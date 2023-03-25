package classes;

public class pets {
    // Make the variables for the class
    private String name;
    private String type;
    private String race;

    //All code for the class, no variables
    public pets(String name, String type, String race) {
        this.name = name;
        this.type = type;
        this.race = race;
    }

    // getters y setters para los atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
