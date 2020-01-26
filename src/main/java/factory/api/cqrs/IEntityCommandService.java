package factory.api.cqrs;


import factory.entities.factories.Entity;

public interface IEntityCommandService {
    public void update(long id, String param, Object value);
    public void insert(Entity entity);
}
