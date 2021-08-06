pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('install') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
