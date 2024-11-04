pipeline {
    agent any
    environment {
        PATH = "/Users/mohsenbakr/Downloads/apache-jmeter-5.6.3/bin:$PATH"
    }
    stages {
        stage('Run Tests') {
            steps {
                sh 'chmod +x ./mvnw' // Ensure mvnw is executable
                sh './mvnw clean test'
            }
        }
    }
}
