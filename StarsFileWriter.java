/*
 * Deborah Kronk-Lewis
 * IT252: Intermediate Java Programming II
 */
package collegesupplysurplus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StarsFileWriter {
    
    public void writeStars (SalesRep s) {

        File textWriter = new File ("stars.txt"); //create file
        try {
            try (BufferedWriter fileOut = new BufferedWriter (new FileWriter(textWriter, true))) { //open file 
                //write to file
                fileOut.write("" + s); //print SalesRep object (pulled from the toString method)
                fileOut.close();//save & close file
            }            
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error writing to file");
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}