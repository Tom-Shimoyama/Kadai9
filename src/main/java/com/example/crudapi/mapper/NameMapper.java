package com.example.crudapi.mapper;

import com.example.crudapi.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface NameMapper {

    @Select("SELECT * FROM names INNER JOIN countries ON names.name_id = countries.country_id;")
    List<Name> findAll();
}
