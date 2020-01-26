package factory.api.cqrs;

import factory.entities.components.EntityComponent;
import org.springframework.stereotype.Component;

import java.util.List;
public interface IEntityQueryService {
  List<EntityComponent> getAll();

  List<EntityComponent> getById(long id);
}
