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
        stages {
            stage('Build') {
                when {
                    branch 'main'
                }
                steps {
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'githubtoken', url: 'https://github.com/benammarfares/Assurance-MicroService.git']])
                    sh 'mvn clean install'
                     dir('configServer') {
                            sh 'mvn clean install'
                     }
                }
            }





    }
}
