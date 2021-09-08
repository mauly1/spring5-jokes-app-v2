package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.controllers.without.sterio.ConstructorInjectedControllerWithoutSterio;
import guru.springframework.sfgdi.controllers.without.sterio.PropertyInjectedControllerWithoutSterio;
import guru.springframework.sfgdi.controllers.without.sterio.SetterInjectedControllerWithoutSterio;
import guru.springframework.sfgdi.services.LifeCycleDemoBean;
import guru.springframework.sfgdi.services.without.sterio.PropertyInjectedGreetingServiceWithoutSterio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
        LifeCycleDemoBean lifeCycleDemoBean = (LifeCycleDemoBean) applicationContext.getBean("lifeCycleDemoBean");
        System.out.println("--------------lifeCycleDemoBean initialization-------------------");



        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println("--------------I18nController-------------------");
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println(i18nController.sayHello());



        System.out.println("--------------Primary Service Qualifier-------------------");
        System.out.println(myController.sayHello());
        System.out.println("--------------PropertyInjectedController-------------------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)
                applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-----------------SetterInjectedController----------------");

        SetterInjectedController setterInjectedController = (SetterInjectedController)
                applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());


        System.out.println("--------------ConstructorInjectedController-------------------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)
                applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>--------------<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("--------------PropertyInjectedControllerWithoutSterio-------------------");

        PropertyInjectedControllerWithoutSterio propertyInjectedControllerWithoutSterio = (PropertyInjectedControllerWithoutSterio)
                applicationContext.getBean("propertyInjectedControllerWithoutSterio");
        System.out.println(propertyInjectedControllerWithoutSterio.getGreeting());

       System.out.println("-----------------SetterInjectedControllerWithoutSterio----------------");

        SetterInjectedControllerWithoutSterio setterInjectedControllerWithoutSterio = (SetterInjectedControllerWithoutSterio)
                applicationContext.getBean("setterInjectedControllerWithoutSterio");
        System.out.println(setterInjectedControllerWithoutSterio.getGreeting());


        System.out.println("--------------ConstructorInjectedController-------------------");

        ConstructorInjectedControllerWithoutSterio constructorInjectedControllerWithoutSterio = (ConstructorInjectedControllerWithoutSterio)
                applicationContext.getBean("constructorInjectedControllerWithoutSterio");
        System.out.println(constructorInjectedControllerWithoutSterio.getGreeting());
    }

}
