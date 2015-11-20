package presentacion;

import Utilitarios.Pila;
import Utilitarios.UtilitarioVentana;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class jPanManAsegurados extends JPanel {
    private JButton jBotRegistrar = new JButton();
    private JButton jBotActualizar = new JButton();
    private JButton jBotAct_Inactivar = new JButton();
    private JButton jBotSalir = new JButton();
    private JToolBar jtobBarraBotones = new JToolBar();

    public jPanManAsegurados() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setSize(new Dimension(400, 261));
        jtobBarraBotones.setBounds(new Rectangle(0, 5, 530, 60));
        jtobBarraBotones.setMaximumSize(new Dimension(550, 61));
        jtobBarraBotones.setMinimumSize(new Dimension(60, 61));
        jtobBarraBotones.setFloatable(false);
        jtobBarraBotones.setSize(new Dimension(550, 60));
        jtobBarraBotones.setPreferredSize(new Dimension(400, 61));
        jBotRegistrar.setText("Registrar");
        jBotRegistrar.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotRegistrar.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotRegistrar.setMaximumSize(new Dimension(70, 60));
        jBotRegistrar.setMinimumSize(new Dimension(70, 60));
        jBotRegistrar.setPreferredSize(new Dimension(70, 60));
        jBotRegistrar.setSize(new Dimension(70, 60));
        jBotRegistrar.setToolTipText("Agregar un  nuevo registro...");
        jBotRegistrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotRegistrar_actionPerformed(e);
                }
            });
        jBotActualizar.setText("Actualizar");
        jBotActualizar.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotActualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotActualizar.setMaximumSize(new Dimension(70, 60));
        jBotActualizar.setMinimumSize(new Dimension(70, 60));
        jBotActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBotActualizar_actionPerformed(e);
            }
        });
        jBotAct_Inactivar.setText("Activar/Inactivar");
        jBotAct_Inactivar.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotAct_Inactivar.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotAct_Inactivar.setMaximumSize(new Dimension(100, 60));
        jBotAct_Inactivar.setMinimumSize(new Dimension(100, 60));
        jBotAct_Inactivar.setPreferredSize(new Dimension(100, 60));
        jBotAct_Inactivar.setSize(new Dimension(100, 60));
        jBotAct_Inactivar.setToolTipText("Salir del mantenimiento");
        jBotAct_Inactivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBotAct_Inactivar_actionPerformed(e);
            }
        });
        jBotSalir.setText("Salir");
        jBotSalir.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotSalir.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotSalir.setMaximumSize(new Dimension(70, 60));
        jBotSalir.setMinimumSize(new Dimension(70, 60));
        jBotSalir.setPreferredSize(new Dimension(70, 60));
        jBotSalir.setSize(new Dimension(70, 60));
        jBotSalir.setToolTipText("Salir del mantenimiento");
        jBotSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBotSalir_actionPerformed(e);
            }
        });
        jtobBarraBotones.add(jBotRegistrar, null);
        jtobBarraBotones.add(jBotActualizar, null);
        jtobBarraBotones.add(jBotAct_Inactivar, null);
        jtobBarraBotones.add(jBotSalir, null);
        this.add(jtobBarraBotones, null);
    }

    private void jBotSalir_actionPerformed(ActionEvent e) {
        UtilitarioVentana.getInstance().cerrarPanel(this);
    }

    private void jBotActualizar_actionPerformed(ActionEvent e) {
        
    }

    private void jBotAct_Inactivar_actionPerformed(ActionEvent e) {
    }

    private void jBotRegistrar_actionPerformed(ActionEvent e) {
        Pila.agregarElemento("R");
        jDlgMantAsegurados ojDlgMantAsegurados = new jDlgMantAsegurados();
        UtilitarioVentana.getInstance().centrarVentana(ojDlgMantAsegurados);
    }
}
