
import static java.lang.Integer.parseInt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
public class VerMisPacientes extends javax.swing.JFrame {
    public static int vd = 0;
    private PersonalAdm usuario;
    String auxS[] = new String [3];
    int auxD=0;
    public static String medS="";
    
    public VerMisPacientes(){}
            
    public VerMisPacientes(PersonalAdm u) {
        this.usuario = u;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        int b= usuario.getDoctorSel().getMisPacientes().size();
        String pDoc[] = new String [b+1];
        DefaultListModel cb2= new DefaultListModel();
        String aux="";
        Pacientes.setModel(cb2);
        for(int i = 0; i<b;i++)
        {   
            try
            {
                aux = usuario.getDoctorSel().getMisPacientes().get(i).getNombre()+" "+usuario.getDoctorSel().getMisPacientes().get(i).getApellido()+" "+usuario.getDoctorSel().getMisPacientes().get(i).getDni();
                auxS = aux.split(" ");
            }
            catch (Exception e){}
           //pDoc[i]=usuario.getAllPacientes().get(i).getNombre()+" "+usuario.getAllPacientes().get(i).getApellido()+" "+usuario.getAllPacientes().get(i).getDni();
           cb2.addElement(aux);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Pacientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Detalle = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AnHist = new javax.swing.JButton();
        ResMed = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        Pacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pacientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PacientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Pacientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 188, 490);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Mis Pacientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 282, 58);

        Detalle.setColumns(20);
        Detalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Detalle.setRows(5);
        jScrollPane2.setViewportView(Detalle);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 100, 410, 490);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pacientes");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 57, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Detalle");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 80, 40, 17);

        AnHist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AnHist.setText("Añadir Historial Médico");
        AnHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnHistActionPerformed(evt);
            }
        });
        getContentPane().add(AnHist);
        AnHist.setBounds(760, 100, 216, 52);

        ResMed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResMed.setText("Recetar Medicamento");
        ResMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResMedActionPerformed(evt);
            }
        });
        getContentPane().add(ResMed);
        ResMed.setBounds(760, 160, 216, 52);

        Volver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver);
        Volver.setBounds(760, 540, 216, 52);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, 0, 1010, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnHistActionPerformed
        if(Pacientes.getSelectedIndex()!=-1)
        {
            HistCorrecto.vengode = 2;
            InHistMed h = new InHistMed(usuario);
            h.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            CamposVacios c = new CamposVacios(usuario);
            c.setVisible(true);
        }
    }//GEN-LAST:event_AnHistActionPerformed

    private void PacientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PacientesValueChanged
        String imprimir = "";
        String alergias = "";
        auxD = parseInt(auxS[2]);
        int otro = Pacientes.getSelectedIndex();
        usuario.getDoctorSel().selPaciente(otro);
        //usuario.getDoctorSel().selPaciente(usuario.getDoctorSel().getPaciente(auxD));
        imprimir = "Nombre: "+usuario.getDoctorSel().getPacienteSel().getNombre()+" "+usuario.getDoctorSel().getPacienteSel().getApellido()+"\n";
        imprimir += "DNI: "+usuario.getDoctorSel().getPacienteSel().getDni()+"\nEdad: "+usuario.getDoctorSel().getPacienteSel().getEdad()+" años.\n";
        imprimir += "Dirección: "+usuario.getDoctorSel().getPacienteSel().getDireccion()+"\nGrupo sanguineo: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getGrupoG()+"\n";
        imprimir += "Enfermedades: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getEnfermedades()+"\n";
        imprimir += "Incapacidades: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getIncapacidades()+"\n";
        for(int i = 0;i<usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().size();i++)
        {
            alergias +=usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().get(i);
        }
        if(usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().isEmpty())
        {
            alergias="Sin alergias";
        }
        imprimir += "Alérgico a: "+alergias;
        imprimir += "\nTratamientos y otra información:\n     "+usuario.getDoctorSel().getPacienteSel().getHistorial().getHistoria();
        imprimir += "\nEstá tomando: "+usuario.getDoctorSel().getPacienteSel().getEstaTomando();
        if(!usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().isEmpty())
        {
            String imp = "";
            for(int j = 0; j < usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().size(); j ++)
            {
                imp +=  "   \n Doctor "+usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().get(j).getDoctor().getNombre();
                imp +=  " Fecha "+usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().get(j).getFecha();
                imp +=  " Hora "+usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().get(j).getHora();
                imp +=  " Detalle: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getConsultas().get(j).getComentario();
            }
            usuario.getDoctorSel().getPacienteSel().getHistorial().setHistTurnos(imp); 
            imprimir += "\nHistorial de turnos: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getHistTurnos();
        }   
        Detalle.setText(imprimir);
    }//GEN-LAST:event_PacientesValueChanged

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        if(vd==0)
        {
            PrincipalDoctor p = new PrincipalDoctor(usuario);
            p.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            VerMisTurnos v = new VerMisTurnos(usuario);
            v.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void ResMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResMedActionPerformed
        Recetar r = new Recetar(usuario);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ResMedActionPerformed

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
            java.util.logging.Logger.getLogger(VerMisPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMisPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMisPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMisPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerMisPacientes().setVisible(true);
            }
        });
    }
    
    public void Cambio()
    {
        String imprimir = "";
        String alergias = "";
        auxD = parseInt(auxS[2]);
        int otro = Pacientes.getSelectedIndex();
        usuario.getDoctorSel().selPaciente(otro);
        //usuario.getDoctorSel().selPaciente(usuario.getDoctorSel().getPaciente(auxD));
        imprimir = "Nombre: "+usuario.getDoctorSel().getPacienteSel().getNombre()+" "+usuario.getDoctorSel().getPacienteSel().getApellido()+"\n";
        imprimir += "DNI: "+usuario.getDoctorSel().getPacienteSel().getDni()+"\nEdad: "+usuario.getDoctorSel().getPacienteSel().getEdad()+" años.\n";
        imprimir += "Dirección: "+usuario.getDoctorSel().getPacienteSel().getDireccion()+"\nGrupo sanguineo: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getGrupoG()+"\n";
        imprimir += "Enfermedades: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getEnfermedades()+"\n";
        imprimir += "Incapacidades: "+usuario.getDoctorSel().getPacienteSel().getHistorial().getIncapacidades()+"\n";
        for(int i = 0;i<usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().size();i++)
        {
            alergias +=usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().get(i);
        }
        if(usuario.getDoctorSel().getPacienteSel().getHistorial().getAlergic().isEmpty())
        {
            alergias="Sin alergias";
        }
        imprimir += "Alérgico a: "+alergias;
        imprimir += "\nTratamientos y otra información:\n     "+usuario.getDoctorSel().getPacienteSel().getHistorial().getHistoria();
        imprimir += "\nEstá tomando: "+usuario.getDoctorSel().getPacienteSel().getEstaTomando();
        Detalle.setText(imprimir);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnHist;
    private javax.swing.JTextArea Detalle;
    private javax.swing.JList<String> Pacientes;
    private javax.swing.JButton ResMed;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
