package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.TituloDAO;
import voy.me.pay.entity.Titulo;


public class ControllerTitulo {
   
    TituloDAO tituloDao = new TituloDAO();
    
    public Titulo saveOrUpdate(Titulo t) {
        t = (Titulo) tituloDao.saveOrUpdate(t);
        return t;
    }

    public void remove(Long id) {
        tituloDao.remove(id);
    }

    public List<Titulo> listaTitulos() {
        return tituloDao.listarDados();

    }
    
}
