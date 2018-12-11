package com.bobocode.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.ComponentScan.*;

/**
 * This class provides application root (non-web) configuration.
 * <p>
 * todo: mark this class as config
 * todo: enable component scanning for all packages in "com.bobocode"
 * todo: ignore all web related config and beans (ignore @{@link Controller}, ignore {@link EnableWebMvc}) using exclude filter
 */
@Configuration
@ComponentScan(value = "com.bobocode",excludeFilters = {@Filter(Controller.class), @Filter(EnableWebMvc.class)})
public class RootConfig {
}
