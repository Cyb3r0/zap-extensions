import org.zaproxy.gradle.addon.AddOnStatus

version = "7"
description = "Allows Ruby to be used for ZAP scripting - templates included"

zapAddOn {
    addOnName.set("Ruby Scripting")
    addOnStatus.set(AddOnStatus.BETA)
    zapVersion.set("2.7.0")

    manifest {
        author.set("ZAP Dev Team")
    }
}

dependencies {
    implementation("org.jruby:jruby-complete:1.7.4")

    testImplementation(project(":testutils"))
    testImplementation("org.apache.commons:commons-lang3:3.5")
}
