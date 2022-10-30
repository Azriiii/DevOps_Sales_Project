pipeline {

    environment {
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
    environment {

            registry = "amineazri/alpine"

          registryCredential = 'docker_hubid'

            dockerImage = ''

        }



            stage('Cloning our Git') {

                steps {

                    git 'https://github.com/Azriiii/DevOps_Sales_Project.git'

                }

            }

            stage('Building our image') {

                steps {

                    script {

                        dockerImage = docker.build registry + ":$BUILD_NUMBER"

                    }

                }

            }

            stage('Deploy our image') {

                steps {

                    script {

                        docker.withRegistry( '', registryCredential ) {

                            dockerImage.push()

                        }

                    }

                }

            }

            stage('Cleaning up') {

                steps {

                    sh "docker rmi $registry:$BUILD_NUMBER"

                }

            }


}}
