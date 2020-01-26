package factory.entities.factories.builder;

import factory.entities.components.EntityComponent;
import factory.entities.factories.Entity;

import java.util.ArrayList;

public class EntityBuilder implements AddComponent {
  public static EntityBuilder builder(){
    return new EntityBuilder();
  }
/*  private long id;
  private String name;*/
  private ArrayList<EntityComponent> components = new ArrayList<>();

  @Override
  public EntityBuilder addComponent(EntityComponent component) {
    components.add(component);
    return this;
  }

  @Override
  public Entity build() {
   Entity entity = new Entity();
   for(EntityComponent component:components){
     entity.addComponent(component);
   }
   return entity;
  }

 /* @Override
  public EntityBuilder ID(long id) {
    this.id = id;
    return this;
  }

  @Override
  public EntityBuilder name(String name) {
    this.name = name;
    return this;
  }*/
}
