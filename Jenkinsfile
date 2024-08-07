pipeline {
    options {
        skipDefaultCheckout true
    }
    agent none
    tools {
      maven "3.9.8"
    }
    stages {
        stage('Build Config Server') {
        agent any
            steps {
                script {
                    sh "pwd"
                    sh "ls -la"
                    dir("configServer") {
                      sh 'mvn clean package -DskipTests'
                    }
                }
            }
        }
            stage('Build Assurance Docker Image') {
                agent {
                    docker {
                        image 'docker'
                        args '-u root -v /var/run/docker.sock:/var/run/docker.sock'
                    }
                }
              steps {
                script {
                  def service = "configserver"
                  def dockerFile = """
        FROM openjdk:17
        COPY /configServer/target/configServer-${env.VERSION}.jar configServer-${env.VERSION}.jar
        ENTRYPOINT ["java", "-jar", "configServer-${env.VERSION}.jar"]
        """
                  writeFile file: 'Dockerfile', text: dockerFile

                  def dockerImage = docker.build("fares121/${service}:${env.VERSION}", "-f Dockerfile .")

                  withCredentials([string(credentialsId: 'Docker', variable: 'docker_password')]) {
                    sh 'docker login -u fares121 -p ${docker_password}'
                    dockerImage.push()

                  }
                }
              }
            }
    }
}
