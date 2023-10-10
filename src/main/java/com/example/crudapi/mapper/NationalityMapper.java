package com.example.crudapi.mapper;

import com.example.crudapi.entity.Nationality;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface NationalityMapper {

    @Select("SELECT * FROM names INNER JOIN countries ON names.name_id = countries.country_id;")
    List<Nationality> findAll();
}
