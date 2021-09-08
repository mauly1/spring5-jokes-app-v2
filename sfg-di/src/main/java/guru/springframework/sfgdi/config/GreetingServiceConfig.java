package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.controllers.without.sterio.PrimaryGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.services.without.sterio.ConstructorGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.services.without.sterio.PropertyInjectedGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.services.without.sterio.SetterInjectedGreetingServiceWithoutSterio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingServiceWithoutSterio constructorGreetingServiceWithoutSterio() {
        return new ConstructorGreetingServiceWithoutSterio();
    }

    @Bean
    PropertyInjectedGreetingServiceWithoutSterio propertyInjectedGreetingServiceWithoutSterio() {
        return new PropertyInjectedGreetingServiceWithoutSterio();
    }

    @Bean
    SetterInjectedGreetingServiceWithoutSterio setterInjectedGreetingServiceWithoutSterio() {
        return new SetterInjectedGreetingServiceWithoutSterio();
    }
    @Primary
    @Bean
    PrimaryGreetingServiceWithoutSterio  primaryGreetingServiceWithoutSterio(){
        return new PrimaryGreetingServiceWithoutSterio();
    }
}
