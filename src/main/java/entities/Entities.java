package entities;

public class Entities {
  public static final Entities INSTANCE = new Entities();

  private Entities() {
    if (INSTANCE != null) {
      throw new IllegalStateException("EntityManager already constructed");
    }
  }
  public static Entities getInstance() {
    return INSTANCE;
  }}
