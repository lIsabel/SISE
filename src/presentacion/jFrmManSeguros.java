package presentacion;

import Utilitarios.Pila;

import Utilitarios.UtilitarioVentana;

import dominio.Producto;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import logicaNegocio.ProductoBl;
import logicaNegocio.ProductoBlIMPL;

public class jFrmManSeguros extends JFrame {
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JButton jBotIncluir = new JButton();
    private JTable jTabProductos = new JTable();
    private DefaultTableModel oModeloTablaProductos;
    //Definir el objeto BLL de referencia
    
    ProductoBlIMPL oProductoBlIMPL = new ProductoBlIMPL();
    
    public jFrmManSeguros() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 320) );
        this.setTitle( "Mantenimientos de Seguros" );
        jScrollPane1.setBounds(new Rectangle(0,0,398, 240));
        jBotIncluir.setText("Incluir Producto");
        jBotIncluir.setBounds(new Rectangle(120,250,160,35));
        jBotIncluir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBotIncluir_actionPerformed(e);
                }
            });
        ;
        this.getContentPane().add(jBotIncluir, null);
        jScrollPane1.getViewport().add(jTabProductos, null);
        this.getContentPane().add(jScrollPane1, null);
    }
    private void InicializarJTable(){
        //Cuando se marca cualquier celda 
        //hace que se marque la fila completa
        jTabProductos.setRowSelectionAllowed(true);            
        
        //Aplicar el ModeleTable a la Tabla de Datos        
        String[] arregloTitulosTabla = {"Código", "Nombre del Producto"};
        oModeloTablaProductos = new DefaultTableModel(arregloTitulosTabla, 0);
        jTabProductos.setModel(oModeloTablaProductos);
    }
    
    private void CargarJTable(){
        
        //Definir objeto Vector para cargar datos
        String[] vDatosTabla = new String[2];
        
        //Limpiar los rows
        oModeloTablaProductos.setRowCount(0);
        
        //Cargar los datos en el objeto JTable
       Iterator oIterador = this.oProductoBlIMPL.getListaProductos().iterator();
        while (oIterador.hasNext()){
        Producto oProducto = (Producto)oIterador.next();
          vDatosTabla[0] = oProducto.getCodigoProducto();
         vDatosTabla[1] = oProducto.getDescripcionProducto();
            
            //Agregar al modelo
            oModeloTablaProductos.addRow(vDatosTabla);
        }
    }
    private void CargarMantenimiento(String pTipoMantenimiento){
        String vCodigo = "";
        int vSeModificoDatos = 0;
        
        //Recorrer el JTable y cargar los rows seleccionados
        for (int vFila = 0; vFila < jTabProductos.getRowCount(); vFila++) {
            if (jTabProductos.isRowSelected(vFila)) {
                vCodigo = "" + jTabProductos.getValueAt(vFila, 0);
                
                //Cargar los datos a la pila
                //1. Valor Llave
                //2. Tipo de Mantemiento
                Pila.agregarElemento(vCodigo);
                Pila.agregarElemento(pTipoMantenimiento);
                
                //Cargar el JFrame del Mantenimiento
             jDlgMantSeguros ojDlgMantSeguros = new jDlgMantSeguros();
                
            UtilitarioVentana.getInstance().centrarVentana(ojDlgMantSeguros);
                
                //Actualizar la bandera si se actualizaron datos
                vSeModificoDatos = Integer.parseInt( Pila.sacarUltimoElemento() );                
            }            
        }
                
        //Si se modificaron datos se debe refrescar el JTable
        if (vSeModificoDatos == 1) {
            CargarJTable();
        }
    
    }

    private void jBotIncluir_actionPerformed(ActionEvent e) {
        //Mandar a la Pila el tipo de Mantenimiento - Agregar
        Pila.agregarElemento("A");
        
        //Cargar el JFrame del Mantenimiento
        jDlgMantSeguros ojDlgMantSeguros = new jDlgMantSeguros();
        
        UtilitarioVentana.getInstance().centrarVentana(ojDlgMantSeguros);
        
        //Si se actulizó datos se debe refrescar el JTable
        if (Integer.parseInt( Pila.sacarUltimoElemento() ) == 1) {
            CargarJTable();
    }
}
}