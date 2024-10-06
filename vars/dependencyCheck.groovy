def call(){
 dependencyCheck additionalArguments: '', odcInstallation: 'Dependency-Check installations'
 dependencyCheckPublisher pattern: '**/dependencyCheck-check-report.xml'
}
