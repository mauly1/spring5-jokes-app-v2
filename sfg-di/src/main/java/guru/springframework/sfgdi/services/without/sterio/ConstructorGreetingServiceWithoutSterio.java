package guru.springframework.sfgdi.services.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;


public class ConstructorGreetingServiceWithoutSterio implements GreetingService {
    @Override
    public String sayGreeting() {
        return "constructor with out sterio Hello World !! -- Constructor";
    }
}
