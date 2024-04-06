package dev.daisuzz.samplemybatisplugin.plugin

import org.apache.ibatis.executor.Executor
import org.apache.ibatis.mapping.MappedStatement
import org.apache.ibatis.plugin.Interceptor
import org.apache.ibatis.plugin.Intercepts
import org.apache.ibatis.plugin.Invocation
import org.apache.ibatis.plugin.Signature
import org.apache.ibatis.session.ResultHandler
import org.apache.ibatis.session.RowBounds
import org.springframework.stereotype.Component

/**
 * print message to stdout on pre and post-processing
 */
@Component
@Intercepts(
    Signature(
        type = Executor::class,
        method = "query",
        args = [MappedStatement::class, Any::class, RowBounds::class, ResultHandler::class]
    )
)
class StdoutInterceptor : Interceptor {
    override fun intercept(invocation: Invocation): Any {

        preProcess()
        val returnObject = invocation.proceed()
        postProcess()

        return returnObject
    }

    private fun preProcess() {
        println("pre-processing.")
    }

    private fun postProcess() {
        println("post-processing.")
    }
}
