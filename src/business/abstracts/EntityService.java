package business.abstracts;

import java.util.List;

public interface EntityService<T>  {
    public T getByName(String name);
    public List<T> getAll();
    public boolean add(T t);
    public boolean delete(String name);
}
