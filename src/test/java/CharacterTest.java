import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Character c = new Character("Buck", 3, 2,1);
        assertEquals("Buck", c.getName());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Character c = new Character("Buck", 3, 2, 1);
        assertEquals(3, c.getHeight());
    }

    @org.junit.jupiter.api.Test
    void getWeight() {
        Character c = new Character("Buck", 3, 2, 1);
        assertEquals(2, c.getWeight());
    }

    @org.junit.jupiter.api.Test
    void getMorals() {
        Character c = new Character("Buck", 3, 2, 1);
        assertEquals(1, c.getMorals());
    }

    @org.junit.jupiter.api.Test
    void getHealth() {
        Character c = new Character("Buck", 3, 2, 1);
        assertEquals(1, c.getHealth());
    }

    @org.junit.jupiter.api.Test
    void heal() {
        Character c = new Character("Buck", 3, 2, 1);
        c.heal(1);
        assertEquals(2, c.getHealth());
    }

    @org.junit.jupiter.api.Test
    void injure() {
        Character c = new Character("Buck", 3, 2, 1);
        c.injure(.5);
        assertEquals(.5, c.getHealth());
    }

    @org.junit.jupiter.api.Test
    void change() {
        Character c = new Character("Buck", 3, 2, 1);
        c.change(-.5);
        assertEquals(.5, c.getMorals());
    }

    @org.junit.jupiter.api.Test
    void printCharacter() {
        Character c = new Character("Buck", 3, 2, 1);
        c.printCharacter();
    }
}