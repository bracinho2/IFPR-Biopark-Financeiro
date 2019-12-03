
package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.CategoriaDAO;
import voy.me.pay.entity.Categoria;

public class ControllerCategoria {
    
   CategoriaDAO categoriaDao = new CategoriaDAO();

    public Categoria saveOrUpdate(Categoria c) {
        c = (Categoria) categoriaDao.saveOrUpdate(c);
        return c;
    }

    public void remove(Long id) {
        categoriaDao.remove(id);
    }

    public List<Categoria> listaCategorias() {
        return categoriaDao.listarDados();

    }
    
    public List<Categoria> listCategoria(Long id){
        return categoriaDao.findByFilter("estado_id", "" + id);
    }
    //
}
