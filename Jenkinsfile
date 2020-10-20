node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("Tests") {
	   sh "mvn clean install"
       }
       	dir("Tests/target/") {
	   sh "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}