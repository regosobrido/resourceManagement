/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcel.groovy;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;
import javaexcel.config.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author REGO
 */
public class Ventana extends javax.swing.JFrame {

    ResourceBundleHelper oResourceBundleHelper = null;
    ResourceBundle dameRecursosUIComponents = null;

    private File fExcelCarga = new File("");
    private String sFicheroExcel;
    private final String sFlagradioButtonFuturo , sFlagradioButtonXML, sFlagradioButtonScreen;
    private final String sExcelFile, sFormat, sCategorization, sExitMenuItem ;
    private final String sAppTitle, sTitleDialogoExcelCapture;
    private final String sLoad, sCancel, sFile , sEdit , sTools, sOptions;
    private final String sCaptureExcel;
    private final String sBotonSinDefinir;
    private final String sEditTemplate ;
//    private final String sCliente = "Customer Management";
    private final String sCustomerLocationBorder, sCustomerBankBorder ;
    private final String sNewCustomer, sEditCustomer, sDeleteCustomer ;
    private final String sHelp, sAbout, sExit, sExitTitle ;
    private final String sYes , sNo;
    private final String sName, sAddress, sDNI;
    private final String sTelephone, sMail;
    private final String sLanguage, sFirstContact;
    private final String sCardNumber, sAccountNumber, sCheckBoxShowAccounts, sReset;
    private final String sCity, sPostalCode;
    private final String sCheckBoxCountry;
    private final String sPhoto;        

    /**
     * Creates new form Ventana
     */
    public Ventana() {

        oResourceBundleHelper = new ResourceBundleHelper();
        dameRecursosUIComponents = oResourceBundleHelper.dameRecursosUIComponents();
        sFicheroExcel = dameRecursosUIComponents.getString("sFicheroExcel");
        sFlagradioButtonFuturo = dameRecursosUIComponents.getString("sFlagradioButtonFuturo");
        sFlagradioButtonXML = dameRecursosUIComponents.getString("sFlagradioButtonXML");
        sFlagradioButtonScreen = dameRecursosUIComponents.getString("sFlagradioButtonScreen");
        sExcelFile = dameRecursosUIComponents.getString("sExcelFile");
        sFormat = dameRecursosUIComponents.getString("sFormat");
        sCategorization = dameRecursosUIComponents.getString("sCategorization");
        sExitMenuItem = dameRecursosUIComponents.getString("sExitMenuItem");
        sLoad = dameRecursosUIComponents.getString("sLoad");
        sCancel = dameRecursosUIComponents.getString("sCancel");
        sAppTitle = dameRecursosUIComponents.getString("sAppTitle");
        sTitleDialogoExcelCapture = dameRecursosUIComponents.getString("sTitleDialogoExcelCapture");
        sFile = dameRecursosUIComponents.getString("sFile");
        sEdit = dameRecursosUIComponents.getString("sEdit");
        sTools = dameRecursosUIComponents.getString("sTools");
        sOptions = dameRecursosUIComponents.getString("sOptions");
        sCaptureExcel = dameRecursosUIComponents.getString("sCaptureExcel");
        sBotonSinDefinir = dameRecursosUIComponents.getString("sBotonSinDefinir");
        sHelp = dameRecursosUIComponents.getString("sHelp");
        sEditTemplate = dameRecursosUIComponents.getString("sEditTemplate");
//    private final String sCliente = "Customer Management";
        sNewCustomer = dameRecursosUIComponents.getString("sNewCustomer");
        sCustomerLocationBorder = dameRecursosUIComponents.getString("sCustomerLocationBorder");
        sCustomerBankBorder = dameRecursosUIComponents.getString("sCustomerBankBorder");
        sEditCustomer = dameRecursosUIComponents.getString("sEditCustomer");
        sDeleteCustomer = dameRecursosUIComponents.getString("sDeleteCustomer");
        sAbout = dameRecursosUIComponents.getString("sAbout");
        sExit = dameRecursosUIComponents.getString("sExit");
        sExitTitle = dameRecursosUIComponents.getString("sExitTitle");
        sYes = dameRecursosUIComponents.getString("sYes");
        sNo = dameRecursosUIComponents.getString("sNo");
        sName = dameRecursosUIComponents.getString("sName");
        sAddress = dameRecursosUIComponents.getString("sAddress");
        sDNI = dameRecursosUIComponents.getString("sDNI");
        sTelephone = dameRecursosUIComponents.getString("sTelephone");
        sMail = dameRecursosUIComponents.getString("sMail");
        sLanguage = dameRecursosUIComponents.getString("sLanguage");
        sFirstContact = dameRecursosUIComponents.getString("sFirstContact");
        sCardNumber = dameRecursosUIComponents.getString("sCardNumber");
        sCity = dameRecursosUIComponents.getString("sCity");
        sPostalCode = dameRecursosUIComponents.getString("sPostalCode");
        sCheckBoxCountry = dameRecursosUIComponents.getString("sCheckBoxCountry");
        sPhoto = dameRecursosUIComponents.getString("sPhoto");
        sCheckBoxShowAccounts = dameRecursosUIComponents.getString("sCheckBoxShowAccounts");
        sAccountNumber = dameRecursosUIComponents.getString("sAccountNumber");
        sReset = dameRecursosUIComponents.getString("sReset");

        initComponents();

        buttonGroup1.add(jRadioButtonFuturo);
        //  jRadioButtonFuturo.setActionCommand(sBotonFuturo);
        buttonGroup1.add(jRadioButtonScreen);
        buttonGroup1.add(jRadioButtonXML);
        // buttonGroup1.setSelected(jRadioButtonXML);
        
        
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Object[] opciones = {sYes, sNo};
                int opcion = JOptionPane.showConfirmDialog(Ventana.this, sExit,
                        sExitTitle,
                        JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {
                    System.exit(0);
                }
            }
        });
        jDialogExcelCapture.pack();
        jDialogNewCustomer.pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserExcelCapture = new javax.swing.JFileChooser();
        jDialogExcelCapture = new javax.swing.JDialog();
        jPanelPropiedadesExcel = new javax.swing.JPanel();
        jPanelFormatoExcel = new javax.swing.JPanel();
        jRadioButtonXML = new javax.swing.JRadioButton();
        jRadioButtonScreen = new javax.swing.JRadioButton();
        jRadioButtonFuturo = new javax.swing.JRadioButton();
        jPanelCategorizacionesExcel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jPanelRutaExcel = new javax.swing.JPanel();
        jButtonRutaFichero = new javax.swing.JButton();
        jRutaFichero = new javax.swing.JTextField();
        jPanelBotonesExcel = new javax.swing.JPanel();
        jButtonExcelLoad = new javax.swing.JButton();
        jButtonExcelCancel = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialogNewCustomer = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        labelDNI = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jPanelPhoto = new javax.swing.JPanel();
        jCheckBoxCountry = new javax.swing.JCheckBox();
        jPanelContact = new javax.swing.JPanel();
        labelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        labelMail = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        labelTelephone = new javax.swing.JLabel();
        jTextFieldTelephone = new javax.swing.JTextField();
        labelCity = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        labelPostalCode = new javax.swing.JLabel();
        jTextFieldPostalCode = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelCardNumber = new javax.swing.JLabel();
        jButtonResetCardNumber = new javax.swing.JButton();
        jPasswordFieldCard1 = new javax.swing.JPasswordField();
        jPasswordFieldCard2 = new javax.swing.JPasswordField();
        jPasswordFieldCard3 = new javax.swing.JPasswordField();
        jPasswordFieldCard4 = new javax.swing.JPasswordField();
        jPasswordFieldControlCard = new javax.swing.JPasswordField();
        jPasswordFieldAccount1 = new javax.swing.JPasswordField();
        jPasswordFieldAccount2 = new javax.swing.JPasswordField();
        jPasswordFieldAccount3 = new javax.swing.JPasswordField();
        jPasswordFieldAccount4 = new javax.swing.JPasswordField();
        jPasswordFieldAccount5 = new javax.swing.JPasswordField();
        jButtonResetAccountNumber = new javax.swing.JButton();
        labelBankNumber = new javax.swing.JLabel();
        jCheckBoxShowAccounts = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAddCustomer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelFirstContact = new javax.swing.JLabel();
        jComboBoxFirstContact = new javax.swing.JComboBox();
        jComboBoxLanguage = new javax.swing.JComboBox();
        labelLanguage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oLogExterno = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuOptions = new javax.swing.JMenu();
        jMenuNewCustomer = new javax.swing.JMenuItem();
        jMenuItemEditCustomer = new javax.swing.JMenuItem();
        jMenuItemDeleteCustomer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEditTemplate = new javax.swing.JMenuItem();
        jMenuExcel = new javax.swing.JMenu();
        jMenuItemCapturaExcel = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemHelp = new javax.swing.JMenuItem();
        jMenuItemAbout = new javax.swing.JMenuItem();

        jDialogExcelCapture.setTitle(sTitleDialogoExcelCapture);
        jDialogExcelCapture.setLocationByPlatform(true);

        jPanelFormatoExcel.setBorder(javax.swing.BorderFactory.createTitledBorder(sFormat));

        jRadioButtonXML.setText(sFlagradioButtonXML);
        jRadioButtonXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonXMLActionPerformed(evt);
            }
        });

        jRadioButtonScreen.setText(sFlagradioButtonScreen);
        jRadioButtonScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonScreenActionPerformed(evt);
            }
        });

        jRadioButtonFuturo.setText(sFlagradioButtonFuturo);

        javax.swing.GroupLayout jPanelFormatoExcelLayout = new javax.swing.GroupLayout(jPanelFormatoExcel);
        jPanelFormatoExcel.setLayout(jPanelFormatoExcelLayout);
        jPanelFormatoExcelLayout.setHorizontalGroup(
            jPanelFormatoExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormatoExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormatoExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonFuturo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonXML, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFormatoExcelLayout.setVerticalGroup(
            jPanelFormatoExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormatoExcelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonXML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonFuturo)
                .addContainerGap())
        );

        jPanelCategorizacionesExcel.setBorder(javax.swing.BorderFactory.createTitledBorder(sCategorization));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelCategorizacionesExcelLayout = new javax.swing.GroupLayout(jPanelCategorizacionesExcel);
        jPanelCategorizacionesExcel.setLayout(jPanelCategorizacionesExcelLayout);
        jPanelCategorizacionesExcelLayout.setHorizontalGroup(
            jPanelCategorizacionesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategorizacionesExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategorizacionesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, 394, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCategorizacionesExcelLayout.setVerticalGroup(
            jPanelCategorizacionesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategorizacionesExcelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPropiedadesExcelLayout = new javax.swing.GroupLayout(jPanelPropiedadesExcel);
        jPanelPropiedadesExcel.setLayout(jPanelPropiedadesExcelLayout);
        jPanelPropiedadesExcelLayout.setHorizontalGroup(
            jPanelPropiedadesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropiedadesExcelLayout.createSequentialGroup()
                .addComponent(jPanelFormatoExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCategorizacionesExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPropiedadesExcelLayout.setVerticalGroup(
            jPanelPropiedadesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropiedadesExcelLayout.createSequentialGroup()
                .addGroup(jPanelPropiedadesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCategorizacionesExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFormatoExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButtonRutaFichero.setText(sExcelFile);
        jButtonRutaFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRutaFicheroActionPerformed(evt);
            }
        });

        jRutaFichero.setEditable(false);
        jRutaFichero.setEnabled(false);
        jRutaFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutaFicheroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRutaExcelLayout = new javax.swing.GroupLayout(jPanelRutaExcel);
        jPanelRutaExcel.setLayout(jPanelRutaExcelLayout);
        jPanelRutaExcelLayout.setHorizontalGroup(
            jPanelRutaExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRutaExcelLayout.createSequentialGroup()
                .addComponent(jButtonRutaFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRutaFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanelRutaExcelLayout.setVerticalGroup(
            jPanelRutaExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRutaExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonRutaFichero)
                .addComponent(jRutaFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonExcelLoad.setText(sLoad);
        jButtonExcelLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcelLoadActionPerformed(evt);
            }
        });

        jButtonExcelCancel.setText(sCancel);
        jButtonExcelCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcelCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesExcelLayout = new javax.swing.GroupLayout(jPanelBotonesExcel);
        jPanelBotonesExcel.setLayout(jPanelBotonesExcelLayout);
        jPanelBotonesExcelLayout.setHorizontalGroup(
            jPanelBotonesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExcelLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcelCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotonesExcelLayout.setVerticalGroup(
            jPanelBotonesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonExcelLoad)
                .addComponent(jButtonExcelCancel))
        );

        javax.swing.GroupLayout jDialogExcelCaptureLayout = new javax.swing.GroupLayout(jDialogExcelCapture.getContentPane());
        jDialogExcelCapture.getContentPane().setLayout(jDialogExcelCaptureLayout);
        jDialogExcelCaptureLayout.setHorizontalGroup(
            jDialogExcelCaptureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogExcelCaptureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogExcelCaptureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPropiedadesExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogExcelCaptureLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelRutaExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelBotonesExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jDialogExcelCaptureLayout.setVerticalGroup(
            jDialogExcelCaptureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogExcelCaptureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRutaExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPropiedadesExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotonesExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogNewCustomer.setTitle(sNewCustomer);
        jDialogNewCustomer.setLocationByPlatform(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, sCustomerBankBorder, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 0, 10))); // NOI18N

        labelName.setText(sName);

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        labelDNI.setText(sDNI);

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jPanelPhoto.setToolTipText(sPhoto);

        javax.swing.GroupLayout jPanelPhotoLayout = new javax.swing.GroupLayout(jPanelPhoto);
        jPanelPhoto.setLayout(jPanelPhotoLayout);
        jPanelPhotoLayout.setHorizontalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelPhotoLayout.setVerticalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jCheckBoxCountry.setText(sCheckBoxCountry);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDNI)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDNI))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxCountry)
                            .addComponent(jPanelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDNI)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxCountry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelContact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, sCustomerLocationBorder, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 0, 10))); // NOI18N

        labelAddress.setText(sAddress);

        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });

        labelMail.setText(sMail);

        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });

        labelTelephone.setText(sTelephone);

        jTextFieldTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelephoneActionPerformed(evt);
            }
        });

        labelCity.setText(sCity);

        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });

        labelPostalCode.setText(sPostalCode);

        jTextFieldPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPostalCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContactLayout = new javax.swing.GroupLayout(jPanelContact);
        jPanelContact.setLayout(jPanelContactLayout);
        jPanelContactLayout.setHorizontalGroup(
            jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContactLayout.createSequentialGroup()
                        .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress)
                            .addComponent(labelMail)
                            .addComponent(labelTelephone)
                            .addComponent(labelCity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAddress)
                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCity)))
                    .addGroup(jPanelContactLayout.createSequentialGroup()
                        .addGap(0, 150, Short.MAX_VALUE)
                        .addComponent(labelPostalCode)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelContactLayout.setVerticalGroup(
            jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelephone))
                .addGap(18, 18, 18)
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMail))
                .addGap(18, 18, 18)
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCity))
                .addGap(18, 18, 18)
                .addGroup(jPanelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPostalCode))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, sCustomerBankBorder, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 0, 10))); // NOI18N

        labelCardNumber.setText(sCardNumber);

        jButtonResetCardNumber.setText("Reset");
        jButtonResetCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetCardNumberActionPerformed(evt);
            }
        });

        jPasswordFieldCard1.setToolTipText("");
        jPasswordFieldCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCard1ActionPerformed(evt);
            }
        });

        jPasswordFieldCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCard2ActionPerformed(evt);
            }
        });

        jPasswordFieldCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCard3ActionPerformed(evt);
            }
        });

        jPasswordFieldCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCard4ActionPerformed(evt);
            }
        });

        jPasswordFieldControlCard.setToolTipText("");
        jPasswordFieldControlCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldControlCardActionPerformed(evt);
            }
        });

        jPasswordFieldAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAccount1ActionPerformed(evt);
            }
        });

        jPasswordFieldAccount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAccount2ActionPerformed(evt);
            }
        });

        jPasswordFieldAccount3.setToolTipText("");
        jPasswordFieldAccount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAccount3ActionPerformed(evt);
            }
        });

        jPasswordFieldAccount4.setText("jPasswordField1");
        jPasswordFieldAccount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAccount4ActionPerformed(evt);
            }
        });

        jPasswordFieldAccount5.setText("jPasswordField1");
        jPasswordFieldAccount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldAccount5ActionPerformed(evt);
            }
        });

        jButtonResetAccountNumber.setText("Reset");
        jButtonResetAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAccountNumberActionPerformed(evt);
            }
        });

        labelBankNumber.setText(sAccountNumber);

        jCheckBoxShowAccounts.setText(sCheckBoxShowAccounts);
        jCheckBoxShowAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowAccountsActionPerformed(evt);
            }
        });

        jLabel2.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldAccount4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldAccount5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonResetAccountNumber))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldCard4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldControlCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonResetCardNumber)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelBankNumber)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCardNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxShowAccounts))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxShowAccounts))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldControlCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetCardNumber)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBankNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldAccount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldAccount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetAccountNumber)))
        );

        jButtonAddCustomer.setText("Add");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButtonAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, sOptions, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 0, 10))); // NOI18N

        labelFirstContact.setText(sFirstContact);

        jComboBoxFirstContact.setModel(new javax.swing.DefaultComboBoxModel(new String[] { sMail, sTelephone, sAddress }));

        jComboBoxLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelLanguage.setText(sLanguage);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelLanguage)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelFirstContact)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxFirstContact, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstContact)
                    .addComponent(jComboBoxFirstContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLanguage)
                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogNewCustomerLayout = new javax.swing.GroupLayout(jDialogNewCustomer.getContentPane());
        jDialogNewCustomer.getContentPane().setLayout(jDialogNewCustomerLayout);
        jDialogNewCustomerLayout.setHorizontalGroup(
            jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNewCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogNewCustomerLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jDialogNewCustomerLayout.setVerticalGroup(
            jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogNewCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogNewCustomerLayout.createSequentialGroup()
                        .addComponent(jPanelContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDialogNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDialogNewCustomerLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 100, Short.MAX_VALUE))))
                    .addGroup(jDialogNewCustomerLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(sAppTitle);
        setLocationByPlatform(true);

        oLogExterno.setColumns(20);
        oLogExterno.setRows(5);
        jScrollPane1.setViewportView(oLogExterno);

        jLabel1.setText("Action Log");

        jMenuFile.setText(sFile);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setText(sExitMenuItem);
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemSalir);

        jMenuBar1.add(jMenuFile);

        jMenuOptions.setText(sEdit);

        jMenuNewCustomer.setText(sNewCustomer);
        jMenuNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewCustomerActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuNewCustomer);

        jMenuItemEditCustomer.setText(sEditCustomer);
        jMenuItemEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditCustomerActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemEditCustomer);

        jMenuItemDeleteCustomer.setText(sDeleteCustomer);
        jMenuOptions.add(jMenuItemDeleteCustomer);
        jMenuOptions.add(jSeparator1);

        jMenuItemEditTemplate.setText(sEditTemplate);
        jMenuOptions.add(jMenuItemEditTemplate);

        jMenuBar1.add(jMenuOptions);

        jMenuExcel.setText(sTools);

        jMenuItemCapturaExcel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCapturaExcel.setText(sCaptureExcel);
        jMenuItemCapturaExcel.setToolTipText(sCaptureExcel);
        jMenuItemCapturaExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCapturaExcelActionPerformed(evt);
            }
        });
        jMenuExcel.add(jMenuItemCapturaExcel);

        jMenuItem3.setText(sBotonSinDefinir);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuExcel.add(jMenuItem3);

        jMenuBar1.add(jMenuExcel);

        jMenuHelp.setText(sHelp);
        jMenuHelp.setActionCommand("help");

        jMenuItemHelp.setText(sHelp);
        jMenuHelp.add(jMenuItemHelp);

        jMenuItemAbout.setText(sAbout);
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCapturaExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCapturaExcelActionPerformed

        jDialogExcelCapture.setVisible(true);

    }//GEN-LAST:event_jMenuItemCapturaExcelActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jRutaFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRutaFicheroActionPerformed
        oLogExterno.append("RutaficheroActionPerformed \n");
        oLogExterno.append("Se activa al pulsar intro en el campo de texto \n");
    }//GEN-LAST:event_jRutaFicheroActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonRutaFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRutaFicheroActionPerformed
        oLogExterno.append("BotonRutafichero pulsado\n");
        jFileChooserExcelCapture.setFileFilter(new FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".xlsx") | f.isDirectory();
            }

            public String getDescription() {
                return "xlsx Files";
            }
        });
        sFicheroExcel = "C://ANTO/workspace/JavaExcel/HojaPrueba.xlsx";
        jFileChooserExcelCapture.setCurrentDirectory(new File(sFicheroExcel));

        int returnValue = jFileChooserExcelCapture.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            fExcelCarga = jFileChooserExcelCapture.getSelectedFile();
            oLogExterno.append(fExcelCarga.getName() + "\n");
        }
        sFicheroExcel = fExcelCarga.getAbsolutePath();
        jRutaFichero.setText(sFicheroExcel);

    }//GEN-LAST:event_jButtonRutaFicheroActionPerformed

    private void jButtonExcelCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcelCancelActionPerformed
        jDialogExcelCapture.setVisible(false);
    }//GEN-LAST:event_jButtonExcelCancelActionPerformed

    private void jRadioButtonXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonXMLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonXMLActionPerformed

    private void jButtonExcelLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcelLoadActionPerformed
        // TODO add your handling code here:
        //String filename = "C://ANTO/workspace/JavaExcel/HojaPrueba.xlsx";
        ExcelParser oExcelParser = new ExcelParser();
        oLogExterno.append("Excel parseado ... OK\n");
        ArrayList aExcelXML = (ArrayList) oExcelParser.getExcelXML(sFicheroExcel);
        ArrayList aCabecera = (ArrayList) aExcelXML.get(0);
        ArrayList aCuerpo = (ArrayList) aExcelXML.get(1);

        /* La cabecera es un arrayList de Strings
         *  El cuerpo es un arraylist de pares formados por:
         *   un string que indica tipo
         *   un valor que en formato java indicado por el anterior tipo.
         */

    }//GEN-LAST:event_jButtonExcelLoadActionPerformed

    private void jRadioButtonScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonScreenActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed

        Object[] opciones = {sYes, sNo};
        int opcion = JOptionPane.showConfirmDialog(Ventana.this, sExit,
                sExitTitle,
                JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEditCustomerActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jMenuNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewCustomerActionPerformed
        jDialogNewCustomer.setVisible(true);
    }//GEN-LAST:event_jMenuNewCustomerActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jPasswordFieldCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCard1ActionPerformed

    private void jPasswordFieldCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCard2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCard2ActionPerformed

    private void jPasswordFieldCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCard3ActionPerformed

    private void jPasswordFieldCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCard4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCard4ActionPerformed

    private void jPasswordFieldAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAccount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAccount1ActionPerformed

    private void jPasswordFieldAccount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAccount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAccount2ActionPerformed

    private void jPasswordFieldAccount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAccount3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAccount3ActionPerformed

    private void jPasswordFieldAccount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAccount4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAccount4ActionPerformed

    private void jPasswordFieldAccount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldAccount5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldAccount5ActionPerformed

    private void jTextFieldPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPostalCodeActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCityActionPerformed

    private void jTextFieldTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelephoneActionPerformed

    private void jTextFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMailActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

    private void jCheckBoxShowAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowAccountsActionPerformed
        if (jCheckBoxShowAccounts.isSelected()) {
            jPasswordFieldCard1.setEchoChar((char) 0);
        } else {
            jPasswordFieldCard1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowAccountsActionPerformed

    private void jButtonResetCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetCardNumberActionPerformed
        jPasswordFieldCard1.setText("");
        jPasswordFieldCard2.setText("");
        jPasswordFieldCard3.setText("");
        jPasswordFieldCard4.setText("");
        jPasswordFieldControlCard.setText("");

    }//GEN-LAST:event_jButtonResetCardNumberActionPerformed

    private void jButtonResetAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAccountNumberActionPerformed
        jPasswordFieldAccount1.setText("");// TODO add your handling code here:
        jPasswordFieldAccount2.setText("");
        jPasswordFieldAccount3.setText("");
        jPasswordFieldAccount4.setText("");
        jPasswordFieldAccount5.setText("");
    }//GEN-LAST:event_jButtonResetAccountNumberActionPerformed

    private void jPasswordFieldControlCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldControlCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldControlCardActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAddCustomer;
    private javax.swing.JButton jButtonExcelCancel;
    private javax.swing.JButton jButtonExcelLoad;
    private javax.swing.JButton jButtonResetAccountNumber;
    private javax.swing.JButton jButtonResetCardNumber;
    private javax.swing.JButton jButtonRutaFichero;
    private javax.swing.JCheckBox jCheckBoxCountry;
    private javax.swing.JCheckBox jCheckBoxShowAccounts;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBoxFirstContact;
    private javax.swing.JComboBox jComboBoxLanguage;
    private javax.swing.JDialog jDialogExcelCapture;
    private javax.swing.JDialog jDialogNewCustomer;
    private javax.swing.JFileChooser jFileChooserExcelCapture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExcel;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemCapturaExcel;
    private javax.swing.JMenuItem jMenuItemDeleteCustomer;
    private javax.swing.JMenuItem jMenuItemEditCustomer;
    private javax.swing.JMenuItem jMenuItemEditTemplate;
    private javax.swing.JMenuItem jMenuItemHelp;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuNewCustomer;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBotonesExcel;
    private javax.swing.JPanel jPanelCategorizacionesExcel;
    private javax.swing.JPanel jPanelContact;
    private javax.swing.JPanel jPanelFormatoExcel;
    private javax.swing.JPanel jPanelPhoto;
    private javax.swing.JPanel jPanelPropiedadesExcel;
    private javax.swing.JPanel jPanelRutaExcel;
    private javax.swing.JPasswordField jPasswordFieldAccount1;
    private javax.swing.JPasswordField jPasswordFieldAccount2;
    private javax.swing.JPasswordField jPasswordFieldAccount3;
    private javax.swing.JPasswordField jPasswordFieldAccount4;
    private javax.swing.JPasswordField jPasswordFieldAccount5;
    private javax.swing.JPasswordField jPasswordFieldCard1;
    private javax.swing.JPasswordField jPasswordFieldCard2;
    private javax.swing.JPasswordField jPasswordFieldCard3;
    private javax.swing.JPasswordField jPasswordFieldCard4;
    private javax.swing.JPasswordField jPasswordFieldControlCard;
    private javax.swing.JRadioButton jRadioButtonFuturo;
    private javax.swing.JRadioButton jRadioButtonScreen;
    private javax.swing.JRadioButton jRadioButtonXML;
    private javax.swing.JTextField jRutaFichero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPostalCode;
    private javax.swing.JTextField jTextFieldTelephone;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBankNumber;
    private javax.swing.JLabel labelCardNumber;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelFirstContact;
    private javax.swing.JLabel labelLanguage;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPostalCode;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JTextArea oLogExterno;
    // End of variables declaration//GEN-END:variables
}
