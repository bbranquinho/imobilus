package org.test.imobilus.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.imobilus.utils.AppConfig;

@Configuration
@Import(AppConfig.class)
public class AppTestConfig {
}
