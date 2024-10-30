public class Character {
    private String name;
    private double height;
    private double weight;
    private double morals;
    private double health;

    public Character(String name, double height, double weight, double morals) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.morals = morals;
        this.health = 1;
    }
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


    public void heal(double amount){
        health += amount;
    }

    public void injure(double amount){
        health -= amount;
    }
    public void change(double amount){
        morals += amount;
    }
    public void printCharacter(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Morals: " + morals);
    }
}
