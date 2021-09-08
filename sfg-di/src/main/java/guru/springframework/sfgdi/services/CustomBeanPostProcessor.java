package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws org.springframework.beans.BeansException {
        if (bean instanceof LifeCycleDemoBean) {
            //  ((LifeCycleDemoBean)bean).beforeInit();
            ((LifeCycleDemoBean) bean).setBeanName("newBeanName");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws org.springframework.beans.BeansException {
        return bean;
    }

}
