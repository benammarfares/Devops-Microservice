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
        stage('Build Other Microservices') {
            parallel {
                stage('Build configServer') {
                    steps {
                        script {
                            dir('configServer') {
                                withSonarQubeEnv('sonarserver') {
                                    sh 'mvn sonar:sonar'
                                }
                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build discoveryServer') {
                    steps {
                        script {
                            dir('discorveryServer') {
                                withSonarQubeEnv('sonarserver') {
                                    sh 'mvn sonar:sonar'
                                }
                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build assurance') {
                    steps {
                        script {
                            dir('assurance') {
                                withSonarQubeEnv('sonarserver') {
                                    sh 'mvn sonar:sonar'
                                }
                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build assurancePolicy') {
                    steps {
                        script {
                            dir('assurancePolicy') {
                                withSonarQubeEnv('sonarserver') {
                                    sh 'mvn sonar:sonar'
                                }
                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
                stage('Build gateway') {
                    steps {
                        script {
                            dir('gateway') {
                                withSonarQubeEnv('sonarserver') {
                                    sh 'mvn sonar:sonar'
                                }
                                sh "mvn clean package -DskipTests"

                            }
                        }
                    }
                }
            }
        }

    }
}