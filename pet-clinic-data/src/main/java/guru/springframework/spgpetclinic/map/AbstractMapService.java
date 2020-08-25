package guru.springframework.spgpetclinic.map;

import guru.springframework.spgpetclinic.services.CrudService;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
	protected Map<ID, T> map = new LinkedHashMap<>();

	public Iterable<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(ID id, T value) {
		return map.put(id, value);
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(o -> Objects.equals(o.getValue(), object));
	}
}
