package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.TipoTituloDAO;
import voy.me.pay.entity.TipoTitulo;


public class ControllerTipoTitulo {
   
    TipoTituloDAO tipoTituloDao = new TipoTituloDAO();
    
    public TipoTitulo saveOrUpdate(TipoTitulo t) {
        t = (TipoTitulo) tipoTituloDao.saveOrUpdate(t);
        return t;
    }

    public void remove(Long id) {
        tipoTituloDao.remove(id);
    }

    public List<TipoTitulo> listTipoTitulo() {
        return tipoTituloDao.listarDados();

    }
    
}
