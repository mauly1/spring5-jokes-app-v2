package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.controllers.without.sterio.PrimaryGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.factory.PetServiceFactory;
import guru.springframework.sfgdi.pets.DogPetService;
import guru.springframework.sfgdi.pets.PetService;
import guru.springframework.sfgdi.services.without.sterio.ConstructorGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.services.without.sterio.PropertyInjectedGreetingServiceWithoutSterio;
import guru.springframework.sfgdi.services.without.sterio.SetterInjectedGreetingServiceWithoutSterio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

//@PropertySource("classpath:datasource.properties")
/**
 *  this will help to bind SfgConstructorConfig file in configuration.
 */
@EnableConfigurationProperties(SfgConstructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration


public class GreetingServiceConfig {
    /**
     *  parsing yml file values
     * @return
     */
 /*   @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                  @Value("${guru.password}") String password,
                                  @Value("${guru.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }*/

    /**
     * binding yml property directly in sfgConfiguration file then pass sfgConfiguration object inside FakedataSource
     * @param sfgConstructorConfig
     * @return
     */
/*    @Bean
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getUsername());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
        return fakeDataSource;
    }*/

    /**
     * below method will used to populate YML data in SfgConstructor properties.
     * @param sfgConstructorConfig
     * @return
     */
    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
        fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
        fakeDataSource.setJdbcurl(sfgConstructorConfig.getJdbcurl());
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService DogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService CatPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    //  @Bean
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
    PrimaryGreetingServiceWithoutSterio primaryGreetingServiceWithoutSterio() {
        return new PrimaryGreetingServiceWithoutSterio();
    }
}
