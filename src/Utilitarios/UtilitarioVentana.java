package Utilitarios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class UtilitarioVentana {
    private static UtilitarioVentana intance = null;

    /**
     * Constructor privado para implementar el Singlenton
     */
    private UtilitarioVentana() {

    }

    /**
     * Método para leer la instancia de la clase
     * @return Objeto Singlenton
     */
    public static UtilitarioVentana getInstance() {

        if (intance == null) {
            intance = new UtilitarioVentana();
        }

        return intance;
    }

    /**
     * Método para Centrar una ventana
     * @param pVentanaJFrame Objeto JFrame a Centrar
     */
    public void centrarVentana(JFrame pVentanaJFrame){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = pVentanaJFrame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        pVentanaJFrame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
        pVentanaJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pVentanaJFrame.setVisible(true);   
    }

    /**
     * Método para Centrar una ventana tipo JDialog
     * Siempre se muestra en forma modal
     * @param pVentanaJDialog Objeto JDialog a Centrar
     */
    public void centrarVentana(JDialog pVentanaJDialog){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = pVentanaJDialog.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        pVentanaJDialog.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
        pVentanaJDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pVentanaJDialog.setModal(true);
        pVentanaJDialog.setVisible(true);   
    }

    /**
     * Método para Centrar una ventana tipo JInternalFrame
     * @param pVentanaPrincipal Objeto JFrame que contiene los JInternalFrame
     * @param pTituloVentana String del título del JInternalFrame
     * @param pPanel Instancia del objeto Panel a asociar en el JInternalFrame
     * @param pEscritorioPane Objeto JDesktopPane del Frame Principal
     */    
    public void centrarVentana(JFrame pVentanaPrincipal, String pTituloVentana, JPanel pPanel, JDesktopPane pEscritorioPane) {
        
        //Crear el JInternalFrame
        JInternalFrame oJInternalFrame = new JInternalFrame(pTituloVentana, true, true, true, true);
        
        //Leer las dimensiones de la ventana principal y del cliente
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = pVentanaPrincipal.getSize();
        
        //Ajusta el alto y ancho del frame principal
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        
        //Asociar el objto Panel al JInternalFrame
        oJInternalFrame.add(pPanel, BorderLayout.CENTER);
        
        //Ubicar el JInternalFrame en el centro del Frame Principal
        oJInternalFrame.setLocation( ( frameSize.width - pPanel.getWidth() ) / 2, ( frameSize.height - pPanel.getHeight() ) / 2 );
        
        //Definir que al cerrar el JInternalFrame se destruya el objeto
        oJInternalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oJInternalFrame.pack();
        
        //Agregar el JInternalFrame el objeto JDesktopPane del Frame Principal
        pEscritorioPane.add(oJInternalFrame);
        
        //Mostrar el JInternalFrame
        oJInternalFrame.setVisible(true);
    }
    
    /**
     * Método que modifica el estilo de las ventanas del ambiente swing
     * @param pEstilo Número del estilo de 1 hasta el 3
     */
    public void aplicarEstiloVentas(int pEstilo) {
        try {            
            UIManager.setLookAndFeel(this.getEstiloVentana(pEstilo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Recorre los objetos contenidos en un panel para cerrar el JFrame/JInternalFrame que lo contiene
     * @param oPanel Objeto Panel a buscar el objeto JFrame/JInternalFrame
     */
    public void cerrarPanel(JPanel oPanel){
        //Leer el padre de un panel en 5 Niveles permite iterar por medio del 
        //método getComponent(x) el objeto JFrame/JInternalFrame que contiene el panel
        //Si existe invoca el dispose de dicho JInternalFrame        
        for(int i=0; i < oPanel.getParent().getParent().getParent().getParent().getParent().getComponentCount(); i++){            
            if (oPanel.getParent().getParent().getParent().getParent().getParent().getComponent(i).getClass() == JInternalFrame.class){
                ((JInternalFrame)oPanel.getParent().getParent().getParent().getParent().getParent().getComponent(i)).dispose();
                return;
            }else if (oPanel.getParent().getParent().getParent().getParent().getParent().getComponent(i).getClass() == JFrame.class){
                ((JFrame)oPanel.getParent().getParent().getParent().getParent().getParent().getComponent(i)).dispose();
                return;
            }                
        }    
    }
    
    /**
     * Retornar el nombre de la clase que permite modificar el Look and Feel
     * de las ventanas de una aplicación
     * @param pEstilo Número del estilo de 1 hasta el 3
     * @return Nombre del estilo a aplicar
     */
    private String getEstiloVentana(int pEstilo) {
        String vEstilo = "";

        switch (pEstilo) {
        case 1:
            //System
            vEstilo = UIManager.getSystemLookAndFeelClassName();        
            break;
        case 2:
            //Metal
            vEstilo = UIManager.getCrossPlatformLookAndFeelClassName();
            break;
        case 3:
            //Moti
            vEstilo = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            break;
        default:
            //Aplica el estilo default del Sistema operativo
            vEstilo = UIManager.getSystemLookAndFeelClassName();
        }
        return vEstilo;
    }
}