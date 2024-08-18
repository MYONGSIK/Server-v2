plugins {
    idea
}

dependencies {
    implementation(project(":jpa"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //swagger
    implementation ("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
}

tasks.register("prepareKotlinBuildScriptModel") {}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}
