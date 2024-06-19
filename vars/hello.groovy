// vars/echoGitUrl.groovy
def call(String gitUrl) {
    echo "The provided Git URL is: ${gitUrl}"
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    echo "Cloning repository from ${gitUrl}"
                    // Git checkout step
                    git url: "${gitUrl}"
                }
            }
            stage('Build') {
                steps {
                    echo "Building the project..."
                    // Add build steps here
                }
            }
            stage('Test') {
                steps {
                    echo "Running tests..."
                    // Add test steps here
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying the project..."
                    // Add deployment steps here
                }
            }
        }
    }
}
