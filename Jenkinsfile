node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("testUi") {
	   sh "mvn clean install"
       }
       	dir("testUi/target/") {
	   sh "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}