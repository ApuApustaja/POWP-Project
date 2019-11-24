package entities.components;

public class ManufactureComponent extends EntityComponent {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
