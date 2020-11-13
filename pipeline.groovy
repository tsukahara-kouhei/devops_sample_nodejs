pipelineJob('Pipeline Basic Job') {

    def repo = 'https://github.com/tsukahara0814/devops_sample_nodejs.git'

    description("Pipeline for $repo")

    triggers {
        scm('H/5 * * * *')
    }

    definition {
        cpsScm {
            scm {
                git{
                    remote { url(repo) }
                    branches('master')
                    scriptPath('misc/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}