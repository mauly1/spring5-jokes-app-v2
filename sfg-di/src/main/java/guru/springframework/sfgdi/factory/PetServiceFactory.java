package guru.springframework.sfgdi.factory;

import guru.springframework.sfgdi.pets.CatPetService;
import guru.springframework.sfgdi.pets.DogPetService;
import guru.springframework.sfgdi.pets.PetService;


public class PetServiceFactory {
    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
