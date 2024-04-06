package dev.daisuzz.samplemybatisplugin

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface SampleMapper {

    @Select("SELECT 'select1'")
    fun select1(): List<String>

    @Select("SELECT 'select2'")
    fun select2(): List<String>
}
