package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTest : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "2687e983-4890-4d68-848c-be3fc27ef324"
    id = "JavaScript_01FastTest"
    name = "01.Fast Test"

    params {
        param("Browser", "PhantomJS")
    }
})
