package factory.entities.components;

import factory.entities.factories.Entity;

import java.util.ArrayList;
import java.util.List;

public class FactoryComponent extends EntityComponent {
    private String name;
    private long id;
    private List lines;

    public long getId() {
        return id;
    }

    public List<Entity> getLines() {
        return lines;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FactoryComponent(String name, long id) {
        this.name = name;
        this.id = id;
        lines = new ArrayList();
    }
    public void addLine(Entity line){
        lines.add(line);
    }
}
