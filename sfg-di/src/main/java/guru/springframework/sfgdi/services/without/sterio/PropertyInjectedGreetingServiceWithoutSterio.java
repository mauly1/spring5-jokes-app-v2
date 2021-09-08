package guru.springframework.sfgdi.services.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedGreetingServiceWithoutSterio implements GreetingService {
    @Override
    public String sayGreeting() {
        return " property With out Sterio --Hello World !! -- Property";
    }
}
