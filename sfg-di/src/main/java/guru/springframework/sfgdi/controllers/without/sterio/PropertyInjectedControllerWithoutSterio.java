package guru.springframework.sfgdi.controllers.without.sterio;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedControllerWithoutSterio {
    @Autowired
    @Qualifier("propertyInjectedGreetingServiceWithoutSterio")
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
