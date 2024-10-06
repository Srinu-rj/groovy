def call(credentialsId){
   withSonarQubeEnv(credentialsId: credentialsId) {
         sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-application  -Dsonar.projectKey=spring-application \
           -Dsonar.java.binaries=. '''
          }
}
