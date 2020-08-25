package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
