package de.mem89.jenkins_shared_library_with_guice

import com.cloudbees.groovy.cps.NonCPS
import com.google.inject.AbstractModule

class StepsModule extends AbstractModule implements Serializable {
    private final steps

    StepsModule(steps) {
        this.steps = steps
    }

    @Override
    @NonCPS
    protected void configure() {
        bind(ISteps.class).toInstance(new Steps(steps))
    }
}
