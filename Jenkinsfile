pipeline {
    options {
        skipDefaultCheckout true
    }
    agent any
    tools {
      maven "3.9.8"
    }
    stages {
        stage('Build Config Server') {
            steps {
               script {
                  dir('configServer') {
                    sh "mvn clean package -DskipTests"
                    def pom = readMavenPom file:'pom.xml'
                    env.VERSION = pom.version
                  }
               }
            }
        }


        stage('Build Discovery Server') {
            steps {
               script {
                  dir('discorveryServer') {
                    sh "mvn clean package -DskipTests"
                    def pom = readMavenPom file:'pom.xml'
                    env.VERSION = pom.version
                  }
               }
            }
        }

    }
}