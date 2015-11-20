package presentacion;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class jDlgMantSeguros extends JDialog implements ActionListener, ItemListener{ 
    private JLabel jLblCodigoProd = new JLabel();
    private JLabel jLblNombreProd = new JLabel();
    private JLabel jLblCodAutorizacion = new JLabel();
    private JLabel jLblLineaSeguro = new JLabel();
    private JLabel jLblModalidad = new JLabel();
    private JLabel jLblMontoAseguradoMin = new JLabel();
    private JLabel jLblMontoAseguradoMax = new JLabel();
    private JLabel jLblTasaFactor = new JLabel();
    private JLabel jLblEstado = new JLabel();
    private JTextField jTxtEstado = new JTextField();
    private JTextField jTxtNombreProd = new JTextField();
    private JTextField jTxtCodAutorizacion = new JTextField();
    private JTextField jTxtMontoMin = new JTextField();
    private JTextField jTxtMontoMax = new JTextField();
    private JTextField jTxtTasaFactor = new JTextField();
    private JTextField jTxtCodigoProducto = new JTextField();
    private JButton jBotAceptar = new JButton();
    private JButton jBotSalir = new JButton();
    private JComboBox jComboBox1 = new JComboBox();
    private JRadioButton jRdioVida = new JRadioButton();
    private JRadioButton jRdioDanos = new JRadioButton();
    private JRadioButton jRdioColectivo = new JRadioButton();
    private JRadioButton jRdioIndividual = new JRadioButton();

    public jDlgMantSeguros() {
        this(null, "", false);
    }

    public jDlgMantSeguros(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(482, 455));
        this.setTitle("Mantenimiento de Seguros");
        this.getContentPane().setLayout( null );
        jLblCodigoProd.setText("Código Producto:");
        jLblCodigoProd.setBounds(new Rectangle(15, 20, 100, 14));
        jLblNombreProd.setText("Nombre Producto:");
        jLblNombreProd.setBounds(new Rectangle(15,60,140, 14));
        jLblCodAutorizacion.setText("Código de Autorización");
        jLblCodAutorizacion.setBounds(new Rectangle(15,90, 140, 14));
        jLblLineaSeguro.setText("Linea del Seguro :");
        jLblLineaSeguro.setBounds(new Rectangle(15,130, 140, 14));
        jLblModalidad.setText("Modalidad");
        jLblModalidad.setBounds(new Rectangle(15,160, 140, 14));
        jLblMontoAseguradoMin.setText("Monto Asegurado Minimo :");
        jLblMontoAseguradoMin.setBounds(new Rectangle(15,190, 140, 14));
        jLblMontoAseguradoMax.setText("Monto Asegurado Maximo :");
        jLblMontoAseguradoMax.setBounds(new Rectangle(15,220, 140, 14));
        jLblTasaFactor.setText("Tasa Factor :");
        jLblTasaFactor.setBounds(new Rectangle(15,260, 140, 14));
        jLblEstado.setText("Estado :");
        jLblEstado.setBounds(new Rectangle(15,290, 140, 14));
        jTxtCodigoProducto.setBounds(new Rectangle(152, 15, 140, 20));
        jBotAceptar.setText("Aceptar");
        jBotAceptar.setBounds(new Rectangle(105, 360, 120, 45));
        jBotAceptar.setSize(new Dimension(120, 45));
        jBotAceptar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotAceptar_actionPerformed(e);
                }
            });
        jBotSalir.setText("Salir");
        jBotSalir.setBounds(new Rectangle(260, 360, 120, 45));
        jBotSalir.setSize(new Dimension(120, 45));
        jBotSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotSalir_actionPerformed(e);
                }
            });
        jRdioVida.setText("Linea Vida");
        jRdioVida.setBounds(new Rectangle(115,120,45,40));
        jRdioDanos.setText("Linea Daños");
        jRdioDanos.setBounds(new Rectangle(180,120,60,40));
        jRdioColectivo.setText("Colectivo");
        jRdioIndividual.setText("Individual");
        jRdioIndividual.setBounds(new Rectangle(190,150,90,40));
        jRdioColectivo.setBounds(new Rectangle(115,150,90,40));
        jTxtTasaFactor.setBounds(new Rectangle(150,257,100, 20));
        jTxtTasaFactor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jTxtTasaFactor_actionPerformed(e);
                }
            });
        jTxtMontoMax.setBounds(new Rectangle(152,217,100, 20));
        jTxtMontoMin.setBounds(new Rectangle(152,187,100, 20));
        jTxtCodAutorizacion.setBounds(new Rectangle(152,87,140, 20));
        jTxtNombreProd.setBounds(new Rectangle(152, 50, 140, 20));
        jTxtEstado.setBounds(new Rectangle(152,287,100, 20));
        this.getContentPane().add(jRdioIndividual, null);
        this.getContentPane().add(jRdioColectivo, null);
        this.getContentPane().add(jRdioDanos, null);
        this.getContentPane().add(jRdioVida, null);
        this.getContentPane().add(jBotSalir, null);
        this.getContentPane().add(jBotAceptar, null);
        this.getContentPane().add(jTxtCodigoProducto, null);
        this.getContentPane().add(jTxtTasaFactor, null);
        this.getContentPane().add(jTxtMontoMax, null);
        this.getContentPane().add(jTxtMontoMin, null);
        this.getContentPane().add(jTxtCodAutorizacion, null);
        this.getContentPane().add(jTxtNombreProd, null);
        this.getContentPane().add(jTxtEstado, null);
        this.getContentPane().add(jLblEstado, null);
        this.getContentPane().add(jLblTasaFactor, null);
        this.getContentPane().add(jLblMontoAseguradoMax, null);
        this.getContentPane().add(jLblMontoAseguradoMin, null);
        this.getContentPane().add(jLblModalidad, null);
        this.getContentPane().add(jLblLineaSeguro, null);
        this.getContentPane().add(jLblCodAutorizacion, null);
        this.getContentPane().add(jLblNombreProd, null);
        this.getContentPane().add(jLblCodigoProd, null);

    }
    private void cargarLineaSeguros(){
       // String[] lineaseguros = { "Vida", "Daños" };   
      //jCboLineaSeguro.addItem(lineaseguros);
    //jCboLineaSeguro.setSelectedIndex(2);
    String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

    //Create the combo box, select item at index 4.
    //Indices start at 0, so 4 specifies the pig.
    //jCboLineaSeguro.addItem(petStrings);
    //jCboLineaSeguro.setSelectedIndex(4);
    //jCboLineaSeguro.addItemListener(this);
    
    }
    private void jTxtTasaFactor_actionPerformed(ActionEvent e) {
    }

    private void jBotSalir_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void jBotAceptar_actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
}
