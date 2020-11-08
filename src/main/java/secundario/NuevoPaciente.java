package secundario;

import static java.lang.Integer.parseInt;
import javax.swing.ImageIcon;

import principal.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
@SuppressWarnings("serial")
public class NuevoPaciente extends javax.swing.JFrame {
    
    private String camp[]= new String [5];
    private PersonalAdm usuario;
    
    public NuevoPaciente(){}
    
    public NuevoPaciente(PersonalAdm u) {
        this.usuario = u;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        Nombre.setText(null);
        Apellido.setText(null);
        Direct.setText(null);
        Edad.setText(null);
        dni.setText(null);
        camp[0]=null;
        camp[1]=null;
        camp[2]=null;
        camp[3]=null;
        camp[4]=null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Direct = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGCP");
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 300, 49, 17);

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre);
        Nombre.setBounds(420, 300, 146, 23);

        Apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Apellido);
        Apellido.setBounds(420, 330, 146, 23);

        Direct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Direct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectActionPerformed(evt);
            }
        });
        getContentPane().add(Direct);
        Direct.setBounds(420, 360, 146, 23);

        Edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });
        getContentPane().add(Edad);
        Edad.setBounds(420, 390, 146, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 330, 45, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 360, 56, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 390, 31, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 450, 107, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DNI");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 420, 23, 17);

        dni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        getContentPane().add(dni);
        dni.setBounds(420, 420, 146, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Ingreso de un");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(32, 163, 297, 58);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("nuevo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(32, 239, 129, 58);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("Paciente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(32, 328, 177, 58);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 680, 110, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-6, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        camp[0]=Nombre.getText();
     
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        camp[0]=Nombre.getText();
        camp[1]=Apellido.getText();
        camp[2]=Direct.getText();
        camp[3]=Edad.getText();
        camp[4]=dni.getText();
        if(camp[0].equals("")||camp[1].equals("")||camp[2].equals("")||camp[3].equals("")||camp[4].equals(""))
        {
            CamposVacios cv = new CamposVacios(usuario);
            cv.setVisible(true);
            Nombre.setText(null);
            Apellido.setText(null);
            Direct.setText(null);
            Edad.setText(null);
            dni.setText(null);
            System.out.print("alguno es null\n");
        }
        else
        {   
            try
            {
                usuario.getAllPacientes().add(new Paciente(camp[0],camp[1],camp[2],parseInt(camp[3]),parseInt(camp[4]),true));
                //Datos.Pacientes.add(new Paciente(Nombre.getText(),Apellido.getText(),Direct.getText(),parseInt(Edad.getText()),parseInt(dni.getText()),true));
            }catch(Exception e){}
            this.setVisible(false);
            PCorrecto abrir = new PCorrecto(usuario);
            abrir.setVisible(true);
            //}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        camp[3]=Edad.getText();
    }//GEN-LAST:event_EdadActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        camp[4]=dni.getText();
    }//GEN-LAST:event_dniActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        camp[1]=Apellido.getText();
    }//GEN-LAST:event_ApellidoActionPerformed

    private void DirectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectActionPerformed
        camp[2]=Direct.getText();
    }//GEN-LAST:event_DirectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrincipalAdmin p = new PrincipalAdmin(usuario);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Direct;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
