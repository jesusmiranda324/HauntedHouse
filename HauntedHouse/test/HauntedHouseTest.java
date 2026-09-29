import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HauntedHouseTest {

    HauntedHouse house;

    @BeforeEach
    void setUp(){
        house = new HauntedHouse();
    }
    @Test
    void isGhostPresentTest() {
        assertTrue(house.isGhostPresent());
    }

    @Test
    void scareAwayGhostTest() {
        assertTrue(house.isGhostPresent());
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @Test
    void refillCandyBowlTest() {
        assertEquals(10, house.getCandyCount());
        house.refillCandyBowl(10);
        assertEquals(20, house.getCandyCount());
    }
    @Test
    void refillCandyBowlTestNegativeInput() {
        assertEquals(10, house.getCandyCount());
        house.refillCandyBowl(-10);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void spookySoundTest() {
        assertEquals("Boo!",house.spookySound());
    }

    @Test
    void trickOrTreatTest() {
        assertEquals(10,house.getCandyCount());
        house.trickOrTreat(5);
        assertEquals(5,house.getCandyCount());
    }

    @Test
    void trickOrTreatTestTooManyPeople() {
        assertEquals(10,house.getCandyCount());
        house.trickOrTreat(11);
        assertEquals(10,house.getCandyCount());
    }

    @Test
    void runningLowTest(){
        assertEquals(10, house.getCandyCount());
        house.setCandyCount(0);
        house.runningLow();
        assertEquals(10,house.getCandyCount());
    }

    @Test
    void hauntingTest(){
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
        house.haunting();
        assertTrue(house.isGhostPresent());
    }

    @Test
    void getCandyCount() {
        int amount = house.getCandyCount();
        assertEquals(10,amount);
    }

}