pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        def app
        stage('Build') {
            steps {
                println 'Start build!'
                sh 'mvn clean package'
                app = docker.build(".")
                println 'done!'
            }
        }

        stage('Test image') {
             /* Ideally, we would run a test framework against our image.
             * For this example, we're using a Volkswagen-type approach ;-) */

             app.inside {
                sh 'ls -la'
                sh 'curl localhost:9090/health'
             }
        }
    }
}