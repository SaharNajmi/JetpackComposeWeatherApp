package dependencies

object UiDep {
    const val coreKtx = Dependencies.Core.coreKtx
    const val lifeCycleRuntimeKtx = Dependencies.LifeCycle.lifeCycleRuntimeKtx
    const val activityCompose = Dependencies.Compose.activityCompose
    const val composeBom = Dependencies.Compose.composeBom
    const val composeUi = Dependencies.Compose.composeUi
    const val composeUiGraphics = Dependencies.Compose.composeUiGraphics
    const val composeUiToolingPreview = Dependencies.Compose.composeUiToolingPreview
    const val composeMaterial = Dependencies.Compose.composeMaterial
    const val composeUiTooling = Dependencies.Compose.composeUiTooling
    const val composeUiTestManifest = Dependencies.Compose.composeUiTestManifest
    const val appCompat=Dependencies.Core.appCompat
    const val material=Dependencies.Core.material

    object Test{
        const val junit = Dependencies.TestDep.junit
        const val testExtJunit = Dependencies.TestDep.testExtJunit
        const val espressoCore = Dependencies.TestDep.espressoCore
        const val composeUiTestJunit = Dependencies.Compose.composeUiTestJunit
    }

}