/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interfaces;

import com.intel.bluetooth.RemoteDeviceHelper;
import core.Bluetooth;
import core.Main;
import core.Resources;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.RemoteDevice;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import support_code.Log;
import support_code.Logs;
import support_code.User;
import support_code.Users;
/**
 *
 * @author Suraj Malviya
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    
     private DefaultListModel defaultModel;
     private List<RemoteDevice> availableDevices;
     private Map<Integer, RemoteDevice> availableMap;
     private  Bluetooth bluetoothSupport;
     private RemoteDevice selectedDevice;
     private AdminDashboard dashboard;
     private Resources myResource;
     private Logs allLogs;
     
   //  Loading loading=new Loading();
     public AddUser() 
    {
        initComponents();
         setIconImage(Main.resources.giveImageIcon());
        defaultModel=new DefaultListModel();
        availableDevices=new ArrayList<>();
        availableMap=new HashMap<>();
        myResource=Resources.getResourceInstance();
        title.setText("ADD ADMIN");
        this.allLogs=myResource.getUserLogs();
         this.admin.setSelected(true);
         this.naive.setEnabled(false);
      //  searching.setVisible(false);
        //bluetoothSupport=new Bluetooth();
    }

     public AddUser(AdminDashboard dashboard) 
    {
        initComponents();
   //     jLabel1.setVisible(false);
    setIconImage(Main.resources.giveImageIcon());
   defaultModel=new DefaultListModel();
        availableDevices=new ArrayList<>();
        availableMap=new HashMap<>();
        this.dashboard=dashboard;
         myResource=Resources.getResourceInstance();
           this.allLogs=myResource.getUserLogs();
       //  loading.setPriority(10);
        
//  searching.setVisible(false);
        //bluetoothSupport=new Bluetooth();
    }
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        searching = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        name = new javax.swing.JLabel();
        btadd = new javax.swing.JLabel();
        pair = new javax.swing.JLabel();
        deviceName = new javax.swing.JLabel();
        deviceBTAddress = new javax.swing.JLabel();
        paired = new javax.swing.JLabel();
        pairButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        searching1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        searching3 = new javax.swing.JLabel();
        naive = new javax.swing.JRadioButton();
        admin = new javax.swing.JRadioButton();
        pair1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        searching.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        searching.setText("Searching For Nearby Active Bluetooth Devices...");

        list.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listFocusLost(evt);
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        name.setText("Device Name:");
        name.setEnabled(false);

        btadd.setText("Bluetooth Address:");
        btadd.setEnabled(false);

        pair.setText("Paired:");
        pair.setEnabled(false);

        deviceName.setText("choose device !");
        deviceName.setEnabled(false);

        deviceBTAddress.setText("choose device !");
        deviceBTAddress.setEnabled(false);

        paired.setText("choose device !");
        paired.setEnabled(false);

        pairButton.setText("Pair Device");
        pairButton.setEnabled(false);
        pairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pairButtonActionPerformed(evt);
            }
        });

        addUserButton.setText("Add User");
        addUserButton.setEnabled(false);
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        searching1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N

        title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        title.setText("ADD USER");

        searching3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        searching3.setText("List of Available Devices...");

        buttonGroup1.add(naive);
        naive.setSelected(true);
        naive.setText("Naive");
        naive.setEnabled(false);

        buttonGroup1.add(admin);
        admin.setText("Admin");
        admin.setEnabled(false);

        pair1.setText("User Type:");
        pair1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name)
                                            .addComponent(btadd)
                                            .addComponent(pair)
                                            .addComponent(pair1))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(admin)
                                                .addGap(18, 18, 18)
                                                .addComponent(naive))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(deviceName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deviceBTAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(paired, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(pairButton)
                                        .addGap(29, 29, 29)
                                        .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searching3)
                                .addGap(18, 18, 18)
                                .addComponent(searching))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(searching1)
                        .addGap(18, 18, 18)
                        .addComponent(title)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searching1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searching3)
                    .addComponent(searching))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(deviceName))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btadd)
                            .addComponent(deviceBTAddress))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pair, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paired))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naive)
                            .addComponent(admin)
                            .addComponent(pair1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pairButton)
                            .addComponent(addUserButton))))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void enableElements(boolean make)
    {
        name.setEnabled(make);
        btadd.setEnabled(make);
        pair.setEnabled(make);
        deviceName.setEnabled(make);
        deviceBTAddress.setEnabled(make);
        paired.setEnabled(make);
       naive.setEnabled(make);
       admin.setEnabled(make);
    }
    
    
    
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if(list.getSelectedValue()!=null){
            enableElements(true);

            selectedDevice= availableMap.get(list.getSelectedIndex());

            String formattedBTAddress=Resources.getFormattedAddress(selectedDevice.getBluetoothAddress());

            deviceBTAddress.setText(formattedBTAddress);

            boolean isPaired=selectedDevice.isTrustedDevice();

            paired.setText(isPaired?"Yes":"No");

            try 
            {
                deviceName.setText(selectedDevice.getFriendlyName(false));

            } 
            catch (IOException e)
            {
                e.printStackTrace();
            }

            pairButton.setEnabled(!isPaired);
            addUserButton.setEnabled(isPaired);
        }
    }//GEN-LAST:event_listMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

     
        list.setModel(defaultModel);

        try 
        {
       
            bluetoothSupport=myResource.getBluetoothStack();
            int i=0;
            availableDevices=bluetoothSupport.searchAvailableDevices();
            
            for(RemoteDevice device: availableDevices)
            {
                String friendlyName=device.getFriendlyName(true);
              //  String bluetoothAddress=device.getBluetoothAddress();
                defaultModel.addElement(friendlyName);
                availableMap.put(i, device);
                searching.setText("Search Completed ! Choose device to add as User");
                i++;
                
            }
            
        }
        catch (BluetoothStateException bse) 
        {
            bse.printStackTrace();
        }
        catch(IOException ie)
        {
            ie.printStackTrace();
        } 
         
      
     

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     //  loading.start();
     // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void listFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listFocusLost
      //  enableElements(false);        // TODO add your handling code here:
    }//GEN-LAST:event_listFocusLost

    private void pairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pairButtonActionPerformed
    if(selectedDevice!=null)
    {
         String timeStamp=new SimpleDateFormat("hh:mm a").format(new Date());
        Log pairLog=null;
        try
        {
            int pairingStatus=bluetoothSupport.pairingDevice(selectedDevice); 
            System.err.println("open connections after adding user: "+RemoteDeviceHelper.openConnections());
            if(pairingStatus==1)
            {
                JOptionPane.showMessageDialog(this,"Device Successfully Paired !");
                addUserButton.setEnabled(true);
                pairButton.setEnabled(false);
                if(!title.getText().contains("ADMIN"))
                {
                             
                pairLog=new Log(this.dashboard.getAdminUser().getName(),timeStamp , "DEVICE PAIRED !");
                allLogs.addLog(pairLog);
              
                }   
                selectedDevice=null;
                System.err.println("Connection object:"+myResource.connection);
            }
            else if(pairingStatus==2)
            {
                JOptionPane.showMessageDialog(this,"Couldnt pair devices.. Try Again after few seconds...");
               if(!title.getText().contains("ADMIN")){
                pairLog=new Log(this.dashboard.getAdminUser().getName(),timeStamp , "DEVICE PAIRED FAILED !");
                allLogs.addLog(pairLog);
                   
               }
               // addUserButton.setEnabled(true);
               // pairButton.setEnabled(false);
                //selectedDevice=null;
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,"Something Bad Happened, Error:\n"+e.getMessage());
            if(!title.getText().contains("ADMIN")){
            pairLog=new Log(this.dashboard.getAdminUser().getName(),timeStamp , "COULDNT PAIR DUE TO SOE FAULT !");
                allLogs.addLog(pairLog);
                
            }
            addUserButton.setEnabled(true);
            pairButton.setEnabled(false);
            selectedDevice=null;
        }
        try {
           if(!title.getText().contains("ADMIN")){
               
            allLogs.saveLogsObject();
        
           }
        } catch (Exception e) 
       {
           e.printStackTrace();
       }
       
    }
    else
    {
        JOptionPane.showMessageDialog(this,"Select a Device !");
    }
    }//GEN-LAST:event_pairButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(dashboard==null)
    {
        System.exit(0);
    }
    else{
        defaultModel.clear();
        this.dashboard.setState(NORMAL);
    dispose(); }   // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
    if(dashboard==null)
    {
        try {
            addAdmin();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    else
    {
         RemoteDevice adminDevice=this.dashboard.getAdminDevice();
         Log addUserLog=null;
           String timeStamp=new SimpleDateFormat("hh:mm a").format(new Date());
        try
        {
            if(adminDevice.authenticate())
            {
               String address=deviceBTAddress.getText().trim();
               String name1=deviceName.getText().trim();
               Users myUsers=myResource.getUsers();

              if(myUsers.getUserMACMap().containsKey(address.trim()))
              {
                  JOptionPane.showMessageDialog(this,"Device Already Registered !");
              }   
              
             // myUsers.getUserNameMap().containsKey(evt)
              else if(myUsers.getUserNameMap().containsKey(name1.toUpperCase()))
              {
                  JOptionPane.showMessageDialog(this,"Please Change Bluetooth Name of your device and then add !");
              }
              else
              {
                  try
                  {
                    addNewUser(address);
                    JOptionPane.showMessageDialog(this,"USER ADDEDD SUCCESSFULLY !");
                   if(!title.getText().contains("ADMIN"))
                   {
                    addUserLog=new Log(this.dashboard.getAdminUser().getName(),timeStamp , "USER ADDED");
                    allLogs.addLog(addUserLog);
                   }
                    this.dashboard.setState(NORMAL);
                    dispose();
                      
                  } 
                  catch (Exception e)
                  {
                      e.printStackTrace();
                  }
              }
            }
            else
            {
                System.err.println("Device Disconnected !!!");
                  addUserLog=new Log(this.dashboard.getAdminUser().getName(),timeStamp , "CONNECTION FAILED");
                    allLogs.addLog(addUserLog);
                JOptionPane.showMessageDialog(this,"Device Disconneceted !");
            }
             allLogs.saveLogsObject();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
       
    } 
     
     
    // TODO add your handling code here:
    }//GEN-LAST:event_addUserButtonActionPerformed

    
    private void addAdmin() throws IOException
    {
        String address=deviceBTAddress.getText().trim();
        addNewUser(address);
        JOptionPane.showMessageDialog(this,"Admin Successfully Added ! Restart the App !");
        System.exit(0);
        
    }
    
    
    
    private void addNewUser(String adress) throws IOException
    {
        String name=deviceName.getText();
       
        int type= naive.isSelected()?1:10;
        
        User newUser=new User(name, adress.trim(), type);
        
        Users myUsers=myResource.getUsers();
        
        myUsers.addUser(newUser);
        
        myUsers.saveUsersObject(myUsers);
     
      //  JOptionPane.showMessageDialog(this,"USER ADDEDD SUCCESSFULLY !");
    }
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddUser user=new AddUser();
                

                user.setVisible(true);
            }
        });
    }

    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JRadioButton admin;
    private javax.swing.JLabel btadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel deviceBTAddress;
    private javax.swing.JLabel deviceName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JRadioButton naive;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pair;
    private javax.swing.JLabel pair1;
    private javax.swing.JButton pairButton;
    private javax.swing.JLabel paired;
    private javax.swing.JLabel searching;
    private javax.swing.JLabel searching1;
    private javax.swing.JLabel searching3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
