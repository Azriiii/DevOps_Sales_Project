
pipeline {
agent any
stages {
stage ('GIT'){
    steps{
        echo "getting project from git";
        git "https://github.com/Azriiii/DevOps_Sales_Project.git";
    }
}
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
	sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=esprit'
	}
}

}
}
