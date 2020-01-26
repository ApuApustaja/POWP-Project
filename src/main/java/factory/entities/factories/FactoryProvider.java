package factory.entities.factories;

public class FactoryProvider {
  public static EntityFactory getFactory(String entityType){
    switch (entityType) {
      case "Factory":
        return new FactoryFactory();
      case "Line":
        return new LineFactory();
      case "Machine":
        return new MachineFactory();
      default:
        return null;
    }
  }
}
