package voy.me.pay.dao;

import java.util.List;
import javax.persistence.EntityManager;
import voy.me.pay.entity.TipoTitulo;
import voy.me.pay.util.ConnectionFactory;

public class TipoTituloDAO extends DaoGenerico{
    
    private static EntityManager manager = ConnectionFactory.getEntityManager();
    
    public TipoTituloDAO() {
         
        super(TipoTitulo.class);
        
    }
    
    public List<TipoTitulo> listarAtivos(){
        return null;
    }
    
}
