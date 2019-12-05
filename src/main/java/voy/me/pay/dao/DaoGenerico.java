package voy.me.pay.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import voy.me.pay.entity.EntidadeBase;
import voy.me.pay.util.ConnectionFactory;

//O dao Genérico trabalha com entidades que realizam operações similares que estejam presentes no contrato da EntidadeBase;
public class DaoGenerico<T extends EntidadeBase> {

    private Class<T> classe;

    protected DaoGenerico() {

    }

    protected DaoGenerico(Class<T> classe) {
        this();
        this.classe = classe;
    }

    private static EntityManager manager = ConnectionFactory.getEntityManager();

    public List<T> listarDados() {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(classe);
        query.from(classe);
        List<T> lista = manager.createQuery(query).getResultList();

        return lista;
    }
    
    

    //Metodo de busca por ID;
    public T findById(Long id) {
        return manager.find(classe, id);
    }

    //Salva ou Atualiza: Se não tem ID salva, se tem ID atualiza;
    public T saveOrUpdate(T obj) {
        try {
            manager.getTransaction().begin();
            if (obj.getId() == null) {
                manager.persist(obj);
            } else {
                manager.merge(obj);
            }

            manager.getTransaction().commit();

            return obj;

        } catch (Exception e) {
            manager.getTransaction().rollback();
            System.out.println("ERRO: " + e);
        }
        return null;
    }

    public void remove(Long id) {
        T t = findById(id);
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }
    
    public List<T> findByFilter(String campo, String filtro){
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(classe);
        query.from(classe);
        
        Root<T> root = query.from(classe);
        
        Predicate igual = root.get(campo).in(filtro);
                
        query.where(builder.and(igual));
                                
        List<T> lista = manager.createQuery(query).getResultList();
        
        return lista;
    }

}
