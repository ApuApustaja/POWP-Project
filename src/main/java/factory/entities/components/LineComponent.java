package factory.entities.components;

import factory.entities.factories.Entity;

import java.util.ArrayList;
import java.util.List;

public class LineComponent extends EntityComponent {
  private String name;
  private long id;
  private List machines;

  public String getName() {
    return name;
  }

  public LineComponent(String name, long id) {
    this.name = name;
    this.id = id;
    machines = new ArrayList();
  }

  public List<Entity> getMachines() {
    return machines;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void addMachine(Entity entity){
    if(entity.haveComponent(MachineComponent.class)) machines.add(entity);
  }

}
