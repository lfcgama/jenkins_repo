pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        sh 'docker build -f Dockerfile.build -t conversor-build .'
      }
    }
    stage('Test') {
      steps {
        sh 'docker build -f Dockerfile.test -t conversor-test .'
      }
    }
  }

  post {
    success {
      echo '✅ Build e Test passaram!'
    }
    failure {
      echo '❌ Falhou em algum estágio'
    }
    unstable {
      echo '⚠️ Build instável'
    }
  }
}
