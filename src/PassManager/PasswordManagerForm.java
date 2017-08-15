/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassManager;

import ConnectionsPK.DBconnection;
import static PassManager.InterNet.netCheck;
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SuperUser
 */
public class PasswordManagerForm extends javax.swing.JInternalFrame {

    Connection con = null;
    /**
     * Creates new form PasswordManagerForm
     */
    public PasswordManagerForm() {
        initComponents();
        //con = DBconnection.connect();
        DBconnection conIns = DBconnection.getConnectionInstance();
        con = conIns.getConnection();
        //Load password table
        loadTable2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //A METHOD to load database data table to  jTable2
    public void loadTable2(){
    String sql2;
    sql2="SELECT id, target, email, username, password, about FROM data";
        try
        {
            PreparedStatement pst = con.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();
                if(rs.next())
                {
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));    
                }else
                {
                javax.swing.JOptionPane.showMessageDialog(null, "Hi,No Passwords data to display", "Welcome to PBM!",INFORMATION_MESSAGE);
                }
        }
        catch(SQLException | HeadlessException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Sorry, Try again later");
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        turlbox = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        webcontent = new javax.swing.JEditorPane();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        labelOK = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonUpdatePass = new javax.swing.JButton();
        jButtonDelPass = new javax.swing.JButton();
        jButtonAddPass = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jDecriptCode = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Manage Passwords");
        setPreferredSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(null);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Target URL: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username: ");

        jLabel4.setText("Password: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("About:");

        turlbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turlboxActionPerformed(evt);
            }
        });

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email: ");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add or Edit Passwords..");

        webcontent.setContentType(""); // NOI18N
        jScrollPane2.setViewportView(webcontent);
        webcontent.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Passsword:");

        jTextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPasswordKeyTyped(evt);
            }
        });

        labelOK.setBackground(new java.awt.Color(204, 204, 204));
        labelOK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelOK.setForeground(new java.awt.Color(255, 0, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setToolTipText("ToolBar");
        jPanel4.setOpaque(false);

        jButtonUpdatePass.setText("Update");
        jButtonUpdatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdatePassActionPerformed(evt);
            }
        });

        jButtonDelPass.setText("Delete");
        jButtonDelPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelPassActionPerformed(evt);
            }
        });

        jButtonAddPass.setText("Add");
        jButtonAddPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPassActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Reset");
        jButton4.setToolTipText("Load URL detail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText(" ↻");
        jButton3.setToolTipText("Load URL detail");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddPass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddPass)
                    .addComponent(jButtonUpdatePass)
                    .addComponent(jButtonDelPass)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOK, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turlbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldEmail, jTextFieldPassword, jTextFieldUsername, turlbox});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelOK, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(turlbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldEmail, jTextFieldPassword, jTextFieldUsername, turlbox});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 720, 200);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(null);
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);

        jDecriptCode.setToolTipText("4 Digit Pin");

        jButton1.setText("Decrypt");

        jSearch.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jSearchComponentRemoved(evt);
            }
        });
        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyReleased(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("4Digit Pin: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jDecriptCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDecriptCode)
                    .addComponent(jButton1)
                    .addComponent(jLabel8)
                    .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 230, 720, 48);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);

        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(153, 153, 153));
        jTable2.setMaximumSize(null);
        jTable2.setName(""); // NOI18N
        jTable2.setOpaque(false);
        jTable2.setPreferredSize(null);
        jTable2.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 290, 720, 205);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isura\\Documents\\NetBeansProjects\\PasswordManager\\BGmain.png")); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(750, 520));
        jLabel9.setMinimumSize(new java.awt.Dimension(750, 520));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 750, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turlboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turlboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turlboxActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed
//PASSWORD INSERT PART>>>
    private void jButtonAddPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPassActionPerformed
                    
        //input
            String targeturl = turlbox.getText();
            String userName = jTextFieldUsername.getText();
            String email = jTextFieldEmail.getText();
            String pass = jTextFieldPassword.getText();
            String webpanel =webcontent.getText();
            //checking if empty field available using array ?
            String values[]={targeturl,userName,email,pass,webpanel};
            boolean tf;          
            tf = InputValidater.validate(values);//Validate methods inputValidator class
            
            if(tf==true && targeturl.isEmpty()||userName.isEmpty()||email.isEmpty()||pass.isEmpty()||webpanel.isEmpty())
                {
                JOptionPane.showMessageDialog(null, "All fields are compulsory");
                }else
                {  
                    try
                    {
                    String pwordQuery ;
                    pwordQuery ="INSERT INTO data(target,email,username,password,about)"
                                +"VALUES('"+targeturl+"','"+email+"','"+userName+"','"+pass+"','"+webpanel+"')";
                    Statement stmt;
                    stmt = con.createStatement();
                    stmt.executeUpdate(pwordQuery);
                    labelOK.setText("Inserted ✔");
                    loadTable2();
                    }
                    catch(Exception e)
                    {
                    javax.swing.JOptionPane.showMessageDialog(null, "Sorry, Try Again later");
                    }
                }
  
            
    }//GEN-LAST:event_jButtonAddPassActionPerformed
//DELETE PASSWORDS
    private void jButtonDelPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelPassActionPerformed
        // TODO add your handling code here:
        //Check if the row selected
        int row = jTable2.getSelectedRow();
            if(row>-1)
            {        
            int x = javax.swing.JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
                if(x==0)
                {
                String delSql = null;

                    String id = jTable2.getValueAt(row, 0).toString();
                    Statement st;
                            try
                            {
                            delSql ="DELETE FROM data WHERE ID ='"+id+"' LIMIT 1";
                            st = con.createStatement();
                            st.executeUpdate(delSql);
                            loadTable2();
                            }
                            catch(Exception e)
                            {
                            javax.swing.JOptionPane.showMessageDialog(null, "Sorry, Try Deletion later");
                            }
                }
            }
            else
            {
            javax.swing.JOptionPane.showMessageDialog(null, "Please Select a row");
            }
        
    }//GEN-LAST:event_jButtonDelPassActionPerformed
//WeB Scrapping to get website Title 
    //Jsoup APN
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //webcontent.setContentType(title);
        boolean tf = netCheck();
        if(tf==false)
        {
        javax.swing.JOptionPane.showMessageDialog(null, "No Internet Connection/nPlease try again later");
        }
        else
        {
        String targeturl = turlbox.getText();
        String content;
        try
        {
        content = Jsoup1.scapper(targeturl);
        webcontent.setText(content);
        }
        catch(Exception e)
        {
        javax.swing.JOptionPane.showMessageDialog(null, "Sorry,/nTry again later");
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasswordKeyTyped
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jTextFieldPasswordKeyTyped

    //When Select a row , the values of the row are assigned to jtextfields
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int tRow = jTable2.getSelectedRow();
        if(tRow>-1){
            String i = jTable2.getValueAt(tRow, 0).toString();
            String t = jTable2.getValueAt(tRow, 1).toString();
            String e = jTable2.getValueAt(tRow, 2).toString();
            String u = jTable2.getValueAt(tRow, 3).toString();
            String p = jTable2.getValueAt(tRow, 4).toString();
            String a = jTable2.getValueAt(tRow, 5).toString();
            
            turlbox.setText(t);
            jTextFieldUsername.setText(e);
            jTextFieldEmail.setText(u);
            jTextFieldPassword.setText(p);
            webcontent.setText(a);
            
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonUpdatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdatePassActionPerformed
   
        int r = jTable2.getSelectedRow();
    //Check if a row is selected to update
        if(r>-1)
        {
                int x = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want/nto update");
                if(x==0)
                {
                    String sql;
                    Statement st;
                    String id = jTable2.getValueAt(r, 0).toString();

                    String url = turlbox.getText();
                    String mail = jTextFieldUsername.getText();
                    String uname = jTextFieldEmail.getText();
                    String pword = jTextFieldPassword.getText();
                    String content = webcontent.getText();
                        sql = "UPDATE data SET"
                                + " target='"+url+"', email='"+mail+"', username='"+uname+"', password='"+pword+"', about='"+content+"' "
                                        +" WHERE ID ='"+id+"' LIMIT 1 " ;
                        try
                        {
                        st = con.createStatement();
                            boolean rs = st.execute(sql);
                            //row updated
                            loadTable2();
                        }
                        catch(Exception e)
                        {
                        javax.swing.JOptionPane.showMessageDialog(null, "Sorry Try Later/n"+e, "Message", INFORMATION_MESSAGE);
                        }
                }
        }
        else
        {
        javax.swing.JOptionPane.showMessageDialog(null, "Please select a row/nto update", "Message", INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonUpdatePassActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            turlbox.setText("");
            jTextFieldUsername.setText("");
            jTextFieldEmail.setText("");
            jTextFieldPassword.setText("");
            webcontent.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

//    public void search(){
//    
//        
//       
//    }
    
    private void jSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyReleased
        // TODO add your handling code here:
        // search
       String txt = jSearch.getText();
        try
        {
        if(txt.trim().length()==0){
        //loadTable2();
        }else{
        String sql = "SELECT * FROM data WHERE "
                + " target = '%"+txt+"%' OR email LIKE '%"+txt+"%' OR email = '%"+txt+"%' OR about LIKE '%"+txt+"%' ";
        PreparedStatement pst;
        pst = con.prepareStatement(sql);
            ResultSet rS = pst.executeQuery();
                if(rS.next())
                {
                jTable2.setModel(DbUtils.resultSetToTableModel(rS));    
                }else
                {
                javax.swing.JOptionPane.showMessageDialog(null, "Hi,No Passwords data to display", "Welcome to PBM!",INFORMATION_MESSAGE);
                }            
        }
        }catch(SQLException | HeadlessException ex)
        {
        System.out.println(ex);
        }
    }//GEN-LAST:event_jSearchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // search
       String txt = jSearch.getText();
        try
        {
        if(txt.trim().length()==0){
        loadTable2();
        }else{
        String sql = "SELECT * FROM data WHERE "
                + " target = '%"+txt+"%' OR email LIKE '%"+txt+"%' OR email = '%"+txt+"%' OR about LIKE '%"+txt+"%' ";
        PreparedStatement pst;
        pst = con.prepareStatement(sql);
            ResultSet rS = pst.executeQuery();
                if(rS.next())
                {
                jTable2.setModel(DbUtils.resultSetToTableModel(rS));    
                }else
                {
                javax.swing.JOptionPane.showMessageDialog(null, "Hi,No Passwords data to display", "Welcome to PBM!",INFORMATION_MESSAGE);
                }            
        }
        }catch(SQLException | HeadlessException ex)
        {
        System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSearchComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jSearchComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAddPass;
    private javax.swing.JButton jButtonDelPass;
    private javax.swing.JButton jButtonUpdatePass;
    private javax.swing.JPasswordField jDecriptCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSearch;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel labelOK;
    private javax.swing.JTextField turlbox;
    private javax.swing.JEditorPane webcontent;
    // End of variables declaration//GEN-END:variables
}