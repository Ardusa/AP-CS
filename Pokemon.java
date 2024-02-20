import java.util.Random;

public class Pokemon {
    private String name;
    private int hp;
    private String bestAttack;

    public Pokemon() {
        name = "";
        hp = 0;
    }

    public Pokemon(String name, String bestAttack, int hp) {
        this.name = name;
        this.hp = hp;
        this.bestAttack = bestAttack;
    }

    public double getHitPoints() {
        return hp;
    }

    public void battle() {
        int damage = new Random().nextInt(31) + 20;
        hp -= damage;
        System.out.println(name + " got hit for " + damage + " hitpoints!");
    }
    
    public boolean knockedOut() {
        return hp <= 0;
    }

    public String getBestAttack() {
        return bestAttack;
    }

    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander", "Blaze", 39);

        System.out.println("Charmander has " + charmander.getHitPoints() + " hitpoints.");
        charmander.battle();
        System.out.println("Charmander has " + charmander.getHitPoints() + " hitpoints.");
        System.out.println("Charmander is knocked out: " + charmander.knockedOut());
        charmander.battle();
        System.out.println("Charmander is knocked out: " + charmander.knockedOut());

        Pokemon abra = new Pokemon();
        abra.getHitPoints();
    }


}
