public class MarvelCharacter {
    private String name, power;
    private int comicsAppeared;

    public MarvelCharacter() {
        name = "";
        power = "";
        comicsAppeared = 0;
    }

    public MarvelCharacter(String name, String power, int comicsAppeared) {
        this.name = name;
        this.power = power;
        this.comicsAppeared = comicsAppeared;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getComicsAppeared() {
        return comicsAppeared;
    }

    public void addPower(String newPower) {
        power += ", " + newPower;
    }

    public void setComicsAppeared(int comicsAppeared) {
        this.comicsAppeared = comicsAppeared;
    }

    public int randComic() {
        return (int) (Math.random() * comicsAppeared) + 1;
    }

    public static void main(String[] args) {
        // MarvelCharacter avenger1 = new MarvelCharacter();
        MarvelCharacter spiderMan = new MarvelCharacter("Spider-Man", "webbing projection", 300);
        MarvelCharacter symbiote = new MarvelCharacter("Venom", "shapeshifting", 144);
        System.out.println(symbiote.getName());
        symbiote.addPower(spiderMan.getPower());
        spiderMan.setComicsAppeared(spiderMan.getComicsAppeared() + 1);
        int symbioteComic = symbiote.randComic();
        System.out.println(symbioteComic);

        MarvelCharacter blueBatman = new MarvelCharacter("Blue Batman", "Laser Vision", 5);
        System.out.println("Marvel Character Name: " + blueBatman.name);
        System.out.println("Marvel Character Power: " + blueBatman.power);
        System.out.println("Marvel Character Comics Appeared: " + blueBatman.comicsAppeared);
        blueBatman.addPower("Hearing");
        blueBatman.setComicsAppeared(blueBatman.getComicsAppeared() + 2);
        System.out.println("Marvel Character Name: " + blueBatman.name);
        System.out.println("Marvel Character Power: " + blueBatman.power);
        System.out.println("Marvel Character Comics Appeared: " + blueBatman.comicsAppeared);
    }
}