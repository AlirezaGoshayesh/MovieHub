package com.test.moviehub.domain.base

abstract class UseCase<in P, R> {

    /** Executes the use case asynchronously and returns a [Resource].
     *
     * @return a [Resource].
     *
     * @param parameters the input parameters to run the use case with
     */

    suspend operator fun invoke(parameters: P): Resource<R> {
        return try {
            execute(parameters).let {
                Resource.Success(it)
            }
        } catch (e: Exception) {
            Resource.Error(e)
        }
    }

    /**
     * Override this to set the code to be executed.
     */
    @Throws(RuntimeException::class)
    protected abstract suspend fun execute(parameters: P): R

    companion object {
        private val TAG = UseCase::class.java.name
    }
}