public class Monster {

    private String name;
    private String type;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getDescription() {
        return "The monster, \"" + name + "\", with the type \"" + type + "\" is from the Neon Ark training program.";
    }
}
