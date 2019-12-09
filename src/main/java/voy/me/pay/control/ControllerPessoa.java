package voy.me.pay.control;

import java.util.Collections;
import java.util.List;
import voy.me.pay.dao.PessoaDAO;
import voy.me.pay.entity.Pessoa;

public class ControllerPessoa {

    PessoaDAO pessoaDao = new PessoaDAO();
    
    //metodo para salvar ou atualizar: o ID é o diferencial:
    //se nao tem id salva e se tem atualiza o objeto;
    public Pessoa saveOrUpdate(Pessoa p) {
        p = (Pessoa) pessoaDao.saveOrUpdate(p);
        return p;
    }
    
    //metodo remover objeto baseado no id;
    public void remove(Long id) {
        pessoaDao.remove(id);
    }

    public List<Pessoa> simpleList() {
        List<Pessoa> lista = pessoaDao.listarDados();
        Collections.sort(lista);
        return lista;
        
    }

    public List<Pessoa> findByFilter(String nome, String text) {
        List<Pessoa> lista = pessoaDao.findByFilter(nome, text);
        Collections.sort(lista);
        return lista;
    }

}
