/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.me.pay.vision;

import java.awt.Component;
import javax.swing.JOptionPane;
import voy.me.pay.control.ControllerCategoria;
import voy.me.pay.entity.Categoria;
import voy.me.pay.entity.to.CategoriaTableModel;

/**
 *
 * @author BrAcInhO
 */
public class TelaCategoria extends javax.swing.JFrame {

    //instancia uma tabela
    CategoriaTableModel tableCategorias = new CategoriaTableModel();
    
    public TelaCategoria() {
        initComponents();
        
       jtCategorias.setModel(tableCategorias);
        
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
        jcStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategorias = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome da Categoria"));

        jcStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativa", "Inativa" }));
        jcStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jtCategorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtCategorias);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        ControllerCategoria cCategoria = new ControllerCategoria();
        Categoria c = new Categoria();

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
            if (jtCategorias.getSelectedRow() != -1) {

                int row = jtCategorias.getSelectedRow();

                Object id = jtCategorias.getValueAt(row, 0);
                Object nome = jtCategorias.getValueAt(row, 1);
                Object status = jtCategorias.getValueAt(row, 2);
                

                c.setId((Long) id);
                c.setNome(jtNome.getText());
                
                if(status.equals("Ativa")){
                    c.setRegistroAtivo(0);
                } else {
                    c.setRegistroAtivo(1);
                }
                

                cCategoria.saveOrUpdate(c);
                tableCategorias.updateRow();

                //limpar campos;
                c.setNome("");

            } else {

                //coleta dados do formulario;
                c.setNome(jtNome.getText());
                if(jcStatus.getSelectedItem().equals("Ativa")){
                    c.setRegistroAtivo(1);
                } else {
                    c.setRegistroAtivo(0);
                }
                

                tableCategorias.addRow(cCategoria.saveOrUpdate(c));
                JOptionPane.showMessageDialog(this, "Categoria Salva com Sucesso! =)");
            }

        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jtCategorias.getSelectedRow() != -1) {

            jbSalvar.setText("Atualizar");

            int row = jtCategorias.getSelectedRow();
            if (row > -1) {
                
                //coleta dados da tabela;
                Object id = jtCategorias.getValueAt(row, 0);
                Object nome = jtCategorias.getValueAt(row, 1);
                Object status = jtCategorias.getValueAt(row, 2);
                
                
                //insere as informaçoes nos campos
                jtNome.setText((String) nome);
                
                if(status.equals("Ativa")){
                    jcStatus.setSelectedIndex(0);
                } else {
                    jcStatus.setSelectedIndex(1);
                }
                
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Tipo de Titulo para editar!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ControllerCategoria cCategoria = new ControllerCategoria();

        if (jtCategorias.getSelectedRow() != -1) {

            if (JOptionPane.showConfirmDialog(null, "Deseja excluir este cadastro?", "Atenção!",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                int row = jtCategorias.getSelectedRow();
                if (row > -1) {

                    //para selecionar o ID a coluna deve ser setada com valor 0;
                    //int column = jtCategorias.getSelectedColumn();
                    Object id = jtCategorias.getValueAt(row, 0);

                    cCategoria.remove((Long) id);

                    tableCategorias.removeRow(jtCategorias.getSelectedRow());

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para Excluir!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcStatus;
    private javax.swing.JTable jtCategorias;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
