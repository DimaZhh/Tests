node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("") {
	   sh "mvn clean install"
       }
       	dir("/target/") {
	   sh "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}