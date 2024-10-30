import java.util.ArrayList;

public class CharacterDatabase {
    HashedDictionary dictionary;
    ArrayList<Character> list;
    int position = 0;

    public CharacterDatabase() {
        dictionary = new HashedDictionary();
        list = new ArrayList<Character>();
    }


    public void addCharacter(String name, int height, int weight, double moralAlign){
        int index = dictionary.add(name, position);
        list.add(position, new Character(name, height, weight, moralAlign));
        position++;
    }

    public void removeCharacter(String name){

    }

    public Character getCharacter(String name){
        return null;
    }

    public HashedDictionary<String, Integer> getHashTable(){
        return null;
    }

    public void printList(){

    }
}
