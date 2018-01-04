package dao;

public interface CrudDao<T> {

    /**
     * @return created entity.
     */
    T save (T entity);

    /**
     * @return updated entity.
     */
    T update(T entity);

    /**
     * delete entity by given id.
     */
    T delete(T entity);
}
