def buildDockerImage(String imageName) {
    def buildCommand = "docker build -t ${imageName} ."
    println "Building Docker image with command: ${buildCommand}"
    def process = buildCommand.execute()
    process.waitForProcessOutput(System.out, System.err)
    if (process.exitValue() == 0) {
        println "Docker image ${imageName} built successfully."
    } else {
        println "Failed to build Docker image."
    }
}

buildDockerImage("srinu641/spring-image")
