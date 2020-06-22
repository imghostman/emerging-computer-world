/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Prashant
 */
//public class Main {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//
//        /* Set the jTattoo look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* 
//         *  
//         */
//        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
//            System.err.println("Look and feel not set.");
//        }
//
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        Splash splash = new Splash();
//        splash.setVisible(true);
//        splash.updateSplash();
//        //after previous line has executed following lines need to be executed
//        //splash.setVisible(false);
//        Manager.getInstance().loginFrame.setVisible(true);
//    }
//}
public class Main extends Thread{
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
    public static void main(String args[]) throws InterruptedException{
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println("Look and feel not set.");
        }
        Main m = new Main();
        m.start();
        m.join();
       
    }
}
