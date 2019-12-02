package voy.me.pay.entity.to;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import voy.me.pay.dao.TituloDAO;
import voy.me.pay.entity.Titulo;

public class TituloTableModel extends AbstractTableModel {

    SimpleDateFormat dataVencimento = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dataRegistro = new SimpleDateFormat("dd/MM/yyyy");

    TituloDAO tituloDao = new TituloDAO();
    List<Titulo> listaTitulos = tituloDao.listarDados();

    private String[] nomeColunasTitulo = {"ID", "Descricao", "Valor", "Vencimento", "Parcelas",
        "Numero", "Ativo", "Status", "Registro", "Categoria"};

    @Override
    public String getColumnName(int column) {
        return nomeColunasTitulo[column];
    }

    @Override
    public int getRowCount() {
        return listaTitulos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunasTitulo.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0: //correto
                return listaTitulos.get(linha).getId();
            case 1://correto
                return listaTitulos.get(linha).getDescricao();
            case 2: //correto
                return listaTitulos.get(linha).getValor();
            case 3: //correto
                if (listaTitulos.get(linha).getDataVencimento() != null) {
                    return dataVencimento.format(listaTitulos.get(linha).getDataVencimento());
                } else {
                    return null;
                }
            case 4: //correto
                return listaTitulos.get(linha).getNumeroParcelaTitulo();
            case 5: //correto
                return listaTitulos.get(linha).getNumeroTitulo();
            case 6:

                if (listaTitulos.get(linha).getRegistroAtivoTitulo() == 1) {
                    String registro = "Sim";
                    return registro;
                } else {
                    String registro = "Não";
                    return registro;
                }
            case 7:
                return listaTitulos.get(linha).getStatus();
            case 8:
                if (listaTitulos.get(linha).getDataVencimento() != null) {
                    return dataRegistro.format(listaTitulos.get(linha).getDataHoraCadastroTitulo());
                } else {
                    return null;
                }
                
            case 9:
                return listaTitulos.get(linha).getCategoria();
        }

        return null;

    }

    public void addRow(Titulo t) {
        this.listaTitulos.add(t);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.listaTitulos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public void updateRow() {
        this.fireTableDataChanged();
    }

}
