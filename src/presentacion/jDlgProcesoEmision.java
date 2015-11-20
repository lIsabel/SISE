package presentacion;

import Utilitarios.UtilitarioVentana;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class jDlgProcesoEmision extends JDialog {
    private JButton jBotProducto = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jLstProducto = new JList();
    private DefaultListModel oModeloLista = new DefaultListModel();
    private JLabel jLblFechaEmision = new JLabel();
    private JTextField jTxtFechaEmision = new JTextField();
    private JLabel jLblMontoAsegurado = new JLabel();
    private JTextField jTxtlMontoAsegurado = new JTextField();
    private JLabel jLblPrimaPoliza = new JLabel();
    private JTextField jTxtPrimaPoliza = new JTextField();
    private JLabel jLblFormaPago = new JLabel();
    private JRadioButton jRdioBotTarjeta = new JRadioButton();
    private JRadioButton jRdioBotBancario = new JRadioButton();
    private JRadioButton jRdioBotVentanilla = new JRadioButton();
    private JLabel jLblPrimaFrecuencia = new JLabel();
    private JTextField jTxtPrimaFrencuencia = new JTextField();
    private JLabel jLblEstadoSolicitud = new JLabel();
    private JTextField jTxtEstado = new JTextField();
    private JButton jBotAceptar = new JButton();
    private JButton jBotSalir = new JButton();
    private JButton jBotRegistrarBeneficiario = new JButton();
    private JButton jBotDeclinar = new JButton();
    private JDesktopPane oEscritorioPane = new JDesktopPane();

    public jDlgProcesoEmision() {
        this(null, "", false);
    }

    public jDlgProcesoEmision(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize( new Dimension( 600, 550 ) );
        this.getContentPane().setLayout( null );
        this.setTitle("SISE: Proceso de venta emision");
        jBotProducto.setText("Solicitar Producto");
        jBotProducto.setBounds(new Rectangle(280,20,150,30));
        jBotProducto.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotProducto_actionPerformed(e);
                }
            });
        jScrollPane1.setBounds(new Rectangle(20,20,80,30));
        jScrollPane1.getViewport().add(jLstProducto, null);
        jLstProducto.setModel(oModeloLista);
        jLblFechaEmision.setText("Fecha de Emision");
        jLblFechaEmision.setBounds(new Rectangle(20,60,100,30));
        jTxtFechaEmision.setBounds(new Rectangle(115,65,100,20));
        jLblMontoAsegurado.setText("Monto Asegurado");
        jTxtlMontoAsegurado.setBounds(new Rectangle(115,120,100,20));
        jLblPrimaPoliza.setText("Prima de la Poliza");
        jTxtPrimaPoliza.setBounds(new Rectangle(115,170,100,20));
        jLblFormaPago.setText("Forma de Pago");
        jLblFormaPago.setBounds(new Rectangle(20,260,100,20));
        jRdioBotTarjeta.setText("Deducción por Tarjeta");
        jRdioBotBancario.setText("Depósito Bancario");
        jRdioBotVentanilla.setText("Pago en Ventanilla");
        jRdioBotVentanilla.setBounds(new Rectangle(140,300,120,20));
        jLblPrimaFrecuencia.setText("Prima por la Frecuencia");
        jTxtPrimaFrencuencia.setBounds(new Rectangle(440,260,120,20));
        jLblEstadoSolicitud.setText("Estado de la Solicitud");
        jTxtEstado.setBounds(new Rectangle(135,345,100,20));
        jTxtEstado.setEditable(false);
        jBotAceptar.setText("Aceptar");
        jBotAceptar.setBounds(new Rectangle(100,480,120,30));
        jBotSalir.setText("Salir");
        jBotSalir.setBounds(new Rectangle(280,480,120,30));
        jBotRegistrarBeneficiario.setText("Registrar Beneficiario");
        jBotRegistrarBeneficiario.setBounds(new Rectangle(320,320,160,30));
        jBotRegistrarBeneficiario.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotRegistrarBeneficiario_actionPerformed(e);
                }
            });
        jBotDeclinar.setText("Declinar Solicitud");
        jBotDeclinar.setBounds(new Rectangle(320,380,160,30));
        jLblEstadoSolicitud.setBounds(new Rectangle(20,345,140,20));
        jLblPrimaFrecuencia.setBounds(new Rectangle(320,260,120,20));
        jRdioBotBancario.setBounds(new Rectangle(140,260,140,20));
        jRdioBotTarjeta.setBounds(new Rectangle(140,220,140,20));
        jLblPrimaPoliza.setBounds(new Rectangle(20,170,100,20));
        jLblMontoAsegurado.setBounds(new Rectangle(20,120,100,20));
        this.getContentPane().add(jBotDeclinar, null);
        this.getContentPane().add(jBotRegistrarBeneficiario, null);
        this.getContentPane().add(jBotSalir, null);
        this.getContentPane().add(jBotAceptar, null);
        this.getContentPane().add(jTxtEstado, null);
        this.getContentPane().add(jLblEstadoSolicitud, null);
        this.getContentPane().add(jTxtPrimaFrencuencia, null);
        this.getContentPane().add(jLblPrimaFrecuencia, null);
        this.getContentPane().add(jRdioBotVentanilla, null);
        this.getContentPane().add(jRdioBotBancario, null);
        this.getContentPane().add(jRdioBotTarjeta, null);
        this.getContentPane().add(jLblFormaPago, null);
        this.getContentPane().add(jTxtPrimaPoliza, null);
        this.getContentPane().add(jLblPrimaPoliza, null);
        this.getContentPane().add(jTxtlMontoAsegurado, null);
        this.getContentPane().add(jLblMontoAsegurado, null);
        this.getContentPane().add(jTxtFechaEmision, null);
        this.getContentPane().add(jLblFechaEmision, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jBotProducto, null);
    }

    private void jBotProducto_actionPerformed(ActionEvent e) {
        
    }

    private void jBotRegistrarBeneficiario_actionPerformed(ActionEvent e) {
        //Cargar el JFrame del Mantenimiento
        jPanBeneficiarios ojPanBeneficiarios = new jPanBeneficiarios();
        
        //UtilitarioVentana.getInstance().centrarVentana(this,"Agregando Beneficiario",ojPanBeneficiarios,oEscritorioPane);
    }
}
