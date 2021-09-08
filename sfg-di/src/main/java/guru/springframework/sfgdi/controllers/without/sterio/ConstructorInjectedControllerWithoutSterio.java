package guru.springframework.sfgdi.controllers.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedControllerWithoutSterio {

    @Autowired
    @Qualifier("constructorGreetingServiceWithoutSterio")
    private final GreetingService greetingService;

    public ConstructorInjectedControllerWithoutSterio(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
