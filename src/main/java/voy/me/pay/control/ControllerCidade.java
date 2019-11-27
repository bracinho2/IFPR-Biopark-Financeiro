
package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.CidadeDAO;
import voy.me.pay.entity.Cidade;


public class ControllerCidade {
    
   CidadeDAO cidadeDao = new CidadeDAO();

    public Cidade saveOrUpdate(Cidade c) {
        c = (Cidade) cidadeDao.saveOrUpdate(c);
        return c;
    }

    public void remove(Long id) {
        cidadeDao.remove(id);
    }

    public List<Cidade> listCidade() {
        return cidadeDao.listarDados();

    }
    
    public List<Cidade> listCidadeEstado(Long id){
        return cidadeDao.findByFilter("estado_id", "" + id);
    }
    
}
