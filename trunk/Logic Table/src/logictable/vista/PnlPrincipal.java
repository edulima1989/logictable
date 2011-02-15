/*
 * PnlPrincipal
 *
 * Ana Campoverde
 * Eduardo Lima
 * German Salas
 * Yanela Ríos
 * Carlos Vivanco
 *
 * Created on 15/07/2009, 11:16:29 PM
 *
 * Copyleft
 */
package logictable.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import logictable.modelo.AFD;
import logictable.modelo.AnalizadorLexico;
import logictable.modelo.AnalizadorSemantico;
import logictable.modelo.AnalizadorSintactico;
import logictable.modelo.ArchivosLtt;
import logictable.modelo.Lexico;
import logictable.modelo.TablaVerdad;

/**
 *
 * @author EDÚ
 */

/*
 * Componentes para solucion de una expresion
 */
public class PnlPrincipal extends javax.swing.JPanel {

    /** Creates new form PnlPrincipal */
    public PnlPrincipal(JTabbedPane contenedor) {
        initComponents();
        this.contenedor = contenedor;
        tablaVerdad.getSelectedRowCount();
    }

    public PnlPrincipal(JTabbedPane contenedor, String archivo, String nombre, int tipo) {
        initComponents();
        this.contenedor = contenedor;
        txtEntrada.setText(archivo);
        this.setName(nombre);
        lblNombre.setText(nombre);
        proposicion = archivo;
        this.nombre = nombre;
        this.analizarTokens();
        if (tipo == 1) {
            sintaxis();
        }
    }

    public void setTitulos(String nombre) {
        lblNombre.setText(nombre);
        this.setName(nombre);
        this.nombre = nombre;
        proposicion = txtEntrada.getText();
        this.setVisible(true);

    }

    public String getTexto() {
        return txtEntrada.getText();
    }
    private JTabbedPane contenedor;

    public JTextPane getTextPane() {
        return txtEntrada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextPane();
        btnResolver = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblErrorTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblVariables = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerdad = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Ingrese la expresión:");

        txtEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtEntrada);

        btnResolver.setBackground(new java.awt.Color(0, 102, 102));
        btnResolver.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnResolver.setForeground(new java.awt.Color(0, 51, 51));
        btnResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/winampA_vIcOls - copia.png"))); // NOI18N
        btnResolver.setText("Resolver");
        btnResolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResolver)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("x");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblErrorTitulo.setBackground(new java.awt.Color(0, 51, 51));
        lblErrorTitulo.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        lblErrorTitulo.setForeground(new java.awt.Color(0, 51, 51));
        lblErrorTitulo.setText("Error:");

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Variables:");

        lblError.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Nombre:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(lblVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblErrorTitulo)
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/logos/pequeno.gif"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("    Equivalencias:\n_________________________\nOperación     | Operador\n______________|__________\nIntrersección |    *\nUnión         |    +\nCondicional   |    =>\nBicondicional |    <=>\nNegación      |    -\n_________________________\nVariabales:p, q, r");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(jTextArea1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Análisis Léxico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Token", "Lexico"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de Verdad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        tablaVerdad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaVerdad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Variable1", "Variable2", "Expresion"
            }
        ));
        tablaVerdad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaVerdad);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/logos/nom1.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))
                            .addGap(18, 144, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cerrar() {
        if (!txtEntrada.getText().equals(proposicion)) {
            int n = JOptionPane.showConfirmDialog(this, "¿Desea Guardar los cambios efectuados en " + nombre + "?", "Logic Table", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (n) {
                case 0:
                    try {
                        ArchivosLtt.guardar(txtEntrada.getText());

                    } catch (IOException ex) {
                        Logger.getLogger(PnlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    contenedor.remove(this);
                    contenedor.setVisible(true);
                    break;
                case 1:
                    contenedor.remove(this);
                    contenedor.setVisible(true);
                    break;
                case 2:
                    break;
                default:
            }
        } else {
            int n = JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar " + nombre + "?", "Logic Table", JOptionPane.YES_NO_OPTION);
            switch (n) {
                case 0:
                    contenedor.remove(this);
                    contenedor.setVisible(true);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                default:
            }
        }
    }

    private void txtEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyReleased
        analizarTokens();
    }//GEN-LAST:event_txtEntradaKeyReleased

    private void analizarTokens() {
        analizadorLexico.crearTokens(txtEntrada.getText());
        List<Lexico> lista = analizadorLexico.getLexicos();
        Object datos[][] = new Object[lista.size()][2];

        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("ERROR");
        nombre.add("Op. Union");
        nombre.add("Op. Negación");
        nombre.add("Op. Intersección");
        nombre.add("Op. Bicondicional");
        nombre.add("Op. Condicional");
        nombre.add("Parent. Abrir");
        nombre.add("Parent. Cerrar");
        nombre.add("Var. (p)");
        nombre.add("Var. (q)");
        nombre.add("Var. (r)");

        for (int i = 0; i < datos.length; i++) {
            datos[i][0] = (lista.get(i).getToken());
            switch (lista.get(i).getToken()) {
                case -1:
                    datos[i][0] = "ERROR";
                    break;
                case 4:
                    datos[i][0] = "Op. Unión";
                    break;
                case 5:
                    datos[i][0] = "Op. Negación";
                    break;
                case 6:
                    datos[i][0] = "Op. Interseccion";
                    break;
                case 7:
                    datos[i][0] = "Op.Bicondicional";
                    break;
                case 8:
                    datos[i][0] = "Op. Condicional";
                    break;
                case 9:
                    datos[i][0] = "Parent. Abrir";
                    break;
                case 10:
                    datos[i][0] = "Parent. Cerrar";
                    break;
                case 11:
                    datos[i][0] = "Var. p";
                    break;
                case 12:
                    datos[i][0] = "Var. q";
                    break;
                case 13:
                    datos[i][0] = "Var. r";
                    break;

            }

            datos[i][1] = lista.get(i).getLexema();
        }


        tabla.setModel(new DefaultTableModel(
                datos,
                new String[]{
                    "Tokens", "Lexema"
                }));
        int c = 0;
        boolean bandera = false;
        boolean var_P = false;
        boolean var_Q = false;
        boolean var_R = false;
        for (Lexico le : lista) {
            if (le.getToken() == AFD.VARIABLE_A) {
                var_P = true;
            } else if (le.getToken() == AFD.VARIABLE_B) {
                var_Q = true;
            } else if (le.getToken() == AFD.VARIABLE_C) {
                var_R = true;
            }

            if (le.getToken() == AFD.EOF) {
                bandera = true;
            }
        }
        if (var_P && var_Q && var_R) {
            c = 3;
        } else if ((var_P && var_Q) || (var_P && var_R) || var_Q && var_R) {
            c = 2;
        } else if (var_P || var_Q || var_R) {
            c = 1;
        }


        lblVariables.setText("" + c);

        if (bandera) {
            lblError.setBorder(new LineBorder(Color.RED, 10, true));
            lblErrorTitulo.setText("Error:");
        } else {
            if (AnalizadorSintactico.comprobarSintaxis(lista)) {
                lblError.setBorder(new LineBorder(Color.GREEN, 10, true));
                lblErrorTitulo.setText("Correcto:");
            } else {
                lblError.setBorder(new LineBorder(Color.RED, 10, true));
                lblErrorTitulo.setText("Error:");
            }

        }
    }

    private void sintaxis() {
        analizadorLexico.crearTokens(txtEntrada.getText());
        List<Lexico> lista = analizadorLexico.getLexicos();
        boolean errorLexico = false;
        for (Lexico lex : lista) {
            if (lex.getToken() == AFD.EOF) {
                errorLexico = true;
            }
        }

        if (errorLexico) {
            JOptionPane.showMessageDialog(this, "No se puede resolver porque\n " + "existe un error Lexico", "Logic Table: ERROR LEXICO", JOptionPane.ERROR_MESSAGE);
            tablaVerdad.setModel(new DefaultTableModel(
                    new String[1][1],
                    new String[]{"?", "?", "?"}));

        } else {
            if (AnalizadorSintactico.comprobarSintaxis(lista)) {
                AnalizadorSemantico analSeman = new AnalizadorSemantico(lista);
                TablaVerdad tablaVerdad1 = analSeman.valoresTabla();
                tablaVerdad.setModel(new DefaultTableModel(
                        tablaVerdad1.getTablaValor(),
                        tablaVerdad1.getVariables()));
            } else {
                JOptionPane.showMessageDialog(this, "No se puede resolver porque\n " + "existe un error de sintaxis", "Logic Table: ERROR DE SINTAXIS", JOptionPane.ERROR_MESSAGE);
                tablaVerdad.setModel(new DefaultTableModel(
                        new String[1][1],
                        new String[]{"?", "?", "?"}));
            }
        }
    }

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed

        sintaxis();
    }//GEN-LAST:event_btnResolverActionPerformed

    private void txtEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEntradaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorTitulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVariables;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaVerdad;
    private javax.swing.JTextPane txtEntrada;
    // End of variables declaration//GEN-END:variables
    private AnalizadorLexico analizadorLexico = new AnalizadorLexico();
    private String proposicion;
    private String nombre;
}
