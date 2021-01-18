package de.mem89.jenkins_shared_library_with_guice

import spock.lang.*

class PipelineUtilsTest extends Specification {
    private static final String ERROR_MESSAGE = "ERROR_MESSAGE"

    private PipelineUtils pipelineUtils
    private ISteps steps

    def setup() {
        steps = Mock()
        pipelineUtils = new PipelineUtils(steps)
    }

    def "abort build with build description"() {
        when:
        pipelineUtils.abortBuild(ERROR_MESSAGE)

        then:
        1 * steps.setBuildDescription(ERROR_MESSAGE)

        then:
        1 * steps.error(ERROR_MESSAGE)
    }

}
