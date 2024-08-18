package com.jpa.domain.global.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.jpa.domain.repository"])
@EntityScan(basePackages = ["com.jpa"])
class JpaConfig {
}