/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package threads.lab7;
import java.io.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Window;
import javafx.stage.DirectoryChooser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.stage.FileChooser.ExtensionFilter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.json.*;


/**
 *
 * @author omarelshobky
 */
public class Paint extends javax.swing.JFrame implements DrawingEngine, Node {

    private Graphics g;
    private ArrayList<AbstractShape> S = new ArrayList<>();
    private HashMap<String, AbstractShape> hash = new HashMap<>();
    private Node parentNode;
    private Swindow swin;
    private Cwindow cwin;
    private lwindow lwin;
    private rwindow rwin;
    private twindow twin;
    private boolean drag = false;
    private boolean resize = false;
    
    /**
     * Creates new form Paint
     */
    public Paint() {
        initComponents();
        g = drawingBoard.getGraphics();
        drawingBoard.printComponents(g);
          
    }

    public HashMap<String, AbstractShape> retHash() {
        return hash;
    }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    @Override
    public Point getMousePosition() throws HeadlessException {
        return super.getMousePosition(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c = new javax.swing.JButton();
        sq = new javax.swing.JButton();
        l = new javax.swing.JButton();
        rec = new javax.swing.JButton();
        Colorize = new javax.swing.JButton();
        del = new javax.swing.JButton();
        Sel = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        drawingBoard = new javax.swing.JPanel();
        tri = new javax.swing.JButton();
        copybtn = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        saveBtn = new javax.swing.JMenuItem();
        loadBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        c.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        c.setForeground(new java.awt.Color(0, 0, 153));
        c.setText("Oval");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        sq.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        sq.setForeground(new java.awt.Color(0, 0, 153));
        sq.setText("Square");
        sq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqActionPerformed(evt);
            }
        });

        l.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        l.setForeground(new java.awt.Color(0, 0, 153));
        l.setText("Line Segment");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        rec.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        rec.setForeground(new java.awt.Color(0, 0, 153));
        rec.setText("Rectangle");
        rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recActionPerformed(evt);
            }
        });

        Colorize.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Colorize.setForeground(new java.awt.Color(0, 0, 153));
        Colorize.setText("Colorize");
        Colorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        del.setForeground(new java.awt.Color(153, 0, 0));
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Select Shape");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        drawingBoard.setBackground(new java.awt.Color(255, 255, 255));
        drawingBoard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingBoardMouseDragged(evt);
            }
        });
        drawingBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingBoardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingBoardMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout drawingBoardLayout = new javax.swing.GroupLayout(drawingBoard);
        drawingBoard.setLayout(drawingBoardLayout);
        drawingBoardLayout.setHorizontalGroup(
            drawingBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingBoardLayout.setVerticalGroup(
            drawingBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        tri.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        tri.setForeground(new java.awt.Color(0, 51, 153));
        tri.setText("Triangle");
        tri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triActionPerformed(evt);
            }
        });

        copybtn.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        copybtn.setText("Copy");
        copybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copybtnActionPerformed(evt);
            }
        });

        menubar.add(jMenu2);

        jMenu1.setText("File");

        saveBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jMenu1.add(saveBtn);

        loadBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });
        jMenu1.add(loadBtn);

        menubar.add(jMenu1);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sel, 0, 211, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Colorize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(del)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(copybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c)
                        .addGap(18, 18, 18)
                        .addComponent(l)
                        .addGap(18, 18, 18)
                        .addComponent(sq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rec)
                        .addGap(25, 25, 25)
                        .addComponent(tri))
                    .addComponent(drawingBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c)
                    .addComponent(sq)
                    .addComponent(l)
                    .addComponent(rec)
                    .addComponent(tri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Colorize)
                    .addComponent(del))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(copybtn)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(drawingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        if (cwin == null) {
            cwin = new Cwindow();
        }
        cwin.setParentNode(this);
        cwin.setVisible(true);
        
    }//GEN-LAST:event_cActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        if (lwin == null) {
            lwin = new lwindow();
        }
        lwin.setParentNode(this);
        lwin.setVisible(true);
    }//GEN-LAST:event_lActionPerformed


    private void sqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqActionPerformed
        if (swin == null) {
            swin = new Swindow();
        }
        swin.setParentNode(this);
        swin.setVisible(true);
    }//GEN-LAST:event_sqActionPerformed

    private void recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recActionPerformed
        if (rwin == null) {
            rwin = new rwindow();
        }
        rwin.setParentNode(this);
        rwin.setVisible(true);
    }//GEN-LAST:event_recActionPerformed

    private void ColorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeActionPerformed
        if(hash.containsKey(Sel.getSelectedItem())){
        AbstractShape s = hash.get(Sel.getSelectedItem());
        if ((s != null) && !(s instanceof Line) && (JOptionPane.showConfirmDialog(null, "Do you want to modify the fill color for the shape selected ?") == 0)) {
            JColorChooser colorChooser = new JColorChooser();
            Color c1 = JColorChooser.showDialog(null, "pick fill color", Color.black);
            s.setFillColor(c1);
        }
        s.setFilled(true);
        s.draw(g);}
    }//GEN-LAST:event_ColorizeActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        if(hash.containsKey(Sel.getSelectedItem())){
        AbstractShape s = hash.get(Sel.getSelectedItem());
        refresh(g);
        removeShape(s);}
    }//GEN-LAST:event_delActionPerformed

    private void drawingBoardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingBoardMousePressed
        Point p2 = drawingBoard.getMousePosition();
        System.out.println(p2);
        if (p2 != null) {
            for (AbstractShape s : S) {
                if (s.contains(p2) || s.doResize(p2)) {
                    refresh(g);
                    for(AbstractShape s2: S){
                        s2.draw(g);
                    }
                    Sel.setSelectedItem(s.getName());
                    s.drawpoints(g);
                    if(s.doResize(p2)){
                        System.out.println("resizing"+ s.getName());
                        resize = true;
                        return;
                    }
                    s.setDraggingPoint(p2);
                    drag = true;
                    return;
                }
            }
        }
        refresh(g);
        for(AbstractShape s2: S){
            s2.draw(g);
        }
        JSONArray j = new JSONArray();
        j.put(hash);
        System.out.println(j);
        resize = false;
        drag = false;
    }//GEN-LAST:event_drawingBoardMousePressed

    private void drawingBoardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingBoardMouseReleased
        Point p2 = drawingBoard.getMousePosition();
        if (p2 == null && drag) {
            refresh(g);
            removeShape(hash.get(Sel.getSelectedItem()));
        }
        else{
        }
        resize = false;
        drag = false;
    }//GEN-LAST:event_drawingBoardMouseReleased

    private void triActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triActionPerformed
        if (twin == null) {
            twin = new twindow();
        }
        twin.setParentNode(this);
        twin.setVisible(true);
    }//GEN-LAST:event_triActionPerformed

    private void drawingBoardMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingBoardMouseDragged
        if (resize){
            Point p2 = drawingBoard.getMousePosition();
            AbstractShape s1 = hash.get(Sel.getSelectedItem());
            if (p2 != null){
                s1.Resize(p2);
                refresh(g);
                for (AbstractShape s : S) {
                    if (!(s.equals(s1))) {
                        s.draw(g);
                    }
                }
                s1.draw(g);
                s1.drawpoints(g);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if (drag) {
            Point p2 = drawingBoard.getMousePosition();
            AbstractShape s1 = hash.get(Sel.getSelectedItem());
            if (p2 != null) {
                s1.moveTo(p2);
                s1.setDraggingPoint(p2);
                refresh(g);
                for (AbstractShape s : S) {
                    if (!(s.equals(s1))) {
                        s.draw(g);
                    }
                }
                s1.draw(g);
                s1.drawpoints(g);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_drawingBoardMouseDragged

    private void copybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copybtnActionPerformed
        if(hash.containsKey(Sel.getSelectedItem())){
            try {
                AbstractShape s = hash.get(Sel.getSelectedItem());
                AbstractShape s2 = s.retshapeObject();
                s2.setName(JOptionPane.showInputDialog(null,"insert a new name for the copied item"));
                addShape(s2);
                hash.put(s2.getName(), s2);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_copybtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        JFileChooser jfc = new JFileChooser();
        //FileSystemView.getFileSystemView().getHomeDirectory()
       FileNameExtensionFilter filter = new FileNameExtensionFilter("json", "json");
       jfc.setFileFilter(filter);
        int r = jfc.showOpenDialog(null);
       if(r == JFileChooser.APPROVE_OPTION){
           File f = jfc.getSelectedFile();
           int l = S.size();
           for(int i=0; i<l ; i++){
                refresh(g);
                S.remove(S.get(0));
                hash.remove(Sel.getSelectedItem());
                Sel.removeItem(Sel.getSelectedItem());
           }
           try{
                Scanner scan = new Scanner(f);
                String data = scan.next();
                JSONArray j = new JSONArray(data);
                for(int i = 0 ;i<j.length();i++){
                    JSONObject jo = j.getJSONObject(i);
                    String type = (String) jo.get("type");
                    switch (type) {
                        case "Line":{
                            Line line = new Line(jo.getString("name"),new Point(jo.getInt("px") , jo.getInt("py")),new Point(jo.getInt("p2x") , jo.getInt("p2y")));
                            line.setColor(new Color((int)jo.get("color")));
                            addShape(line);
                            hash.put(jo.getString("name"), line);
                            break;}
                        case "Oval":{
                            Circles Oval = new Circles(jo.getString("name"), jo.getInt("width"),  jo.getInt("length"), new Point(jo.getInt("px") , jo.getInt("py")));
                            Oval.setColor(new Color((int)jo.get("color")));
                            Oval.setFillColor(new Color((int)jo.get("Fill_Color")));
                            Oval.setFilled(jo.getBoolean("status"));
                            addShape(Oval);
                            hash.put(jo.getString("name"), Oval);
                            break;}
                        case "Rectangle":{
                            Rectangle rect = new Rectangle(jo.getInt("length"), jo.getInt("width"),  jo.getString("name") , new Point(jo.getInt("px") , jo.getInt("py")));
                            rect.setColor(new Color((int)jo.get("color")));
                            rect.setFillColor(new Color((int)jo.get("Fill_Color")));
                            rect.setFilled(jo.getBoolean("status"));
                            addShape(rect);
                            hash.put(jo.getString("name"), rect);
                            break;}
                        case "Triangle":{
                            Triangle triangle = new Triangle(jo.getString("name") ,new Point(jo.getInt("px") , jo.getInt("py")),new Point(jo.getInt("p2x") , jo.getInt("p2y")),new Point(jo.getInt("p3x") , jo.getInt("p3y")));
                            triangle.setColor(new Color((int)jo.get("color")));
                            triangle.setFillColor(new Color((int)jo.get("Fill_Color")));
                            triangle.setFilled(jo.getBoolean("status"));
                            addShape(triangle);
                            hash.put(jo.getString("name"), triangle);
                            break;}
                        default:
                            throw new AssertionError();
                    }
                        }
                
                
            }
           catch(Exception e){
               System.out.println("error");
           }
           
        }
       
    }//GEN-LAST:event_loadBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("json", "json");
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileFilter(filter);
        int res = fileChooser.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {            
            JSONArray Arr=new JSONArray();
       for (AbstractShape s : S)
               Arr.put(s.getlinRep());
        try {
            FileWriter file = new FileWriter(fileChooser.getSelectedFile().getAbsolutePath());
           
            file.write(Arr.toString());
            file.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File Not Found",
                    "Error occured while saving file", JOptionPane.ERROR_MESSAGE);

        }}
    }//GEN-LAST:event_saveBtnActionPerformed

    /*public javax.swing.JPanel getdrawingBoard(){
        return drawingBoard;
    }*/
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
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Colorize;
    private javax.swing.JComboBox<String> Sel;
    private javax.swing.JButton c;
    private javax.swing.JButton copybtn;
    private javax.swing.JButton del;
    private javax.swing.JPanel drawingBoard;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton l;
    private javax.swing.JMenuItem loadBtn;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JButton rec;
    private javax.swing.JMenuItem saveBtn;
    private javax.swing.JButton sq;
    private javax.swing.JButton tri;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addShape(Shape shape) {
        Sel.addItem(((AbstractShape) shape).getName());
        S.add((AbstractShape) shape);
        shape.draw(g);
        drawingBoard.printComponents(g);
    }

    @Override
    public void removeShape(Shape shape) {
        S.remove((AbstractShape) shape);
        hash.remove(Sel.getSelectedItem());
        Sel.removeItem(Sel.getSelectedItem());
        for (AbstractShape s : S) {
            s.draw(g);
        }

    }

    @Override
    public Shape[] getShapes() {
        Shape[] S2 = new Shape[S.size()];
        S2 = S.toArray(S2);
        return S2;
    }

    @Override
    public void refresh(Graphics canvas) {
        canvas.setColor(drawingBoard.getBackground());
        canvas.fillRect(0, 0, this.getWidth(), this.getHeight());

    }

    @Override
    public void setParentNode(Node n) {
        this.parentNode = n;
    }

    @Override
    public Node getParentNode() {
        return this.parentNode;
    }
}
