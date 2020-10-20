node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("proj") {
	   sh "mvn clean install"
       }
       	dir("proj/target/") {
	   sh "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}