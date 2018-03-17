package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_DeployToStaging : BuildType({
    uuid = "7c5035e6-34a4-4a7b-9d61-c82d1032af6f"
    id = "JavaScript_DeployToStaging"
    name = "03.Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComAkhilvs007teamcityCourseCardsGit)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02chrome) {
            snapshot {
            }
        }
	dependency(JavaScript.buildTypes.JavaScript_02IE) {
	    snapshot {
	    }
	}
    }
})
