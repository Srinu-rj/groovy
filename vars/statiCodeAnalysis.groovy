def call(){
   withSonarQubeEnv(credentialsId: 'sonar-api') {
      // sh 'mvn clean package sonar:sonar'
       sh ''' $SCANNER_HOHE/bin/sonar-scanner -Dsonar.projectName=spring-boot-application  -Dsonar.projectKey=spring-boot-application \
         -Dsonar.java.binaries=. '''
   }
}
