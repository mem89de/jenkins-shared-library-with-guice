import com.google.inject.Guice
import com.google.inject.Injector
import de.mem89.jenkins_shared_library_with_guice.PipelineUtils
import de.mem89.jenkins_shared_library_with_guice.StepsModule

/**
 * Sets the build description to <code>errorMessage</code> and aborts the build.
 * @param errorMessage the error message
 */
void call(String errorMessage) {
    PipelineUtils pipelineUtils = getPipelineUtils()
    pipelineUtils.abortBuild(errorMessage)
}

private PipelineUtils getPipelineUtils() {
    Injector injector = Guice.createInjector(
            new StepsModule(this)
    )
    return injector.getInstance(PipelineUtils.class)
}