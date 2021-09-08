package guru.springframework.sfgdi.pets;


public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are best Pet";
    }
}
