package presentacion;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class jDlgMantAsegurados extends JDialog {
    private JLabel jLblIdentificacion = new JLabel();
    private JTextField jTxtIdentificacion = new JTextField();
    private JLabel jLblNombre = new JLabel();
    private JTextField jTxtNombre = new JTextField();
    private JLabel jLblDireccion = new JLabel();
    private JLabel jLblProfesion = new JLabel();
    private JTextField jTxtProfesion = new JTextField();
    private JLabel jLblNivelEscolaridad = new JLabel();
    private JList jLstNivelEscolaridad = new JList();
    private JLabel jLblNivelIngresos = new JLabel();
    private JList jLstNivelIngresos = new JList();
    private JButton jBotAceptar = new JButton();
    private JButton jBotSalir = new JButton();

    public jDlgMantAsegurados() {
        this(null, "", false);
    }

    public jDlgMantAsegurados(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(482, 455));
        this.setTitle("Mantenimiento Asegurados");
        this.getContentPane().setLayout( null );
        jLblIdentificacion.setText("Identificacón");
        jLblIdentificacion.setBounds(new Rectangle(15, 20, 125, 20));
        jTxtIdentificacion.setBounds(new Rectangle(140, 20, 125, 20));
        jLblNombre.setText("Nombre Completo");
        jLblNombre.setBounds(new Rectangle(15, 50, 125, 20));
        jTxtNombre.setBounds(new Rectangle(140,50, 125, 20));
        jTxtNombre.setSize(new Dimension(300, 20));
        jLblDireccion.setText("Dirección");
        jLblDireccion.setBounds(new Rectangle(15,80, 125, 20));
        jLblProfesion.setText("Profesion :");
        jLblProfesion.setBounds(new Rectangle(15,120, 125, 20));
        jTxtProfesion.setBounds(new Rectangle(140,120, 125, 20));
        jLblNivelEscolaridad.setText("Nivel de Escolaridad");
        jLblNivelEscolaridad.setBounds(new Rectangle(15, 160, 125, 20));
        jLstNivelEscolaridad.setBounds(new Rectangle(140, 160, 125, 20));
        jLblNivelIngresos.setText("Nivel de Ingresos");
        jLblNivelIngresos.setBounds(new Rectangle(15,200, 125, 20));
        jLstNivelIngresos.setBounds(new Rectangle(140,200, 125, 20));
        jBotAceptar.setText("Aceptar");
        jBotAceptar.setBounds(new Rectangle(80, 360, 120, 45));
        jBotAceptar.setSize(new Dimension(120, 45));
        jBotSalir.setText("Salir");
        jBotSalir.setBounds(new Rectangle(280, 360, 120, 45));
        jBotSalir.setSize(new Dimension(120, 45));
        this.getContentPane().add(jBotSalir, null);
        this.getContentPane().add(jBotAceptar, null);
        this.getContentPane().add(jLstNivelIngresos, null);
        this.getContentPane().add(jLblNivelIngresos, null);
        this.getContentPane().add(jLstNivelEscolaridad, null);
        this.getContentPane().add(jLblNivelEscolaridad, null);
        this.getContentPane().add(jTxtProfesion, null);
        this.getContentPane().add(jLblProfesion, null);
        this.getContentPane().add(jLblDireccion, null);
        this.getContentPane().add(jTxtNombre, null);
        this.getContentPane().add(jLblNombre, null);
        this.getContentPane().add(jTxtIdentificacion, null);
        this.getContentPane().add(jLblIdentificacion, null);
    }
}
