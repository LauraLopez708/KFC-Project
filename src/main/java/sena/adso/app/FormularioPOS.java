/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sena.adso.app;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class FormularioPOS extends javax.swing.JFrame {

    private int refs;

    private static final int MAX_TABS = 20;
    private static int tabNo = 0;
    private JTabbedPane tabbedPane = new JTabbedPane();

    public FormularioPOS() {
        initComponents();
        tblDetalle.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(200);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Logos/kfcLogo.png")));

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        colorearTabs();

        addWindowListener(
                new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e
            ) {
                confirmarCierre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

        }
        );
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        rbtnTop.addActionListener(e -> pnlPrincipal.setTabPlacement(JTabbedPane.TOP));
        rbtnLeft.addActionListener(e -> pnlPrincipal.setTabPlacement(JTabbedPane.LEFT));
        rbtnBottom.addActionListener(e -> pnlPrincipal.setTabPlacement(JTabbedPane.BOTTOM));
        rbtnRigth.addActionListener(e -> pnlPrincipal.setTabPlacement(JTabbedPane.RIGHT));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JTabbedPane();
        pnlNuggets = new javax.swing.JPanel();
        btnParteYComparte = new javax.swing.JButton();
        lblq1 = new javax.swing.JLabel();
        btnComboNuggets = new javax.swing.JButton();
        lblq2 = new javax.swing.JLabel();
        btnAdicion5Nuggets = new javax.swing.JButton();
        lblq3 = new javax.swing.JLabel();
        btnAdicion10Nuggets = new javax.swing.JButton();
        lblq4 = new javax.swing.JLabel();
        btnCombo5Nuggets = new javax.swing.JButton();
        lblq5 = new javax.swing.JLabel();
        pnlBuckets = new javax.swing.JPanel();
        btnMega3 = new javax.swing.JButton();
        lblq6 = new javax.swing.JLabel();
        btnMegaFamiliar = new javax.swing.JButton();
        lblq7 = new javax.swing.JLabel();
        btnMegaVariedadXL = new javax.swing.JButton();
        lblq8 = new javax.swing.JLabel();
        btnBucketTradicional = new javax.swing.JButton();
        lblq9 = new javax.swing.JLabel();
        btnTrioSupremo = new javax.swing.JButton();
        lblq12 = new javax.swing.JLabel();
        btnMegaFamiliarArepas = new javax.swing.JButton();
        lblq10 = new javax.swing.JLabel();
        btnMedioKFC = new javax.swing.JButton();
        lblq13 = new javax.swing.JLabel();
        btnMegaFamiliarXL = new javax.swing.JButton();
        lblq11 = new javax.swing.JLabel();
        btnFamiliarKFCArepas = new javax.swing.JButton();
        lblq14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pnlCombos = new javax.swing.JPanel();
        btn2Presas = new javax.swing.JButton();
        lblq15 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn3Presas = new javax.swing.JButton();
        lblq16 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnAlitasPicantes = new javax.swing.JButton();
        lblq17 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        bntPopCorn = new javax.swing.JButton();
        lblq18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        btnCasero = new javax.swing.JButton();
        lblq19 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnNuggets = new javax.swing.JButton();
        lblq20 = new javax.swing.JLabel();
        pnlBoxes = new javax.swing.JPanel();
        btnBigBoxPopHelado = new javax.swing.JButton();
        lblq21 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnBigBoxKSandwichNuggets = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        lblq22 = new javax.swing.JLabel();
        btnBigBoxKCoronel = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        lblq23 = new javax.swing.JLabel();
        pnl2Personas = new javax.swing.JPanel();
        btnParteComparteAlas = new javax.swing.JButton();
        lblq24 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblq25 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        btnParteComparteMixto = new javax.swing.JButton();
        lblq26 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        btnParteCompartePresas = new javax.swing.JButton();
        lblq27 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        btnParteComparteNuggets = new javax.swing.JButton();
        lblq28 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        btnWowDuoDeluxe = new javax.swing.JButton();
        lblq29 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        btnWowDuoDeluxeNuggets = new javax.swing.JButton();
        pnlSandwich = new javax.swing.JPanel();
        btnBbqCrunch = new javax.swing.JButton();
        lblq30 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnComboBbqCrunch = new javax.swing.JButton();
        lblq31 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        btnComboKSandwich = new javax.swing.JButton();
        lblq32 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        btnKentuckySandwich = new javax.swing.JButton();
        lblq33 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btnKentuckyCoronelSandich = new javax.swing.JButton();
        lblq34 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        btnComboKCoronelSandwich = new javax.swing.JButton();
        lblq35 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        btnSandwichCrispyBbq = new javax.swing.JButton();
        lblq36 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        btnComboSandwichCrispyBbq = new javax.swing.JButton();
        lblq37 = new javax.swing.JLabel();
        pnlIndividual = new javax.swing.JPanel();
        btn6AlitasPicantes = new javax.swing.JButton();
        lblq38 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        btnPopcornGrande = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        lblq39 = new javax.swing.JLabel();
        btn9AlitasPicantes = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        lblq40 = new javax.swing.JLabel();
        btnPopCornMediano = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        lblq41 = new javax.swing.JLabel();
        btnAdicion5NuggetsIndividual = new javax.swing.JButton();
        btnPopCornPequeño = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        lblq42 = new javax.swing.JLabel();
        btn20AlitasPicantes = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        lblq43 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        lblq44 = new javax.swing.JLabel();
        btnAdicion10NuggetsIndividual = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        lblq45 = new javax.swing.JLabel();
        pnlbebidas = new javax.swing.JPanel();
        btnPapaGrande = new javax.swing.JButton();
        lblq46 = new javax.swing.JLabel();
        btnEnsaladaColslawGrande = new javax.swing.JButton();
        lblq47 = new javax.swing.JLabel();
        btnPapaPequeña = new javax.swing.JButton();
        lblq48 = new javax.swing.JLabel();
        btnEnsaladaColslawPersonal = new javax.swing.JButton();
        lblq49 = new javax.swing.JLabel();
        btnGaseosaPet400ML = new javax.swing.JButton();
        lblq50 = new javax.swing.JLabel();
        btn3PresasBebidas = new javax.swing.JButton();
        lblq51 = new javax.swing.JLabel();
        btn12Arepas = new javax.swing.JButton();
        lblq52 = new javax.swing.JLabel();
        btnGaseosa15Lts = new javax.swing.JButton();
        lblq53 = new javax.swing.JLabel();
        btnMrTea = new javax.swing.JButton();
        lblq54 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        pnlPostres = new javax.swing.JPanel();
        btnAvalanchaOreo = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        lblq55 = new javax.swing.JLabel();
        btnAvalanchaOreoPromo = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        lblq56 = new javax.swing.JLabel();
        btn3AvalanchasOreo = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        lblq57 = new javax.swing.JLabel();
        bnSundaeArequipe = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        lblq58 = new javax.swing.JLabel();
        btnSundaeDeChocolate = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        lblq59 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFactura = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btnEliminarIteam = new javax.swing.JButton();
        rbtnRigth = new javax.swing.JRadioButton();
        rbtnTop = new javax.swing.JRadioButton();
        rbtnBottom = new javax.swing.JRadioButton();
        rbtnLeft = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlPrincipal.setForeground(new java.awt.Color(0, 0, 0));

        btnParteYComparte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuggets/nug_1.png"))); // NOI18N
        btnParteYComparte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParteYComparteActionPerformed(evt);
            }
        });

        lblq1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq1.setText("0");

        btnComboNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuggets/nug_2.png"))); // NOI18N
        btnComboNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboNuggetsActionPerformed(evt);
            }
        });

        lblq2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq2.setText("0");

        btnAdicion5Nuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuggets/nug_3.png"))); // NOI18N
        btnAdicion5Nuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicion5NuggetsActionPerformed(evt);
            }
        });

        lblq3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq3.setText("0");

        btnAdicion10Nuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuggets/nug_4.png"))); // NOI18N
        btnAdicion10Nuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicion10NuggetsActionPerformed(evt);
            }
        });

        lblq4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq4.setText("0");

        btnCombo5Nuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuggets/nug_5.png"))); // NOI18N
        btnCombo5Nuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo5NuggetsActionPerformed(evt);
            }
        });

        lblq5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq5.setText("0");

        javax.swing.GroupLayout pnlNuggetsLayout = new javax.swing.GroupLayout(pnlNuggets);
        pnlNuggets.setLayout(pnlNuggetsLayout);
        pnlNuggetsLayout.setHorizontalGroup(
            pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuggetsLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblq4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicion10Nuggets, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblq1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnParteYComparte, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblq2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnComboNuggets, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblq5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCombo5Nuggets, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblq3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicion5Nuggets, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlNuggetsLayout.setVerticalGroup(
            pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuggetsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuggetsLayout.createSequentialGroup()
                        .addComponent(btnAdicion5Nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq3))
                    .addGroup(pnlNuggetsLayout.createSequentialGroup()
                        .addComponent(btnComboNuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq2))
                    .addGroup(pnlNuggetsLayout.createSequentialGroup()
                        .addComponent(btnParteYComparte, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq1)))
                .addGap(18, 18, 18)
                .addGroup(pnlNuggetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuggetsLayout.createSequentialGroup()
                        .addComponent(btnAdicion10Nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq4))
                    .addGroup(pnlNuggetsLayout.createSequentialGroup()
                        .addComponent(btnCombo5Nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq5)))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Nuggets", pnlNuggets);

        btnMega3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_1.png"))); // NOI18N
        btnMega3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMega3ActionPerformed(evt);
            }
        });

        lblq6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq6.setText("0");

        btnMegaFamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_2.png"))); // NOI18N
        btnMegaFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegaFamiliarActionPerformed(evt);
            }
        });

        lblq7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq7.setText("0");

        btnMegaVariedadXL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_3.png"))); // NOI18N
        btnMegaVariedadXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegaVariedadXLActionPerformed(evt);
            }
        });

        lblq8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq8.setText("0");

        btnBucketTradicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_4.png"))); // NOI18N
        btnBucketTradicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucketTradicionalActionPerformed(evt);
            }
        });

        lblq9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq9.setText("0");

        btnTrioSupremo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_7.png"))); // NOI18N
        btnTrioSupremo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrioSupremoActionPerformed(evt);
            }
        });

        lblq12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq12.setText("0");

        btnMegaFamiliarArepas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_5.png"))); // NOI18N
        btnMegaFamiliarArepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegaFamiliarArepasActionPerformed(evt);
            }
        });

        lblq10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq10.setText("0");

        btnMedioKFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_8.png"))); // NOI18N
        btnMedioKFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioKFCActionPerformed(evt);
            }
        });

        lblq13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq13.setText("0");

        btnMegaFamiliarXL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_6.png"))); // NOI18N
        btnMegaFamiliarXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegaFamiliarXLActionPerformed(evt);
            }
        });

        lblq11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq11.setText("0");

        btnFamiliarKFCArepas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buckets/buck_9.png"))); // NOI18N
        btnFamiliarKFCArepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliarKFCArepasActionPerformed(evt);
            }
        });

        lblq14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq14.setText("0");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MEGA 3");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("MEGA FAMILIAR");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("MEGA VARIEDAD XL");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("BUCKET TRADICIONAL");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("MEGA FAMILIAR AREPAS");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("MEGA FAMILIAR XL");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("FAMILIAR KFC AREPAS");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("TRIO SUPREMO");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("MEDIO KFC");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlBucketsLayout = new javax.swing.GroupLayout(pnlBuckets);
        pnlBuckets.setLayout(pnlBucketsLayout);
        pnlBucketsLayout.setHorizontalGroup(
            pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBucketsLayout.createSequentialGroup()
                .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBucketsLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTrioSupremo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBucketTradicional, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMega3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblq7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMegaFamiliar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblq8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMegaVariedadXL, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMedioKFC, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMegaFamiliarArepas, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFamiliarKFCArepas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblq11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMegaFamiliarXL, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        pnlBucketsLayout.setVerticalGroup(
            pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBucketsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addComponent(btnMegaVariedadXL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addGap(1, 1, 1)
                        .addComponent(lblq8))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addComponent(btnMegaFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblq7))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addComponent(btnMega3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq6)))
                .addGap(18, 18, 18)
                .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addComponent(btnBucketTradicional, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrioSupremo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblq12))
                    .addGroup(pnlBucketsLayout.createSequentialGroup()
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBucketsLayout.createSequentialGroup()
                                .addComponent(btnMegaFamiliarXL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblq11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFamiliarKFCArepas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBucketsLayout.createSequentialGroup()
                                .addComponent(btnMegaFamiliarArepas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblq10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMedioKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBucketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblq13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblq14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Buckets", pnlBuckets);

        btn2Presas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/1-removebg-preview.png"))); // NOI18N
        btn2Presas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2PresasActionPerformed(evt);
            }
        });

        lblq15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq15.setText("0");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("2 PRESAS");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("3 PRESAS");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btn3Presas.setBackground(new java.awt.Color(255, 255, 255));
        btn3Presas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/2-removebg-preview.png"))); // NOI18N
        btn3Presas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3PresasActionPerformed(evt);
            }
        });

        lblq16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq16.setText("0");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("ALITAS PICANTES");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnAlitasPicantes.setBackground(new java.awt.Color(255, 255, 255));
        btnAlitasPicantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/3-removebg-preview.png"))); // NOI18N
        btnAlitasPicantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlitasPicantesActionPerformed(evt);
            }
        });

        lblq17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq17.setText("0");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("POP CORN");
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bntPopCorn.setBackground(new java.awt.Color(255, 255, 255));
        bntPopCorn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/4-removebg-preview.png"))); // NOI18N
        bntPopCorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPopCornActionPerformed(evt);
            }
        });

        lblq18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq18.setText("0");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("CASERO");
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnCasero.setBackground(new java.awt.Color(255, 255, 255));
        btnCasero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/5-removebg-preview.png"))); // NOI18N
        btnCasero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaseroActionPerformed(evt);
            }
        });

        lblq19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq19.setText("0");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("NUGGETS");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnNuggets.setBackground(new java.awt.Color(255, 255, 255));
        btnNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Combos/6-removebg-preview.png"))); // NOI18N
        btnNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuggetsActionPerformed(evt);
            }
        });

        lblq20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq20.setText("0");

        javax.swing.GroupLayout pnlCombosLayout = new javax.swing.GroupLayout(pnlCombos);
        pnlCombos.setLayout(pnlCombosLayout);
        pnlCombosLayout.setHorizontalGroup(
            pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntPopCorn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2Presas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCombosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblq16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCombosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3Presas)))))
                .addGap(18, 18, 18)
                .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnNuggets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAlitasPicantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlCombosLayout.setVerticalGroup(
            pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombosLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addComponent(btnAlitasPicantes)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel39)
                        .addGap(1, 1, 1)
                        .addComponent(lblq17))
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addComponent(btn3Presas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addGap(1, 1, 1)
                        .addComponent(lblq16))
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addComponent(btn2Presas)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel36)
                        .addGap(1, 1, 1)
                        .addComponent(lblq15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCombosLayout.createSequentialGroup()
                            .addComponent(bntPopCorn)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel41)
                            .addGap(1, 1, 1)
                            .addComponent(lblq18))
                        .addGroup(pnlCombosLayout.createSequentialGroup()
                            .addComponent(btnCasero)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel43)
                            .addGap(1, 1, 1)
                            .addComponent(lblq19)))
                    .addGroup(pnlCombosLayout.createSequentialGroup()
                        .addComponent(btnNuggets)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel45)
                        .addGap(1, 1, 1)
                        .addComponent(lblq20)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Combos", pnlCombos);

        btnBigBoxPopHelado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boxes/1-removebg-preview.png"))); // NOI18N
        btnBigBoxPopHelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigBoxPopHeladoActionPerformed(evt);
            }
        });

        lblq21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq21.setText("0");

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("BIG BOX POP HELADO");
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnBigBoxKSandwichNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boxes/2-removebg-preview.png"))); // NOI18N
        btnBigBoxKSandwichNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigBoxKSandwichNuggetsActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("BIG BOX K. SANDWICH NUGGETS");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq22.setText("0");

        btnBigBoxKCoronel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boxes/3-removebg-preview.png"))); // NOI18N
        btnBigBoxKCoronel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigBoxKCoronelActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("BIG BOX KENTUCKY CORONEL");
        jLabel50.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq23.setText("0");

        javax.swing.GroupLayout pnlBoxesLayout = new javax.swing.GroupLayout(pnlBoxes);
        pnlBoxes.setLayout(pnlBoxesLayout);
        pnlBoxesLayout.setHorizontalGroup(
            pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBoxesLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBigBoxPopHelado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBoxesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblq21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBoxesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBigBoxKSandwichNuggets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48)))
                    .addGroup(pnlBoxesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblq22, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBigBoxKCoronel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50))
                    .addComponent(lblq23, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        pnlBoxesLayout.setVerticalGroup(
            pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoxesLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBoxesLayout.createSequentialGroup()
                        .addComponent(btnBigBoxKSandwichNuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48))
                    .addGroup(pnlBoxesLayout.createSequentialGroup()
                        .addComponent(btnBigBoxKCoronel)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel50)
                        .addGap(1, 1, 1)
                        .addComponent(lblq23))
                    .addGroup(pnlBoxesLayout.createSequentialGroup()
                        .addComponent(btnBigBoxPopHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblq21)
                            .addComponent(lblq22))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Boxes", pnlBoxes);

        btnParteComparteAlas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/1-removebg-preview (1).png"))); // NOI18N
        btnParteComparteAlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParteComparteAlasActionPerformed(evt);
            }
        });

        lblq24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq24.setText("0");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("PARTE Y COPARTE ALAS");
        jLabel52.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq25.setText("0");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("PARTE Y COMPARTE MIXTO");
        jLabel54.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnParteComparteMixto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/2-removebg-preview (2).png"))); // NOI18N
        btnParteComparteMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParteComparteMixtoActionPerformed(evt);
            }
        });

        lblq26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq26.setText("0");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("PARTE Y COMPARTE PRESAS");
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnParteCompartePresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/3-removebg-preview (1).png"))); // NOI18N
        btnParteCompartePresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParteCompartePresasActionPerformed(evt);
            }
        });

        lblq27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq27.setText("0");

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("PARTE Y COMPARTE NUGGETS");
        jLabel58.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnParteComparteNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/4-removebg-preview.png"))); // NOI18N
        btnParteComparteNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParteComparteNuggetsActionPerformed(evt);
            }
        });

        lblq28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq28.setText("0");

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("WOW DUO DELUXE");
        jLabel60.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnWowDuoDeluxe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/5-removebg-preview.png"))); // NOI18N
        btnWowDuoDeluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWowDuoDeluxeActionPerformed(evt);
            }
        });

        lblq29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq29.setText("0");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("WOW DUO DELUXE NUGGETS");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnWowDuoDeluxeNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DosPersonas/6-removebg-preview.png"))); // NOI18N
        btnWowDuoDeluxeNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWowDuoDeluxeNuggetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2PersonasLayout = new javax.swing.GroupLayout(pnl2Personas);
        pnl2Personas.setLayout(pnl2PersonasLayout);
        pnl2PersonasLayout.setHorizontalGroup(
            pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnParteComparteAlas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                        .addComponent(lblq24, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2PersonasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(btnParteComparteNuggets))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2PersonasLayout.createSequentialGroup()
                        .addComponent(lblq27, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnParteComparteMixto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblq25, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnParteCompartePresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblq26, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWowDuoDeluxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2PersonasLayout.createSequentialGroup()
                                .addComponent(lblq28, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWowDuoDeluxeNuggets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblq29, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        pnl2PersonasLayout.setVerticalGroup(
            pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addComponent(btnParteComparteMixto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addGap(3, 3, 3)
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblq25)
                            .addComponent(lblq24)
                            .addComponent(lblq26))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addComponent(btnParteComparteAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52))
                            .addGroup(pnl2PersonasLayout.createSequentialGroup()
                                .addComponent(btnParteCompartePresas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel56)))
                        .addGap(45, 45, 45)))
                .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addComponent(btnParteComparteNuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58)
                        .addGap(3, 3, 3)
                        .addGroup(pnl2PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblq27)
                            .addComponent(lblq28)))
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addComponent(btnWowDuoDeluxe, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addGap(3, 3, 3)
                        .addComponent(lblq29))
                    .addGroup(pnl2PersonasLayout.createSequentialGroup()
                        .addComponent(btnWowDuoDeluxeNuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("2 Personas", pnl2Personas);

        btnBbqCrunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/1-removebg-preview.png"))); // NOI18N
        btnBbqCrunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBbqCrunchActionPerformed(evt);
            }
        });

        lblq30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq30.setText("0");

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("BBQ CRUNCH");
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("COMBO BBQ CRUNCH");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnComboBbqCrunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/2-removebg-preview.png"))); // NOI18N
        btnComboBbqCrunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboBbqCrunchActionPerformed(evt);
            }
        });

        lblq31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq31.setText("0");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("COMBO K. SANDWICH");
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnComboKSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/3-removebg-preview.png"))); // NOI18N
        btnComboKSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboKSandwichActionPerformed(evt);
            }
        });

        lblq32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq32.setText("0");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("KENTUCKY SANDWICH");
        jLabel67.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnKentuckySandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/4-removebg-preview.png"))); // NOI18N
        btnKentuckySandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKentuckySandwichActionPerformed(evt);
            }
        });

        lblq33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq33.setText("0");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("KENTUCKY CORONEL S.");
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnKentuckyCoronelSandich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/5-removebg-preview.png"))); // NOI18N
        btnKentuckyCoronelSandich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKentuckyCoronelSandichActionPerformed(evt);
            }
        });

        lblq34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq34.setText("0");

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("COMBO K. CORONEL S.");
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnComboKCoronelSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/6-removebg-preview.png"))); // NOI18N
        btnComboKCoronelSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboKCoronelSandwichActionPerformed(evt);
            }
        });

        lblq35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq35.setText("0");

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("SANDWICH CRISPY BBQ");
        jLabel73.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnSandwichCrispyBbq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/7-removebg-preview.png"))); // NOI18N
        btnSandwichCrispyBbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandwichCrispyBbqActionPerformed(evt);
            }
        });

        lblq36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq36.setText("0");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("COMBO S. CRISPY BBQ");
        jLabel75.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnComboSandwichCrispyBbq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sandwiches/8-removebg-preview.png"))); // NOI18N
        btnComboSandwichCrispyBbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboSandwichCrispyBbqActionPerformed(evt);
            }
        });

        lblq37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq37.setText("0");

        javax.swing.GroupLayout pnlSandwichLayout = new javax.swing.GroupLayout(pnlSandwich);
        pnlSandwich.setLayout(pnlSandwichLayout);
        pnlSandwichLayout.setHorizontalGroup(
            pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSandwichLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSandwichCrispyBbq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblq36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblq37, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnComboSandwichCrispyBbq, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblq33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKentuckySandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSandwichLayout.createSequentialGroup()
                                .addComponent(lblq30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSandwichLayout.createSequentialGroup()
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBbqCrunch, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblq34, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnKentuckyCoronelSandich, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblq35, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComboKCoronelSandwich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblq31, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnComboBbqCrunch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnComboKSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblq32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)))))
                .addGap(130, 130, 130))
        );
        pnlSandwichLayout.setVerticalGroup(
            pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSandwichLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addComponent(btnComboKSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addComponent(btnComboBbqCrunch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBbqCrunch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSandwichLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel63)
                        .addGap(36, 36, 36)
                        .addComponent(btnKentuckySandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq33))
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblq31)
                                    .addComponent(lblq30)))
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblq32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addComponent(btnComboKCoronelSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblq35))
                            .addGroup(pnlSandwichLayout.createSequentialGroup()
                                .addComponent(btnKentuckyCoronelSandich, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblq34)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addComponent(btnSandwichCrispyBbq, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq36))
                    .addGroup(pnlSandwichLayout.createSequentialGroup()
                        .addComponent(btnComboSandwichCrispyBbq, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq37)))
                .addGap(47, 47, 47))
        );

        pnlPrincipal.addTab("Sandwich", pnlSandwich);

        btn6AlitasPicantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/1-removebg-preview.png"))); // NOI18N
        btn6AlitasPicantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6AlitasPicantesActionPerformed(evt);
            }
        });

        lblq38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq38.setText("0");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("6 ALITAS PICANTES");
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnPopcornGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/2-removebg-preview.png"))); // NOI18N
        btnPopcornGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopcornGrandeActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("POPCORN GRANDE");
        jLabel78.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq39.setText("0");

        btn9AlitasPicantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/3-removebg-preview.png"))); // NOI18N
        btn9AlitasPicantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9AlitasPicantesActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("9 ALITAS PICANTES");
        jLabel80.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq40.setText("0");

        btnPopCornMediano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/4-removebg-preview.png"))); // NOI18N
        btnPopCornMediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopCornMedianoActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("POPCORN MEDIANO");
        jLabel82.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq41.setText("0");

        btnAdicion5NuggetsIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/7-removebg-preview.png"))); // NOI18N
        btnAdicion5NuggetsIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicion5NuggetsIndividualActionPerformed(evt);
            }
        });

        btnPopCornPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/5-removebg-preview.png"))); // NOI18N
        btnPopCornPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopCornPequeñoActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("POPCORN PEQUEÑO");
        jLabel84.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq42.setText("0");

        btn20AlitasPicantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/6-removebg-preview.png"))); // NOI18N
        btn20AlitasPicantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20AlitasPicantesActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("20 ALITAS PICANTES");
        jLabel86.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq43.setText("0");

        jLabel88.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("ADICION 5 NUGGETS");
        jLabel88.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq44.setText("0");

        btnAdicion10NuggetsIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Individuales/8-removebg-preview.png"))); // NOI18N
        btnAdicion10NuggetsIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicion10NuggetsIndividualActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("ADICIÓN 10 NUGGETS");
        jLabel90.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq45.setText("0");

        javax.swing.GroupLayout pnlIndividualLayout = new javax.swing.GroupLayout(pnlIndividual);
        pnlIndividual.setLayout(pnlIndividualLayout);
        pnlIndividualLayout.setHorizontalGroup(
            pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndividualLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn6AlitasPicantes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblq38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPopCornMediano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblq41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIndividualLayout.createSequentialGroup()
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPopcornGrande, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblq39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblq40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btn9AlitasPicantes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlIndividualLayout.createSequentialGroup()
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPopCornPequeño, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblq42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn20AlitasPicantes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblq43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblq44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdicion5NuggetsIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicion10NuggetsIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblq45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnlIndividualLayout.setVerticalGroup(
            pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndividualLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addComponent(btn9AlitasPicantes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq40))
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addComponent(btnPopcornGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq39))
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addComponent(btn6AlitasPicantes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addComponent(btnPopCornMediano, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblq41))
                    .addGroup(pnlIndividualLayout.createSequentialGroup()
                        .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIndividualLayout.createSequentialGroup()
                                .addComponent(btnPopCornPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel86))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblq42)
                                    .addComponent(lblq43)))
                            .addComponent(btn20AlitasPicantes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicion5NuggetsIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnAdicion10NuggetsIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblq44)
                    .addComponent(lblq45))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Individuales", pnlIndividual);

        btnPapaGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/1-removebg-preview (1).png"))); // NOI18N
        btnPapaGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapaGrandeActionPerformed(evt);
            }
        });

        lblq46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq46.setText("0");

        btnEnsaladaColslawGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/2-removebg-preview (1).png"))); // NOI18N
        btnEnsaladaColslawGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsaladaColslawGrandeActionPerformed(evt);
            }
        });

        lblq47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq47.setText("0");

        btnPapaPequeña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/3-removebg-preview (1).png"))); // NOI18N
        btnPapaPequeña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapaPequeñaActionPerformed(evt);
            }
        });

        lblq48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq48.setText("0");

        btnEnsaladaColslawPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/4-removebg-preview (1).png"))); // NOI18N
        btnEnsaladaColslawPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsaladaColslawPersonalActionPerformed(evt);
            }
        });

        lblq49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq49.setText("0");

        btnGaseosaPet400ML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/5-removebg-preview (1).png"))); // NOI18N
        btnGaseosaPet400ML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaseosaPet400MLActionPerformed(evt);
            }
        });

        lblq50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq50.setText("0");

        btn3PresasBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/6-removebg-preview (1).png"))); // NOI18N
        btn3PresasBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3PresasBebidasActionPerformed(evt);
            }
        });

        lblq51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq51.setText("0");

        btn12Arepas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/7-removebg-preview (1).png"))); // NOI18N
        btn12Arepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ArepasActionPerformed(evt);
            }
        });

        lblq52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq52.setText("0");

        btnGaseosa15Lts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/8-re.png"))); // NOI18N
        btnGaseosa15Lts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaseosa15LtsActionPerformed(evt);
            }
        });

        lblq53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq53.setText("0");

        btnMrTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bebidas/9.png"))); // NOI18N
        btnMrTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMrTeaActionPerformed(evt);
            }
        });

        lblq54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq54.setText("0");

        jLabel100.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("PAPA GRANDE");
        jLabel100.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel101.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("ENSALADA COL SLAW GRAN.");
        jLabel101.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel102.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("12 AREPAS");
        jLabel102.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel103.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("ENSALADA COLSLAW PERS.");
        jLabel103.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel104.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("PAPA PQUEÑA");
        jLabel104.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel105.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("GASEOSA PET 400 ML");
        jLabel105.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel106.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("3 PRESAS");
        jLabel106.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel107.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("MR TEA");
        jLabel107.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel108.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("GAEOSA 1,5 LTS");
        jLabel108.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlbebidasLayout = new javax.swing.GroupLayout(pnlbebidas);
        pnlbebidas.setLayout(pnlbebidasLayout);
        pnlbebidasLayout.setHorizontalGroup(
            pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbebidasLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn12Arepas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnsaladaColslawPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPapaGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq49, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblq52, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGaseosaPet400ML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGaseosa15Lts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMrTea)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblq54, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblq51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3PresasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEnsaladaColslawGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel101))
                        .addGap(18, 18, 18)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPapaPequeña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pnlbebidasLayout.setVerticalGroup(
            pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbebidasLayout.createSequentialGroup()
                .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlbebidasLayout.createSequentialGroup()
                                .addComponent(btnPapaPequeña, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblq48))
                            .addGroup(pnlbebidasLayout.createSequentialGroup()
                                .addComponent(btnEnsaladaColslawGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblq47))
                            .addGroup(pnlbebidasLayout.createSequentialGroup()
                                .addComponent(btnPapaGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel104))
                                .addGap(1, 1, 1)
                                .addComponent(lblq46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlbebidasLayout.createSequentialGroup()
                                .addComponent(btn3PresasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblq51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn12Arepas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlbebidasLayout.createSequentialGroup()
                                .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                                        .addComponent(btnEnsaladaColslawPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel103)
                                            .addComponent(jLabel105)
                                            .addComponent(jLabel106))
                                        .addGap(1, 1, 1)
                                        .addComponent(lblq49))
                                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                                        .addComponent(btnGaseosaPet400ML, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblq50)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGaseosa15Lts, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102)
                        .addGap(2, 2, 2)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblq52)
                            .addComponent(lblq53)
                            .addComponent(lblq54)))
                    .addGroup(pnlbebidasLayout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(btnMrTea, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Bebidas", pnlbebidas);

        btnAvalanchaOreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postres/1-removebg-preview.png"))); // NOI18N
        btnAvalanchaOreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvalanchaOreoActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("AVALANCHA OREO");
        jLabel109.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq55.setText("0");

        btnAvalanchaOreoPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postres/2-removebg-preview.png"))); // NOI18N
        btnAvalanchaOreoPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvalanchaOreoPromoActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("AVALANCHA OREO PROMO");
        jLabel111.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq56.setText("0");

        btn3AvalanchasOreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postres/3-removebg-preview.png"))); // NOI18N
        btn3AvalanchasOreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3AvalanchasOreoActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("3 AVALANCHAS OREO");
        jLabel113.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq57.setText("0");

        bnSundaeArequipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postres/4-removebg-preview.png"))); // NOI18N
        bnSundaeArequipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSundaeArequipeActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("SUNADE AREQUIPE");
        jLabel115.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq58.setText("0");

        btnSundaeDeChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postres/5-removebg-preview.png"))); // NOI18N
        btnSundaeDeChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSundaeDeChocolateActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("SUNDAE DE CHOCOLATE");
        jLabel117.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblq59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblq59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblq59.setText("0");

        javax.swing.GroupLayout pnlPostresLayout = new javax.swing.GroupLayout(pnlPostres);
        pnlPostres.setLayout(pnlPostresLayout);
        pnlPostresLayout.setHorizontalGroup(
            pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPostresLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bnSundaeArequipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq58, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAvalanchaOreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblq55, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSundaeDeChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPostresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAvalanchaOreoPromo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblq56, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPostresLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblq59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn3AvalanchasOreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblq57, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        pnlPostresLayout.setVerticalGroup(
            pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPostresLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPostresLayout.createSequentialGroup()
                        .addComponent(btn3AvalanchasOreo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel113)
                        .addGap(1, 1, 1)
                        .addComponent(lblq57))
                    .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlPostresLayout.createSequentialGroup()
                            .addComponent(btnAvalanchaOreoPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel111)
                            .addGap(1, 1, 1)
                            .addComponent(lblq56))
                        .addGroup(pnlPostresLayout.createSequentialGroup()
                            .addComponent(btnAvalanchaOreo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel109)
                            .addGap(1, 1, 1)
                            .addComponent(lblq55))))
                .addGap(28, 28, 28)
                .addGroup(pnlPostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPostresLayout.createSequentialGroup()
                        .addComponent(bnSundaeArequipe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel115)
                        .addGap(1, 1, 1)
                        .addComponent(lblq58))
                    .addGroup(pnlPostresLayout.createSequentialGroup()
                        .addComponent(btnSundaeDeChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel117)
                        .addGap(1, 1, 1)
                        .addComponent(lblq59)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pnlPrincipal.addTab("Postres", pnlPostres);

        tblDetalle.setBackground(new java.awt.Color(255, 255, 255));
        tblDetalle.setForeground(new java.awt.Color(0, 0, 0));
        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Iteam", "Qty", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblDetalle);

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura.setColumns(20);
        txtFactura.setForeground(new java.awt.Color(0, 0, 0));
        txtFactura.setRows(5);
        jScrollPane2.setViewportView(txtFactura);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("TOTAL");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Efectivo");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("Cambio");

        txtTotal.setEditable(false);

        txtCambio.setEditable(false);

        btnPagar.setBackground(new java.awt.Color(102, 153, 255));
        btnPagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/pagar.png"))); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(153, 255, 153));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnFacturar.setBackground(new java.awt.Color(102, 255, 204));
        btnFacturar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/factura.png"))); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(255, 255, 153));
        btnImprimir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminarIteam.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEliminarIteam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/eliminar.png"))); // NOI18N
        btnEliminarIteam.setText("Eliminar");
        btnEliminarIteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIteamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(btnEliminarIteam)
                .addGap(214, 214, 214))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarIteam)
                .addContainerGap())
        );

        Grupo1.add(rbtnRigth);
        rbtnRigth.setText("Right");
        rbtnRigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRigthActionPerformed(evt);
            }
        });

        Grupo1.add(rbtnTop);
        rbtnTop.setText("Top");
        rbtnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTopActionPerformed(evt);
            }
        });

        Grupo1.add(rbtnBottom);
        rbtnBottom.setText("Bottom");
        rbtnBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBottomActionPerformed(evt);
            }
        });

        Grupo1.add(rbtnLeft);
        rbtnLeft.setText("Left");
        rbtnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLeftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnRigth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnTop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnBottom)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnRigth)
                            .addComponent(rbtnTop)
                            .addComponent(rbtnBottom)
                            .addComponent(rbtnLeft))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarCierre() {
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro en que desea cerrar la aplicación?",
                "Confirmar cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void colorearTabs() {
        Color[] colores = {
            new Color(255, 0, 0), //Rojo - Nuggets
            new Color(204, 255, 204), //Verde claro - Buckets
            new Color(204, 204, 255), //Azul claro - Combos
            new Color(255, 255, 204), //Amarillo claro - Boxes
            new Color(255, 204, 255), //Lavanda - 2 Personas
            new Color(204, 255, 255), //Cyan - Sandwiches
            new Color(255, 229, 204), //Melocotón claro - Individuales
            new Color(255, 204, 153), //Naranja Claro - Bebidas
            new Color(50, 205, 50), //Verde lima - Postres
            new Color(25, 250, 21) //oro Claro Krunchy
        };
        for (int i = 0; i < pnlPrincipal.getTabCount(); i++) {
            pnlPrincipal.setBackgroundAt(i, colores[i]);
        }
        pnlPrincipal.updateUI();
    }

    public void addTable(int id, String Nombre, int Qty, Double Precio) {
        DefaultTableModel dt = (DefaultTableModel) tblDetalle.getModel();

        Vector v = new Vector();

        v.add(id);
        v.add(Nombre);
        v.add(Qty);
        v.add(Precio);
        dt.addRow(v);
    }

    public void addTables(int id, String nombre, int qty, Double precio) {
        DefaultTableModel dt = (DefaultTableModel) tblDetalle.getModel();
        DecimalFormat df = new DecimalFormat("0.00");

        double totalPrecio = precio * qty;

        for (int row = 0; row < tblDetalle.getRowCount(); row++) {
            if (nombre.equals(tblDetalle.getValueAt(row, 1))) {
                dt.removeRow(tblDetalle.convertRowIndexToModel(row));
            }
        }

        Vector v = new Vector();

        v.add(id);
        v.add(nombre);
        v.add(qty);
        v.add(totalPrecio);
        dt.addRow(v);
        cal();
    }

    public void cal() {
        int numOfRow = tblDetalle.getRowCount();
        double tot = 0;

        for (int i = 0; i < numOfRow; i++) {
            try {
                double value = Double.parseDouble(tblDetalle.getValueAt(i, 3).toString());
                tot += value;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
//        DecimalFormat df = new DecimalFormat("0.00");
        NumberFormat formatoColombia = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        txtTotal.setText(formatoColombia.format(tot));
    }

    private void setLabelToZero(String labelNumber) {
        try {
            int num = Integer.parseInt(labelNumber);
            if (num >= 1 && num <= 59) {
                JLabel label = (JLabel) this.getClass().getDeclaredField("lblq" + num).get(this);
                label.setText("0");
            } else {
                System.out.println("número de label fuera de rango: " + num);
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            System.out.println("Error al acceder al label. lbq" + labelNumber);
        }
    }

    private void limpiarCampos() {
        DefaultTableModel model = (DefaultTableModel) tblDetalle.getModel();
        model.setRowCount(0);

        for (int i = 1; i <= 59; i++) {
            try {
                JLabel label = (JLabel) this.getClass().getDeclaredField("lblq" + i).get(this);
                label.setText("0");
            } catch (Exception e) {
                System.out.println("error al acceer al label: lblq" + i);

            }
        }

        txtTotal.setText("");
        txtEfectivo.setText("");
        txtCambio.setText("");
        txtFactura.setText("");

        this.revalidate();
        this.repaint();

    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea iniciar una nueva transacción? se perderán los datos no guardados",
                "Nueva transacción", JOptionPane.YES_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCampos();
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarIteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIteamActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tblDetalle.getModel();

        String r = dt.getValueAt(tblDetalle.getSelectedRow(), 0).toString();

        int row = tblDetalle.getSelectedRow();
        dt.removeRow(row);

        setLabelToZero(r);
    }//GEN-LAST:event_btnEliminarIteamActionPerformed

    private void btnParteYComparteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParteYComparteActionPerformed
        int i = Integer.parseInt(lblq1.getText());
        ++i;
        lblq1.setText(String.valueOf(i));
        addTables(1, "Parte y Comparte", i, 39900.00);
        cal();
    }//GEN-LAST:event_btnParteYComparteActionPerformed

    private void btnComboNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboNuggetsActionPerformed
        int i = Integer.parseInt(lblq2.getText());
        ++i;
        lblq2.setText(String.valueOf(i));
        addTables(2, "Combo Nuggets", i, 19900.00);
        cal();
    }//GEN-LAST:event_btnComboNuggetsActionPerformed

    private void btnAdicion5NuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicion5NuggetsActionPerformed
        int i = Integer.parseInt(lblq3.getText());
        ++i;
        lblq3.setText(String.valueOf(i));
        addTables(3, "Adicion 5 Nuggets", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnAdicion5NuggetsActionPerformed

    private void btnAdicion10NuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicion10NuggetsActionPerformed
        int i = Integer.parseInt(lblq4.getText());
        ++i;
        lblq5.setText(String.valueOf(i));
        addTables(4, "Adicion 10 Nuggets", i, 14900.00);
        cal();
    }//GEN-LAST:event_btnAdicion10NuggetsActionPerformed

    private void btnCombo5NuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo5NuggetsActionPerformed
        int i = Integer.parseInt(lblq5.getText());
        ++i;
        lblq5.setText(String.valueOf(i));
        addTables(5, "Combo 5 Nuggets", i, 14900.00);
        cal();
    }//GEN-LAST:event_btnCombo5NuggetsActionPerformed

    private void btnMega3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMega3ActionPerformed
        int i = Integer.parseInt(lblq6.getText());
        ++i;
        lblq6.setText(String.valueOf(i));
        addTables(6, "Mega 3", i, 79900.00);
        cal();
    }//GEN-LAST:event_btnMega3ActionPerformed

    private void btnMegaFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegaFamiliarActionPerformed
        int i = Integer.parseInt(lblq7.getText());
        ++i;
        lblq7.setText(String.valueOf(i));
        addTables(7, "Mega Familiar", i, 61900.00);
        cal();
    }//GEN-LAST:event_btnMegaFamiliarActionPerformed

    private void btnMegaVariedadXLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegaVariedadXLActionPerformed
        int i = Integer.parseInt(lblq8.getText());
        ++i;
        lblq8.setText(String.valueOf(i));
        addTables(8, "Mega Variedad XL", i, 77900.00);
        cal();
    }//GEN-LAST:event_btnMegaVariedadXLActionPerformed

    private void btnBucketTradicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucketTradicionalActionPerformed
        int i = Integer.parseInt(lblq9.getText());
        ++i;
        lblq9.setText(String.valueOf(i));
        addTables(9, "Bucket Tradicional", i, 62500.00);
        cal();
    }//GEN-LAST:event_btnBucketTradicionalActionPerformed

    private void btnMegaFamiliarArepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegaFamiliarArepasActionPerformed
        int i = Integer.parseInt(lblq10.getText());
        ++i;
        lblq10.setText(String.valueOf(i));
        addTables(10, "Mega Familiar Arepas", i, 49900.00);
        cal();
    }//GEN-LAST:event_btnMegaFamiliarArepasActionPerformed

    private void btnMegaFamiliarXLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegaFamiliarXLActionPerformed
        int i = Integer.parseInt(lblq11.getText());
        ++i;
        lblq11.setText(String.valueOf(i));
        addTables(11, "Mega Familiar XL", i, 76900.00);
        cal();
    }//GEN-LAST:event_btnMegaFamiliarXLActionPerformed

    private void btnTrioSupremoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrioSupremoActionPerformed
        int i = Integer.parseInt(lblq12.getText());
        ++i;
        lblq12.setText(String.valueOf(i));
        addTables(12, "Trio Supremo", i, 57900.00);
        cal();
    }//GEN-LAST:event_btnTrioSupremoActionPerformed

    private void btnMedioKFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioKFCActionPerformed
        int i = Integer.parseInt(lblq13.getText());
        ++i;
        lblq13.setText(String.valueOf(i));
        addTables(13, "Medio KFC", i, 32900.00);
        cal();
    }//GEN-LAST:event_btnMedioKFCActionPerformed

    private void btnFamiliarKFCArepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliarKFCArepasActionPerformed
        int i = Integer.parseInt(lblq14.getText());
        ++i;
        lblq14.setText(String.valueOf(i));
        addTables(14, "Familiar KFC Arepas", i, 62900.00);
        cal();
    }//GEN-LAST:event_btnFamiliarKFCArepasActionPerformed

    private void btn2PresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2PresasActionPerformed
        int i = Integer.parseInt(lblq15.getText());
        ++i;
        lblq15.setText(String.valueOf(i));
        addTables(15, "2 Presas", i, 18900.00);
        cal();
    }//GEN-LAST:event_btn2PresasActionPerformed

    private void btn3PresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3PresasActionPerformed
        int i = Integer.parseInt(lblq16.getText());
        ++i;
        lblq16.setText(String.valueOf(i));
        addTables(16, "3 Presas", i, 26900.00);
        cal();
    }//GEN-LAST:event_btn3PresasActionPerformed

    private void btnAlitasPicantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlitasPicantesActionPerformed
        int i = Integer.parseInt(lblq17.getText());
        ++i;
        lblq17.setText(String.valueOf(i));
        addTables(17, "Alitas Picantes", i, 24900.00);
        cal();
    }//GEN-LAST:event_btnAlitasPicantesActionPerformed

    private void bntPopCornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPopCornActionPerformed
        int i = Integer.parseInt(lblq18.getText());
        ++i;
        lblq18.setText(String.valueOf(i));
        addTables(18, "Pop Corn", i, 17900.00);
        cal();
    }//GEN-LAST:event_bntPopCornActionPerformed

    private void btnCaseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaseroActionPerformed
        int i = Integer.parseInt(lblq19.getText());
        ++i;
        lblq19.setText(String.valueOf(i));
        addTables(19, "Casero", i, 21900.00);
        cal();
    }//GEN-LAST:event_btnCaseroActionPerformed

    private void btnNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuggetsActionPerformed
        int i = Integer.parseInt(lblq20.getText());
        ++i;
        lblq20.setText(String.valueOf(i));
        addTables(20, "Nuggets", i, 19900.00);
        cal();
    }//GEN-LAST:event_btnNuggetsActionPerformed

    private void btnBigBoxPopHeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigBoxPopHeladoActionPerformed
        int i = Integer.parseInt(lblq21.getText());
        ++i;
        lblq21.setText(String.valueOf(i));
        addTables(21, "Big Box Pop Helado", i, 30500.00);
        cal();
    }//GEN-LAST:event_btnBigBoxPopHeladoActionPerformed

    private void btnBigBoxKSandwichNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigBoxKSandwichNuggetsActionPerformed
        int i = Integer.parseInt(lblq22.getText());
        ++i;
        lblq22.setText(String.valueOf(i));
        addTables(22, "Big Box K. Sandwich Nuggets", i, 30900.00);
        cal();
    }//GEN-LAST:event_btnBigBoxKSandwichNuggetsActionPerformed

    private void btnBigBoxKCoronelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigBoxKCoronelActionPerformed
        int i = Integer.parseInt(lblq23.getText());
        ++i;
        lblq23.setText(String.valueOf(i));
        addTables(23, "Big Box Kentucky Coronel", i, 27900.00);
        cal();
    }//GEN-LAST:event_btnBigBoxKCoronelActionPerformed

    private void btnParteComparteAlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParteComparteAlasActionPerformed
        int i = Integer.parseInt(lblq24.getText());
        ++i;
        lblq24.setText(String.valueOf(i));
        addTables(24, "Parte y Comparte Alas", i, 46900.00);
        cal();
    }//GEN-LAST:event_btnParteComparteAlasActionPerformed
////--------------------
    private void btnParteComparteMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParteComparteMixtoActionPerformed
        int i = Integer.parseInt(lblq25.getText());
        ++i;
        lblq25.setText(String.valueOf(i));
        addTables(25, "Parte Comparte Mixto", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnParteComparteMixtoActionPerformed

    private void btnParteCompartePresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParteCompartePresasActionPerformed
        int i = Integer.parseInt(lblq26.getText());
        ++i;
        lblq26.setText(String.valueOf(i));
        addTables(26, "Parte Comparte Presas", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnParteCompartePresasActionPerformed

    private void btnParteComparteNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParteComparteNuggetsActionPerformed
        int i = Integer.parseInt(lblq27.getText());
        ++i;
        lblq27.setText(String.valueOf(i));
        addTables(27, "Parte Comparte Nuggets", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnParteComparteNuggetsActionPerformed

    private void btnWowDuoDeluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWowDuoDeluxeActionPerformed
        int i = Integer.parseInt(lblq28.getText());
        ++i;
        lblq28.setText(String.valueOf(i));
        addTables(28, "Wow Duo Deluxe", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnWowDuoDeluxeActionPerformed

    private void btnWowDuoDeluxeNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWowDuoDeluxeNuggetsActionPerformed
        int i = Integer.parseInt(lblq29.getText());
        ++i;
        lblq29.setText(String.valueOf(i));
        addTables(29, "Wow Duo Deluxe Nuggets", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnWowDuoDeluxeNuggetsActionPerformed

    private void btn6AlitasPicantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6AlitasPicantesActionPerformed
        int i = Integer.parseInt(lblq38.getText());
        ++i;
        lblq38.setText(String.valueOf(i));
        addTables(30, "6 Alitas Picantes", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn6AlitasPicantesActionPerformed

    private void btnPopcornGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopcornGrandeActionPerformed
        int i = Integer.parseInt(lblq39.getText());
        ++i;
        lblq39.setText(String.valueOf(i));
        addTables(31, "Popcorn Grande", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnPopcornGrandeActionPerformed

    private void btn9AlitasPicantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9AlitasPicantesActionPerformed
        int i = Integer.parseInt(lblq40.getText());
        ++i;
        lblq40.setText(String.valueOf(i));
        addTables(32, "9 Alitas Picantes", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn9AlitasPicantesActionPerformed

    private void btnPopCornMedianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopCornMedianoActionPerformed
        int i = Integer.parseInt(lblq41.getText());
        ++i;
        lblq41.setText(String.valueOf(i));
        addTables(33, "Popcorn Mediano", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnPopCornMedianoActionPerformed

    private void btnPopCornPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopCornPequeñoActionPerformed
        int i = Integer.parseInt(lblq42.getText());
        ++i;
        lblq42.setText(String.valueOf(i));
        addTables(34, "Popcorn Pequeño", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnPopCornPequeñoActionPerformed

    private void btn20AlitasPicantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20AlitasPicantesActionPerformed
        int i = Integer.parseInt(lblq43.getText());
        ++i;
        lblq43.setText(String.valueOf(i));
        addTables(35, "20 AlitasPicantes", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn20AlitasPicantesActionPerformed

    private void btnAdicion5NuggetsIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicion5NuggetsIndividualActionPerformed
        int i = Integer.parseInt(lblq44.getText());
        ++i;
        lblq44.setText(String.valueOf(i));
        addTables(36, "Adicion 5 Nuggets (Individual)", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnAdicion5NuggetsIndividualActionPerformed

    private void btnAdicion10NuggetsIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicion10NuggetsIndividualActionPerformed
        int i = Integer.parseInt(lblq45.getText());
        ++i;
        lblq45.setText(String.valueOf(i));
        addTables(37, "Adicion 10 Nuggets", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnAdicion10NuggetsIndividualActionPerformed

    private void btnComboSandwichCrispyBbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboSandwichCrispyBbqActionPerformed
        int i = Integer.parseInt(lblq37.getText());
        ++i;
        lblq37.setText(String.valueOf(i));
        addTables(38, "Combo Sandwich Crispy Bbq", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnComboSandwichCrispyBbqActionPerformed

    private void btnSandwichCrispyBbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandwichCrispyBbqActionPerformed
        int i = Integer.parseInt(lblq36.getText());
        ++i;
        lblq36.setText(String.valueOf(i));
        addTables(39, "Sandwich Crispy BBQ", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnSandwichCrispyBbqActionPerformed

    private void btnComboKCoronelSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboKCoronelSandwichActionPerformed
        int i = Integer.parseInt(lblq35.getText());
        ++i;
        lblq35.setText(String.valueOf(i));
        addTables(40, "Combo K. Coronel Sandwich", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnComboKCoronelSandwichActionPerformed

    private void btnKentuckyCoronelSandichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKentuckyCoronelSandichActionPerformed
        int i = Integer.parseInt(lblq34.getText());
        ++i;
        lblq34.setText(String.valueOf(i));
        addTables(41, "Kentucky Coronel Sandich", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnKentuckyCoronelSandichActionPerformed

    private void btnKentuckySandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKentuckySandwichActionPerformed
        int i = Integer.parseInt(lblq33.getText());
        ++i;
        lblq33.setText(String.valueOf(i));
        addTables(42, "Kentucky Sandwich", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnKentuckySandwichActionPerformed

    private void btnComboKSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboKSandwichActionPerformed
        int i = Integer.parseInt(lblq32.getText());
        ++i;
        lblq32.setText(String.valueOf(i));
        addTables(43, "Combo KSandwich", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnComboKSandwichActionPerformed

    private void btnComboBbqCrunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboBbqCrunchActionPerformed
        int i = Integer.parseInt(lblq31.getText());
        ++i;
        lblq31.setText(String.valueOf(i));
        addTables(44, "Combo BBQ Crunch", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnComboBbqCrunchActionPerformed

    private void btnBbqCrunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBbqCrunchActionPerformed
        int i = Integer.parseInt(lblq30.getText());
        ++i;
        lblq30.setText(String.valueOf(i));
        addTables(45, "BBQ Crunch", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnBbqCrunchActionPerformed

    private void btnPapaGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapaGrandeActionPerformed
        int i = Integer.parseInt(lblq46.getText());
        ++i;
        lblq46.setText(String.valueOf(i));
        addTables(46, "Papa Grande", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnPapaGrandeActionPerformed

    private void btnEnsaladaColslawGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsaladaColslawGrandeActionPerformed
        int i = Integer.parseInt(lblq47.getText());
        ++i;
        lblq47.setText(String.valueOf(i));
        addTables(47, "Ensalada Colslaw Grande", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnEnsaladaColslawGrandeActionPerformed

    private void btnPapaPequeñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapaPequeñaActionPerformed
        int i = Integer.parseInt(lblq48.getText());
        ++i;
        lblq48.setText(String.valueOf(i));
        addTables(48, "Papa Pequeña", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnPapaPequeñaActionPerformed

    private void btnEnsaladaColslawPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsaladaColslawPersonalActionPerformed
        int i = Integer.parseInt(lblq3.getText());
        ++i;
        lblq3.setText(String.valueOf(i));
        addTables(49, "Adicion 5 Nuggets", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnEnsaladaColslawPersonalActionPerformed

    private void btnGaseosaPet400MLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaseosaPet400MLActionPerformed
        int i = Integer.parseInt(lblq50.getText());
        ++i;
        lblq50.setText(String.valueOf(i));
        addTables(50, "Gaseosa Pet 400 ML", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnGaseosaPet400MLActionPerformed

    private void btn3PresasBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3PresasBebidasActionPerformed
        int i = Integer.parseInt(lblq51.getText());
        ++i;
        lblq51.setText(String.valueOf(i));
        addTables(51, "3 Presas (Bebidas)", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn3PresasBebidasActionPerformed

    private void btn12ArepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ArepasActionPerformed
        int i = Integer.parseInt(lblq52.getText());
        ++i;
        lblq52.setText(String.valueOf(i));
        addTables(52, "12 Arepas", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn12ArepasActionPerformed

    private void btnGaseosa15LtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaseosa15LtsActionPerformed
        int i = Integer.parseInt(lblq53.getText());
        ++i;
        lblq53.setText(String.valueOf(i));
        addTables(53, "Gaseosa 1,5 Lts", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnGaseosa15LtsActionPerformed

    private void btnMrTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMrTeaActionPerformed
        int i = Integer.parseInt(lblq54.getText());
        ++i;
        lblq54.setText(String.valueOf(i));
        addTables(54, "Mr. Tea", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnMrTeaActionPerformed

    private void btnAvalanchaOreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvalanchaOreoActionPerformed
        int i = Integer.parseInt(lblq55.getText());
        ++i;
        lblq55.setText(String.valueOf(i));
        addTables(55, "Avalancha Oreo", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnAvalanchaOreoActionPerformed

    private void btnAvalanchaOreoPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvalanchaOreoPromoActionPerformed
        int i = Integer.parseInt(lblq56.getText());
        ++i;
        lblq56.setText(String.valueOf(i));
        addTables(56, "Avalancha Oreo Promo", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnAvalanchaOreoPromoActionPerformed

    private void btn3AvalanchasOreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3AvalanchasOreoActionPerformed
        int i = Integer.parseInt(lblq57.getText());
        ++i;
        lblq57.setText(String.valueOf(i));
        addTables(57, "3 Avalanchas Oreo", i, 9900.00);
        cal();
    }//GEN-LAST:event_btn3AvalanchasOreoActionPerformed

    private void bnSundaeArequipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSundaeArequipeActionPerformed
        int i = Integer.parseInt(lblq58.getText());
        ++i;
        lblq58.setText(String.valueOf(i));
        addTables(58, "Sundae Arequipe", i, 9900.00);
        cal();
    }//GEN-LAST:event_bnSundaeArequipeActionPerformed

    private void btnSundaeDeChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSundaeDeChocolateActionPerformed
        int i = Integer.parseInt(lblq59.getText());
        ++i;
        lblq59.setText(String.valueOf(i));
        addTables(59, "Sundae De Chocolate", i, 9900.00);
        cal();
    }//GEN-LAST:event_btnSundaeDeChocolateActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            NumberFormat formatoColombia = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
            Number totalNumber = formatoColombia.parse(txtTotal.getText());
            double total = totalNumber.doubleValue();

            double efectivo = Double.parseDouble(txtEfectivo.getText());

            double vueltas = efectivo - total;

            txtCambio.setText(formatoColombia.format(vueltas));
        } catch (Exception e) {
            System.out.println("Error: el valor ingresado no es valido " + e.getMessage());
            txtCambio.setText("Error!");
        }
    }//GEN-LAST:event_btnPagarActionPerformed


    private void rbtnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTopActionPerformed
//        tabbedPane.setTabPlacement(JTabbedPane.TOP);
//        tabbedPane.revalidate();
//        tabbedPane.repaint();
    }//GEN-LAST:event_rbtnTopActionPerformed

    private void rbtnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLeftActionPerformed
//        tabbedPane.setTabPlacement(JTabbedPane.LEFT);
//        tabbedPane.revalidate();
//        tabbedPane.repaint();
    }//GEN-LAST:event_rbtnLeftActionPerformed

    private void rbtnRigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRigthActionPerformed
//        tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
//        tabbedPane.revalidate();
//        tabbedPane.repaint();
    }//GEN-LAST:event_rbtnRigthActionPerformed

    private void rbtnBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBottomActionPerformed
//        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
//        tabbedPane.revalidate();
//        tabbedPane.repaint();
    }//GEN-LAST:event_rbtnBottomActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        StringBuilder recibo = new StringBuilder();
        refs = (int) (1325 + (Math.random() * 4238));

        recibo.append(String.format("%38s\n", "KFC"));
        recibo.append(String.format("%38s\n", "Sogamoso - Boyacá"));
        recibo.append(String.format("%38s\n", "Carrera 14 # 13-81"));
        recibo.append(String.format("%38s\n", "Tel: 3123456789"));
        recibo.append(String.format("\n"));
        recibo.append(String.format("Factura No.: ", "%04d\n", refs));
        recibo.append(String.format("------------------------------------------------------\n"));

        recibo.append(String.format("%-23s %5s %14s\n", "Item", "Qty", "Precio"));
        recibo.append("----------------------------------------------------------------\n");

        DefaultTableModel model = (DefaultTableModel) tblDetalle.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String item = model.getValueAt(i, 1).toString();
            int qty = Integer.parseInt(model.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(model.getValueAt(i, 3).toString());
            recibo.append(String.format("%-23s %5s %14s\n", item, qty, nf.format(precio)));
        }

        recibo.append("----------------------------------------------------------------\n");

        double efectivo = Double.parseDouble(txtEfectivo.getText().replaceAll("[^\\d.]", ""));
        double cambio = Double.parseDouble(txtEfectivo.getText().replaceAll("[^\\d.]", ""));

        recibo.append(String.format("%-29s %14s\n", "Total: ", txtTotal.getText()));
        recibo.append(String.format("%-29s %14s\n", "Efectivo: ", nf.format(efectivo)));
        recibo.append(String.format("%-29s %14s\n", "Cambio: ", txtCambio.getText()));
        recibo.append("----------------------------------------------------------------\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss");
        recibo.append(String.format("Fecha: %s\n", dateFormat.format(new Date())));
        recibo.append(String.format("%-38s\n", "¡Gracias por su compra!"));
        recibo.append(String.format("%-38s\n", "Visitenos en www.kfc.com.co"));
        recibo.append(String.format("%-38s\n", "ADSO SENA - LAURA"));

        txtFactura.setText((recibo.toString()));

        String reciboString = recibo.toString();
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                if (page > 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                FontMetrics fm = g.getFontMetrics();
                int lineHeight = fm.getHeight();

                String[] lines = reciboString.split("\n");
                int y = 0;
                for (String line : lines) {
                    y += lineHeight;
                    g.drawString(line, 0, y);
                }

                return PAGE_EXISTS;
            }
        });
        try {
            if (job.printDialog()) {
                job.print();
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Error al imprimir: " + e.getMessage(),
                    "Error de Impresión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
//        refs = (int) (1325 + (Math.random() + 4238));
        Calendar tiempo = Calendar.getInstance();
        SimpleDateFormat tTiempo = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dia = new SimpleDateFormat("dd-MM-YYY");

        com.itextpdf.text.Document document = new com.itextpdf.text.Document();

        try {
            PdfWriter Writer = PdfWriter.getInstance(document, new FileOutputStream("Recibo_KFC_" + refs + ".pdf"));
            document.open();

            com.itextpdf.text.Font titleFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA,
                    18, com.itextpdf.text.Font.BOLD, BaseColor.BLACK);

            Paragraph title = new Paragraph("KFC", titleFont);
            title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(title);

            com.itextpdf.text.Font normalFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA,
                    12, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);

            Paragraph address = new Paragraph("Sogamoso - Boyaca\nCarrera 11 # 13-81\n", normalFont);
            title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(address);

            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100);
            table.addCell("Item");
            table.addCell("Qty");
            table.addCell("Precio");
            DefaultTableModel df = (DefaultTableModel) tblDetalle.getModel();

            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                table.addCell(df.getValueAt(i, 1).toString());
                table.addCell(df.getValueAt(i, 2).toString());
                table.addCell(df.getValueAt(i, 3).toString());
            }
            document.add(table);
            document.add(new Paragraph("\n"));

            Paragraph gracias = new Paragraph("¡Gracias por su compra!", normalFont);
            title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(gracias);

            String qrContent = "KFC Recibo #" + refs + "\nTotal: " + txtTotal.getText();
            com.itextpdf.text.Image qrImage = generarQRCode(qrContent, 250, 250);
            qrImage.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(qrImage);

            document.close();
            JOptionPane.showMessageDialog(null, "PDF creado exitosamente");

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_btnFacturarActionPerformed

    private com.itextpdf.text.Image generarQRCode(String content, int width, int heigth) throws BadElementException, DocumentException {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, width, HEIGHT);
            ByteArrayOutputStream pngOutPutStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", pngOutPutStream);
            byte[] pngData = pngOutPutStream.toByteArray();
            return com.itextpdf.text.Image.getInstance(pngData);
        } catch (WriterException | IOException e) {
            throw new DocumentException("Error generado QR", e);
        }
    }

    private void createCustomTabbedPane() {
        JPanel tabPanel = new JPanel(new BorderLayout());
        tabPanel.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("DefaultTab", new JPanel());

        for (int i = 1; i < 7; i++) {
            addNewTab();

        }

        addAddButton();

        tabPanel.add(tabbedPane, BorderLayout.CENTER);
        this.add(tabPanel, BorderLayout.CENTER);
    }

    private void addNewTab() {
        String tabTitle = "Tab " + (++tabNo) + "  ";
        tabbedPane.insertTab(tabTitle, null, new JPanel(), null, tabbedPane.getTabCount() - 1);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 2, new CloseableTabComponent(tabbedPane, tabTitle));
    }

    private void addAddButton() {
        tabbedPane.addTab("+", new JPanel());
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 1, new AddTabComponent(tabbedPane));
        tabbedPane.setEnabledAt(tabbedPane.getTabCount() - 1, false);

    }

    private static class CloseButton extends JButton {

        private static final ImageIcon CLOSER_ICON = new ImageIcon(CloseButton.class.getResource("/closer.gif"));
        private static final ImageIcon CLOSER_ROLLOVER_ICON = new ImageIcon(CloseButton.class.getResource("/closer_rollover.gif"));
        private static final ImageIcon CLOSER_PRESSED_ICON = new ImageIcon(CloseButton.class.getResource("/closer_pressed.gif"));
        private static final Dimension PREF_SIZE = new Dimension(16, 16);

        public CloseButton() {
            super("");
            setIcon(CLOSER_ICON);
            setRolloverIcon(CLOSER_ROLLOVER_ICON);
            setPressedIcon(CLOSER_PRESSED_ICON);
            setContentAreaFilled(false);
            setBorder(BorderFactory.createEmptyBorder());
            setFocusable(false);
        }

        @Override
        public Dimension getPreferredSize() {
            return PREF_SIZE;
        }
    }

    private static class CloseableTabComponent extends JPanel {

        private final JTabbedPane tabbedPane;
        private final JLabel titleLabel;
        private final Font defaultFont;
        private final Font selectedFont;
        private final Color selectedColor;

        public CloseableTabComponent(JTabbedPane aTabbedPane, String title) {
            super(new BorderLayout());
            this.tabbedPane = aTabbedPane;
            setOpaque(false);

            titleLabel = new JLabel(title);
            titleLabel.setOpaque(false);
            defaultFont = titleLabel.getFont().deriveFont(~Font.BOLD);
            selectedFont = titleLabel.getFont().deriveFont(Font.BOLD);
            selectedColor = UIManager.getColor("TabbedPane.selectedForeground");
            JButton closeButton = new CloseButton();
            add(titleLabel, BorderLayout.CENTER);
            add(closeButton, BorderLayout.EAST);

            closeButton.addActionListener(e -> {
                int tabIndex = getTabIndex();
                if (tabIndex >= 0) {
                    tabbedPane.removeTabAt(tabIndex);
                }
                if ((tabbedPane.getTabCount() > 1) && (tabbedPane.getSelectedIndex() == tabbedPane.getTabCount() - 1)) {
                    tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 2);
                }
            });
        }

        private int getTabIndex() {
            for (int i = 0; i < tabbedPane.getTabCount(); i++) {
                if (this.equals(tabbedPane.getTabComponentAt(i))) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int tabIndex = getTabIndex();
            if (tabIndex >= 0) {
                if (tabIndex == tabbedPane.getSelectedIndex()) {
                    titleLabel.setFont(selectedFont);
                    titleLabel.setForeground(selectedColor);
                } else {
                    titleLabel.setFont(defaultFont);
                    titleLabel.setForeground(tabbedPane.getForegroundAt(tabIndex));
                }
            }
        }
    }

    private class AddTabComponent extends JPanel {

        public AddTabComponent(JTabbedPane tabPane) {
            super(new BorderLayout());
            setOpaque(false);
            JButton addButton = new AddButton();

            addButton.addActionListener(e -> {
                if (tabPane.getTabCount() < MAX_TABS) {
                    addNewTab();
                    SwingUtilities.invokeLater(() -> {
                        if (tabPane.getTabCount() > 1) {
                            tabPane.setSelectedIndex(tabPane.getTabCount() - 2);
                        }
                    });
                }
            });
            add(addButton, BorderLayout.EAST);
        }
    }

    private static class AddButton extends JButton {

        private static final Dimension PREF_SIZE = new Dimension(16, 15);

        public AddButton() {
            super("+");
            setFont(new Font("Dialog", Font.BOLD, 14));
            setForeground(Color.blue);
            setContentAreaFilled(false);
            setBorder(BorderFactory.createEmptyBorder());
            setFocusable(false);
        }

        @Override
        public Dimension getPreferredSize() {
            return PREF_SIZE;
        }
    }

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(FormularioPOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JButton bnSundaeArequipe;
    private javax.swing.JButton bntPopCorn;
    private javax.swing.JButton btn12Arepas;
    private javax.swing.JButton btn20AlitasPicantes;
    private javax.swing.JButton btn2Presas;
    private javax.swing.JButton btn3AvalanchasOreo;
    private javax.swing.JButton btn3Presas;
    private javax.swing.JButton btn3PresasBebidas;
    private javax.swing.JButton btn6AlitasPicantes;
    private javax.swing.JButton btn9AlitasPicantes;
    private javax.swing.JButton btnAdicion10Nuggets;
    private javax.swing.JButton btnAdicion10NuggetsIndividual;
    private javax.swing.JButton btnAdicion5Nuggets;
    private javax.swing.JButton btnAdicion5NuggetsIndividual;
    private javax.swing.JButton btnAlitasPicantes;
    private javax.swing.JButton btnAvalanchaOreo;
    private javax.swing.JButton btnAvalanchaOreoPromo;
    private javax.swing.JButton btnBbqCrunch;
    private javax.swing.JButton btnBigBoxKCoronel;
    private javax.swing.JButton btnBigBoxKSandwichNuggets;
    private javax.swing.JButton btnBigBoxPopHelado;
    private javax.swing.JButton btnBucketTradicional;
    private javax.swing.JButton btnCasero;
    private javax.swing.JButton btnCombo5Nuggets;
    private javax.swing.JButton btnComboBbqCrunch;
    private javax.swing.JButton btnComboKCoronelSandwich;
    private javax.swing.JButton btnComboKSandwich;
    private javax.swing.JButton btnComboNuggets;
    private javax.swing.JButton btnComboSandwichCrispyBbq;
    private javax.swing.JButton btnEliminarIteam;
    private javax.swing.JButton btnEnsaladaColslawGrande;
    private javax.swing.JButton btnEnsaladaColslawPersonal;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnFamiliarKFCArepas;
    private javax.swing.JButton btnGaseosa15Lts;
    private javax.swing.JButton btnGaseosaPet400ML;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnKentuckyCoronelSandich;
    private javax.swing.JButton btnKentuckySandwich;
    private javax.swing.JButton btnMedioKFC;
    private javax.swing.JButton btnMega3;
    private javax.swing.JButton btnMegaFamiliar;
    private javax.swing.JButton btnMegaFamiliarArepas;
    private javax.swing.JButton btnMegaFamiliarXL;
    private javax.swing.JButton btnMegaVariedadXL;
    private javax.swing.JButton btnMrTea;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuggets;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPapaGrande;
    private javax.swing.JButton btnPapaPequeña;
    private javax.swing.JButton btnParteComparteAlas;
    private javax.swing.JButton btnParteComparteMixto;
    private javax.swing.JButton btnParteComparteNuggets;
    private javax.swing.JButton btnParteCompartePresas;
    private javax.swing.JButton btnParteYComparte;
    private javax.swing.JButton btnPopCornMediano;
    private javax.swing.JButton btnPopCornPequeño;
    private javax.swing.JButton btnPopcornGrande;
    private javax.swing.JButton btnSandwichCrispyBbq;
    private javax.swing.JButton btnSundaeDeChocolate;
    private javax.swing.JButton btnTrioSupremo;
    private javax.swing.JButton btnWowDuoDeluxe;
    private javax.swing.JButton btnWowDuoDeluxeNuggets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblq1;
    private javax.swing.JLabel lblq10;
    private javax.swing.JLabel lblq11;
    private javax.swing.JLabel lblq12;
    private javax.swing.JLabel lblq13;
    private javax.swing.JLabel lblq14;
    private javax.swing.JLabel lblq15;
    private javax.swing.JLabel lblq16;
    private javax.swing.JLabel lblq17;
    private javax.swing.JLabel lblq18;
    private javax.swing.JLabel lblq19;
    private javax.swing.JLabel lblq2;
    private javax.swing.JLabel lblq20;
    private javax.swing.JLabel lblq21;
    private javax.swing.JLabel lblq22;
    private javax.swing.JLabel lblq23;
    private javax.swing.JLabel lblq24;
    private javax.swing.JLabel lblq25;
    private javax.swing.JLabel lblq26;
    private javax.swing.JLabel lblq27;
    private javax.swing.JLabel lblq28;
    private javax.swing.JLabel lblq29;
    private javax.swing.JLabel lblq3;
    private javax.swing.JLabel lblq30;
    private javax.swing.JLabel lblq31;
    private javax.swing.JLabel lblq32;
    private javax.swing.JLabel lblq33;
    private javax.swing.JLabel lblq34;
    private javax.swing.JLabel lblq35;
    private javax.swing.JLabel lblq36;
    private javax.swing.JLabel lblq37;
    private javax.swing.JLabel lblq38;
    private javax.swing.JLabel lblq39;
    private javax.swing.JLabel lblq4;
    private javax.swing.JLabel lblq40;
    private javax.swing.JLabel lblq41;
    private javax.swing.JLabel lblq42;
    private javax.swing.JLabel lblq43;
    private javax.swing.JLabel lblq44;
    private javax.swing.JLabel lblq45;
    private javax.swing.JLabel lblq46;
    private javax.swing.JLabel lblq47;
    private javax.swing.JLabel lblq48;
    private javax.swing.JLabel lblq49;
    private javax.swing.JLabel lblq5;
    private javax.swing.JLabel lblq50;
    private javax.swing.JLabel lblq51;
    private javax.swing.JLabel lblq52;
    private javax.swing.JLabel lblq53;
    private javax.swing.JLabel lblq54;
    private javax.swing.JLabel lblq55;
    private javax.swing.JLabel lblq56;
    private javax.swing.JLabel lblq57;
    private javax.swing.JLabel lblq58;
    private javax.swing.JLabel lblq59;
    private javax.swing.JLabel lblq6;
    private javax.swing.JLabel lblq7;
    private javax.swing.JLabel lblq8;
    private javax.swing.JLabel lblq9;
    private javax.swing.JPanel pnl2Personas;
    private javax.swing.JPanel pnlBoxes;
    private javax.swing.JPanel pnlBuckets;
    private javax.swing.JPanel pnlCombos;
    private javax.swing.JPanel pnlIndividual;
    private javax.swing.JPanel pnlNuggets;
    private javax.swing.JPanel pnlPostres;
    private javax.swing.JTabbedPane pnlPrincipal;
    private javax.swing.JPanel pnlSandwich;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlbebidas;
    private javax.swing.JRadioButton rbtnBottom;
    private javax.swing.JRadioButton rbtnLeft;
    private javax.swing.JRadioButton rbtnRigth;
    private javax.swing.JRadioButton rbtnTop;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextArea txtFactura;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
