pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                echo 'Hello, World!'
            }
        }
        stage('Create Directory') {
            steps {
                script {
                    sh '''#!/bin/bash
                    mkdir my_directory
                    '''
                }
            }
        }
    }
}
