grails.project.work.dir = 'target'

grails.project.dependency.resolution = {
    inherits 'global'
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'com.rabbitmq:amqp-client:3.4.3'
        test 'org.mockito:mockito-all:1.10.19', {
            export = false
        }
    }

    plugins {
        build ":release:2.2.1", {
            export = false
        }
    }
}
