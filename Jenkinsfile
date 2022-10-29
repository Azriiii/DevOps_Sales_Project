


stage('MVN CLEAN'){
    steps{
        sh 'mvn clean'
    }
}

stage('MVN COMPILE'){
    steps{
        sh 'mvn compile'
    }
}
stage('MVN SONARQUBE'){
	steps{
	sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=esprit';
	}
}
