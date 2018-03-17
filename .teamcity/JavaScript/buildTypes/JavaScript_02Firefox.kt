package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "9e0e4273-f648-4615-ad9a-3da53d2f04b0"
    id = "JavaScript_02Firefox"
    name = "02.Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
