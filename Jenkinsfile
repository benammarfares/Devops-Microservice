pipeline {
    options {
        skipDefaultCheckout true
    }
        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }

            stage('Build Config Server') {
                agent {
                    docker {
                        image 'maven'
                        args '-u root -v $HOME/.m2:/root/.m2'
                    }
                }
                script {
                    dir('configServer') {
                        sh "pwd"
                        sh "find . -name Dockerfile"
                        sh "ls -l"
                        sh "mvn clean install -DskipTests"
                        def pom = readMavenPom file:'pom.xml'
                        print pom.version
                        env.VERSION = pom.version
                        print env.VERSION

                    }
                }
            }







        }
}
