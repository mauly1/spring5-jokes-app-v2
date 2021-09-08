package guru.springframework.sfgdi.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return ">>>>>>>>>>>>>>??????? coming from English greeting repository";
    }
}
