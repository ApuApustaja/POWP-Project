import entities.Entity;
import entities.components.EntityComponent;
import entities.components.ManufactureComponent;

public class Application {

  public static void main(String[] args) {
      Entity entity = new Entity();
      entity.addComponent(new ManufactureComponent());
      EntityComponent component = entity.getComponent(ManufactureComponent.class);
      ((ManufactureComponent) component).setName("name");
      System.out.println(((ManufactureComponent) component).getName());
  }
}
