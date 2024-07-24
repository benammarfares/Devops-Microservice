pipeline {
    options {
        skipDefaultCheckout true
    }
    agent none

    stages {


        stage('Build Config Server') {
            agent {
                docker {
                    image 'maven'
                    args '-u root -v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                dir('configServer') {
                        sh "mvn clean install -DskipTests"

                }
            }
        }

    }
}