stage "DEV-QA"
  node {
    git 'https://github.com/sfatima8/se441-qotd-pipeline.git'

    def gradleHome = tool 'Gradle 2.12'
    bat "${gradleHome}\\bin\\gradle.bat assemble assemble"
    bat "${gradleHome}\\bin\\gradle.bat assemble uploadArchives"
    bat "${gradleHome}\\bin\\gradle.bat assemble test"
    bat "${gradleHome}\\bin\\gradle.bat assemble sonarqube"
  }