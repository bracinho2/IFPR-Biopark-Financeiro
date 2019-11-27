package voy.me.pay.control;

import java.util.List;
import voy.me.pay.dao.PessoaDAO;
import voy.me.pay.entity.Pessoa;

public class ControllerPessoa {

    PessoaDAO pessoaDao = new PessoaDAO();

    public Pessoa saveOrUpdate(Pessoa p) {
        p = (Pessoa) pessoaDao.saveOrUpdate(p);
        return p;
    }

    public void remove(Long id) {
        pessoaDao.remove(id);
    }

    public List<Pessoa> listPessoa() {
        return pessoaDao.listarDados();
        
    }

}
