package dependencies

object CoreDep {
    const val coreKtx = Dependencies.Core.coreKtx
    const val appCompat=Dependencies.Core.appCompat
    const val material=Dependencies.Core.material

    object Test{
        const val junit = Dependencies.TestDep.junit
        const val testExtJunit = Dependencies.TestDep.testExtJunit
        const val espressoCore = Dependencies.TestDep.espressoCore
    }

}