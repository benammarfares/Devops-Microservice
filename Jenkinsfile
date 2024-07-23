pipeline {
  agent none
    options {
        skipDefaultCheckout true
    }
    stages {
        stage('Build configServer') {
            agent {
                docker {
                    image 'maven'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                script {
                    dir('configServer') {
                        sh "mvn clean install -DskipTests"
                        def pom = readMavenPom file:'pom.xml'
                        print pom.version
                        env.VERSION = pom.version
                        print env.VERSION

                    }
                }
            }
        }

        stage('Docker Build and Push') {
            agent {
                docker {
                    image 'docker'
                    args '-u root -v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                script {
                    def service = "configserver"
                    dir('configServer') {
                        sh "ls -l"
                        sh "docker build -t fares121/${service}:${env.VERSION} ."
                        withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
                            sh 'docker login -u fares121 -p ${docker_password}'
                            sh 'docker push fares121/${service}:${env.version}'
                        }
                    }
                }
            }
        }


    }
}