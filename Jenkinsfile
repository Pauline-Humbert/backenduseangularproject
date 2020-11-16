	node {
	
		stage('SCM'){
			git 'https://gitlab.com/PaulineHumbert/backenduseangularproject'
		}
	
		stage('Compile') {
		def mvnHome= tool name: 'maven-3', type:'maven'
		sh "${mvnHome}/bin/mvn package -Dmaven.test.skip=true"
		}
	
		stage('SonarQube'){
		def mvnHome = tool name: 'maven-3', type:'maven'
		sh "${mvnHome}/bin/mvn sonar:sonar -Dsonar.host.url=http://172.18.32.161:9000"
		}
	}