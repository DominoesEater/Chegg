package RealEstate;

public abstract class Property { 
private int zip;
private String streetAddress;
private double listPrice;
private double appraisalPrice;
Property() {
    streetAddress = "";
    zip = 0;
}
Property(String streetAddress, int zip) {
    this.streetAddress = streetAddress;
    this.zip = zip;
}

//setters
public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
}

public void setZip(int zip) {
    this.zip = zip;
}
//getters

public int getZip() {
    return zip;
}
public String getStreetAddress() {
    return streetAddress;
}
public double getListPrice() {
    return listPrice;

}
/**
 * @param listPrice the listPrice to set
 */
public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
}

/**
 * @return the appraisalPrice
 */
public double getAppraisalPrice() {
        return appraisalPrice;
}

/**
 * @param appraisalPrice the appraisalPrice to set
 */
protected void setAppraisalPrice(double appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
}

public abstract double calculateAppraisalPrice();
}
