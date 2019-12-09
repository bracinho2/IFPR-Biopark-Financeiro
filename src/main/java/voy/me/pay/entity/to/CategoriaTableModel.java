package voy.me.pay.entity.to;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.me.pay.control.ControllerCategoria;
import voy.me.pay.entity.Categoria;



public class CategoriaTableModel extends AbstractTableModel {
    private ControllerCategoria listaCategoriaBanco = new ControllerCategoria();
    
    private List<Categoria> listaCategorias = listaCategoriaBanco.simpleList();
        
    private String[] nomeColunasCategorias = {"ID", "Nome da Categoria", "Status da Categoria"};

    @Override
    public String getColumnName(int column) {
        return nomeColunasCategorias[column];
    }
    
        
    @Override
    public int getRowCount() {
        return listaCategorias.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunasCategorias.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return listaCategorias.get(linha).getId();
            case 1:
                return listaCategorias.get(linha).getNome();
            case 2:
                if (listaCategorias.get(linha).getRegistroAtivo() == 1){
                    return "Ativa";
                } else
                    return "Inativa";
            
        }
        
        return null;
        
    }
    
    public void addRow(Categoria c){
        this.listaCategorias.add(c);
        listaCategorias = listaCategoriaBanco.simpleList();
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.listaCategorias.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void updateRow(){
        listaCategorias = listaCategoriaBanco.simpleList();
        this.fireTableDataChanged();
    }
    
}
