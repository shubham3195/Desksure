/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interfaces;

import core.DataTable;
import core.EncryptionEngine;
import core.Main;
import core.Resources;
import icons.fileicons.IconProvider;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import support_code.FileStatus;
import support_code.Log;
import support_code.Logs;
import support_code.UserFile;
import support_code.UserFiles;

/**
 *
 * @author Suraj Malviya
 */
public class ManageFile extends javax.swing.JFrame {

    /**
     * Creates new form ManageFolder
     */
    private AdminDashboard dashboard;
    private Resources myResource;
    private UserFiles allFiles;
    DefaultTableModel model;
    private Logs allLogs;
    public ManageFile() 
    {
        initComponents();
         setIconImage(Main.resources.giveImageIcon());
        DataTable.makeManageFileTable(manageFileTable);
        model=(DefaultTableModel) manageFileTable.getModel();
        myResource=Resources.getResourceInstance();
        this.allLogs=myResource.getUserLogs();
    }
    
    public ManageFile(AdminDashboard dashboard)
    {
        initComponents();
         setIconImage(Main.resources.giveImageIcon());
        this.dashboard=dashboard;
        myResource=Resources.getResourceInstance();
        DataTable.makeManageFileTable(manageFileTable);
        allFiles=myResource.getUserFiles();
        model=(DefaultTableModel) manageFileTable.getModel();
        encrypt_label.setVisible(false);
        encrypt_label1.setVisible(false);
          this.allLogs=myResource.getUserLogs();
        allFiles.getUserfiles().forEach((userFile)->
        {
            String name=userFile.getFile().getName();
            String path=userFile.getFile().getPath();
            String addedBy=userFile.getAddedBy().getName();
            model.addRow(new Object[]{name,path,addedBy});
        });
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageFileTable = new javax.swing.JTable();
        encrypt_label = new javax.swing.JLabel();
        encrypt_label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage File");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage-file.png"))); // NOI18N
        jLabel3.setText(" MANAGE FILES");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file-removexs.png"))); // NOI18N
        jLabel6.setText("Remove File");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filexs.png"))); // NOI18N
        jLabel2.setText(" ADD FILE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        manageFileTable.setAutoCreateRowSorter(true);
        manageFileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FileName", "Path", "Added By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manageFileTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        manageFileTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageFileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageFileTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageFileTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(manageFileTable);

        encrypt_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        encrypt_label.setForeground(new java.awt.Color(153, 0, 0));
        encrypt_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        encrypt_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileicons/file-lock.png"))); // NOI18N
        encrypt_label.setText(" ENCRYPTED");

        encrypt_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        encrypt_label1.setForeground(new java.awt.Color(153, 0, 0));
        encrypt_label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        encrypt_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileicons/file-lock.png"))); // NOI18N
        encrypt_label1.setText("DECRYPT FILE ");
        encrypt_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encrypt_label1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6)
                                .addGap(23, 23, 23)
                                .addComponent(encrypt_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(encrypt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(encrypt_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encrypt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    JFileChooser chooser;   
    chooser = new JFileChooser("C:\\Users\\Suraj Malviya\\Desktop");
    chooser.setMultiSelectionEnabled(false);
    int approve=chooser.showOpenDialog(this);
    if(approve==JFileChooser.APPROVE_OPTION)
    {
        File newFile=chooser.getSelectedFile();
        
        String path=newFile.getPath();
        String fileExtension=Resources.fetchFileExtension(path);
        
        int i=JOptionPane.showConfirmDialog(this,"Do you really want to Secure this File using DeskSure ?");
        if(i==0)
        {
            try 
            {
                
                UserFile file=new UserFile(newFile, fileExtension, dashboard.getAdminUser(), FileStatus.DECRYPTED);
                EncryptionEngine.encryptFile(newFile);
                file.setEncrypted(true);
                allFiles.addFile(file);
                allFiles.saveFilesObject();
                String timeStamp=new SimpleDateFormat("hh:mm a").format(new Date());
                Log addFileLog=new Log(this.dashboard.getAdminUser().getName(), timeStamp, "File Added :"+path);
                allLogs.addLog(addFileLog);
                allLogs.saveLogsObject();
                JOptionPane.showMessageDialog(this, "File Successfully Encryoted and Added !");
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
          
            
        }
    }                // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
    private int row=-1;
    private final IconProvider icons=new IconProvider();
    private void manageFileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFileTableMouseClicked
     row=manageFileTable.getSelectedRow();
    
     encrypt_label.setVisible(true);
     encrypt_label1.setVisible(true);
     if(allFiles.getUserfiles().get(row).isEnrypted())
     {
        encrypt_label.setIcon(new ImageIcon(icons.file_lock));
        encrypt_label.setText(" ENCRYPTED");
        encrypt_label1.setText("DECRYPT FILE");
        encrypt_label1.setIcon(new ImageIcon(icons.file_unlock));
     }
     else
     {
        encrypt_label.setIcon(new ImageIcon(icons.file_unlock));
        encrypt_label.setText(" DECRYPTED");
        encrypt_label1.setText("ENCRYPT FILE");
        encrypt_label1.setIcon(new ImageIcon(icons.file_lock));
     }
    }//GEN-LAST:event_manageFileTableMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    if(row!=-1)
    {
        
        String timeStamp=new SimpleDateFormat("hh:mm a").format(new Date());
        UserFile userFile=allFiles.getUserfiles().get(row);
        File currentFile=userFile.getFile();
        int confirm=JOptionPane.showConfirmDialog(this,"Do you really want to remove the File:\n"+currentFile.getName());
        if(confirm==0)
        {
            if(currentFile.exists())
            {
                if(userFile.isEnrypted())
                {
                    System.err.println("Decrypting"+currentFile.getName());
                    try 
                    {
                        EncryptionEngine.decrpytFile(currentFile);
                        userFile.setEncrypted(false);
                         System.err.println("File: "+currentFile.getName()+" Decrypted Successfully");
                    } 
                    catch (Exception ex) 
                    {
                       ex.printStackTrace();
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"File is missing from the location !");
            }

            System.err.println("Removing File from the DeskSure !");  

            allFiles.removeFile(userFile);
            try 
            {
                allFiles.saveFilesObject();
                model.removeRow(row);
                Log removeFile=new Log(this.dashboard.getAdminUser().getName(), timeStamp, "File Removed: "+userFile.getFile().getName());
                allLogs.addLog(removeFile);
                allLogs.saveLogsObject();
                row=-1;    
                JOptionPane.showMessageDialog(this, "File Successfully removed !");
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Select a File !");
    }

    }//GEN-LAST:event_jLabel6MouseClicked

    private void manageFileTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFileTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_manageFileTableMouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
    encrypt_label.setVisible(false);
    encrypt_label1.setVisible(false);  
    row=-1;// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void encrypt_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encrypt_label1MouseClicked
    if(row!=-1)
    {
        UserFile current_file=allFiles.getUserfiles().get(row);
        if(current_file.getFile().exists())
        {
            if(encrypt_label1.getText().equalsIgnoreCase("encrypt file"))
            {
                if(!current_file.isEnrypted())
                {
                    try 
                    {
                       int confirm=JOptionPane.showConfirmDialog(this,"Do you want to Encrypt the File: \n"+
                               current_file.getFile().getName());
                       if(confirm==0)
                       {
                            System.err.println("Encrypting File: "+current_file.getFile().getName());
                            EncryptionEngine.encryptFile(current_file.getFile());
                            System.err.println("File is Encrypted !");
                            encrypt_label.setIcon(new ImageIcon(icons.file_lock));
                            encrypt_label.setText(" ENCRYPTED");
                            encrypt_label1.setIcon(new ImageIcon(icons.file_unlock));
                            encrypt_label1.setText("DECRYPT FILE");
                            current_file.setEncrypted(true);
                            JOptionPane.showMessageDialog(this, "FILE ENCRYPTED SUCCESSFULLY !");
                       }
                    }
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }

                }
            }   
            else
            {
                 if(current_file.isEnrypted())
                {
                    try 
                    {
                        int confirm=JOptionPane.showConfirmDialog(this,"Do you want to Decrypt the File: \n"+
                               current_file.getFile().getName());
                        if(confirm==0)
                        {
                            System.err.println("Decrypting File: "+current_file.getFile().getName());
                            EncryptionEngine.decrpytFile(current_file.getFile());
                            System.err.println("File is Decrypted !");
                            encrypt_label.setIcon(new ImageIcon(icons.file_unlock));
                            encrypt_label.setText(" DECRYPTED");
                            encrypt_label1.setIcon(new ImageIcon(icons.file_lock));
                            encrypt_label1.setText("ENCRYPT FILE");
                            current_file.setEncrypted(false);
                            JOptionPane.showMessageDialog(this, "FILE DECRYPTED SUCCESSFULLY !");
                        }
                    }
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            try {
                allFiles.saveFilesObject();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"File is Missing from Location !");
        }
    }


// TODO add your handling code here:
    }//GEN-LAST:event_encrypt_label1MouseClicked

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
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encrypt_label;
    private javax.swing.JLabel encrypt_label1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageFileTable;
    // End of variables declaration//GEN-END:variables
}
