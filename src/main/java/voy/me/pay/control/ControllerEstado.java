package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.EstadoDAO;
import voy.me.pay.entity.Estado;

public class ControllerEstado {

    EstadoDAO estadoDao = new EstadoDAO();

    public Estado saveOrUpdate(Estado e) {
        e = (Estado) estadoDao.saveOrUpdate(e);
        return e;
    }

    public void remove(Long id) {
        estadoDao.remove(id);
    }

    public List<Estado> listEstado() {
        return estadoDao.listarDados();

    }
    
}
