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
        checkout scm
        dir('configServer') {
          sh "pwd"
          sh "find . -name Dockerfile"
          sh "ls -l"
          sh 'mvn clean install'
        }
      }
    }

    stage('Build and push Docker image') {
        agent {
            docker {
                image 'docker'
                args '-u root -v /var/run/docker.sock:/var/run/docker.sock'
            }
        }
      steps {
        script {
          def service = "configserver"
          sh "docker build -t fares121/${service}:${env.VERSION} configServer"
          withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
            sh 'docker login -u fares121 -p ${docker_password}'
            sh 'docker push fares121/${service}:${env.VERSION}'
          }
        }
      }
    }
  }
}