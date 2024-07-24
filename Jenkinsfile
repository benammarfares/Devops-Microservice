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
                    sh "pwd"
                    dir('configServer') {
                        sh "pwd"
                        sh "find . -name Dockerfile"
                        sh "ls -l"
                        sh 'mvn clean install'
                    }
                    sh 'cd ..'


            }
        }

                stage('Build dock') {
                    agent {
                        dockerfile true

                    }
                    steps {
                            sh "pwd"
                            dir('configServer') {
                                def service = "configserver"
                                sh "pwd"
                                sh "docker build -t fares121/${service}:${env.VERSION} ."
                                withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
                                    sh 'docker login -u fares121 -p ${docker_password}'
                                    sh 'docker push fares121/${service}:${env.version}'
                                }
                            }
                            sh 'cd ..'

                    }
                }
    }
}