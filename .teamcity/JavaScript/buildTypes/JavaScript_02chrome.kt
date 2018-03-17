package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "fdaa5e1e-aefe-4104-8174-526edcec843e"
    id = "JavaScript_02chrome"
    name = "02.chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
