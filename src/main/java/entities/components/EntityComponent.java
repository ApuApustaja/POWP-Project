package entities.components;

import entities.Entity;

public class EntityComponent {
  protected Entity entity;

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public Entity getEntity() {
    return entity;
  }
}
