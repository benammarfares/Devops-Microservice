pipeline {
  options {
    skipDefaultCheckout true
  }
    agent {
        docker {
            image 'maven'
            args '-u root -v $HOME/.m2:/root/.m2'
        }
    }

    stages {
        stage('Build configServer') {
            steps {
                script {
                    dir('configServer') {
                        sh "pwd"
                        sh "find . -name Dockerfile"
                        sh "ls -l"
                        sh 'mvn clean install -DskipTests'
                    }
                    sh 'cd ..'
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
                        sh "docker build -t configServer.jar ."
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