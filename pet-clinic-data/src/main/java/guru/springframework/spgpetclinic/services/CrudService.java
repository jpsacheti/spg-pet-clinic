package guru.springframework.spgpetclinic.services;

public interface CrudService<T, ID> {
	Iterable<T> findAll();

	T findById(ID id);

	T save(ID id, T type);

	void delete(T type);

	void deleteById(ID id);
}
