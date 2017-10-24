package prestarsala;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Calvo R
 */
public final class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public int row;
    public int i, entera;
    public static Nodo PTR, p, q, r, w, y, anty, z;
    public static Nodo RTP;
    public static String sn, nom, cod;
    public String horario, nomsala;
    public static DefaultTableModel model = new DefaultTableModel();
    public boolean sw, ws;
    public static boolean can = false;
    public boolean[] canEdit = new boolean[]{
        false, false, false
    };

//    .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Auditorio.jpg")));
    public View() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Table.setModel(model);
        model.setColumnIdentifiers(new Object[]{
            "NUM", "HORARIO", "DISPONIBILAD"
        });
        //Table.setEnabled(false);

    }

    /**
     * esto cambia el icono del programa
     *
     * @return
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/icon.png"));

        return retValue;
    }

    /**
     * *
     * aqui se crean los nodos y con estos se llena la tabla
     */
    public static void createMain() {
        /*
        aqui se crean los nodos de los salones que se prestan
         */
        PTR = new Nodo("SALON DE PROYECCIONES", 2, null, null);
        p = new Nodo("AUDITORIO", 3, null, null);
        PTR.setLink1(p);
        q = new Nodo("AULA DEL K", 3, null, null);
        p.setLink1(q);

        /**
         * *
         * lo siguiente es la creacion de un horario default para cada salon que
         * se va a prestar, que en total son 12. Este es del salon de
         * proyecciones
         */
        System.out.println("ejecutando primera parte");
        r = new Nodo(true, "", "", "8:30-9:30", 1, null);
        PTR.setLink2(r);
        w = new Nodo(true, "", "", "9:30-10:30", 2, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "10:30-11:30", 3, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "11:30-12:30", 4, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "12:30-13:30", 5, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "13:30-14:30", 6, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "14:30-15:30", 7, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "15:30-16:30", 8, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "16:30-17:30", 9, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "17:30-18:30", 10, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "18:30-19:30", 11, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "19:30-20:30", 12, null);
        r.setLink2(w);

        /**
         * *
         * esta del auditorio
         *
         */
        System.out.println("ejecutando segunda parte");
        r = new Nodo(true, "", "", "8:30-9:30", 1, null);
        p.setLink2(r);
        w = new Nodo(true, "", "", "9:30-10:30", 2, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "10:30-11:30", 3, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "11:30-12:30", 4, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "12:30-13:30", 5, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "13:30-14:30", 6, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "14:30-15:30", 7, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "15:30-16:30", 8, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "16:30-17:30", 9, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "17:30-18:30", 10, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "18:30-19:30", 11, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "19:30-20:30", 12, null);
        r.setLink2(w);

        /**
         * *
         *
         * y esta de la sala del k
         */
        System.out.println("ejecutando tercera parte");
        r = new Nodo(true, "", "", "8:30-9:30", 1, null);
        q.setLink2(r);
        w = new Nodo(true, "", "", "9:30-10:30", 2, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "10:30-11:30", 3, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "11:30-12:30", 4, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "12:30-13:30", 5, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "13:30-14:30", 6, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "14:30-15:30", 7, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "15:30-16:30", 8, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "16:30-17:30", 9, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "17:30-18:30", 10, null);
        r.setLink2(w);
        r = new Nodo(true, "", "", "18:30-19:30", 11, null);
        w.setLink2(r);
        w = new Nodo(true, "", "", "19:30-20:30", 12, null);
        r.setLink2(w);

        /**
         * aqui se crea la otra lista que guarda los usuarios que reservan
         */
    }

    /**
     * aqui se crea la lista de las personas que reservas
     */
    public void creates() {

        y = RTP;
        while (y != null && can == false) {
            if (y.codigo.equals(cod)) {
                can = true;
            } else {
                y = y.link3;
            }
            //can = !y.codigo.equals(cod);//aqui verifica si el reservador ya esta en la lista            
        }
        //
        //
        if (can == false) {
            y = new Nodo(nom, cod, RTP, null);
            RTP = y;
            horario = (String) (model.getValueAt(row, 1));
            nomsala = List.getSelectedValue();
            z = new Nodo(nomsala, horario, cod, null);
            RTP.link4 = z;
        } else {
            horario = (String) (model.getValueAt(row, 1));
            nomsala = List.getSelectedValue();
            z = new Nodo(nomsala, horario, cod, null);
            z.link4 = y.link4;
            y.link4 = z;
            can = false;
        }

    }

    /**
     * esta subrutina se encarga de actualizar la tabla
     */
    public static void refresh() {
        q = p.link2;

        Table.selectAll();
        int[] rows = Table.getSelectedRows();
        for (int i = rows.length - 1; i >= 0; i--) {

            model.removeRow(rows[i]);

        }

        while (q != null) {
            if (q.libre == true) {
                sn = "SI";
            } else {
                sn = "NO";
            }
            Object[] fila = new Object[]{q.turno, q.horario, sn};
            model.addRow(fila);
            q = q.link2;

        }

    }

    /**
     * esta es la subrutina que hace las reservas
     */
    public void reserva() {
        q = p.link2;
        try {
            try {
                try {
                    try{
                    row = Table.getSelectedRow();
                    entera = Integer.parseInt(codfield.getText());
                    sw = true;
                    i = (int) (model.getValueAt(row, 0));
                    while (q != null && sw == true) {
                        if (q.libre == false && i == q.turno) {
                            JOptionPane.showMessageDialog(null, "ESTE HORARIO NO ESTA DISPONIBLE, POR FAVOR ELIJA OTRO");

                        } else if (i == q.turno && !"".equals(codfield.getText()) && !"".equals(nomfield.getText()) && q.libre == true) {

                            q.codigo = codfield.getText();
                            q.name = nomfield.getText();
                            q.libre = false;
                            sw = false;

                        } else if (codfield.getText().equals("") || "".equals(nomfield.getText())) {

                            JOptionPane.showMessageDialog(null, "NINGUNO DE LOS CAMPOS *NOMBRE* Y *CODIGO* PUEDEN ESTAR VACIOS, POR FAVOR COMPLETE EL FORMULARIO");
                            sw = false;
                        }
                        q = q.link2;
                    }
                    creates();
                    refresh();
                    }catch (ClassCastException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (NumberFormatException z) {
                    JOptionPane.showMessageDialog(null, z);
                }

            } catch (ArrayIndexOutOfBoundsException x) {
                JOptionPane.showMessageDialog(null, x);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * esta subrutina cancela las reservas
     */
    public void cancelar() {

        /**
         * AQUI ES CON LA PRIMERA LISTA, LA DE LA TABLA
         */
        if (codfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE DIGITAR UN CODIGO");
        } else {

            try {
                q = p.link2;
                row = Table.getSelectedRow();
                nomsala = List.getSelectedValue();
                cod = codfield.getText();
                entera = Integer.parseInt(cod);
                sw = true;
                i = (int) (model.getValueAt(row, 0));
                while (q != null && sw == true) {

                    if (q.turno == i && cod.equals(q.codigo)) {
                        q.codigo = "";
                        q.name = "";
                        q.libre = true;
                        sw = false;
                    }

                    q = q.link2;
                }
                if (sw == true) {
                    JOptionPane.showMessageDialog(null, "NO EXISTE TAL USUARIO CON RESERVA CON DICHO CODIGO");
                } else {
                    /**
                     * ACA ES CON LA SEGUNDA LISTA, LA DEL USUARIO CON SUS
                     * RESERVAS
                     */
                    sw = true;
                    horario = (String) (model.getValueAt(row, 1));
                    y = RTP;
                    while (y != null && sw == true) {

                        if (cod.equals(y.codigo)) {
                            anty = y;
                            y = y.link4;
                            ws = true;
                            while (y != null && ws == true) {
                                if (nomsala.equals(y.name) && horario.equals(y.horario)) {
                                    anty.link4 = y.link4;
                                    y.link4 = null;
                                    JOptionPane.showMessageDialog(null, "RESERVA CANCELADA");
                                    ws = false;
                                } else {
                                    anty = y;
                                    y = y.link4;
                                }
                            }
                            if (ws == true) {
                                JOptionPane.showMessageDialog(null, "ESTE USUARIO NO TIENE DERECHO A CANCELAR ESTA RESERVA YA QUE NO LE PERTENECE");
                            }
                            sw = false;
                        } else {
                            y = y.link3;
                        }
                    }
                }
                refresh();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e);
            }

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        Logo = new javax.swing.JLabel();
        imageSala = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomfield = new javax.swing.JTextField();
        codfield = new javax.swing.JTextField();
        Reservar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRESTAR SALAS LABORATORIO");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel1.setText("PRESTAMO DE SALAS");

        List.setBackground(new java.awt.Color(204, 204, 204));
        List.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SALON DE PROYECCIONES", "AUDITORIO", "AULA DEL K" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo Uninorte.png"))); // NOI18N

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NUM", "HORARIO", "DISPONIBILIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel4.setText("NOMBRE: ");

        jLabel5.setText("CODIGO:");

        Reservar.setText("RESERVAR");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel6.setText("PARA RESERVAR EN UN HORARIO, SELECCIONE EN LA TABLA Y");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel7.setText("DELE AL BOTON DE RESERVAR");

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel8.setText("SOLO EL CODIGO PARA CANCELAR");

        jButton1.setText("RESERVAS");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(Reservar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomfield, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codfield, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(110, 110, 110))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imageSala, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nomfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(codfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reservar)
                    .addComponent(cancelar)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(imageSala, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMouseClicked

        if (null != this.List.getSelectedValue()) /**
         * *
         * aqui se cambia la imagen cada vez que se selecciona algo en el JList
         */
        {
            switch (this.List.getSelectedValue()) {
                case "AUDITORIO":
                    imageSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Auditorio.jpg")));
                    p = PTR.link1;
                    refresh();
                    break;
                case "AULA DEL K":
                    imageSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AuladelK.jpg")));
                    p = PTR.link1.link1;
                    refresh();
                    break;
                case "SALON DE PROYECCIONES":
                    imageSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SalaProyecciones.jpg")));
                    p = PTR;
                    refresh();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_ListMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createMain();
    }//GEN-LAST:event_formWindowOpened

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        cod = codfield.getText();
        nom = nomfield.getText();
        reserva();
        codfield.setText("");
        nomfield.setText("");
    }//GEN-LAST:event_ReservarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        try {
            cancelar();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        codfield.setText("");
        nomfield.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MostrarReservas reserv = new MostrarReservas();
        reserv.setVisible(true);
        this.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Reservar;
    private static javax.swing.JTable Table;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codfield;
    private javax.swing.JLabel imageSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomfield;
    // End of variables declaration//GEN-END:variables
}
