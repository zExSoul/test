package com.ddd.example.core.core.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author xuyifan
 * Date on 8/11/2018 12:04 AM
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.ddd.example.core.core"})
public class CoreConfigContext {


}
