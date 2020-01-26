package factory.entities.manager;

import factory.entities.components.EntityComponent;
import factory.entities.factories.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EntityManager implements Serializable, Cloneable {

  private static volatile EntityManager INSTANCE = null;
  private List<Entity> entityList;
  private EntityManager() {
    if (INSTANCE != null) {
      throw new RuntimeException("Cannot instantiate single object using constructor. Use getInstance() method");
    }
  }

  public List<Entity> getAllEntities() {
    return entityList;
  }

  public List<Entity> getEntitiesWithComponent(Class<? extends EntityComponent> component){
    ArrayList<Entity> list = new ArrayList<>();
    for(Entity entity: entityList){
      if(entity.haveComponent(component)) list.add(entity);
    }
    return list;
  }
  public List<EntityComponent> getEntitiesComponent(Class<? extends EntityComponent> component){
    ArrayList<EntityComponent> list = new ArrayList<>();
    for(Entity entity: entityList){
      if(entity.haveComponent(component)) list.add(entity.getComponent(component));
    }
    return list;
  }
  public void addEntity(Entity entity){
    entityList.add(entity);
  }
  public static EntityManager getInstance() {

    if (INSTANCE == null) {
      synchronized (EntityManager.class) {
        if (INSTANCE == null) {
          INSTANCE = new EntityManager();
          INSTANCE.entityList = new ArrayList();
        }
      }
    }
    return INSTANCE;
  }

  public Object readResolve() {
    return EntityManager.getInstance();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}