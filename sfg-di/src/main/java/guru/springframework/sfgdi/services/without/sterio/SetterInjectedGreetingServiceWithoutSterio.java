package guru.springframework.sfgdi.services.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;


public class SetterInjectedGreetingServiceWithoutSterio implements GreetingService {
    @Override
    public String sayGreeting() {
        return "----setter without sterio Hello World !! -- Setter";
    }
}
