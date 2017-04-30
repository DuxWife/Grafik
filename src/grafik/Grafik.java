package grafik;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
public class Grafik extends javax.swing.JFrame {
    public Grafik() {
        super("График функции");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Заданный отрезок [");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText(";");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("]");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Коэффициенты:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("a=");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("b=");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("y=1/Cos(x+a)+b");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Построить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 484, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double z=Double.parseDouble(jTextField1.getText()), x=Double.parseDouble(jTextField2.getText()), a=Double.parseDouble(jTextField3.getText());  
    double b=Double.parseDouble(jTextField4.getText());   
    Graphics g=jPanel1.getGraphics();
    g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
    g.setColor(Color.BLACK);
    int w = 0, wy = 0;
    if (z<=0&x>=0) w=(int)x-(int)z+2;   
    else{
      if (z>0) w=(int)x+2;
      if (x<0) w=-(int)z+2;
    }
    // ось x и стрелка
    g.drawLine(0, jPanel1.getHeight()/2, jPanel1.getWidth(), jPanel1.getHeight()/2);
    g.drawLine(jPanel1.getWidth()-10, jPanel1.getHeight()/2-5, jPanel1.getWidth(), jPanel1.getHeight()/2);
    g.drawLine(jPanel1.getWidth()-10, jPanel1.getHeight()/2+5, jPanel1.getWidth(), jPanel1.getHeight()/2);    
    double h=(double)w/jPanel1.getWidth(), hh=(double)jPanel1.getWidth()/w;
     if (z<=0&x>=0) wy=(int)((-(int)z+1)*hh);   
        else{
      if (z>0) wy=(int)hh;
      if (x<0) wy=jPanel1.getWidth()-(int)hh;
    }
     // ось у и стрелка
    g.drawLine(wy, 0, wy, jPanel1.getHeight());
    g.drawLine(wy, 0, wy-5, 10);
    g.drawLine(wy, 0, wy+5, 10);
    g.setColor(Color.GREEN);
    double c=hh;
    // разметка
    for (int i=1;i<w;i++)
        if ((int)c!=wy) {
        g.drawLine((int)c, 0, (int)c, jPanel1.getHeight());
        c=c+hh;
    } else c=c+hh;
    c=hh;
    while (jPanel1.getHeight()/2+(int)c<jPanel1.getHeight()) {
        g.drawLine(0, jPanel1.getHeight()/2+(int)c, jPanel1.getWidth(), jPanel1.getHeight()/2+(int)c);
        c=c+hh;
    }
    c=-hh;
    while (jPanel1.getHeight()/2+(int)c>0) {
        g.drawLine(0, jPanel1.getHeight()/2+(int)c, jPanel1.getWidth(), jPanel1.getHeight()/2+(int)c);
        c=c-hh;
    }
    g.setColor(Color.BLACK);
    // оцифровка
       // ось ox
    Font f=g.getFont();
    g.setFont(new Font(f.getFontName(),f.getStyle(),14));
    FontMetrics fm=g.getFontMetrics();
    c=hh;
    double p=1;
    String o="";
    if (z<=0&x>=0) { 
        for (int i=(int)z;i<=(int)x;i++){
        String s=Integer.toString(i); 
        if (s.equals("0")){
          g.drawString(s, (int)c+1, jPanel1.getHeight()/2+fm.getHeight());  
          p=c+1; o=s;
        } else {
        if ((int)c-fm.stringWidth(s)/2>(int)p+fm.stringWidth(o)) {
            g.drawString(s, (int)c-fm.stringWidth(s)/2, jPanel1.getHeight()/2+fm.getHeight());
            p=c-fm.stringWidth(s)/2; o=s;
        }  }
        c=c+hh;
    }
    } else{
        if (z>0){
           for (int i=0;i<=(int)x;i++){
           String s=Integer.toString(i); 
           if (s.equals("0")){
             g.drawString(s, (int)c+1, jPanel1.getHeight()/2+fm.getHeight());  
             p=c+1; o=s;
           } else {
           if ((int)c-fm.stringWidth(s)/2>(int)p+fm.stringWidth(o)) {
               g.drawString(s, (int)c-fm.stringWidth(s)/2, jPanel1.getHeight()/2+fm.getHeight());
               p=c-fm.stringWidth(s)/2; o=s;
           }  }
           c=c+hh;
          }
       }        
        if (x<0){
            for (int i=(int)z;i<=0;i++){
           String s=Integer.toString(i); 
           if (s.equals("0")){
             g.drawString(s, (int)c+1, jPanel1.getHeight()/2+fm.getHeight());  
             p=c+1; o=s;
           } else {
           if ((int)c-fm.stringWidth(s)/2>(int)p+fm.stringWidth(o)) {
               g.drawString(s, (int)c-fm.stringWidth(s)/2, jPanel1.getHeight()/2+fm.getHeight());
               p=c-fm.stringWidth(s)/2; o=s;
           }  }
           c=c+hh;
          }
        }
    }
       // ось oy
    c=jPanel1.getHeight()/2-hh;
    p=jPanel1.getHeight();
    int j=1;    
    while ((int)c-fm.getHeight()/2>0){
        String s=Integer.toString(j);
         if ((int)c+fm.getHeight()/2<=(int)p) {
            g.drawString(s, wy+2, (int)c+fm.getHeight()/2);
            p=(int)c-fm.getHeight()/2;
        }
        c=c-hh; j++;
    }
    c=jPanel1.getHeight()/2+hh;
    p=jPanel1.getHeight()/2+fm.getHeight()-6;
    j=-1;  
    while ((int)c+fm.getHeight()/2<jPanel1.getHeight()){
        String s=Integer.toString(j);
         if ((int)c-fm.getHeight()/2>=(int)p) {
            g.drawString(s, wy+2, (int)c+fm.getHeight()/2);
            p=(int)c+fm.getHeight()/2;
        }
        c=c+hh; j--;
    }
    g.drawString("x", jPanel1.getWidth()-fm.stringWidth("x"), jPanel1.getHeight()/2-6);
    g.drawString("y", wy-8-fm.stringWidth("y"), fm.getHeight()-6);
    // построение графика
    double y=-(1/Math.cos(z+a)+b),y1;
    for (int i=wy+(int)(z*hh);i<=wy+(int)(x*hh);i++) {    
        y1=y;
        y=-(1/Math.cos(z+a)+b);
        if ((int)(y1*hh)+jPanel1.getHeight()/2>=0&(int)(y1*hh)+jPanel1.getHeight()/2<=jPanel1.getHeight()&(int)(y*hh)+jPanel1.getHeight()/2>=0&(int)(y*hh)+jPanel1.getHeight()/2<=jPanel1.getHeight()) {
           if (((int)(y1*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh&(int)(y*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh)|((int)(y1*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh&(int)(y*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh)) 
               g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, (int)(y*hh)+jPanel1.getHeight()/2);
           else {
               if ((int)(y1*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, jPanel1.getHeight());
               if ((int)(y*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh) g.drawLine(i, (int)(y*hh)+jPanel1.getHeight()/2, i, jPanel1.getHeight());
               if ((int)(y1*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, 0);
               if ((int)(y*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh) g.drawLine(i, (int)(y*hh)+jPanel1.getHeight()/2, i, 0);
           }
           }
        else {
            if ((int)(y1*hh)+jPanel1.getHeight()/2>=0&(int)(y1*hh)+jPanel1.getHeight()/2<=jPanel1.getHeight()){
                if ((int)(y1*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh){
                    if ((int)(y*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, (int)(y*hh)+jPanel1.getHeight()/2);
                    else g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, jPanel1.getHeight());
                }
                if ((int)(y1*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh){
                    if ((int)(y*hh)+jPanel1.getHeight()/2<0) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, (int)(y*hh)+jPanel1.getHeight()/2);
                    else g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, 0);
                }
            }
            if ((int)(y*hh)+jPanel1.getHeight()/2>=0&(int)(y*hh)+jPanel1.getHeight()/2<=jPanel1.getHeight()) {
                if ((int)(y*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()/2-(int)b*hh){
                    if ((int)(y1*hh)+jPanel1.getHeight()/2>jPanel1.getHeight()) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, (int)(y*hh)+jPanel1.getHeight()/2);
                    else g.drawLine(i, (int)(y*hh)+jPanel1.getHeight()/2, i, jPanel1.getHeight());
                }
                if ((int)(y*hh)+jPanel1.getHeight()/2<jPanel1.getHeight()/2-(int)b*hh){
                    if ((int)(y1*hh)+jPanel1.getHeight()/2<0) g.drawLine(i, (int)(y1*hh)+jPanel1.getHeight()/2, i, (int)(y*hh)+jPanel1.getHeight()/2);
                    else g.drawLine(i, (int)(y*hh)+jPanel1.getHeight()/2, i, 0);
                }
            } 
        }
        z=z+h;
    }
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
            java.util.logging.Logger.getLogger(Grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}