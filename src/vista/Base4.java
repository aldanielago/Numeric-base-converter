package vista;

/**
 *
 * @author danib
 */
public class Base4 extends javax.swing.JPanel {

    /**
     * Creates new form Base2
     */
    public Base4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_base2 = new javax.swing.JPanel();
        lbl_base4 = new javax.swing.JLabel();
        jtf_base4 = new javax.swing.JTextField();
        lbl_base16 = new javax.swing.JLabel();
        jtf_base16 = new javax.swing.JTextField();
        jtf_base64 = new javax.swing.JTextField();
        lbl_base64 = new javax.swing.JLabel();
        jtf_base256 = new javax.swing.JTextField();
        lbl_base256 = new javax.swing.JLabel();
        panel_equivalencias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_equivalencias = new javax.swing.JLabel();
        jtf_equivalencias = new javax.swing.JTextField();

        pnl_base2.setBackground(new java.awt.Color(181, 131, 141));
        pnl_base2.setMaximumSize(new java.awt.Dimension(690, 460));
        pnl_base2.setMinimumSize(new java.awt.Dimension(690, 460));

        lbl_base4.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base4.setText("Base 4: ");

        jtf_base4.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base4.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        lbl_base16.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base16.setText("Base 16: ");

        jtf_base16.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base16.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        jtf_base64.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base64.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        lbl_base64.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base64.setText("Base 64: ");

        jtf_base256.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base256.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        lbl_base256.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base256.setText("Base 256: ");

        panel_equivalencias.setBackground(new java.awt.Color(181, 131, 141));

        lbl_equivalencias.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_equivalencias.setText("Equivalencias");

        jtf_equivalencias.setEditable(false);
        jtf_equivalencias.setBackground(new java.awt.Color(181, 131, 141));
        jtf_equivalencias.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        javax.swing.GroupLayout panel_equivalenciasLayout = new javax.swing.GroupLayout(panel_equivalencias);
        panel_equivalencias.setLayout(panel_equivalenciasLayout);
        panel_equivalenciasLayout.setHorizontalGroup(
            panel_equivalenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_equivalenciasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_equivalenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_equivalencias)
                    .addComponent(jtf_equivalencias, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_equivalenciasLayout.setVerticalGroup(
            panel_equivalenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_equivalenciasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_equivalenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_equivalencias)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jtf_equivalencias, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_base2Layout = new javax.swing.GroupLayout(pnl_base2);
        pnl_base2.setLayout(pnl_base2Layout);
        pnl_base2Layout.setHorizontalGroup(
            pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_base2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_base4)
                    .addComponent(lbl_base16)
                    .addComponent(lbl_base64)
                    .addComponent(lbl_base256))
                .addGap(18, 18, 18)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_base256, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base64, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(panel_equivalencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnl_base2Layout.setVerticalGroup(
            pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_base2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_equivalencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_base2Layout.createSequentialGroup()
                        .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_base4)
                            .addComponent(jtf_base4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_base16)
                            .addComponent(jtf_base16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_base64)
                            .addComponent(jtf_base64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_base256)
                            .addComponent(jtf_base256, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtf_base16;
    private javax.swing.JTextField jtf_base256;
    private javax.swing.JTextField jtf_base4;
    private javax.swing.JTextField jtf_base64;
    private javax.swing.JTextField jtf_equivalencias;
    private javax.swing.JLabel lbl_base16;
    private javax.swing.JLabel lbl_base256;
    private javax.swing.JLabel lbl_base4;
    private javax.swing.JLabel lbl_base64;
    private javax.swing.JLabel lbl_equivalencias;
    private javax.swing.JPanel panel_equivalencias;
    private javax.swing.JPanel pnl_base2;
    // End of variables declaration//GEN-END:variables
}