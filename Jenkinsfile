node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("") {
	   bat "mvn clean install"
       }
       	dir("target/") {
	   bat "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}