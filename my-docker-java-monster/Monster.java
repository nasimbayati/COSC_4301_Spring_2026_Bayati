public class Monster {

    private String name;
    private String type;
	private String description;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
        this.description = "The monster, \"" + name + "\", with the type \"" + type + "\" is from the Neon Ark training program.";
        System.out.println("Your monster has been created.");
    }

    public String getDescription() {
        return description;
    }
}
