pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                // Étape de construction - par exemple, compilation du code
                sh "mvn clean package DskipTests"
            }
        }
        stage('Build Docker image') {
            steps {
                // Étape de test - par exemple, exécution des tests unitaires
                sh "docker build -t githubaction:v1 ."
            }
        }
        stage('Deploy') {
            steps {
                // Étape de déploiement - par exemple, déploiement sur un serveur d'application
                sh "docker run --name githubaction -d -p 8080:8080 githubaction"
            }
        }
    }
    post {
        success {
            // Actions à effectuer si le pipeline réussit
            echo 'Le pipeline a été exécuté avec succès!'
        }
        failure {
            // Actions à effectuer si le pipeline échoue
            echo 'Le pipeline a échoué!'
        }
    }
}
