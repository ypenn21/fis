node {
   def mvnHome
   def registry = "yannipeng/fis"
   def registryCredential = 'pass'

   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
    //   def pipeline = sh 'ls'

    //  if(pipeline?.trim()) {
    //       echo "great"
    //  }
      git 'https://github.com/ypenn21/fis.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration. M3 ust be the name
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }

   stage('Building image') {
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
   }

   stage('Deploy Image') {
        sh "docker login -u yannipeng -p ${registryCredential}"
        sh "docker push $registry:$BUILD_NUMBER"
    }
    stage('Remove Unused docker image') {
        sh "docker rmi $registry:$BUILD_NUMBER"
    }

//   stage('Results') {
//       junit '**/target/surefire-reports/TEST-*.xml'
//       archive 'target/*.jar'
//   }
}