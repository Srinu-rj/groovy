def call(){
 waitForQualityGate abortPipeline: false, credentialsId: 'sonar-token-docker'
}

// def call(){
//  waitForQualityGate abortPipeline: false, credentialsId: 'sonar-api'
// }
