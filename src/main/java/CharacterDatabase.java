import java.util.ArrayList;


public class CharacterDatabase {
    HashedDictionary dictionary;
    ArrayList<Character> list;
    int position = 0;

    //init database
    public CharacterDatabase() {
        dictionary = new HashedDictionary();
        list = new ArrayList<Character>();
    }

    public void addCharacter(String name, int height, int weight, double moralAlign){
        //adds name as key and position as value
        dictionary.add(name, position);
        //position grows incrementally by 1
        list.add(position, new Character(name, height, weight, moralAlign));
        position++;
    }

    public void removeCharacter(String name){
        //index on list retrieved from dictionary using name as a key
        int index = (int) dictionary.getValue(name);
        //list position set to null to keep other entries correct
        list.set(index, null);
    }

    public Character getCharacter(String name){
        //index on list retrieved from dictionary using name as a key
        int index = (int) dictionary.getValue(name);
        //returns character object from indexed position on list.
        return list.get(index);
    }

    //returns dictionary
    public HashedDictionary<String, Integer> getHashTable(){
        return dictionary;
    }

    //prints all characters in list
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
