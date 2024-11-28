// def call(String project, String ImageTag, String hubUser){
// withDockerRegistry([usernamePassword(
//  credentialsId: "docker-cred",
//  usernameVariable: "srinu641",
//  passwordVariable: "srinu1234"
// )]) {
//         sh "docker login -u '$srinu641' -p '$srinu1234'"
//     }
//     sh "docker image push ${hubUser}/${project}:${ImageTag}"
//     sh "docker image push ${hubUser}/${project}:latest"   
// }
// }

def call(){
     withDockerRegistry(credentialsId: 'docker-cred', toolName: 'docker') {
       sh "docker tag spring-image srinu641/spring-image:latest"
       sh "docker push srinu641/spring-image:latest" 
}
}







// def call(){
//  withDockerRegistry(credentialsId: 'docker-credentials', toolName: 'docker') {
//                       sh "docker tag spring-image srinu641/spring-image:latest"
//                       sh "docker push srinu641/spring-image:latest" 
//                     }
// }

