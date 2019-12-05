package voy.me.pay.dao;

import java.util.List;
import javax.persistence.EntityManager;
import voy.me.pay.entity.Categoria;
import voy.me.pay.util.ConnectionFactory;



public class CategoriaDAO extends DaoGenerico {

    private static EntityManager manager = ConnectionFactory.getEntityManager();
    
    public CategoriaDAO() {

        super(Categoria.class);
    }

    public List<Categoria> listaCategoriaAtiva () {
        
        //return manager.createNativeQuery("select * from categoria where registroAtivo = :Ativa", Categoria.class).setParameter("Ativa", 1).getResultList();
        return manager.createQuery("select c from Categoria c where c.registroAtivo = :Ativa", Categoria.class).setParameter("Ativa", 1).getResultList();
    }
    
}