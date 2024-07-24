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
                        sh "mvn compiler:compile"
                        sh "mvn clean package -DskipTests"
                        sh "pwd"
                        sh "find . -name Dockerfile"
                        sh "ls -l"
                    }
                    sh 'cd ..'
                }
            }
        }

        stage('Build discoveryServer') {
            steps {
                script {
                    dir('discorveryServer') {
                        sh "mvn clean install -DskipTests"
                    }
                    sh 'cd ..'
                }
            }
        }

        stage('Build assurance') {
            steps {
                script {
                    dir('assurance') {
                        sh "mvn clean install -DskipTests"
                    }
                    sh 'cd ..'
                }
            }
        }

        stage('Build assurancePolicy') {
            steps {
                script {
                    dir('assurancePolicy') {
                        sh "mvn clean install -DskipTests"
                    }
                    sh 'cd ..'
                }
            }
        }

        stage('Build gateway') {
            steps {
                script {
                    dir('gateway') {

                        sh "mvn clean install  -DskipTests"
                    }
                    sh 'cd ..'
                }
            }
        }
    }
}