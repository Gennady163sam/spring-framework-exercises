package com.bobocode.config;

import com.bobocode.TestDataGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * This class application context configuration.
 * <p>
 * todo: make this class a Spring configuration class
 * todo: enable component scanning for dao and service packages
 * todo: provide explicit configuration for a bean of type {@link TestDataGenerator} with name "dataGenerator" in this class.
 * todo: Don't specify bean name "dataGenerator" explicitly
 */

@Configuration
@Component
public class AppConfig {

}
