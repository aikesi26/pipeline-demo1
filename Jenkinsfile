pipeline {
    agent any

    tools {
        maven 'mvn-3.6.0'
    }

    stages {
        stage('pmd') {
            steps {
                sh "mvn clean install"
                sh "mvn pmd:pmd"
            }
        }
    }

    post {
        always {
            script {
                try {
                    pmd(canRunOnFailed: true, pattern: '**/target/pmd.xml')
                } catch {
                    echo "has error"
                }

            }
        }
    }
}