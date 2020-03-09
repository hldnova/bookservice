pipeline {
  agent any
  stages {
    stage('checkout'){
      steps {
        git 'https://github.com/hldnova/bookservice.git'
      }
    }
    stage('Build') {
      when { changeset "src/**" }
      steps { 
        sh './gradlew build'
      }
    }
  }
}
