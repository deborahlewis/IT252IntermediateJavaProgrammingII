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
        
        s.setRepId(Integer.parseInt(st.nextToken().trim()));
        s.setFirstName(st.nextToken().trim());
        s.setLastName(st.nextToken().trim());
        label = st.nextToken().trim();
        s.setSupplies(Double.parseDouble(st.nextToken().trim()));
        label = st.nextToken().trim();
        s.setBooks(Double.parseDouble(st.nextToken().trim()));
        label = st.nextToken().trim();
        s.setPaper(Double.parseDouble(st.nextToken().trim()));
        s.setDistrict(st.nextToken().trim());
        s.setContact(st.nextToken().trim());
        return s;
        
    }
    

    
} //end class
