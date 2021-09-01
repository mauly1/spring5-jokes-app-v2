package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.LifeCycleDemoBean;
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
    }

}
