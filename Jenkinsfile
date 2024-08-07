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
            agent {
                docker {
                    image 'maven'
                    args '-u root -v $HOME/.m2:/root/.m2'
                }
            }
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