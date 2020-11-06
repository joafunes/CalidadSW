package pruebaGradle;


import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

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
public class NuevoTurno extends javax.swing.JFrame {
    private PersonalAdm usuario;
    private boolean HabC=false;
    @SuppressWarnings("unused")
	private Doctor doc = new Doctor();
    
    public NuevoTurno(){}
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public NuevoTurno(PersonalAdm u) {
        this.usuario = u;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        Date date = new Date();
        Fech.setDate(date);
        int a=0;
        try{a= usuario.getMisObservers().size();} catch(Exception e){}
        String sDoc[] = new String [a+1];
        for(int i = 0; i<a+1;i++)
        {
            if(i==0)
            {
                sDoc[0]="Seleccionar";
            }
            else
            {
                sDoc[i]=usuario.getMisObservers().get(i-1).getNombre();
            }
        }
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(sDoc);
        Doc.setModel(cbm);
        int b=0;
        try {b= usuario.getAllPacientes().size();} catch(Exception e) {}
        String pDoc[] = new String [b+1];
        for(int i = 0; i<b+1;i++)
        {
            if(i==0)
            {
                pDoc[0]="Seleccionar";
            }
            else
            {
                pDoc[i]=usuario.getAllPacientes().get(i-1).getNombre()+" "+usuario.getAllPacientes().get(i-1).getApellido()+" "+usuario.getAllPacientes().get(i-1).getDni();
            }
        }
        DefaultComboBoxModel cb2 = new DefaultComboBoxModel(pDoc);
        Pac.setModel(cb2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Doc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pac = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Note = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        Fech = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        HoraD = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Doctor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(301, 184, 43, 17);

        Doc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocActionPerformed(evt);
            }
        });
        getContentPane().add(Doc);
        Doc.setBounds(362, 181, 314, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("nuevo Turno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 75, 269, 58);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Paciente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(293, 225, 51, 17);

        Pac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Pac);
        Pac.setBounds(362, 222, 314, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(308, 263, 36, 17);

        Note.setColumns(20);
        Note.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Note.setRows(5);
        jScrollPane1.setViewportView(Note);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(362, 351, 314, 106);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Notas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(309, 351, 35, 17);

        Ingresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar);
        Ingresar.setBounds(526, 475, 150, 57);

        Fech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechMouseClicked(evt);
            }
        });
        Fech.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechPropertyChange(evt);
            }
        });
        getContentPane().add(Fech);
        Fech.setBounds(362, 263, 314, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("Ingreso de un");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 11, 297, 58);

        HoraD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HoraD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "17:00", "17:30", "18:00", "18:30" }));
        HoraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraDActionPerformed(evt);
            }
        });
        getContentPane().add(HoraD);
        HoraD.setBounds(362, 310, 314, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Desde");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(306, 313, 38, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(830, 690, 110, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-6, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed

        if((Doc.getSelectedIndex()==0)||(Pac.getSelectedIndex()==0)||(HoraD.getSelectedIndex()==0))
        {
            CamposVacios cv = new CamposVacios(usuario);
            cv.setVisible(true);
            Note.setText("");
        }
        else
        {
            Paciente p;
            Doctor d;
            String aux;
            @SuppressWarnings("unused")
			String aux2;
            SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yyyy");
            String fecha=form.format(Fech.getDate());
            int n;
            @SuppressWarnings("unused")
			int h[] = new int [2];
            aux=(String)Pac.getSelectedItem();
            String partes[]=aux.split(" ");
            n=parseInt(partes[2]);
            p=usuario.getPaciente(n);
            p.setDeuda(true);
            d=usuario.getDoctor((String)Doc.getSelectedItem());
            Turnos taux =new Turnos(p,d,fecha,(String)HoraD.getSelectedItem());
            taux.setComentario(Note.getText());
            usuario.crearTurno(taux);
            if(!d.ExistePaciente(p.getDni()))
            {
                d.getMisPacientes().add(p);
            }
            this.setVisible(false);
            TCorrecto t = new TCorrecto(usuario);
            t.setVisible(true);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocActionPerformed
        SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yyyy");
        String f=form.format(Fech.getDate());
        LinkedList<String> molde = new LinkedList();
        molde.add("Seleccionar");
        molde.add("08:00");
        molde.add("08:30");
        molde.add("09:00");
        molde.add("09:30");
        molde.add("10:00");
        molde.add("10:30");
        molde.add("11:00");
        molde.add("11:30");
        molde.add("12:00");
        molde.add("12:30");
        molde.add("13:00");
        molde.add("13:30");
        molde.add("14:00");
        molde.add("14:30");
        molde.add("15:00");
        molde.add("15:30");
        molde.add("16:00");
        molde.add("16:30");
        molde.add("17:00");
        molde.add("17:30");
        molde.add("18:00");
        molde.add("18:30");
        System.out.print("Entre\n");
        //System.out.print(Fech.getDateFormatString());
        System.out.print(f+"\n");
        if(!f.equals("dd-MMM-yyyy"))
        {
            for(int i = 0; i < usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().size(); i++)
            {
                if(usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().get(i).getFecha().equals(f))
                {
                    System.out.print(Fech.getDateFormatString());
                    for(int j = 1;j<molde.size();j++)
                    {
                        if(usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().get(i).getHora().equals(molde.get(j)))
                        {
                            molde.remove(j);
                        }   
                    }
                }
            }
        }
        String s[] = new String[molde.size()];
        for(int i = 0; i < molde.size() ; i++)
        {
            s[i] = molde.get(i);
        }
        HabC=true;
        DefaultComboBoxModel mod = new DefaultComboBoxModel(s);
        HoraD.setModel(mod);
    }//GEN-LAST:event_DocActionPerformed

    private void HoraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraDActionPerformed

    @SuppressWarnings("unchecked")
	private void FechPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechPropertyChange
        if(HabC)
        {
            SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yyyy");
        String f=form.format(Fech.getDate());
        @SuppressWarnings("rawtypes")
		LinkedList<String> molde = new LinkedList();
        molde.add("Seleccionar");
        molde.add("08:00");
        molde.add("08:30");
        molde.add("09:00");
        molde.add("09:30");
        molde.add("10:00");
        molde.add("10:30");
        molde.add("11:00");
        molde.add("11:30");
        molde.add("12:00");
        molde.add("12:30");
        molde.add("13:00");
        molde.add("13:30");
        molde.add("14:00");
        molde.add("14:30");
        molde.add("15:00");
        molde.add("15:30");
        molde.add("16:00");
        molde.add("16:30");
        molde.add("17:00");
        molde.add("17:30");
        molde.add("18:00");
        molde.add("18:30");
        System.out.print("Entre\n");
        //System.out.print(Fech.getDateFormatString());
        System.out.print(f+"\n");
        if(!f.equals("dd-MMM-yyyy"))
        {
            for(int i = 0; i < usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().size(); i++)
            {
                if(usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().get(i).getFecha().equals(f))
                {
                    System.out.print(Fech.getDateFormatString());
                    for(int j = 1;j<molde.size();j++)
                    {
                        if(usuario.getDoctor((String)Doc.getSelectedItem()).getTurnos().get(i).getHora().equals(molde.get(j)))
                        {
                            molde.remove(j);
                        }   
                    }
                }
            }
        }
        String s[] = new String[molde.size()];
        for(int i = 0; i < molde.size() ; i++)
        {
            s[i] = molde.get(i);
        }
        @SuppressWarnings("rawtypes")
		DefaultComboBoxModel mod = new DefaultComboBoxModel(s);
        HoraD.setModel(mod);
        }
    }//GEN-LAST:event_FechPropertyChange

    private void FechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechMouseClicked
        //System.out.print("Cambio de fecha\n");
    }//GEN-LAST:event_FechMouseClicked

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
            java.util.logging.Logger.getLogger(NuevoTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Doc;
    private com.toedter.calendar.JDateChooser Fech;
    private javax.swing.JComboBox<String> HoraD;
    private javax.swing.JButton Ingresar;
    private javax.swing.JTextArea Note;
    private javax.swing.JComboBox<String> Pac;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
