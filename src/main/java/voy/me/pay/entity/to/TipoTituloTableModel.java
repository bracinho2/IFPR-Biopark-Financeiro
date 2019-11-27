/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.me.pay.entity.to;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.me.pay.dao.TipoTituloDAO;
import voy.me.pay.entity.TipoTitulo;

/**
 *
 * @author BrAcInhO
 */
public class TipoTituloTableModel extends AbstractTableModel{

    TipoTituloDAO tipoTituloDao = new TipoTituloDAO();
     List<TipoTitulo> listaTipoTitulo = tipoTituloDao.listarDados();
     
     private String[] colunasTipoTitulo = {"ID", "Nome"};
    
    @Override
    public String getColumnName(int column) {
        return colunasTipoTitulo[column];
    }
    
        
    @Override
    public int getRowCount() {
        return listaTipoTitulo.size();
    }

    @Override
    public int getColumnCount() {
        return colunasTipoTitulo.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return listaTipoTitulo.get(linha).getId();
            case 1:
                return listaTipoTitulo.get(linha).getNome();
        }

        return null;
        
    }
    
    public void addRow(TipoTitulo t){
        this.listaTipoTitulo.add(t);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.listaTipoTitulo.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void updateRow(){
        this.fireTableDataChanged();
    }
    
}
