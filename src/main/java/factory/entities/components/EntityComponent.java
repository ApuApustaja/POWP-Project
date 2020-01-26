package factory.entities.components;

import factory.entities.factories.Entity;

public abstract class EntityComponent {
  protected Entity entity;

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public Entity getEntity() {
    return entity;
  }
}
