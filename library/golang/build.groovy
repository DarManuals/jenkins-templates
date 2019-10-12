void call() {
    node {
        stage("print") {
            println "go: build()"
        }

        stage('git') { // for display purposes
            git 'https://github.com/DarManuals/clean-arch.git'
        }

        stage("build") {
            sh("go build .")
        }

        stage("test") {
            sh("go test -v ./...")
        }
    }
}