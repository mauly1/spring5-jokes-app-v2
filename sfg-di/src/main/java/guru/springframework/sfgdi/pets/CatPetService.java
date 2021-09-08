package guru.springframework.sfgdi.pets;

public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cat are best pet";
    }
}
