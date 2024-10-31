public class Main {
    public static void main(String[] args) {
        CharacterDatabase db = new CharacterDatabase();
        db.addCharacter("FB", 4, 30, 0);
        db.addCharacter("Ea", 1, 20, 0);
        db.addCharacter("Daegon", 2, 25, 0);
        db.addCharacter("Gandalf", 6, 100, 1);
        db.printList();
        db.removeCharacter("Daegon");
        db.printList();
        Character gan = db.getCharacter("Gandalf");
        gan.printCharacter();
        gan.change(-2);
        gan.injure(.5);
        gan.heal(.25);
        gan.printCharacter();
    }
}
