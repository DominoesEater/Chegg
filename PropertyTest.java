package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {
	private final Property property1 = new House();
    private final Property property2 = new Condo();
	@Test
	void getZip() {
     
        property1.setZip(100);
        property2.setZip(200);
        assertEquals(100, property1.getZip());
        assertEquals(200, property2.getZip());

    }

    @Test
    void getStreetAddress() {
        property1.setStreetAddress("Salt Lake Street");
        property2.setStreetAddress("fake street 2");
        assertEquals("Salt Lake Street", property1.getStreetAddress());
        assertEquals("Provo", property2.getStreetAddress());
        
        
    }
@Test
    
    void getListPrice() {
        // setting the list price

        property1.setListPrice(1000);
        property2.setListPrice(2000);
        // testing the list price

        assertEquals(1000, property1.getListPrice());
        assertEquals(2000, property2.getListPrice());
        
        }

    @Test
    
        void setListPrice() {
    
        // setting the list price

        property1.setListPrice(500);
        property2.setListPrice(800);

        // testing the list price

        assertEquals(500, property1.getListPrice());
        assertEquals(800, property2.getListPrice());
        }

    @Test
    
        void getAppraisalPrice() {
                // setting the appraisal price

        property1.setAppraisalPrice(1500);
        property2.setAppraisalPrice(900);
        // testing the list price

        assertEquals(1500, property1.getAppraisalPrice());
        assertEquals(900, property2.getAppraisalPrice());
        }

    @Test
    
        void setAppraisalPrice() {
        // setting the appraisal price

        property1.setAppraisalPrice(2500);
        property2.setAppraisalPrice(3500);
        // testing the list price

        assertEquals(2500, property1.getAppraisalPrice());
        assertEquals(3500, property2.getAppraisalPrice());
        }

	}
