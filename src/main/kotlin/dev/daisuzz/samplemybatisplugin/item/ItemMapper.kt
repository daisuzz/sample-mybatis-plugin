package dev.daisuzz.samplemybatisplugin.item

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface ItemMapper {

    @Select("SELECT * FROM ITEM")
    fun find(): List<Item>
}
