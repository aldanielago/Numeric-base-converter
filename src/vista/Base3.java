package vista;

import java.awt.Font;

public class Base3 extends javax.swing.JPanel {
    
    public Font font = new Font("Calibri Unicode MS", Font.ITALIC, 18);

    public Base3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_base3 = new javax.swing.JPanel();
        lbl_base3 = new javax.swing.JLabel();
        jtf_base3 = new javax.swing.JTextField();
        lbl_base9 = new javax.swing.JLabel();
        jtf_base9 = new javax.swing.JTextField();
        lbl_base8 = new javax.swing.JLabel();
        jtf_base27 = new javax.swing.JTextField();
        lbl_base16 = new javax.swing.JLabel();
        jtf_base81 = new javax.swing.JTextField();

        pnl_base3.setBackground(new java.awt.Color(181, 131, 141));
        pnl_base3.setMaximumSize(new java.awt.Dimension(690, 460));
        pnl_base3.setMinimumSize(new java.awt.Dimension(690, 460));

        lbl_base3.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base3.setText("Base 3: ");

        jtf_base3.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base3.setFont(font);

        lbl_base9.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base9.setText("Base 9: ");

        jtf_base9.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base9.setFont(font);

        lbl_base8.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base8.setText("Base 27: ");

        jtf_base27.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base27.setFont(font);

        lbl_base16.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base16.setText("Base 81: ");

        jtf_base81.setBackground(new java.awt.Color(229, 152, 155));
        jtf_base81.setFont(font);

        javax.swing.GroupLayout pnl_base3Layout = new javax.swing.GroupLayout(pnl_base3);
        pnl_base3.setLayout(pnl_base3Layout);
        pnl_base3Layout.setHorizontalGroup(
            pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_base3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_base3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_base9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_base8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_base16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_base3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jtf_base9, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jtf_base27, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jtf_base81, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(190, 190, 190))
        );
        pnl_base3Layout.setVerticalGroup(
            pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_base3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_base3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jtf_base9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base8)
                    .addComponent(jtf_base27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnl_base3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_base16)
                    .addComponent(jtf_base81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField jtf_base27;
    public javax.swing.JTextField jtf_base3;
    public javax.swing.JTextField jtf_base81;
    public javax.swing.JTextField jtf_base9;
    private javax.swing.JLabel lbl_base16;
    private javax.swing.JLabel lbl_base3;
    private javax.swing.JLabel lbl_base8;
    private javax.swing.JLabel lbl_base9;
    private javax.swing.JPanel pnl_base3;
    // End of variables declaration//GEN-END:variables
}
