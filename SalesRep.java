/*
 * Deborah Kronk-Lewis
 * IT252: Intermediate Java Programming II
 * Unit 1 IP
 */
package IT252_Unit1;

//import statements to permit formatting of decimals
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class SalesRep {
    
    //declare variables
    private int repId;
    private String firstName, lastName, district, contact;
    private double supplies, books, paper;
    
    //default constructor
    public SalesRep() {
        
    }
    
    //get & set methods
    public int getRepId() {
        return repId;
    }

    public void setRepId(int repId) {
        this.repId = repId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public double getSupplies() {
        return supplies;
    }

    public void setSupplies(double supplies) {
        this.supplies = supplies;
    }

    public double getBooks() {
        return books;
    }

    public void setBooks(double books) {
        this.books = books;
    }

    public double getPaper() {
        return paper;
    }

    public void setPaper(double paper) {
        this.paper = paper;
    }
    
    public String getDistrict() {
        return district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    //format doubles to show 2 decimal places like dollar amounts
    NumberFormat dollarFormat = new DecimalFormat("#0.00"); //done before displaying to ensure validity of any calculations that may be done later
    
    //toString method to display object at the end of the MainApp.java program
    @Override
    public String toString() {
        return "Sales Rep Id: " + repId 
                + "\nFirst Name: " + firstName 
                + "\nLast Name: " + lastName 
                + "\n\nSupplies: $" + dollarFormat.format(supplies) 
                + "\nBooks: $" + dollarFormat.format(books) 
                + "\nPaper: $" + dollarFormat.format(paper)
                + "\n\nSales District: " + district
                + "\nPreferred Contact: " + contact;
    }
    
    
    
} //end salesRep class
