/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import Entidades.LlamadaEntidad;
import java.util.Date;
import Entidades.PersonaEntidad;
import Entidades.TelefonoEntidad;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author Juan Andres
 */
public class Jform extends javax.swing.JFrame {

    Date fecha= new Date();
    Date fecha1= new Date();
    Date Fechaaux=new Date();
    long a=0,b=0;
    /**
     * Creates new form Jform
     */
    public Jform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldAnadirPersonaEmail = new javax.swing.JTextField();
        TextFieldAnadirPersonaTelefono = new javax.swing.JTextField();
        AnadirPersonaButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldAnadirTelefonoTelefono = new javax.swing.JTextField();
        AnadirTelefonoButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePersonaYNumeros = new javax.swing.JTable();
        MostrarPersonaYNumerosButton = new javax.swing.JButton();
        jComboBoxCelular = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAñadirTelefonoIdPersona = new javax.swing.JTextField();
        jComboBoxCelular1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFieldIdDelEmisor = new javax.swing.JTextField();
        TextFieldNumeroDelReceptor = new javax.swing.JTextField();
        ComboBoxTipoDeLlamada = new javax.swing.JComboBox<>();
        LlamarButton = new javax.swing.JButton();
        ColgarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLlamadas = new javax.swing.JTable();
        MostrarLlamadasButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MostrarGastosButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanelCostoTotal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelTiposGrafica = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        jLabel2.setText("Telefono");

        AnadirPersonaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/checked.png"))); // NOI18N
        AnadirPersonaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirPersonaButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Id de persona");

        jLabel4.setText("Telefono");

        AnadirTelefonoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/checked.png"))); // NOI18N
        AnadirTelefonoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirTelefonoButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Añadir Telefono");

        jLabel6.setText("Añadir Persona");

        TablePersonaYNumeros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablePersonaYNumeros);

        MostrarPersonaYNumerosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/show-menu-button.png"))); // NOI18N
        MostrarPersonaYNumerosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPersonaYNumerosButtonActionPerformed(evt);
            }
        });

        jComboBoxCelular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        jComboBoxCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCelularActionPerformed(evt);
            }
        });

        jLabel12.setText("Es Celular");

        jComboBoxCelular1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        jComboBoxCelular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCelular1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Es Celular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldAnadirPersonaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(AnadirPersonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAnadirPersonaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnadirTelefonoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldAñadirTelefonoIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(jComboBoxCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)))
                                .addContainerGap(20, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextFieldAnadirTelefonoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(MostrarPersonaYNumerosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldAnadirPersonaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAnadirPersonaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAnadirTelefonoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAñadirTelefonoIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnadirTelefonoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnadirPersonaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarPersonaYNumerosButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mostrar Personas y Numeros", jPanel1);

        jLabel7.setText("ID. del Emisor");

        jLabel8.setText("ID. del Receptor");

        jLabel9.setText("Tipo de Llamada");

        TextFieldIdDelEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdDelEmisorActionPerformed(evt);
            }
        });

        TextFieldNumeroDelReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNumeroDelReceptorActionPerformed(evt);
            }
        });

        ComboBoxTipoDeLlamada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Internacional", "Celular" }));

        LlamarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/phone-receiver.png"))); // NOI18N
        LlamarButton.setText("Llamar");
        LlamarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlamarButtonActionPerformed(evt);
            }
        });

        ColgarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/phone-receiver.png"))); // NOI18N
        ColgarButton.setText("Colgar");
        ColgarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColgarButtonActionPerformed(evt);
            }
        });

        jTableLlamadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableLlamadas);

        MostrarLlamadasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/show-menu-button.png"))); // NOI18N
        MostrarLlamadasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarLlamadasButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("CostoxMinuto=2 Bs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MostrarLlamadasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(LlamarButton)
                        .addGap(104, 104, 104)
                        .addComponent(ColgarButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldIdDelEmisor))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(TextFieldNumeroDelReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxTipoDeLlamada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldIdDelEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNumeroDelReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxTipoDeLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LlamarButton)
                    .addComponent(ColgarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarLlamadasButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Llamadas", jPanel2);

        MostrarGastosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/bars.png"))); // NOI18N
        MostrarGastosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarGastosButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Gastos Efectuados Por los Usuarios");

        javax.swing.GroupLayout jPanelCostoTotalLayout = new javax.swing.GroupLayout(jPanelCostoTotal);
        jPanelCostoTotal.setLayout(jPanelCostoTotalLayout);
        jPanelCostoTotalLayout.setHorizontalGroup(
            jPanelCostoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelCostoTotalLayout.setVerticalGroup(
            jPanelCostoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(164, 164, 164))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(MostrarGastosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(MostrarGastosButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gastos", jPanel3);

        javax.swing.GroupLayout jPanelTiposGraficaLayout = new javax.swing.GroupLayout(jPanelTiposGrafica);
        jPanelTiposGrafica.setLayout(jPanelTiposGraficaLayout);
        jPanelTiposGraficaLayout.setHorizontalGroup(
            jPanelTiposGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTiposGraficaLayout.setVerticalGroup(
            jPanelTiposGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsPackage/bars.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTiposGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton1)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTiposGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipos Grafica", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void TextFieldNumeroDelReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNumeroDelReceptorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNumeroDelReceptorActionPerformed

    private void TextFieldIdDelEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdDelEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdDelEmisorActionPerformed

    private void AnadirPersonaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirPersonaButtonActionPerformed
        Modelo m = new Modelo();
        m.insertarPersona(TextFieldAnadirPersonaEmail.getText(),TextFieldAnadirPersonaTelefono.getText(),jComboBoxCelular.getSelectedItem().toString());
    }//GEN-LAST:event_AnadirPersonaButtonActionPerformed

    private void LlamarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlamarButtonActionPerformed
        //LlamadaEntidad m = new LlamadaEntidad(HIDE_ON_CLOSE, HIDE_ON_CLOSE, inicioLlamada, finLlamada, tipoLlamada, Double.MIN_NORMAL);
        this.a=this.fecha.getTime();
        this.Fechaaux=this.fecha1;
    }//GEN-LAST:event_LlamarButtonActionPerformed

    private void ColgarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColgarButtonActionPerformed
        Date k = new Date();
        b=k.getTime();
        long c=(b-this.a)/1000;
        Double r = ((double)c)*2;
        LlamadaEntidad m = new LlamadaEntidad(Integer.parseInt(TextFieldIdDelEmisor.getText()), Integer.parseInt(TextFieldNumeroDelReceptor.getText()), fecha, k, ComboBoxTipoDeLlamada.getSelectedItem().toString(),r);
        Modelo mm = new Modelo();
        mm.insertarLlamada(m);
        
    }//GEN-LAST:event_ColgarButtonActionPerformed

    private void jComboBoxCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCelularActionPerformed

    private void MostrarGastosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGastosButtonActionPerformed
        JavaJFreeChartBarChart3D MyChart = new JavaJFreeChartBarChart3D("CostoDeTelefonos",true);
        CategoryDataset dataset = MyChart.createDataset();
        JFreeChart chart = MyChart.createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        jPanelCostoTotal.setLayout(new java.awt.BorderLayout());
        jPanelCostoTotal.add(chartPanel);
        jPanelCostoTotal.validate();
    }//GEN-LAST:event_MostrarGastosButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JavaJFreeChartBarChart3D MyChart2 = new JavaJFreeChartBarChart3D("TiposGanancia",false);
        CategoryDataset dataset2 = MyChart2.createDataset2();
        JFreeChart chart2 = MyChart2.createChart(dataset2);
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        jPanelTiposGrafica.setLayout(new java.awt.BorderLayout());
        jPanelTiposGrafica.add(chartPanel2);
        jPanelTiposGrafica.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MostrarPersonaYNumerosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPersonaYNumerosButtonActionPerformed
    Modelo modelo =new Modelo();
    TablePersonaYNumeros.setModel(modelo.selectPersonasYNumeros());
    }//GEN-LAST:event_MostrarPersonaYNumerosButtonActionPerformed

    private void AnadirTelefonoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirTelefonoButtonActionPerformed
        Modelo m = new Modelo();
        TelefonoEntidad t=new TelefonoEntidad(Integer.parseInt(jTextFieldAñadirTelefonoIdPersona.getText()),Integer.parseInt(TextFieldAnadirTelefonoTelefono.getText()) ,jComboBoxCelular1.getSelectedItem().toString());
        m.insertarTelefono(t);    
    }//GEN-LAST:event_AnadirTelefonoButtonActionPerformed

    private void jComboBoxCelular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCelular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCelular1ActionPerformed

    private void MostrarLlamadasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarLlamadasButtonActionPerformed
    Modelo modelo =new Modelo();
    jTableLlamadas.setModel(modelo.selectLlamadas());
    }//GEN-LAST:event_MostrarLlamadasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Jform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadirPersonaButton;
    private javax.swing.JButton AnadirTelefonoButton;
    private javax.swing.JButton ColgarButton;
    private javax.swing.JComboBox<String> ComboBoxTipoDeLlamada;
    private javax.swing.JButton LlamarButton;
    private javax.swing.JButton MostrarGastosButton;
    private javax.swing.JButton MostrarLlamadasButton;
    private javax.swing.JButton MostrarPersonaYNumerosButton;
    private javax.swing.JTable TablePersonaYNumeros;
    private javax.swing.JTextField TextFieldAnadirPersonaEmail;
    private javax.swing.JTextField TextFieldAnadirPersonaTelefono;
    private javax.swing.JTextField TextFieldAnadirTelefonoTelefono;
    private javax.swing.JTextField TextFieldIdDelEmisor;
    private javax.swing.JTextField TextFieldNumeroDelReceptor;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCelular;
    private javax.swing.JComboBox<String> jComboBoxCelular1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanelCostoTotal;
    private javax.swing.JPanel jPanelTiposGrafica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableLlamadas;
    private javax.swing.JTextField jTextFieldAñadirTelefonoIdPersona;
    // End of variables declaration//GEN-END:variables
}
