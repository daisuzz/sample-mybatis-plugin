package dev.daisuzz.samplemybatisplugin.customer

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface CustomerMapper {

    @Select("SELECT * FROM CUSTOMER")
    fun find(): List<Customer>
}
