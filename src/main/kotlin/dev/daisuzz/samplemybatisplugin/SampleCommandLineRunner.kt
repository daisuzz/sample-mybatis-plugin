package dev.daisuzz.samplemybatisplugin

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class SampleCommandLineRunner(private val sampleMapper: SampleMapper) : CommandLineRunner {
    override fun run(vararg args: String) {
        sampleMapper.select1()
        sampleMapper.select2()
    }
}
