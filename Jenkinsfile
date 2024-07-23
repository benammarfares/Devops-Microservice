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
                        sh "mvn clean install -DskipTests"
                        def pom = readMavenPom file:'pom.xml'
                        print pom.version
                        env.version = pom.version
                    }
                }
            }
        }

        stage('Build discoveryServer') {
            steps {
                script {
                    dir('discorveryServer') {
                        sh "mvn clean install -DskipTests"
                    }
                }
            }
        }

        stage('Build assurance') {
            steps {
                script {
                    dir('assurance') {
                        sh "mvn clean install -DskipTests"
                    }
                }
            }
        }

        stage('Build assurancePolicy') {
            steps {
                script {
                    dir('assurancePolicy') {
                        sh "mvn clean install -DskipTests"
                    }
                }
            }
        }

        stage('Build gateway') {
            steps {
                script {
                    dir('gateway') {
                        sh "mvn clean install -DskipTests"
                    }
                }
            }
        }

        stage('Docker Build and Push') {
            agent {
                docker {
                    image 'docker'
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                script {
                    dir('configServer') {
                        def service = "configserver"
                        sh "docker build -t fares121/${service}:${env.version} ."
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