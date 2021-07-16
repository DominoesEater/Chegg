package RealEstate;

public class House extends Residential {
	private double yardAcres;
    House() {
        yardAcres = 0;
    }
    House(double yardAcres) {
        this.yardAcres = yardAcres;
    }
    public double getYardAcres() {
        return yardAcres;
    }
    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }
    @Override
    public double calculateAppraisalPrice() {
            double price=(97*super.getSqFootage())+(10000*super.getBedCount())+
            		(12000*super.getBathCount())+(yardAcres*460000);
            setAppraisalPrice(price);
            return price;
    }

}
