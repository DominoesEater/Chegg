package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	   private final Condo condo = new Condo();
	    @Test
	    void getFloorLvl() {
	        condo.setFloorLvl(1);
	        assertEquals(1, condo.getFloorLvl());
	    }
	    @Test

        void calculateAppraisalPrice()
        {
                condo.setBathCount(2);
                condo.setBedCount(3);
                condo.setSqFootage(1200);
                //(88*super.getSqFootage())+(8000*super.getBedCount())+(10000*super.getBathCount());

                double actual=condo.calculateAppraisalPrice();

                assertEquals(149600, actual);
        }
}
