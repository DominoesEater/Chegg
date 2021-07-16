package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {
	 private final Residential residential = new House();

	    @Test
	    void getSqFootage() {
	        residential.setSqFootage(0.8);

	        assertEquals(0.8, residential.getSqFootage());
	    }
	    @Test
	    void getBathCount() {
	        residential.setBathCount(33);
	        assertEquals(33, residential.getBathCount());
	    }
	    @Test

	    void getBedCount() {

	        // setting bed count

	        residential.setBedCount(5);

	        // testing

	        assertEquals(5, residential.getBedCount());


}
}
