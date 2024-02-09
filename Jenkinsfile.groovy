pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install' // Comando Maven para compilar e construir o projeto
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test' // Comando Maven para executar os testes
            }
        }
    }
}