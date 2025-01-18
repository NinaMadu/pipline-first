echo 'pipeline {
    agent any
    stages {
        stage("Clone Repository") {
            steps {
                git "https://github.com/NinaMadu/pipline-first"
            }
        }
        stage("Run Python Script") {
            steps {
                sh "python3 print.py"
            }
        }
    }
}' > Jenkinsfile
