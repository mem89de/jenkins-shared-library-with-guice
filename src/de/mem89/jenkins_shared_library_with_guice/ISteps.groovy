package de.mem89.jenkins_shared_library_with_guice

/**
 * Provides access to Jenkins pipeline steps.
 */
interface ISteps {
    /**
     * Signals an error. Useful if you want to conditionally abort some part of your program.
     * @param message the error message
     */
    void error(String message)

    /**
     * Sets the build description
     * @param buildDescription the build description
     */
    void setBuildDescription(String buildDescription);
}