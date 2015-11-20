package presentacion;

import java.awt.Dimension;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class jPanProcesoEmision extends JPanel {
    private JToolBar jtobBarraBotones = new JToolBar();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JButton jBotRegistrarSolicitud = new JButton();
    private JButton jBotEmitirPoliza = new JButton();
    private JButton jBotRevertirEmision = new JButton();

    public jPanProcesoEmision() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setSize(new Dimension(500, 261));
        jtobBarraBotones.setBounds(new Rectangle(0, 5, 530, 60));
        jScrollPane1.setBounds(new Rectangle(0, 75, 500, 185));
        jBotRegistrarSolicitud.setText("Registrar Solicitud");
        jBotRegistrarSolicitud.setSize(new Dimension(120, 60));
        jBotRegistrarSolicitud.setMaximumSize(new Dimension(120, 60));
        jBotRegistrarSolicitud.setMinimumSize(new Dimension(120, 60));
        jBotRegistrarSolicitud.setPreferredSize(new Dimension(120, 60));
        jBotRegistrarSolicitud.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotRegistrarSolicitud.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotRegistrarSolicitud.setToolTipText("Registrar Solicituda de Poliza");
        jBotEmitirPoliza.setText("Emitir Poliza");
        jBotEmitirPoliza.setSize(new Dimension(120, 60));
        jBotEmitirPoliza.setMaximumSize(new Dimension(120, 60));
        jBotEmitirPoliza.setMinimumSize(new Dimension(120, 60));
        jBotEmitirPoliza.setPreferredSize(new Dimension(120, 60));
        jBotEmitirPoliza.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotEmitirPoliza.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotEmitirPoliza.setToolTipText("Emitir Solicituda de Poliza");
        jBotRevertirEmision.setText("Revertir Emision");
        jBotRevertirEmision.setText("Emitir Poliza");
        jBotRevertirEmision.setSize(new Dimension(120, 60));
        jBotRevertirEmision.setMaximumSize(new Dimension(120, 60));
        jBotRevertirEmision.setMinimumSize(new Dimension(120, 60));
        jBotRevertirEmision.setPreferredSize(new Dimension(120, 60));
        jBotRevertirEmision.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotRevertirEmision.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotRevertirEmision.setToolTipText("Revertir Solicituda de Poliza");
        this.add(jScrollPane1, null);
        jtobBarraBotones.add(jBotRegistrarSolicitud, null);
        jtobBarraBotones.add(jBotEmitirPoliza, null);
        jtobBarraBotones.add(jBotRevertirEmision, null);
        this.add(jtobBarraBotones, null);
    }
}
