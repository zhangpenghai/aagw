package com.aagw.dao;

import com.aagw.entity.Result;
import com.aagw.entity.Uuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserDao {
    @Select("select * from u_user where username=#{user.userName} and password=#{user.password}")
    Uuser UserLogin(@Param("user")Uuser user );
    @Select("select * from u_user")
    List<Uuser> findAllUuser();
}
