package com.matao.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project;

class DemoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def extension = project.extensions.create('demoExtension', DemoExtension)
        project.afterEvaluate {
            println "name in DemoPlugin: ${extension.name}"
        }
    }
}
