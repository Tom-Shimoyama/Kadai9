package com.example.crudapi;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface NameMapper {

    @Select("SELCT * FROM names")
    List<Name> findAll();


}
