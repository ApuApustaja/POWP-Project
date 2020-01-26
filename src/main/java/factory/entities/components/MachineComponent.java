package factory.entities.components;

import java.util.HashMap;
import java.util.Map;

public class MachineComponent extends EntityComponent {
  private String name;
  private long id;
  private Map<String,Object> params;

  public Map<String, Object> getParams() {
    return params;
  }

  public MachineComponent(String name, long id) {
    this.name = name;
    this.id = id;
    params = new HashMap<>();

  }
  public void addParam(String paramName,Object param){
    params.put(paramName,param);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
