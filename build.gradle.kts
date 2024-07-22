allprojects {

    group = "dev.mina1316.kotlinutil.di"
    version = "0.0.1"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}