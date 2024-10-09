// def call(){
//     sh "mvn clean install -DskipTests=true"
// }

def call(){
    sh 'mvn verify -DskipUnitTests'
}
