
pipeline {
agent any
tools {
        maven 'M2_HOME'
    }
    environment {
    		DOCKERHUB_CREDENTIALS=credentials('dockerHub')
    	}
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
stage('Compilation du Projet'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Azriiii/DevOps_Sales_Project.git']]])
             sh 'mvn clean install'
            }
        }
        stage('Package') {
                    steps {
                        sh 'mvn package'
                        // bat '.\\mvnw package'
                    }
                }

                 stage('MOCKITO') {
                            steps {
                           sh 'mvn clean test -Dtest=com.esprit.examen.services.ProduitServiceMockTest'
                            }
                        }
                        /* stage('JUNIT') {
                            steps {
                            sh 'mvn clean test -Dtest=com.esprit.examen.services.ProduiServiceImplTest -Dmaven.test.failure.ignore=true'
                            }
                        }*/

                stage('MVN SONARQUBE') {
                                                            steps {
                                                                sh 'mvn sonar:sonar  -Dsonar.login=admin -Dsonar.password=esprit'

                                                            }


                                                        }
                 stage('NEXUS'){
                            steps{
                                sh 'mvn deploy -DskipStaging=true '
                            }

                        }
                        stage('Start container') {
                             steps {
                                sh  'docker-compose -v'
                                sh 'docker-compose up -d '
                                sh 'docker-compose ps'
                      }
                        }

/*stage('MVN CLEAN'){
    steps{
        sh 'mvn clean'
    }
}
*/

/*stage('MVN COMPILE'){
    steps{
        sh 'mvn compile'
    }
}
*/
/*stage('MVN SONARQUBE'){
	steps{
	sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=esprit'
	}
}
*/
}
}
/*pipeline {

    environment {

        registry = "amineazri/alpine"

        registryCredential = 'dockerHub'

        dockerImage = ''

    }

    agent any

    stages {

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
        stage('NEXUS'){
                    steps{
                        sh 'mvn deploy -DskipStaging=true '
                    }

                }
                stage('Start container') {
                     steps {
                        sh  'docker-compose -v'
                        sh 'docker-compose up -d '
                        sh 'docker-compose ps'
              }
                }

        stage('Cleaning up') {
            steps {

                sh "docker rmi $registry:$BUILD_NUMBER"

            }

        }

    }

}
*/