def getDockerTag() {
    def tag = sh script: 'git rev-parse HEAD', returnStdout: true
    return tag
}
pipeline {
agent any
  options {
    skipDefaultCheckout true
  }
      environment {
          Docker_tag = getDockerTag()
      }

    stages {

                stage('Build configServer') {
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

                            }
                        }
                    }
                }
                stage('Build discoveryServer') {
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

                            }
                        }
                    }
                }
                stage('Build assurance') {
                agent {
                    docker {
                        image 'maven'
                        args '-u root -v $HOME/.m2:/root/.m2'
                    }
                }
                    steps {
                        script {
                            dir('assurance') {

                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build assurancePolicy') {
                agent {
                    docker {
                        image 'maven'
                        args '-u root -v $HOME/.m2:/root/.m2'
                    }
                }
                    steps {
                        script {
                            dir('assurancePolicy') {

                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build gateway') {
                agent {
                    docker {
                        image 'maven'
                        args '-u root -v $HOME/.m2:/root/.m2'
                    }
                }
                    steps {
                        script {
                            dir('gateway') {

                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Docker Build and Push') {
                    steps {
                        script {
                            buildAndPushDockerImage('configServer')
                        }
                    }
                }
    }


    def buildAndPushDockerImage(String service) {
    sh "docker build -t fares121/${service}:${env.Docker_tag} ."
    withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
        sh 'docker login -u fares121 -p ${docker_password}'
        sh 'docker push fares121/${service}:${env.Docker_tag}'
    }
    }
}