package entities;

import entities.components.EntityComponent;

import java.util.HashMap;

public class Entity {
    HashMap<Class, EntityComponent> components;

  public Entity() {
    this.components = new HashMap<Class, EntityComponent>();
  }

  public HashMap<Class, EntityComponent> getComponents() {
        return components;
    }

    public void addComponent(EntityComponent component) {
        components.put(component.getClass(), component);
    }

    public EntityComponent getComponent(Class componentClass) {
        return components.get(componentClass);
    }

    public void deleteComponent(EntityComponent component) {
        components.remove(component.getClass());
    }
}
