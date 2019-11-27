package voy.me.pay.entity.to;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.me.pay.dao.CategoriaDAO;
import voy.me.pay.entity.Categoria;



public class CategoriaTableModel extends AbstractTableModel {
    private CategoriaDAO listaCategoriaBanco = new CategoriaDAO();
        
    private List<Categoria> listaCategoriasTableModel = listaCategoriaBanco.listarDados();
    private String[] nomeColunasCategorias = {"ID", "Nome da Categoria", "Status da Categoria"};

    @Override
    public String getColumnName(int column) {
        return nomeColunasCategorias[column];
    }
    
        
    @Override
    public int getRowCount() {
        return listaCategoriasTableModel.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunasCategorias.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return listaCategoriasTableModel.get(linha).getId();
            case 1:
                return listaCategoriasTableModel.get(linha).getNome();
            case 2:
                return listaCategoriasTableModel.get(linha).getRegistroAtivo();
        }
        
        return null;
        
    }
    
    public void addRow(Categoria c){
        this.listaCategoriasTableModel.add(c);
        listaCategoriasTableModel = listaCategoriaBanco.listarDados();
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.listaCategoriasTableModel.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void updateRow(){
        listaCategoriasTableModel = listaCategoriaBanco.listarDados();
        this.fireTableDataChanged();
    }
    
}
