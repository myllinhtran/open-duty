package com.openduty.spring.springboot.actuator;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.config.MeterFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Lazy
@Component
public class ActuatorConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MeterRegistry meterRegistry;

    @Bean
    DataSourceStatusProbe dataSourceStatusProbe(DataSource dataSource) {
        return new DataSourceStatusProbe(dataSource);
    }
}
