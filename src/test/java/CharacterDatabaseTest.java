import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterDatabaseTest {

    @Test
    void addCharacter() {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("Buck", 3, 2, 1);
        assertEquals(db.list.getFirst(), db.getCharacter("Buck"));
    }

    @Test
    void removeCharacter() {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("Buck", 3, 2, 1);
        db.removeCharacter("Buck");
        assertEquals(null, db.getCharacter("Buck"));

    }

    @Test
    void getCharacter() {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("Buck", 3, 2, 1);
        assertEquals(db.list.getFirst(), db.getCharacter("Buck"));
    }

    @Test
    void getHashTable() {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("Buck", 3, 2, 1);
        assertEquals(db.dictionary, db.getHashTable());
    }

    @Test
    void printList() {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("Buck", 3, 2, 1);
        db.addCharacter("Buck2", 3, 2, 1);
        db.removeCharacter("Buck2");
        db.printList();
    }
}