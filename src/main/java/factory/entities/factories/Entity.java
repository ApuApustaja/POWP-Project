package factory.entities.factories;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import factory.entities.components.EntityComponent;
import factory.entities.manager.EntityManager;

import java.util.HashMap;

@JsonSerialize
public class Entity {
  HashMap<Class<? extends EntityComponent>, EntityComponent> components;

  public Entity() {
    this.components = new HashMap<>();
    EntityManager.getInstance().addEntity(this);
  }

  private HashMap<Class<? extends EntityComponent>, EntityComponent> getComponents() {
    return components;
  }

  public void addComponent(EntityComponent component) {
    component.setEntity(this);
    components.put(component.getClass(), component);
  }

  public EntityComponent getComponent(Class<? extends EntityComponent> componentClass) {
    return components.get(componentClass);
  }

  public void deleteComponent(EntityComponent component) {
    components.remove(component.getClass());
  }

  public boolean haveComponent(Class<? extends EntityComponent> component) {
    if (components.get(component) != null) return true;
    return false;
  }
}
