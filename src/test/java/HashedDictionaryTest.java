import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class HashedDictionaryTest {

    @Test
    void displayHashTable() {
        HashedDictionary hd = new HashedDictionary(1);
        hd.displayHashTable();
    }

    @Test
    void add() {
        HashedDictionary hd = new HashedDictionary(1);
        hd.add("Buck", 1);
        assertEquals(1, hd.getValue("Buck"));
    }

    @Test
    void remove() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        hd.remove("Buck");
        assertEquals(null, hd.getValue("Buck"));
    }

    @Test
    void getValue() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        assertEquals(1, hd.getValue("Buck"));
    }

    @Test
    void getIndex() {
        HashedDictionary hd = new HashedDictionary();
        assertEquals(hd.add("Buck", 1), hd.getIndex("Buck"));
    }

    @Test
    void contains() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        assertTrue(hd.contains("Buck"));
    }

    @Test
    void isEmpty() {
        HashedDictionary hd = new HashedDictionary();
        assertTrue(hd.isEmpty());
    }

    @Test
    void getSize() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        assertEquals(1, hd.getSize());
    }

    @Test
    void clear() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        hd.clear();
        assertTrue(hd.isEmpty());
    }

    @Test
    void getKeyIterator() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        Iterator<String> it = hd.getKeyIterator();
        assertTrue(it.hasNext());
        assertEquals("Buck", it.next());
    }

    @Test
    void getValueIterator() {
        HashedDictionary hd = new HashedDictionary();
        hd.add("Buck", 1);
        Iterator<Integer> it = hd.getValueIterator();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
    }
}