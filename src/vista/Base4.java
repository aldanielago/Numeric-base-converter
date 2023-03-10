package vista;

import java.awt.Font;

public class Base4 extends javax.swing.JPanel {
    
    public Font font = new Font("Calibri Unicode MS", Font.ITALIC, 18);

    public Base4() {
        initComponents();
    }

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

        pnl_base2.setBackground(new java.awt.Color(181, 131, 141));
        pnl_base2.setMaximumSize(new java.awt.Dimension(690, 460));
        pnl_base2.setMinimumSize(new java.awt.Dimension(690, 460));

        lbl_base4.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base4.setText("Base 4: ");

        jtf_base4.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base4.setFont(font);

        lbl_base16.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base16.setText("Base 16: ");

        jtf_base16.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base16.setFont(font);

        jtf_base64.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base64.setFont(font);

        lbl_base64.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base64.setText("Base 64: ");

        jtf_base256.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base256.setFont(font);

        lbl_base256.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base256.setText("Base 256: ");

        javax.swing.GroupLayout pnl_base2Layout = new javax.swing.GroupLayout(pnl_base2);
        pnl_base2.setLayout(pnl_base2Layout);
        pnl_base2Layout.setHorizontalGroup(
            pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_base2Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_base4)
                    .addComponent(lbl_base16)
                    .addComponent(lbl_base64)
                    .addComponent(lbl_base256))
                .addGap(26, 26, 26)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_base256, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base64, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_base4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        pnl_base2Layout.setVerticalGroup(
            pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_base2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtf_base4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_base16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_base16, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base64)
                    .addComponent(jtf_base64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnl_base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base256, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_base256, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
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
    public javax.swing.JTextField jtf_base16;
    public javax.swing.JTextField jtf_base256;
    public javax.swing.JTextField jtf_base4;
    public javax.swing.JTextField jtf_base64;
    private javax.swing.JLabel lbl_base16;
    private javax.swing.JLabel lbl_base256;
    private javax.swing.JLabel lbl_base4;
    private javax.swing.JLabel lbl_base64;
    private javax.swing.JPanel pnl_base2;
    // End of variables declaration//GEN-END:variables
}
