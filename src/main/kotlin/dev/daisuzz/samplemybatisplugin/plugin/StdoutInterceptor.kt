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
import java.util.logging.Logger

/**
 * log message on pre and post-processing
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

        logger.info("pre-processing.")
        val returnObject = invocation.proceed()
        logger.info("post-processing.")

        return returnObject
    }

    companion object {
        val logger: Logger = Logger.getLogger(this::class.java.name)
    }
}
