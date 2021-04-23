package com.github.joskfg.phpstormremotek8sinterpreter.services

import com.github.joskfg.phpstormremotek8sinterpreter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
