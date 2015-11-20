package presentacion;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JDialog;

public class jDlgDeclinarEmision extends JDialog {
    public jDlgDeclinarEmision() {
        this(null, "", false);
    }

    public jDlgDeclinarEmision(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize( new Dimension( 400, 300 ) );
        this.getContentPane().setLayout( null );
    }
}
