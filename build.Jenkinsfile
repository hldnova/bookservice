node {
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/hldnova/bookservice.git'
    
   }
   stage('Build') {
       sh './gradlew build'
   }
   stage('Results') {
      archiveArtifacts 'build/libs/*.jar'
   }
}
