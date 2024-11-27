def call(String project, String ImageTag, String hubUser){
    
    sh """   
     trivy image ${hubUser}/${project}:latest > scan.txt
     cat scan.txt
    """

    sh '''
        # Install Trivy if not already installed
        if ! command -v trivy &> /dev/null; then
        curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/install.sh | sh -s -- -b /usr/local/bin
        fi

        # Scan the Docker image
        trivy image --exit-code 1 --severity HIGH,CRITICAL 
                    '''
    
}
