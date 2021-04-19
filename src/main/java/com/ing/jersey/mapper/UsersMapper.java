package com.ing.jersey.mapper;

import com.ing.jersey.domain.model.entities.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from \"USER\"")
    List<User> findAll();

    @Select("select * from \"USER\" where \"ID\" = #{id}")
    User find( int id );

    @Insert("insert into \"USER\" ( \"NAME\", \"USERNAME\" ) values (#{name}, #{username}) ")
    void create( User user );

    @Update("update \"USER\" set \"NAME\" = #{name}, \"USERNAME\" = #{username} where \"ID\" = #{id}")
    void update( User user );

    @Delete("delete from \"USER\" where \"ID\" = #{id}")
    void delete( int id );
}
