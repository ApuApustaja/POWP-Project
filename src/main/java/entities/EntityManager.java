package entities;

public class EntityManager {
  public static final EntityManager INSTANCE = new EntityManager();

  private EntityManager() {
    if (INSTANCE != null) {
      throw new IllegalStateException("EntityManager already constructed");
    }
  }
  public static EntityManager getInstance() {
    return INSTANCE;
  }}
