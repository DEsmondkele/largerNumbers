package afrrica.semicolon.mp3.RainOfFuns;

public class Invoice {
    private String aPartNumber;
    private String aPartDescription;
    private int itemQuantity;
    private double price;
    public Invoice(String aPartNumber, String aPartDescription, int itemQuantity, double price) {

        this.aPartNumber = aPartNumber;
        this.aPartDescription = aPartDescription;
        this.itemQuantity = itemQuantity;
        this.price = price;
    }
    public Invoice(int itemQuantity, double price){
        this.itemQuantity=itemQuantity;
        this.price=price;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPartNumber() {
        return aPartNumber;
    }

    public void setPartNumber(String aPartNumber) {
        this.aPartNumber = aPartNumber;
    }

    public String getPartDescription() {
        return aPartDescription;
    }

    public void setPartDescription(String aPartDescription) {
        this.aPartDescription = aPartDescription;
    }

    public Object getInvoice() {
        Invoice myInvoice;
        myInvoice = new Invoice(aPartNumber,aPartDescription,itemQuantity,price);
        return myInvoice;
    }

    public double getInvoiceAmount() {
        double invoiceAmount = 0.0;
        if(itemQuantity<0 || price<0.0){
            return invoiceAmount;
        }
        else
        invoiceAmount = itemQuantity*price;
        return invoiceAmount;
    }
}
