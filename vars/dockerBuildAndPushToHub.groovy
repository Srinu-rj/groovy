def call(String project, String ImageTag, String hubUser){
withDockerRegistry([usernamePassword(
 credentialsId: "docker-cred",
 usernameVariable: "srinu641",
 passwordVariable: "srinu1234"
)]) {
        sh "docker login -u '$srinu641' -p '$srinu1234'"
    }
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"   
}

// withDockerRegistry(credentialsId: 'docker-cred', toolName: 'docker', url: 'https://hub.docker.com/') {
//     // some block
// }




// withCredentials([usernameColonPassword(credentialsId: 'docker-cred', variable: 'docker-cred')]) {
//     // some block
// }

// my docker Id ,Credentials
// withCredentials([usernamePassword(credentialsId: 'docker-credentials', passwordVariable: 'srinu1234', usernameVariable: 'dnsrinu143@gmail.com')]) {
//     // some block
// }

// def call(){
//  withDockerRegistry(credentialsId: 'docker-credentials', toolName: 'docker') {
//                       sh "docker tag spring-image srinu641/spring-image:latest"
//                       sh "docker push srinu641/spring-image:latest" 
//                     }
// }

// def dockerBuildAndPushToHub(String project, String imageTag, String dockerHubUser) {
//     sh """
//     # Authenticate with Docker Hub
//     docker login -u ${dockerHubUser} -p ${DOCKER_HUB_PASSWORD}

//     # Build the Docker image
//     docker image build -t ${dockerHubUser}/${project}:${imageTag} .

//     # Tag the Docker image
//     docker tag ${dockerHubUser}/${project}:${imageTag} ${dockerHubUser}/${project}:latest

//     # Push the Docker image to Docker Hub
//     docker push ${dockerHubUser}/${project}:${imageTag}
//     docker push ${dockerHubUser}/${project}:latest
//     """
// }

