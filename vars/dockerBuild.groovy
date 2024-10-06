def call(String project, String ImageTag){
sh """
  docker build -t ${hubUser}/${project}
  docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
  docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
"""
}
