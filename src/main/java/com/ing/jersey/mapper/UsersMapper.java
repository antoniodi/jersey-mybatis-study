package com.ing.jersey.mapper;

import com.ing.jersey.domain.model.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from \"USER\"")
    List<User> findAll();
}
