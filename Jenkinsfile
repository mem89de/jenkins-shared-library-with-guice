pipeline {
    agent any

    stages {
        stage('Fail build') {
            steps {
                script {
                    abortBuild "This build failed"
                }
            }
        }
    }
}