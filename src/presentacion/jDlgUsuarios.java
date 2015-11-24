package presentacion;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class jDlgUsuarios extends JDialog {
    private JLabel jLblCodigo = new JLabel();
    private JLabel jLblNombre = new JLabel();
    private JLabel jLblClave = new JLabel();
    private JLabel jLblRol = new JLabel();
    private JLabel jLblEstado = new JLabel();
    private JButton jBotAceptar = new JButton();

    public jDlgUsuarios() {
        this(null, "", false);
    }

    public jDlgUsuarios(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize( new Dimension( 410,300 ) );
        this.getContentPane().setLayout( null );
        jLblCodigo.setText("Código");
        jLblNombre.setText("Nombre");
        jLblClave.setText("Clave");
        jLblRol.setText("Rol");
        jLblEstado.setText("Estado");
        jLblEstado.setBounds(new Rectangle(15,180,70, 14));
        jBotAceptar.setText("jButton1");
        jBotAceptar.setBounds();
        jLblRol.setBounds(new Rectangle(15, 140,70, 14));
        jLblClave.setBounds(new Rectangle(15,100, 70, 14));
        jLblNombre.setBounds(new Rectangle(15,70, 70, 14));
        jLblCodigo.setBounds(new Rectangle(15, 30, 70, 14));
        this.getContentPane().add(jBotAceptar, null);
        this.getContentPane().add(jLblEstado, null);
        this.getContentPane().add(jLblRol, null);
        this.getContentPane().add(jLblClave, null);
        this.getContentPane().add(jLblNombre, null);
        this.getContentPane().add(jLblCodigo, null);
    }
}
