def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "srinu641",
            passwordVariable: "srinu1234"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"   
}

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

