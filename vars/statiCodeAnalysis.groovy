def call(){
   withSonarQubeEnv(credentialsId: 'sonar-api') {
      // sh 'mvn clean package sonar:sonar'
       sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-application  -Dsonar.projectKey=spring-application \
         -Dsonar.java.binaries=. '''
   }
}
