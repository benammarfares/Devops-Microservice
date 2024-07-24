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
                        env.VERSION = pom.version
                        print env.VERSION

                    }
                }
            }
        }




    }
}