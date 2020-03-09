pipeline {
  agent any
  stages {
    stage('checkout'){
      steps {
        git 'https://github.com/hldnova/bookservice.git'
      }
    }
    stage('Build') {
      steps { 
        sh './gradlew build'
      }
    }
  }
}
