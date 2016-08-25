/*
 * Deborah Kronk-Lewis
 * IT252: Intermediate Java Programming II
 */
package collegesupplysurplus;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class SalesRep {
    
    private int repId;
    private String firstName, lastName, district, contact;
    private double supplies, books, paper;

    //constructor
    public SalesRep() {
    }

    //getters and setters
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
    
    //format doubles to show 2 decimal places like dollar amounts
    NumberFormat dollar = new DecimalFormat("#0.00");

    //toString method
    @Override
    public String toString() {
        return repId + " " + firstName + " " + lastName + " " 
                + "SUPPLIES " + dollar.format(supplies)  + " " 
                + "BOOKS " + dollar.format(books)  + " " 
                + "PAPER " + dollar.format(paper) + " " + district.toUpperCase() + " " + contact + "\n";
    } 
    
    
    
} //end sales rep class
