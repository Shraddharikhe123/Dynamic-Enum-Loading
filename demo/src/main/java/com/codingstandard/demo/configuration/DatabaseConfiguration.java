package com.codingstandard.demo.configuration;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Description This class provides database connection
 * @author Shraddha Rikhe
 * @version 1.8
 * @see <a href=”spec.html#section”>Java Spec</a>
 * @since 04-Feb-2020
 */
@Configuration
public class DatabaseConfiguration {

    /**
     * Description:
     * @param
     * @return SessionFactory object
     * @exception
     * @see
     * @since 04-Feb-2020
     */
    @Bean
    public SessionFactory getArchivedSessionFactory() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration()

                .configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
                applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        return factory;
    }

}

