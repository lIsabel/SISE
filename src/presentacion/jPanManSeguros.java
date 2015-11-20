package presentacion;

import Utilitarios.UtilitarioVentana;
import Utilitarios.ValidadorFormatos;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class jPanManSeguros extends JPanel {
    private ImageIcon oImagenIncluir = new ImageIcon(getClass().getResource("..\\imagenes\\registrar.png"));
    private JButton jBotIncluirSeguro = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jList1 = new JList();
    private JTable jTabDatos = new JTable();
    private DefaultTableModel oModeloTablaDatos;
    private JDesktopPane oEscritorioPane = new JDesktopPane();

    public jPanManSeguros() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        jBotIncluirSeguro.setIcon(oImagenIncluir);
        this.setSize(new Dimension(400,320));
        jBotIncluirSeguro.setText("Incluir Producto");
        jBotIncluirSeguro.setBounds(new Rectangle(120,270,160,35));
        jBotIncluirSeguro.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotIncluirSeguro_actionPerformed(e);
                }
            });
        jScrollPane1.setBounds(new Rectangle(0,0, 520, 185));
        jScrollPane1.setSize(new Dimension(399, 250));
        jScrollPane1.getViewport().add(jList1, null);
        this.add(jScrollPane1, null);
        this.add(jBotIncluirSeguro, null);
    }
    private void InicializarJTable(){
        //Cuando se marca cualquier celda 
        //hace que se marque la fila completa
        jTabDatos.setRowSelectionAllowed(true);            
        
        //Aplicar el ModeleTable a la Tabla de Datos        
        String[] arregloProductoTabla = {"Código Producto", "Nombre del Producto", "Código de Autorización",
                                        "Linea de Seguro","Modalidad","Monto Minimo","Monto Máximo",
            "Tasa Factor","Estado"};
        oModeloTablaDatos = new DefaultTableModel(arregloProductoTabla, 0);
        jTabDatos.setModel(oModeloTablaDatos);
    }
    private void jBotIncluirSeguro_actionPerformed(ActionEvent e) {
       jDlgMantSeguros ojDlgMantSeguros = new jDlgMantSeguros();
       UtilitarioVentana.getInstance().centrarVentana(ojDlgMantSeguros);
       
    }
}
