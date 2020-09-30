import javax.swing.*;

/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 * <p>
 * Handles input and output for the HealthyPets program.
 */

public class HPUtils {

    /**
     * Shows an InputDialog with a message
     *
     * @return user input String
     */
    public static String getInput() {

        return JOptionPane.showInputDialog("Vilket djur skall få mat?");
    }

    /**
     * Shows a message dialog containing the feedingPreference of the object
     *
     * @param obj Object implementing the IFoodGuide interface
     */
    public static void printFoodGuide(IFoodGuide obj) {
        //Polymorfism med hjälp av ett interface
        JOptionPane.showMessageDialog(null, obj.getFeedingPreference());
    }

    /**
     * Prints error message
     *
     * @param search the search string that did not find a match
     */
    public static void printNotFound(String search) {
        JOptionPane.showMessageDialog(null, "Kunde inte hitta " + search, "Sökning misslyckades", JOptionPane.ERROR_MESSAGE);
    }
}
