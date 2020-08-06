package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
