/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.me.pay.vision;

import java.awt.Component;
import javax.swing.JOptionPane;
import voy.me.pay.control.ControllerTipoTitulo;
import voy.me.pay.entity.TipoTitulo;
import voy.me.pay.entity.to.TipoTituloTableModel;

/**
 *
 * @author BrAcInhO
 */
public class TelaTipoTitulo extends javax.swing.JFrame {

    
    TipoTituloTableModel tabelaTipoTitulo = new TipoTituloTableModel();
    
    public TelaTipoTitulo() {
        initComponents();
        
         jtTipoTitulo.setModel(tabelaTipoTitulo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTipoTitulo = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Título[Pagar, Receber, Financiamento...]"));

        jtTipoTitulo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTipoTitulo);

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

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(30, 30, 30))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        ControllerTipoTitulo cTipo = new ControllerTipoTitulo();
        TipoTitulo tt = new TipoTitulo();

        //ajusta o botao
        if (jbSalvar.getText().equals("Atualizar")) {
            jbSalvar.setText("Salvar");
        }

        //Obriga preenchimento do cpf ou cnpj;
        if (jtNome.getText().isEmpty()) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Insira os dados para Cadastrar!");

        } else {

            //Aqui atualiza os dados do objeto;
            if (jtTipoTitulo.getSelectedRow() != -1) {

                int row = jtTipoTitulo.getSelectedRow();

                Object id = jtTipoTitulo.getValueAt(row, 0);

                tt.setId((Long) id);
                tt.setNome(jtNome.getText());

                cTipo.saveOrUpdate(tt);
                tabelaTipoTitulo.updateRow();

                //limpar campos;
                tt.setNome("");

            } else {

                //coleta dados do formulario;
                tt.setNome(jtNome.getText());

                tabelaTipoTitulo.addRow(cTipo.saveOrUpdate(tt));
                
                jtNome.setText("");
            }

        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       
        if (jtTipoTitulo.getSelectedRow() != -1) {

            jbSalvar.setText("Atualizar");

            int row = jtTipoTitulo.getSelectedRow();
            if (row > -1) {
                
                //coleta dados da tabela;
                Object id = jtTipoTitulo.getValueAt(row, 0);
                Object nome = jtTipoTitulo.getValueAt(row, 1);
                
                //insere as informaçoes nos campos
                jtNome.setText((String) nome);
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Tipo de Titulo para editar!");
        }
        
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        ControllerTipoTitulo tt = new ControllerTipoTitulo();

        if (jtTipoTitulo.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja excluir este cadastro?", "Atenção!",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                int row = jtTipoTitulo.getSelectedRow();
                if (row > -1) {

                    //para selecionar o ID a coluna deve ser setada com valor 0;
                    //int column = jtCategorias.getSelectedColumn();
                    Object id = jtTipoTitulo.getValueAt(row, 0);

                    tt.remove((Long) id);

                    tabelaTipoTitulo.removeRow(jtTipoTitulo.getSelectedRow());

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para Excluir!");
        }
        
        
    }//GEN-LAST:event_jbExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTipoTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipoTitulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable jtTipoTitulo;
    // End of variables declaration//GEN-END:variables
}
