/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.me.pay.vision;

import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.MaskFormatter;
import voy.me.pay.control.ControllerCategoria;
import voy.me.pay.control.ControllerPessoa;
import voy.me.pay.control.ControllerTipoTitulo;
import voy.me.pay.control.ControllerTitulo;
import voy.me.pay.entity.Categoria;
import voy.me.pay.entity.Pessoa;
import voy.me.pay.entity.TipoTitulo;
import voy.me.pay.entity.Titulo;
import voy.me.pay.entity.to.TituloTableModel;

/**
 *
 * @author UnioestePROEX
 */
public class TelaTitulo extends javax.swing.JFrame {

    TituloTableModel tabelaTitulo = new TituloTableModel();
    
    List<Categoria> categorias = new ArrayList();
    List<TipoTitulo> tipoTitulos = new ArrayList();
    List<Pessoa> pessoas = new ArrayList();
     
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
    
    public TelaTitulo() throws ParseException {
        initComponents();
        
        //seta modelo da tabela;
        jTitulos.setModel(tabelaTitulo);
        
        //seta os tamanhos das colunas da tabela;
        jTitulos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        jTitulos.getColumnModel().getColumn(0).setMinWidth(30);
        jTitulos.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTitulos.getColumnModel().getColumn(0).setMaxWidth(30);
        
        
        MaskFormatter maskRegistro = new MaskFormatter("##/##/####");  
        maskRegistro.install(jfDataRegistro);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        jfDataRegistro.setText(sdf.format(new Date()));
        
        MaskFormatter maskVencimento = new MaskFormatter("##/##/####");        
        maskVencimento.install(jfVencimento);
        
        //botao listar categorias;
        ControllerCategoria c = new ControllerCategoria();
        categorias = c.simpleList();//listarAtivas();
        
        Collections.sort(categorias, null);
        for (int i = 0; i < categorias.size(); i++) {
            cbCategorias.addItem(categorias.get(i));
        }
        
        //botao tipo de titulo
        ControllerTipoTitulo tTitulo = new ControllerTipoTitulo();
        tipoTitulos = tTitulo.listTipoTitulo();
        
        Collections.sort(tipoTitulos, null);
        for (int i = 0; i < tipoTitulos.size(); i++) {
            cbTipoTitulo.addItem(tipoTitulos.get(i));
        }
        
        //botao pessoa;
        ControllerPessoa cPessoa = new ControllerPessoa();
        pessoas = cPessoa.simpleList();
        
        Collections.sort(pessoas, null);
        for (int i = 0; i < pessoas.size(); i++){
            cbPessoas.addItem(pessoas.get(i));
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtDesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTitulos = new javax.swing.JTable();
        jtParcelas = new javax.swing.JTextField();
        jtNumeroTitulo = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jfVencimento = new javax.swing.JFormattedTextField();
        jfDataRegistro = new javax.swing.JFormattedTextField();
        jcAtivo = new javax.swing.JComboBox<>();
        cbTipoTitulo = new javax.swing.JComboBox<>();
        cbSituacao = new javax.swing.JComboBox<>();
        cbCategorias = new javax.swing.JComboBox<>();
        cbPessoas = new javax.swing.JComboBox<>();
        btnPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jtDesc.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        jTitulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTitulos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTitulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTitulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTitulos);

        jtParcelas.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Parcelas"));

        jtNumeroTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero do Título"));

        jtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jfVencimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Vencimento"));

        jfDataRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Registro"));
        jfDataRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataRegistroActionPerformed(evt);
            }
        });

        jcAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        jcAtivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ativo"));
        jcAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAtivoActionPerformed(evt);
            }
        });

        cbTipoTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Título"));

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Liquidado" }));
        cbSituacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        cbCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        cbPessoas.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        cbPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPessoasActionPerformed(evt);
            }
        });

        btnPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDesc)
                                        .addGap(13, 13, 13)
                                        .addComponent(jfDataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNumeroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 219, Short.MAX_VALUE)))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPesquisa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfDataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumeroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jcAtivo)
                    .addComponent(cbTipoTitulo)
                    .addComponent(cbSituacao)
                    .addComponent(cbCategorias)
                    .addComponent(cbPessoas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        ControllerTitulo cTitulo = new ControllerTitulo();
        Titulo t = new Titulo();

        //ajusta o botao
        if (jbSalvar.getText().equals("Atualizar")) {
            jbSalvar.setText("Salvar");
        }

        //Obriga dos dados baseado no campo descricao
        if (jtDesc.getText().isEmpty()) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Insira os dados para Cadastrar!");

        } else {

            //Objeto Persistido: Coleta dados do abstract table para atualizar e persistir novamente;
            if (jTitulos.getSelectedRow() != -1) {

                int row = jTitulos.getSelectedRow();
                
                Object id = jTitulos.getValueAt(row, 0);
                t.setId((Long) id);
               
                t.setDescricao(jtDesc.getText());
                
                SimpleDateFormat dataRegistro = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    t.setDataHoraCadastroTitulo(dataRegistro.parse(jfDataRegistro.getText()));
                } catch (ParseException ex) {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Insira a data de Registro!");
                }
                
                SimpleDateFormat dataVencimento = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    t.setDataVencimento((dataVencimento.parse(jfVencimento.getText())));
                } catch (ParseException ex){
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "insira a data de Vencimento!");
                }
                
                t.setNumeroParcelaTitulo(Integer.parseInt(jtParcelas.getText()));
                t.setNumeroTitulo(Integer.parseInt(jtNumeroTitulo.getText()));
                
                t.setRegistroAtivoTitulo(jcAtivo.getSelectedIndex());
                
                if(jcAtivo.getSelectedIndex() == 0){
                    t.setStatus("Pendente");
                } else {
                    t.setStatus("Liquidado");
                }
                                                
                t.setValor(Float.parseFloat(jtValor.getText()));
                
                t.setCategoria((Categoria) cbCategorias.getSelectedItem());
                t.setTipoTitulo((TipoTitulo) cbTipoTitulo.getSelectedItem());
                t.setPessoa((Pessoa) cbPessoas.getSelectedItem());
                
                
                                                
                cTitulo.saveOrUpdate(t);
                tabelaTitulo.updateRow();

                //limpar campos;
                jtDesc.setText("");
                jfDataRegistro.setText("");
                jfVencimento.setText("");
                jtParcelas.setText("");
                jtNumeroTitulo.setText("");
                jtValor.setText("");
                jcAtivo.setSelectedIndex(0);
                cbTipoTitulo.setSelectedIndex(0);
                cbPessoas.setSelectedIndex(0);
                
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Salvo com Sucesso!");

            } else {

                //Objeto Novo: coleta dados do formulario para persistir o objeto;
                t.setDescricao(jtDesc.getText());
                
                SimpleDateFormat dataRegistro = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    t.setDataHoraCadastroTitulo(dataRegistro.parse(jfDataRegistro.getText()));
                } catch (ParseException ex) {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "Insira a data de Registro!");
                }
                
                SimpleDateFormat dataVencimento = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    t.setDataVencimento((dataVencimento.parse(jfVencimento.getText())));
                } catch (ParseException ex){
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame, "insira a data de Vencimento!");
                }
                
                t.setNumeroParcelaTitulo(Integer.parseInt(jtParcelas.getText()));
                t.setNumeroTitulo(Integer.parseInt(jtNumeroTitulo.getText()));
                
                t.setRegistroAtivoTitulo(jcAtivo.getSelectedIndex());
                
                if(jcAtivo.getSelectedIndex() == 0){
                    t.setStatus("Pendente");
                } else {
                    t.setStatus("Liquidado");
                }
                                                
                t.setValor(Float.parseFloat(jtValor.getText()));
                t.setCategoria((Categoria) cbCategorias.getSelectedItem());
                t.setTipoTitulo((TipoTitulo) cbTipoTitulo.getSelectedItem());
                t.setPessoa((Pessoa) cbPessoas.getSelectedItem());
                
                //insere o objeto na tabela e já encaminha para persistencia;
                tabelaTitulo.addRow(cTitulo.saveOrUpdate(t));
                
                
                //Limpa os campos do formulario;
                jtDesc.setText("");
                jfDataRegistro.setText("");
                jfVencimento.setText("");
                jtParcelas.setText("");
                jtNumeroTitulo.setText("");
                jtValor.setText("");
                jcAtivo.setSelectedIndex(0);
                cbTipoTitulo.setSelectedIndex(0);
                
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Salvo com Sucesso!");
            }

        }
        
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (jTitulos.getSelectedRow() != -1) {

            jbSalvar.setText("Atualizar");

            int row = jTitulos.getSelectedRow();
            if (row > -1) {
                
                //coleta dados da tabela;
                Object descricao = jTitulos.getValueAt(row, 1);
                Object valor = jTitulos.getValueAt(row, 2).toString();
                Object vencimento = jTitulos.getValueAt(row, 3).toString();
                Object parcelas = jTitulos.getValueAt(row, 4).toString();
                Object numero = jTitulos.getValueAt(row, 5).toString();
                Object ativo = jTitulos.getValueAt(row, 6);
                Object situacao = jTitulos.getValueAt(row, 7);
                Object dataRegistro = jTitulos.getValueAt(row, 8).toString();
                Object categoriaTitulo = jTitulos.getValueAt(row, 9).toString();
                Object tipoTitulo = jTitulos.getValueAt(row, 10).toString();
                Object pessoaTitulo = jTitulos.getValueAt(row, 11).toString();
                
                //insere as informaçoes nos campos
                jtDesc.setText((String) descricao);
                jtValor.setText((String) valor);
                jfVencimento.setText((String) vencimento);
                jtParcelas.setText((String) parcelas);
                jtNumeroTitulo.setText((String) numero);
                jfDataRegistro.setText((String) dataRegistro);
                
                //botao ativo
                if(ativo.equals("Não")){
                    jcAtivo.setSelectedIndex(0);
                } else {
                    jcAtivo.setSelectedIndex(1);
                }
                
                //botao situacao
                cbSituacao.setSelectedItem(situacao);
                
                //botao categoria
                cbCategorias.setSelectedItem(categoriaTitulo);
                
                //botao tipo titulo
                cbTipoTitulo.setSelectedItem(tipoTitulo);
                
                //botao pessoa
                cbPessoas.setSelectedItem(pessoaTitulo);
                
                for(int i = 0; i > pessoas.size(); i++){
                    if(tabelaTitulo.getIdPessoa(row) == pessoas.get(i).getId()){
                        cbPessoas.setSelectedIndex(i+1);
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Titulo para EDITAR!");
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       
        ControllerTitulo t = new ControllerTitulo();

        if (jTitulos.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja excluir este cadastro?", "Atenção!",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                int row = jTitulos.getSelectedRow();
                if (row > -1) {

                    //para selecionar o ID a coluna deve ser setada com valor 0;
                    //int column = jtCategorias.getSelectedColumn();
                    Object id = jTitulos.getValueAt(row, 0);

                    t.remove((Long) id);

                    tabelaTitulo.removeRow(jTitulos.getSelectedRow());

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um titulo para Excluir!");
        }
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jfDataRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfDataRegistroActionPerformed

    private void jcAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAtivoActionPerformed

    private void cbPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPessoasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPessoasActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void jTitulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTitulosMouseClicked
        if (evt.getClickCount() == 2){
        
            Titulo t = tabelaTitulo.getListaTitulos().get(jTitulos.getSelectedRow());
            
            //insere as informaçoes nos campos
                jtDesc.setText(t.getDescricao());
                jtValor.setText(String.valueOf(t.getValor()));
                jfVencimento.setText(sdf.format(t.getDataVencimento()));
                jtParcelas.setText(String.valueOf(t.getNumeroParcelaTitulo()));
                jtNumeroTitulo.setText(String.valueOf(t.getNumeroTitulo()));
                jfDataRegistro.setText(sdf.format(t.getDataHoraCadastroTitulo()));
                
                //botao ativo
                if(t.getRegistroAtivoTitulo() == 1){
                    jcAtivo.setSelectedIndex(0);
                } else {
                    jcAtivo.setSelectedIndex(1);
                }
                
                //botao situacao
                cbSituacao.setSelectedItem(t.getStatus());
                
                //botao categoria
                cbCategorias.setSelectedItem(t.getCategoria());
                
                //botao tipo titulo
                cbTipoTitulo.setSelectedItem(t.getTipoTitulo());
                
                //botao pessoa
                cbPessoas.setSelectedItem(t.getPessoa());
                
            
                JOptionPane.showMessageDialog(this, t.getId());
        }
    }//GEN-LAST:event_jTitulosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControllerTitulo t = new ControllerTitulo();
        List<Titulo> listaTitulo = t.findByFilter("nome", btnPesquisa.getText());
        
        tabelaTitulo.setListaTitulos(listaTitulo);
        tabelaTitulo.updateRow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaTitulo().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(TelaTitulo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnPesquisa;
    private javax.swing.JComboBox<Categoria> cbCategorias;
    private javax.swing.JComboBox<Pessoa> cbPessoas;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JComboBox<TipoTitulo> cbTipoTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTitulos;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcAtivo;
    private javax.swing.JFormattedTextField jfDataRegistro;
    private javax.swing.JFormattedTextField jfVencimento;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtNumeroTitulo;
    private javax.swing.JTextField jtParcelas;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
