package presentacion;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class jPanUsuarios extends JPanel {
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTabUsuarios = new JTable();
    private DefaultTableModel oModeloTablaUsuarios;
    private JToolBar jtobBarraBotones = new JToolBar();
    private JButton jBotCrearUsuario = new JButton();
    private JButton jBotActualizar = new JButton();
    private JButton jBotEliminar = new JButton();
    private JButton jBotCambiarClave = new JButton();

    public jPanUsuarios() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(400, 261));
        jtobBarraBotones.setBounds(new Rectangle(0, 5, 400, 60));
        jtobBarraBotones.setMaximumSize(new Dimension(400, 61));
        jtobBarraBotones.setMinimumSize(new Dimension(60, 61));
        jtobBarraBotones.setFloatable(false);
        jtobBarraBotones.setSize(new Dimension(400, 61));
        jtobBarraBotones.setPreferredSize(new Dimension(400, 61));
        jScrollPane1.setBounds(new Rectangle(0, 75, 400, 185));
        jBotCrearUsuario.setText("Crear Usuario");
        jBotCrearUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotCrearUsuario.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotCrearUsuario.setMaximumSize(new Dimension(100, 50));
        jBotCrearUsuario.setMinimumSize(new Dimension(100, 50));
        jBotCrearUsuario.setPreferredSize(new Dimension(100, 50));
        jBotCrearUsuario.setSize(new Dimension(100, 50));
        jBotCrearUsuario.setToolTipText("Agregar un  nuevo Usuario...");
        jBotActualizar.setText("Actualizar");
        jBotActualizar.setSize(new Dimension(70, 60));
        jBotActualizar.setMaximumSize(new Dimension(70, 60));
        jBotActualizar.setMinimumSize(new Dimension(70, 60));
        jBotActualizar.setPreferredSize(new Dimension(70, 60));
        jBotActualizar.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotActualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotActualizar.setToolTipText("Actualizar el registro seleccionado...");
        jBotEliminar.setText("Eliminar");
        jBotEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotEliminar.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotEliminar.setMaximumSize(new Dimension(70, 80));
        jBotEliminar.setMinimumSize(new Dimension(70, 80));
        jBotEliminar.setPreferredSize(new Dimension(70, 80));
        jBotEliminar.setSize(new Dimension(70, 80));
        jBotEliminar.setToolTipText("Eliminar el registro seleccionado...");
        jBotCambiarClave.setText("Cambiar Clave");
        jBotCambiarClave.setHorizontalTextPosition(SwingConstants.CENTER);
        jBotCambiarClave.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBotCambiarClave.setToolTipText("Cambiar clave del registro selecciondo...");
        jBotCambiarClave.setMaximumSize(new Dimension(100, 60));
        jBotCambiarClave.setMinimumSize(new Dimension(100, 60));
        jBotCambiarClave.setPreferredSize(new Dimension(100, 60));
        jScrollPane1.getViewport().add(jTabUsuarios, null);
        jtobBarraBotones.add(jBotCrearUsuario, null);
        jtobBarraBotones.add(jBotActualizar, null);
        jtobBarraBotones.add(jBotEliminar, null);
        jtobBarraBotones.add(jBotCambiarClave, null);
        this.add(jtobBarraBotones, null);
        this.add(jScrollPane1, null);
    }
}
