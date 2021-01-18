package de.mem89.jenkins_shared_library_with_guice

class Steps implements ISteps, Serializable {
    private final steps;

    Steps(Object steps) {
        this.steps = steps
    }

    @Override
    void error(String message) {
        steps.error(message)
    }

    @Override
    void setBuildDescription(String buildDescription) {
        steps.currentBuild.description = buildDescription
    }
}