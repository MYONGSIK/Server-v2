plugins {
    idea
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //mysql
    implementation("mysql:mysql-connector-java:8.0.33")
    //swagger
    implementation ("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
}
