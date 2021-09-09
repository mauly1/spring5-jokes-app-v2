package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonScopeBean {
    public SingletonScopeBean() {
        System.out.println("Creating a single ton bean");
    }

    public String getMyScope(){
    return "I am Single ton bean";
    }
}
