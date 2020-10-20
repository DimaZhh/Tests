node {
	stage ('SCM checkout'){
		git "https://github.com/DimaZhh/Tests"
		}
	stage ('Build'){
    	dir("pipeline_selenium3") {
	   sh "mvn clean install"
       }
       	dir("/target/") {
	   sh "java -jar testUi-1.0-SNAPSHOT.jar"
       }
		}
}