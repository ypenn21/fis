pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                println 'Start build!'
                sh 'mvn clean package'
                def app = docker.build(".")
                println 'done!'

                             app.inside {
                                sh 'ls -la'
                                sh 'curl localhost:9090/health'
                             }
            }
        }

    }
}