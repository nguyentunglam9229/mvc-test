pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh 'mvn clean package'
            }
        }
        stage('run') {
            steps {
                sh 'java -jar target/mvc-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
