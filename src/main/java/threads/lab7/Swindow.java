/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package threads.lab7;

import java.awt.Color;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author omarelshobky
 */
public class Swindow extends javax.swing.JFrame implements Node{

    private Node parentNode;
    public void setParentNode(Node n) {
        this.parentNode = n;
    }

    @Override
    public Node getParentNode() {
        return this.parentNode;
    } 
    /**
     * Creates new form Swindow
     */
    public Swindow() {
        initComponents();
        setTitle("Square");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pos = new javax.swing.JTextField();
        length = new javax.swing.JTextField();
        Bcolor = new javax.swing.JButton();
        Fcolor = new javax.swing.JButton();
        Done = new javax.swing.JButton();

        setTitle("Square");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Position");

        jLabel3.setText("Side length");

        Bcolor.setText("Border Color");
        Bcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcolorActionPerformed(evt);
            }
        });

        Fcolor.setText("Fill Color");
        Fcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcolorActionPerformed(evt);
            }
        });

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bcolor)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Done)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(length, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(pos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(Fcolor)
                        .addContainerGap(104, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcolor)
                    .addComponent(Fcolor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Done)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private Color c1,c2;
    private void BcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcolorActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        c1 = JColorChooser.showDialog(null, "pick drawing color", Color.black);
    }//GEN-LAST:event_BcolorActionPerformed

    private void FcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcolorActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        c2 = JColorChooser.showDialog(null, "pick fill color", Color.black);  
    }//GEN-LAST:event_FcolorActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
       if(name.getText().isEmpty() || pos.getText().isEmpty() || length.getText().isEmpty() ){
             JOptionPane.showMessageDialog(null, "please dont leave any empty fields");
             return;
        }
        if(((Paint)getParentNode()).retHash() != null){
        if (((Paint)getParentNode()).retHash().containsKey(name.getText())){
             JOptionPane.showMessageDialog(null, "please enter a unique name for the shape");
             return;
        }}
        String[] co = pos.getText().split(",");
        Rectangle s = new Rectangle(Integer.parseInt(length.getText()), Integer.parseInt(length.getText()), name.getText(), new Point(Integer.parseInt(co[0]),Integer.parseInt(co[1])));
        if(c1!= null){s.setColor(c1);}
        if(c2!=null){s.setFillColor(c2);}
        ((Paint)getParentNode()).retHash().put(name.getText(), s);
        JOptionPane.showMessageDialog(null, "Square "+ name.getText() + " was added successfully ");
        setVisible(false);
        name.setText("");
        pos.setText("");
        length.setText("");
        ((Paint)getParentNode()).addShape(s);
    }//GEN-LAST:event_DoneActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        name.setText("");
        pos.setText("");
        length.setText("");
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Swindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcolor;
    private javax.swing.JButton Done;
    private javax.swing.JButton Fcolor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField length;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pos;
    // End of variables declaration//GEN-END:variables
}
