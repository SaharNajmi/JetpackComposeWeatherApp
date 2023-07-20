package dependencies

import Versions

object Dependencies {
    object Core {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
        const val material = "com.google.android.material:material:${Versions.materialVersion}"
    }

    object LifeCycle {
        const val lifeCycleRuntimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntimeKtxVersion}"
    }

    object Compose {
        const val activityCompose =
            "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
        const val composeBom = "androidx.compose:compose-bom:${Versions.composeBomVersion}"
        const val composeUi = "androidx.compose.ui:ui"
        const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
        const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val composeMaterial = "androidx.compose.material3:material3"
        const val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling"
        const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
    }

    object TestDep {
        const val junit = "junit:junit:${Versions.junitVersion}"
        const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

    }

}