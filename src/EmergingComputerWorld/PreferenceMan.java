/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import java.util.prefs.Preferences;

/**
 *
 * @author Prashant
 */
public class PreferenceMan {

    private Preferences prefs;

    private PreferenceMan() {
        prefs = Preferences.userRoot().node(this.getClass().getName());
    }

    public void setPreference(boolean mode) {
        prefs.putBoolean("mode", mode);

    }

    public boolean getPreference() {
        return prefs.getBoolean("mode", false);
    }

    public void removePrefernence() {
        prefs.remove("mode");

    }

    public static PreferenceMan getInstance() {
        return Singleton.INSTANCE;
    }

    private static class Singleton {

        private static final PreferenceMan INSTANCE = new PreferenceMan();
    }
}
