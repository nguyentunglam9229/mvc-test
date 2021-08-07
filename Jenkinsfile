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
                sh 'docker-compose up -d --build'
            }
        }
    }
}
