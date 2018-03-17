package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object JavaScript_Template : Template({
    uuid = "c37d235e-6bc7-4736-b6ea-e96f6fa10149"
    id = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComAkhilvs007teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "Yarn Install"
            id = "RUNNER_6"
            scriptContent = "yarn install"
        }
        script {
            name = "Browser Test"
            id = "RUNNER_7"
            scriptContent = "yarn test -- --single-run --browsers %Browser% --colors false"
        }
        stepsOrder = arrayListOf("RUNNER_6", "RUNNER_7")
    }
})
