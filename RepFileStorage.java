/*
 * Deborah Kronk-Lewis
 * IT252: Intermediate Java Programming II
 */
package collegesupplysurplus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RepFileStorage {
    
    public void writeSalesRep(SalesRep s) {

        File textWriter = new File ("salesrep.txt"); //create file
        try {
            //format doubles to show 2 decimal places like dollar amounts
            try (BufferedWriter fileOut = new BufferedWriter (new FileWriter(textWriter, true)) //open file
            ) {
                //format doubles to show 2 decimal places like dollar amounts
                NumberFormat dollar = new DecimalFormat("#0.00");
                //write to file
                fileOut.write("" + s); //print SalesRep object (pulled from the toString method
        
        /*("" + s.getRepId() //rep id
                        + " " + s.getFirstName() //space firstName
                        + " " + s.getLastName() //space lastName
                        + " SUPPLIES " + dollar.format(s.getSupplies()) //space supplies in dollar format
                        + " BOOKS " + dollar.format(s.getBooks()) //space books in dollar format
                        + " PAPER " + dollar.format(s.getPaper()) //space paper in dollar format
                        + " " + s.getDistrict().toUpperCase() //space district in upper case
                        + " " + s.getContact());
                fileOut.newLine(); //next entry begins on new line
                
                */
                fileOut.close();//save & close file
            }            
            //give user feedback
            JOptionPane.showMessageDialog(null, "Entry saved to salesrep.txt file:\n" + s); 
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error writing to file");
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
