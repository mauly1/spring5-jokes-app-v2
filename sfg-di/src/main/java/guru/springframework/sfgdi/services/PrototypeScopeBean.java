package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeScopeBean {
    public PrototypeScopeBean() {
        System.out.println("Creating a proto type bean");
    }

    public String getMyScope() {
        return "I am prototype bean";
    }
}

