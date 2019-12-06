package voy.me.pay.entity.to;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.me.pay.control.ControllerPessoa;
import voy.me.pay.dao.PessoaDAO;
import voy.me.pay.entity.Pessoa;

public class PessoaTableModel extends AbstractTableModel {
    
    ControllerPessoa p = new ControllerPessoa();
    
    List<Pessoa> listaPessoas = p.listPessoa();
    
    
    
    public List<Pessoa> getListaPessoas() {
           
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    
    
    private String[] nomeColunasPessoa = {"ID", "Nome", "CPF|CNPJ", "Email", "Telefone", 
        "Endereco", "Numero", "Bairro", "Complemento", "Cidade", "Estado", "Cliente", "Fornecedor", "Registro Ativo"};
   
    @Override
    public String getColumnName(int column) {
        return nomeColunasPessoa[column];
    }
    
        
    @Override
    public int getRowCount() {
        return listaPessoas.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunasPessoa.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return listaPessoas.get(linha).getId();
            case 1:
                return listaPessoas.get(linha).getNome();
            case 2:
                return listaPessoas.get(linha).getCpfCnpj();
            case 3:
                return listaPessoas.get(linha).getEmail();
            case 4:
                return listaPessoas.get(linha).getTelefone();
            case 5:
                return listaPessoas.get(linha).getEndereco();
            case 6:
                return listaPessoas.get(linha).getEnderecoNumero();
            case 7:
                return listaPessoas.get(linha).getBairro();
            case 8:
                return listaPessoas.get(linha).getComplemento();
            case 9:
                return listaPessoas.get(linha).getCidade();
            case 10:
                return listaPessoas.get(linha).getEstado();
            case 11:
                return (listaPessoas.get(linha).getCliente() == 1) ? "Sim" : "Não";
            case 12:
                return (listaPessoas.get(linha).getFornecedor() == 1) ? "Sim" : "Não";
            case 13:
                 return (listaPessoas.get(linha).getRegistroAtivo() == 1) ? "Sim" : "Não";
                
        }
        
        return null;
        
    }
    
    public void addRow(Pessoa p){
        this.listaPessoas.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.listaPessoas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void updateRow(){
        this.fireTableDataChanged();
    }
    
}
