package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## inside LifeCycle Bean Constructor..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The life cycle has been terminated..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The life cycle bean has its own properties..");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is : " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set");
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("## Post Construct has been set");
    }

    @PreDestroy
    private void shutdown() {
        System.out.println("Shutdown All Resources");
    }

}
