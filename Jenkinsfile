def getDockerTag() {
    def tag = sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
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
            steps {
                script {
                    dir('assurancePolicy') {
                        sh "mvn clean package -DskipTests"
                    }
                }
            }
        }

        stage('Build gateway') {
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
                    sh 'docker build . -t fares121/configServer:$Docker_tag'
                    withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
                        sh 'docker login -u fares121 -p ${docker_password}'
                        sh 'docker push fares121/${service}:${env.Docker_tag}'
                    }
                }
            }
        }
    }
}