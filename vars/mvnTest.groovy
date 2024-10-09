// def call(){
//      sh "mvn compile" 
// }
def call(){
    sh 'mvn test'
}
