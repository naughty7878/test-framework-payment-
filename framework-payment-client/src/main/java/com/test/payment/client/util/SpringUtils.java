//package com.test.payment.client.util;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
//@Slf4j
//@Component
//public class SpringUtils implements ApplicationContextAware {
//
//    /**
//     * spring全局配置项
//     */
//    private static ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext context) throws BeansException {
//        if (applicationContext == null) {
//            applicationContext = context;
//            log.info("ApplicationContext init success,you can invoke by SpringUtils.getApplicationContext() to get ApplicationContext,init bean count="
//                    + applicationContext.getBeanDefinitionCount());
//        }
//    }
//
//    /**
//     * @return spring全局配置项
//     */
//    public static ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }
//
//    /**
//     * 通过name获取 Bean.
//     *
//     * @param name
//     * @return
//     */
//    public static <T> T getBean(String name) {
//        return (T) applicationContext.getBean(name);
//    }
//
//    /**
//     * 通过class获取Bean.
//     *
//     * @param clazz
//     * @return
//     */
//    public static <T> T getBean(Class<T> clazz) {
//        return applicationContext.getBean(clazz);
//    }
//
//    /**
//     * 通过name,以及Clazz返回指定的Bean
//     *
//     * @param name
//     * @param clazz
//     * @return
//     */
//    public static <T> T getBean(String name, Class<T> clazz) {
//        return applicationContext.getBean(name, clazz);
//    }
//
//    /**
//     * 获取实现相关接口的类关系
//     *
//     * @param clazz
//     * @return
//     */
//    public static <T> Map<String, T> getBeansOfType(Class<T> clazz) {
//        return applicationContext.getBeansOfType(clazz);
//    }
//
//    /**
//     * 发布事件
//     *
//     * @param event
//     */
//    public static void publishEvent(ApplicationEvent event) {
//        applicationContext.publishEvent(event);
//    }
//
//    /**
//     * 获取环境信息
//     */
//    public static Environment getEnvironment() {
//        return applicationContext.getEnvironment();
//    }
//}