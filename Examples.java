import org.junit.Test;
import static org.junit.Assert.*;

public class Examples {


    // make Virus objects

    Virus myVirus = new Virus(5, 50, false);

    Virus myVirus2 = new Virus(12, 65, true);

    Virus myVirus3 = new Virus(20, 80, false);

    // make Antibodies objects

    Antibodies myAntibodies = new Antibodies(50, 50, true);

    Antibodies myAntibodies2 = new Antibodies(75, 100, true);

    Antibodies myAntibodies3 = new Antibodies(5, 5, true);

    // Test cases for is Virus is dangerous

    @Test
    public void isDangerToPeople(){
        assertFalse(myVirus.isDangerToPeople());
    }

    @Test
    public void isDangerToPeople2() {
        assertTrue(myVirus2.isDangerToPeople());
    }

    @Test
    public void isDangerToPeople3() {
        assertFalse(myVirus3.isDangerToPeople());
    }

    // Test cases to see if you have antibodies

    @Test
    public void hasAntibodies() {
        assertTrue(myAntibodies.goodAntibodies());
    }

    @Test
    public void hasAntibodies2() {
        assertTrue(myAntibodies2.goodAntibodies());
    }

    @Test
    public void hasAntibodies3() {
        assertFalse(myAntibodies3.goodAntibodies());
    }
}
