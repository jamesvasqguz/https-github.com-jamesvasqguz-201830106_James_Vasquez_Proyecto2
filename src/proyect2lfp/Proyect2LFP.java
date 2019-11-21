package proyect2lfp;

import Proyect2LFP.UI.JFIndex;

/**
 *
 * @author jara
 */
public class Proyect2LFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFIndex in = new JFIndex();
        in.setVisible(true);    
        in.setSize(800, 650);
        in.setResizable(false);
        in.setTitle("Analizador");
        in.setLocationRelativeTo(null);
    }

}
