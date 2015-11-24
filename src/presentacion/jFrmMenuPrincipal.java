package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import Utilitarios.UtilitarioVentana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class jFrmMenuPrincipal extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JLabel jLblBarraEstado = new JLabel();
    private JPanel jPanPanelCentral = new JPanel();
    private JMenuBar jMnuMenuPrincipal = new JMenuBar();
    private JMenu jMnuPrincipal = new JMenu();
    private JMenu jMnuMantenimiento = new JMenu();
    private JMenuItem jMnuMantenimientoSeguros = new JMenuItem();
    private JMenuItem jMnuMantenimientoAsegurados = new JMenuItem();
    private JMenu jMnuAyuda = new JMenu();
    private JMenuItem jMnuAyudaAcercaDe = new JMenuItem();
    private JDesktopPane oEscritorioPane = new JDesktopPane();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();

    public jFrmMenuPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar(jMnuMenuPrincipal);
        this.getContentPane().setLayout( layoutMain );        
        jPanPanelCentral.setLayout( null );
        this.setSize(new Dimension(800, 600));
        this.setTitle( "Sistema de Seguros - Menú Principal" );
        jMnuPrincipal.setText("Menu Principal");
        jMnuMantenimiento.setText("Catálogos");
        jMnuMantenimientoSeguros.setText("Seguros");
        jMnuMantenimientoSeguros.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jMnuMantenimientoSeguros_actionPerformed(e);
                }
            });
        jMnuMantenimientoAsegurados.setText("Asegurados");
        jMnuMantenimientoAsegurados.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jMnuMantenimientoAsegurados_actionPerformed(e);
                }
            });
        jMnuAyuda.setText("Ayuda");
        jMnuAyudaAcercaDe.setText("Acerca de..");
        jMenuItem1.setText("Proceso de Venta Emision");
        jMenuItem2.setText("Consultas y Reportes");
        jMenuItem3.setText("Gestión de Usuarios");
        jLblBarraEstado.setText("Sistema de Seguros, versión 1.0");
        jMnuPrincipal.add(jMnuMantenimiento);
        jMnuPrincipal.add(jMenuItem2);
        jMnuPrincipal.add(jMenuItem3);
        jMnuPrincipal.add(jMenuItem1);
        jMnuMenuPrincipal.add(jMnuPrincipal);
        jMnuMantenimiento.add(jMnuMantenimientoAsegurados);
        jMnuMantenimiento.add(jMnuMantenimientoSeguros);
        jMnuAyuda.add(jMnuAyudaAcercaDe);
        jMnuMenuPrincipal.add(jMnuAyuda);
        this.getContentPane().add(jLblBarraEstado, BorderLayout.SOUTH);
        this.getContentPane().add(jPanPanelCentral, BorderLayout.CENTER);
        this.getContentPane().add(oEscritorioPane);
    }
    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
    private void jMnuMantenimientoSeguros_actionPerformed(ActionEvent e) {
        jFrmManSeguros ojFrmManSeguros = new jFrmManSeguros();
        UtilitarioVentana.getInstance().centrarVentana(ojFrmManSeguros);
    }

    private void jMnuMantenimientoAsegurados_actionPerformed(ActionEvent e) {
        jPanManAsegurados ojPanManAsegurados = new jPanManAsegurados();
        UtilitarioVentana.getInstance().centrarVentana(this, "Mantenimiento de Asegurados",ojPanManAsegurados,oEscritorioPane);
    }
}
