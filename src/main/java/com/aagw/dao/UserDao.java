package com.aagw.dao;


import com.aagw.entity.Uuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<Uuser> {

}
