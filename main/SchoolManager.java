/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanager.main;

import schoolmanager.object.School;

/**
 *
 * @author JMorenoM
 */
public class SchoolManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        School school = new School("Buena Tierra");
        System.out.println(school.toString());
        System.out.println("Done");
    }
}
