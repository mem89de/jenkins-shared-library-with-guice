package de.mem89.jenkins_shared_library_with_guice

import com.google.inject.Inject

/**
 * Utilities for work with Jenkins pipelines.
 */
class PipelineUtils {
    private final ISteps steps

    @Inject
    protected PipelineUtils(ISteps steps) {
        this.steps = steps
    }

    /**
     * Sets the build description to <code>errorMessage</code> and aborts the build.
     * @param errorMessage the error message
     */
    void abortBuild(String errorMessage) {
        steps.setBuildDescription(errorMessage)
        steps.error(errorMessage)
    }
}
