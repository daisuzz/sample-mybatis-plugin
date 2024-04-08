package dev.daisuzz.samplemybatisplugin

import dev.daisuzz.samplemybatisplugin.customer.CustomerMapper
import dev.daisuzz.samplemybatisplugin.item.ItemMapper
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class SampleCommandLineRunner(
    private val customerMapper: CustomerMapper,
    private val itemMapper: ItemMapper,
) : CommandLineRunner {
    override fun run(vararg args: String) {
        customerMapper.find()
        itemMapper.find()
    }
}
