public class Character {
    private String name;
    private double height;
    private double weight;
    private double morals;
    private double health;

    //init character
    public Character(String name, double height, double weight, double morals) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.morals = morals;
        this.health = 1;
    }
    //getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public double getMorals() {
        return morals;
    }
    public double getHealth() {
        return health;
    }

    //add health
    public void heal(double amount){
        health += amount;
    }

    //remove health
    public void injure(double amount){
        health -= amount;
    }

    //add or remove morality
    public void change(double amount){
        morals += amount;
    }

    //print all line by line
    public void printCharacter(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Morals: " + morals + "\n");
    }
}
