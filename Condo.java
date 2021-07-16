package RealEstate;

public class Condo extends Residential {
    private int floorLvl;
    Condo() {
        floorLvl = 0;
    }
    Condo(int floorLvl) {
        this.floorLvl = floorLvl;
    }
    public int getFloorLvl() {
        return floorLvl;
    }
    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }



    @Override
    public double calculateAppraisalPrice() {
            double price=(88*super.getSqFootage())+(8000*super.getBedCount())+(10000*super.getBathCount());
            if(floorLvl>1)
            {
                    price+=((floorLvl-1)*5000);
            }
            setAppraisalPrice(price);
            return price;
    }

}
