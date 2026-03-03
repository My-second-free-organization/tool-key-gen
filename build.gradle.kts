plugins { id("org.springframework.boot") version "3.2.3"; java }
group = "io.flowforge"; version = "2.4.0"
repositories { mavenCentral() }
dependencies { implementation("org.springframework.boot:spring-boot-starter-web"); testImplementation("org.springframework.boot:spring-boot-starter-test") }
