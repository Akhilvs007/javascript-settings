package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "5d40b47b-82cf-4050-b429-715379c61a3a"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComAkhilvs007teamcityCourseCardsGit)

    buildType(JavaScript_DeployToStaging)
    buildType(JavaScript_02chrome)
    buildType(JavaScript_01FastTest)
    buildType(JavaScript_02Firefox)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComAkhilvs007javascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
