/*
 * VtnPrincipal
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

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import logictable.modelo.ArchivosLtt;
import logictable.ayuda.Ayuda;

/**
 *
 * @author EDÚ
 */
public class VtnPrincipal extends javax.swing.JFrame {

    /** Creates new form VtnPrincipal */
    public VtnPrincipal() {
        pielmac();
        initComponents();
        ImageIcon im=new ImageIcon(getClass().getResource("/logictable/logos/Captura.png"));
        Image imag=im.getImage();
        this.setIconImage(imag);

        this.setVisible(true);
    }

    public void pielmac() {
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            SwingUtilities.updateComponentTreeUI(VtnPrincipal.this);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void trans() throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel("com.nilo.plaf.nimrod.NimRODLookAndFeel");
            NimRODTheme nt = new NimRODTheme();
            nt.setPrimary1(Color.GREEN);
            nt.setPrimary2(Color.GREEN);
            nt.setPrimary3(Color.GREEN);
            nt.setOpacity(0);
            nt.setFrameOpacity(0);
            NimRODLookAndFeel NimRODLF = new NimRODLookAndFeel();
            NimRODLookAndFeel.setCurrentTheme(nt);
            UIManager.setLookAndFeel(NimRODLF);
            SwingUtilities.updateComponentTreeUI(VtnPrincipal.this);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabla = new javax.swing.JTabbedPane();
        pnlImagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarraHerram = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnVistaPrevia = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miImprimir = new javax.swing.JMenuItem();
        miCerrar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        pnlTabla.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnlTablaComponentRemoved(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIC TABLE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Castellar", 3, 12)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/logos/LOGO.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout pnlImagenLayout = new javax.swing.GroupLayout(pnlImagen);
        pnlImagen.setLayout(pnlImagenLayout);
        pnlImagenLayout.setHorizontalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagenLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlImagenLayout.setVerticalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagenLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(pnlImagen, java.awt.BorderLayout.CENTER);

        pnlBarraHerram.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/document_32.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo ");
        btnNuevo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnNuevo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNuevo.setMaximumSize(new java.awt.Dimension(35, 37));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/save_32.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.MatteBorder(null));
        btnGuardar.setEnabled(false);
        btnGuardar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnGuardar.setMaximumSize(new java.awt.Dimension(35, 37));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/folder_32.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAbrir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAbrir.setMaximumSize(new java.awt.Dimension(35, 37));
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/print_32.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnImprimir.setEnabled(false);
        btnImprimir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnImprimir.setMaximumSize(new java.awt.Dimension(35, 37));

        btnVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/search_32.png"))); // NOI18N
        btnVistaPrevia.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnVistaPrevia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVistaPrevia.setMaximumSize(new java.awt.Dimension(35, 37));

        javax.swing.GroupLayout pnlBarraHerramLayout = new javax.swing.GroupLayout(pnlBarraHerram);
        pnlBarraHerram.setLayout(pnlBarraHerramLayout);
        pnlBarraHerramLayout.setHorizontalGroup(
            pnlBarraHerramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraHerramLayout.createSequentialGroup()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        pnlBarraHerramLayout.setVerticalGroup(
            pnlBarraHerramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(btnVistaPrevia, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBarraHerram, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 0, 153));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/document_16.png"))); // NOI18N
        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        miAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/folder_16.png"))); // NOI18N
        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        miGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/save_16.png"))); // NOI18N
        miGuardar.setText("Guardar");
        miGuardar.setEnabled(false);
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(miGuardar);

        miImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        miImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/print_16.png"))); // NOI18N
        miImprimir.setText("Imprimir");
        miImprimir.setEnabled(false);
        miImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(miImprimir);

        miCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/delete_16.png"))); // NOI18N
        miCerrar.setText("Cerrar Documento");
        miCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(miCerrar);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/power_off.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(0, 0, 153));
        jMenu2.setText("Editar");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/cut.png"))); // NOI18N
        jMenuItem7.setText("Cortar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/copy.png"))); // NOI18N
        jMenuItem8.setText("Copiar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logictable/vista/Iconos/paste.png"))); // NOI18N
        jMenuItem9.setText("Pegar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Contenido");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setForeground(new java.awt.Color(0, 0, 153));
        jMenu5.setText("Apariencia");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mac");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setText("Trans");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu5);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setForeground(new java.awt.Color(0, 0, 153));
        jMenu4.setText("Ayuda");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem10.setText("Temas de Ayuda");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem12.setText("Acerca de:");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-830)/2, (screenSize.height-676)/2, 830, 676);
    }// </editor-fold>//GEN-END:initComponents

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
            nuevo("","Nuevo",0);
    }//GEN-LAST:event_miNuevoActionPerformed

    private void nuevo(String texto, String Nombre, int tipo){
            PnlPrincipal pn=new PnlPrincipal(pnlTabla,texto, Nombre,tipo);
            pnlTabla.add(pn);
            pnlTabla.setSelectedIndex(pnlTabla.getComponentCount()-1);
            JPanel aux=new JPanel(new BorderLayout());
            aux.add(pnlTabla,"Center");
            aux.add(pnlBarraHerram,"North");
          //  paneles.add(pn);
            this.setContentPane(aux);
            this.setVisible(true);
            miGuardar.setEnabled(true);
            miImprimir.setEnabled(true);
            btnGuardar.setEnabled(true);
            btnImprimir.setEnabled(true);

    }

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        try {
            String str=ArchivosLtt.abrir(this);
            String nomb=ArchivosLtt.getNombreArchivo();
            nuevo(str, nomb,1);
        } catch (BadLocationException ex) {
            Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_miAbrirActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        String str=((PnlPrincipal)pnlTabla.getSelectedComponent()).getTexto();
        try {
            ArchivosLtt.guardar(str);
           ((PnlPrincipal)pnlTabla.getSelectedComponent()).setTitulos(ArchivosLtt.getNombreArchivo());
          
        } catch (IOException ex) {
            Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miGuardarActionPerformed

    public JTabbedPane obtenerTabbedPane(){
        return pnlTabla;
    }

    private void miImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miImprimirActionPerformed

    }//GEN-LAST:event_miImprimirActionPerformed

    private void pnlTablaComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlTablaComponentRemoved
            if(pnlTabla.getComponents().length==0){
                    JPanel aux=new JPanel(new BorderLayout());
                    aux.add(pnlImagen,"Center");
                    aux.add(pnlBarraHerram,"North");
                    this.setContentPane(aux);
                    miGuardar.setEnabled(false);
                    miImprimir.setEnabled(false);
                    btnGuardar.setEnabled(false);
                    btnImprimir.setEnabled(false);
            }
    }//GEN-LAST:event_pnlTablaComponentRemoved

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
         
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void miCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarActionPerformed
            ((PnlPrincipal)pnlTabla.getSelectedComponent()).cerrar();
    }//GEN-LAST:event_miCerrarActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
            new Ayuda();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
            miNuevoActionPerformed(evt);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            miGuardarActionPerformed(evt);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        miAbrirActionPerformed(evt);
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ((PnlPrincipal)pnlTabla.getSelectedComponent()).getTextPane().cut();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            ((PnlPrincipal)pnlTabla.getSelectedComponent()).getTextPane().copy();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            ((PnlPrincipal)pnlTabla.getSelectedComponent()).getTextPane().paste();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        Ayuda ay= new Ayuda();
       
}//GEN-LAST:event_jMenuItem10ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if(pnlTabla.getComponents().length==0){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
            int n=JOptionPane.showConfirmDialog(this, "Esta a punto de cerrar Logic Table si continua\n"
                                                + "se perderan los cambios realizados actualmente\n"
                                                + "(Se recomienda primero guardar los documentos abiertos)\n"
                                                + "¿Desea realmente cerrar Logic Table?",
                                                "Logic Table: Confirmación de cierre", JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE);
switch(n){
    case 0:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        break;
    case 1:
         this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(pnlTabla.getComponents().length==0){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }else{
            int n=JOptionPane.showConfirmDialog(this, "Esta a punto de cerrar Logic Table si continua\n"
                                                + "se perderan los cambios realizados actualmente\n"
                                                + "(Se recomienda primero guardar los documentos abiertos)\n"
                                                + "¿Desea realmente cerrar Logic Table?",
                                                "Logic Table: Confirmación de cierre", JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE);
switch(n){
    case 0:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
        break;
    case 1:
         this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        AcercaDe ad = new AcercaDe();
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        pielmac();
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem2.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        try {
            trans();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem2.setSelected(true);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVistaPrevia;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miCerrar;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miImprimir;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JPanel pnlBarraHerram;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JTabbedPane pnlTabla;
    // End of variables declaration//GEN-END:variables
//    private List<PnlPrincipal> paneles=new ArrayList<PnlPrincipal>();
    private JFileChooser fc=new JFileChooser();
}
