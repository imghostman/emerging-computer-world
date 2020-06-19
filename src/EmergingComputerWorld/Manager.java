/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import javax.swing.JFrame;

/**
 *
 * @author Prashant
 */
public class Manager {

    public static int userId;

    public JFrame registerFrame;
    public JFrame loginFrame;
    public JFrame homeFrame;
    public JFrame billFrame;
    public JFrame supplistFrame;

    private Manager()
    {
        loginFrame = new Login();
        registerFrame = new Register();
    }

    public void createFrames() {
        homeFrame = new Home();
        billFrame = new Bill();
        supplistFrame = new Supplist();
    }

    public static Manager getInstance() {
        return Singleton.INSTANCE;
    }

    private static class Singleton {
        private static final Manager INSTANCE = new Manager();
    }
}
