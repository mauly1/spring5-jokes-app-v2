package guru.springframework.sfgdi.controllers.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingServiceWithoutSterio implements GreetingService {
    @Override
    public String sayGreeting() {
        return "---- primary Bean with out sterio annotation Hello World !! -- Primary";
    }
}
