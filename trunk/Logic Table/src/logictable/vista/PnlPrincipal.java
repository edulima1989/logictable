/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PnlPrincipal.java
 *
 * Created on 15/12/2010, 09:08:26 PM
 */

package logictable.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import logictable.modelo.AnalizadorSintactico;
import logictable.modelo.ArchivosLtt;
import logictable.modelo.Lexico;

/**
 *
 * @author EDÚ
 */
public class PnlPrincipal extends javax.swing.JPanel {

    /** Creates new form PnlPrincipal */
    public PnlPrincipal(JTabbedPane contenedor) {
        initComponents();
        this.contenedor=contenedor;
        tablaVerdad.getSelectedRowCount();
    }

    public PnlPrincipal(JTabbedPane contenedor,String archivo,String nombre) {
        initComponents();
        this.contenedor=contenedor;
        txtEntrada.setText(archivo);
        this.setName(nombre);
        lblNombre.setText(nombre);
        proposicion=archivo;
        this.nombre=nombre;
        analizarTokens();
    }

    public String getTexto(){
        return txtEntrada.getText();
    }

    private JTabbedPane contenedor;

    public JTextPane getTextPane(){
        return txtEntrada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerdad = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblErrorTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblVariables = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Ingrese la expresión:");

        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtEntrada);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/logos/pequeno.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)))
        );

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
        jScrollPane1.setViewportView(tablaVerdad);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("x");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblErrorTitulo.setText("Error:");

        jLabel4.setText("Variables:");

        lblError.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));

        jLabel2.setText("Nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(lblErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblErrorTitulo)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(757, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cerrar(){
        if(!txtEntrada.getText().equals(proposicion)){
            int n=JOptionPane.showConfirmDialog(this, "¿Desea Guardar los cambios efectuados en "+nombre+"?", "Logic Table", JOptionPane.YES_NO_CANCEL_OPTION);
            switch(n){
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
        }else{
            int n=JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar "+nombre+"?", "Logic Table", JOptionPane.YES_NO_OPTION);
             switch(n){
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

    public void analizarTokens(){
        analizadorLexico.crearTokens(txtEntrada.getText());
        List<Lexico> lista =analizadorLexico.getLexicos();
        Object datos [][] = new Object[lista.size()][2];
        for (int i = 0; i < datos.length; i++) {
            datos[i][0]=lista.get(i).getToken();
            datos[i][1]=lista.get(i).getLexema();
        }
        tabla.setModel(new DefaultTableModel(
            datos,
            new String [] {
                "Tokens", "Lexema"
            }
        ));
        int c=0;
        boolean bandera=false;
        for(Lexico le:lista){
            if(le.getToken()==AFD.VARIABLE_A||le.getToken()==AFD.VARIABLE_B||
                    le.getToken()==AFD.VARIABLE_C)
                c++;
            if(le.getToken()==AFD.EOF)
                bandera=true;
          }
          lblVariables.setText(""+c);

          if(bandera){
              lblError.setBorder(new LineBorder(Color.RED,10,true));
              lblErrorTitulo.setText("Error:");
          }else{
              if(AnalizadorSintactico.comprobarSintaxis(lista)){
              lblError.setBorder(new LineBorder(Color.GREEN,10,true));
              lblErrorTitulo.setText("Correcto:");
              }else{
                lblError.setBorder(new LineBorder(Color.RED,10,true));
              lblErrorTitulo.setText("Error:");
              }

          }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            analizadorLexico.crearTokens(txtEntrada.getText());
            List<Lexico> lista =analizadorLexico.getLexicos();
            boolean errorLexico=false;
            for(Lexico lex:lista){
                if(lex.getToken()==AFD.EOF)
                        errorLexico=true;
            }

            if(errorLexico)
                JOptionPane.showMessageDialog(this, "Error lexico");
            else{
                if(AnalizadorSintactico.comprobarSintaxis(lista))
                        JOptionPane.showMessageDialog(this, "Sintaxis Correcta");
                else
                        JOptionPane.showMessageDialog(this, "Error Sintaxis");
            }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyPressed
            if(KeyEvent.VK_ENTER==evt.getKeyCode()){
                    evt.consume();
            }
    }//GEN-LAST:event_txtEntradaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorTitulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVariables;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaVerdad;
    private javax.swing.JTextPane txtEntrada;
    // End of variables declaration//GEN-END:variables
    private AnalizadorLexico analizadorLexico=new AnalizadorLexico();
    private String proposicion;
    private String nombre;
}
