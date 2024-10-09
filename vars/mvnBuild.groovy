// def call(){
//     sh 'mvn clean install'
// }

def callMavenBuild() {
    withMaven(maven: 'Maven_3.9.9') {
        sh 'mvn clean install'
    }
}

// withMaven(globalMavenSettingsConfig: '', jdk: 'jdk17', maven: 'maven3', mavenSettingsConfig: '', traceability: true) {
//    sh 'mvn clean install'
// }
