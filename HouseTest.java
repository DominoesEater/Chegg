package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	 private final House house = new House();

	    @Test
	    void getYardAcres() {

	        house.setYardAcres(123);

	        assertEquals(123, house.getYardAcres());
	    }
	    @Test
	    
	    void calculateAppraisalPrice()
	    {
	        house.setBathCount(2);
	        house.setBedCount(3);
	        house.setSqFootage(1200);
	        house.setYardAcres(20);

	        //(97*super.getSqFootage())+(10000*super.getBedCount())+(12000*super.getBathCount())+(yardAcres*460000);
	        double actual=house.calculateAppraisalPrice();
	        
	        assertEquals(9370400.0, actual);
	    }
}
