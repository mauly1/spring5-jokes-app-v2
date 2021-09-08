package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World !! -- Property";
    }
}
