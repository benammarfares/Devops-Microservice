pipeline {
    options {
        skipDefaultCheckout true
    }
    agent none
    stages {


        stage('Build Config Server') {
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
                    env.VERSION = pom.version
                  }
               }
            }
        }
            stage('Build Docker Image') {
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
        FROM openjdk
        EXPOSE 8888
        COPY /configServer/target/configServer-${env.VERSION}.jar configServer-${env.VERSION}.jar
        ENTRYPOINT ["java", "-jar", "configServer-${env.VERSION}.jar"]
        """
                  writeFile file: 'Dockerfile', text: dockerFile

                  def dockerImage = docker.build("fares121/${service}:${env.VERSION}", "-f Dockerfile .")

                  withCredentials([usernamePassword(credentialsId: 'Docker', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh 'echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
                    dockerImage.push()
                  }
                }
              }
            }

    }
}