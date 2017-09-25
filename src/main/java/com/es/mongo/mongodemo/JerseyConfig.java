package com.es.mongo.mongodemo;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ClassUtils;

import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;
import java.util.Set;
import java.util.stream.Collectors;


@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        this.configureEndpoints();
    }


    /**
     * Configures the package scanning for all api resource components
     */
    public void configureEndpoints() {
        String packageBase= this.getClass().getPackage().getName() + ".api";
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        scanner.addIncludeFilter(new AnnotationTypeFilter(Provider.class));
        scanner.addIncludeFilter(new AnnotationTypeFilter(Path.class));
        Set<Class<?>> classes = scanner.findCandidateComponents(packageBase).stream()
                .map(bean -> ClassUtils.resolveClassName(bean.getBeanClassName(), getClassLoader()))
                .collect(Collectors.toSet());
        this.registerClasses(classes);

    }


}

