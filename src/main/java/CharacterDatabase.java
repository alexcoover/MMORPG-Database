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
        int index = (int) dictionary.getValue(name);
        list.set(index, null);
    }

    public Character getCharacter(String name){
        int index = (int) dictionary.getValue(name);
        return list.get(index);
    }

    public HashedDictionary<String, Integer> getHashTable(){
        return dictionary;
    }

    public void printList(){
        System.out.println("List of characters:\n");
        for(Character c : list){
            if(c != null){
                c.printCharacter();
            } else{
                System.out.println("null\n");
            }
        }
        System.out.println("End of list.\n\n\n");

    }
}
