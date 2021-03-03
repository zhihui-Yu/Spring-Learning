package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author simple
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
    void insertUser(User user);
}
