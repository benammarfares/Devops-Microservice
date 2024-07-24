pipeline {
  agent any
  options {
    skipDefaultCheckout true
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
          def dockerImage = docker.build("fares121/${service}:${env.VERSION}", "-f - configServer")
          withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
            sh 'docker login -u fares121 -p ${docker_password}'
            dockerImage.push()
          }
        }
      }
    }
  }
}