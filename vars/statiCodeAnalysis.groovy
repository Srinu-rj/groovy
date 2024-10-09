def call(){
   withSonarQubeEnv(credentialsId: 'sonar-token-docker', installationName: 'sonar-one') {
       sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-boot-application  -Dsonar.projectKey=spring-boot-application \
         -Dsonar.java.binaries=. '''
   }
}

// def call(){
//   withSonarQubeEnv(credentialsId: 'sonar-api', installationName: 'sonar') {
//        sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-boot-application  -Dsonar.projectKey=spring-boot-application \
//          -Dsonar.java.binaries=. '''
//    }
// }


