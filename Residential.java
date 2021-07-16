package RealEstate;

public abstract class Residential extends Property{
	private int bedCount;
    private int bathCount;
    private double sqFootage;

   
    Residential() {
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }

  
    Residential(String streetAddress, int zip, int bedCount, int bathCount, double sqFootage) {
        super(streetAddress, zip); 
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    // getters

    public double getSqFootage() {
        return sqFootage;
    }

    public int getBathCount() {
        return bathCount;
    }

    public int getBedCount() {
        return bedCount;
    }

    // setters

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public void setSqFootage(double sqFootage) {
        this.sqFootage = sqFootage;
    }
}
