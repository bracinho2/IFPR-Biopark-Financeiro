package voy.me.pay.control;

import java.util.Collections;
import java.util.List;
import voy.me.pay.dao.CategoriaDAO;
import voy.me.pay.dao.PessoaDAO;
import voy.me.pay.dao.TituloDAO;
import voy.me.pay.entity.Categoria;
import voy.me.pay.entity.Pessoa;
import voy.me.pay.entity.Titulo;


public class ControllerTitulo {
   
    TituloDAO tituloDao = new TituloDAO();
    CategoriaDAO catDao = new CategoriaDAO();
    PessoaDAO pDao = new PessoaDAO();
    
    public Titulo saveOrUpdate(Titulo t) {
       // t.setCategoria((Categoria) catDao.findById(t.getCategoria().getId()));
       // t.setPessoa((Pessoa) pDao.findById(t.getPessoa().getId()));
        
        
        t = (Titulo) tituloDao.saveOrUpdate(t);
        return t;
    }

    public void remove(Long id) {
        tituloDao.remove(id);
    }

    public List<Titulo> listaTitulos() {
        return tituloDao.listarDados();

    }
    
    public List<Titulo> findByFilter(String nome, String text) {
        List<Titulo> lista = tituloDao.findByFilter(nome, text);
        //Collections.sort(lista);
        return lista;
    }
    
}
