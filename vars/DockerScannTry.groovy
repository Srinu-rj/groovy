def call(String project, String ImageTag, String hubUser){
    
    // sh """   
    //  trivy image ${hubUser}/${project}:latest > scan.txt
    //  cat scan.txt
    // """

     echo 'Trivy Scan Started'
        sh 'trivy fs --format table --output trivy-fs-output.html .'
        echo 'Trivy Scan Finished'
    
}
