object Modules {
    const val core = ":core" // domain models layer independent
    const val data = ":data" // database implemented classes layer depends on shared only
    const val remote = ":remote" // remote implemented classes layer depends on shared only
    const val shared = ":shared" // remote and database interfaces layer depends on core only
    const val presentation = ":presentation" //mvvm layer depends on core only
    const val ui = ":app" // depends on all modules
}