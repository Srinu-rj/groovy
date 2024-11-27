// def call(){
//    withSonarQubeEnv(credentialsId: 'sonar-token-docker', installationName: 'sonar-one') {
//        sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-boot-cicd-pipeline  -Dsonar.projectKey=spring-boot-cicd-pipeline \
//          -Dsonar.java.binaries=. '''
//    }
// }


def call(){
  withSonarQubeEnv(credentialsId: 'sonar-token') {
       sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-boot-sonar  -Dsonar.projectKey=spring-boot-sonar \
         -Dsonar.java.binaries=. '''
   }
}


