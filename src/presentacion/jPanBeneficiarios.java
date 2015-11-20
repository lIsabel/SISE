package presentacion;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class jPanBeneficiarios extends JPanel {
    private JLabel jLblIdentificacion = new JLabel();
    private JTextField jTxtIdentificacion = new JTextField();
    private DefaultListModel oModeloLista = new DefaultListModel();
    private JLabel jLblNombre = new JLabel();
    private JTextField jTxtNombre = new JTextField();
    private JLabel jLblParentesco = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jLstParentesco = new JList();
    private JLabel jLblPorcentajeDesignado = new JLabel();
    private JTextField jTxtPorcentaje = new JTextField();
    private JButton jBotCargarParentesco = new JButton();

    public jPanBeneficiarios() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(500,400));
        jLblIdentificacion.setText("Identificación");
        jTxtIdentificacion.setBounds(new Rectangle(115,35,100,20));
        jLblNombre.setText("Nombre Completo");
        jTxtNombre.setBounds(new Rectangle(115,85,100,20));
        jLblParentesco.setText("Parentesco");
        jLblParentesco.setBounds(new Rectangle(20,130,100,20));
        jScrollPane1.setBounds(new Rectangle(115,130,100,80));
        jLblPorcentajeDesignado.setText("Porcentaje Designado");
        jTxtPorcentaje.setBounds(new Rectangle(135,252,100,20));
        jBotCargarParentesco.setText("Cargar Parentesco");
        jBotCargarParentesco.setBounds(new Rectangle(240,130,140,30));
        jBotCargarParentesco.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotCargarParentesco_actionPerformed(e);
                }
            });
        jLblPorcentajeDesignado.setBounds(new Rectangle(20,250,120,30));
        jLblNombre.setBounds(new Rectangle(20,80,100,30));
        jLblIdentificacion.setBounds(new Rectangle(20,30,80,30));
        jLstParentesco.setModel(oModeloLista);
        jScrollPane1.getViewport().add(jLstParentesco, null);
        this.add(jBotCargarParentesco, null);
        this.add(jTxtPorcentaje, null);
        this.add(jLblPorcentajeDesignado, null);
        this.add(jScrollPane1, null);
        this.add(jLblParentesco, null);
        this.add(jTxtNombre, null);
        this.add(jLblNombre, null);
        this.add(jTxtIdentificacion, null);
        this.add(jLblIdentificacion, null);
    }

    private void jBotCargarParentesco_actionPerformed(ActionEvent e) {
        //Limpiar la lista
        oModeloLista.clear();

        //Agregar los elementos
        oModeloLista.addElement("1 - Cónyuge");
        oModeloLista.addElement("2 - Compañero(a) Sentimental");
        oModeloLista.addElement("3 - Hijo(a)");
        oModeloLista.addElement("4 - Padre");
        oModeloLista.addElement("5 - Madre");
        oModeloLista.addElement("6 - Tio(a)");
        oModeloLista.addElement("7 - Hermano(a)");
        oModeloLista.addElement("8 - Primo(a)");
        oModeloLista.addElement("9 - Otro");
    }
}
