package presentacion;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class jPanSeguros extends JPanel implements ActionListener{
    
    private JComboBox jCboLineaSeguro = new JComboBox();

    public jPanSeguros() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        jCboLineaSeguro.setBounds(new Rectangle(20,100,40,40));
        this.add(jCboLineaSeguro, null);
    }
    private void cargarLineaSeguros(){
       // String[] lineaseguros = { "Vida", "Daños" };   
      //jCboLineaSeguro.addItem(lineaseguros);
    //jCboLineaSeguro.setSelectedIndex(2);
    String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

    //Create the combo box, select item at index 4.
    //Indices start at 0, so 4 specifies the pig.
    jCboLineaSeguro.addItem(petStrings);
    jCboLineaSeguro.setSelectedIndex(4);
    jCboLineaSeguro.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
