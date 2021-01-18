package de.mem89.jenkins_shared_library_with_guice

import com.google.inject.AbstractModule

class StepsModule extends AbstractModule {
    private steps

    StepsModule(steps) {
        this.steps = steps
    }

    @Override
    protected void configure() {
        bind(IStep.class).toInstance(new Steps(steps))
    }
}
