/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Prashant
 */
public class Main extends Thread {

    /**
     * @param args the command line arguments
     */
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        Splash splash = new Splash();
        splash.setVisible(true);
        splash.updateSplash();
    }

    public static void main(String args[]) throws InterruptedException {
        try {
            if (PreferenceMan.getInstance().getPreference()) {
                 UIManager.setLookAndFeel(NoireLookAndFeel.class.getName());
            } else {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //UIManager.setLookAndFeel ( "com.alee.laf.WebLookAndFeel" );
        Main m = new Main();
        m.start();
        m.join();

    }
}
