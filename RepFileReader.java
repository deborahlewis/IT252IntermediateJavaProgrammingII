/*
 * Deborah Kronk-Lewis
 * IT252: Intermediate Java Programming II
 */
package collegesupplysurplus;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Deborah
 */
public class RepFileReader {
    
    public List<SalesRep> readSalesRep(String filename) throws IOException {
        File salesRepReader = new File(filename); //open salesrep.txt file
        FileReader reader = new FileReader(salesRepReader); //create reader to read file
        BufferedReader bufferedReader = new BufferedReader(reader); //read more than one char at a time
        
        List<SalesRep> SalesRep = new ArrayList<SalesRep>(); //create salesRep array
        SalesRep s = new SalesRep(); //create new salesrep object
        
        String line = bufferedReader.readLine(); //read line of salesrep.txt file
        while (line != null) { //while lines exist
            s = parseLine(line);

            if (s == null) {
                System.out.println("This row was bad" + line);
            } else {
                SalesRep.add(s); //populate SalesRep array
                System.out.println(s); //print person
            }
            line = bufferedReader.readLine();
        }
        
        return SalesRep;

        
    } //end readSalesRep()
    
    private static SalesRep parseLine(String line) { //create parseLine method
        //declare variables
        String label;
        
        StringTokenizer st = new StringTokenizer(line, " " ); //create tokenizer using space as delimiter
        
        SalesRep s = new SalesRep(); //create new salesrep object
        
        s.setRepId(Integer.parseInt(st.nextToken().trim())); //trim salesRep string and convert to int to set as repId
        s.setFirstName(st.nextToken().trim()); //trim first name and set as firstName
        s.setLastName(st.nextToken().trim()); //trim last name and set as last name
        label = st.nextToken().trim(); //acknowledge supplies label
        s.setSupplies(Double.parseDouble(st.nextToken().trim())); //trim supplies string and convert to double to set as supplies total
        label = st.nextToken().trim(); //acknowledge books label
        s.setBooks(Double.parseDouble(st.nextToken().trim())); //trim books string and convert to double to use as books total
        label = st.nextToken().trim(); //acknowledge paper label
        s.setPaper(Double.parseDouble(st.nextToken().trim())); //trim paper string and convert to double to use as paper total
        s.setDistrict(st.nextToken().trim()); //trim district input and use as district
        s.setContact(st.nextToken().trim()); //trim contact input and use as contact
        return s; //return SalesRep object
        
    }
    

    
} //end class
