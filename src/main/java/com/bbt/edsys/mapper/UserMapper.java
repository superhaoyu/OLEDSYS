package com.bbt.edsys.mapper;

import java.util.List;

import com.bbt.edsys.common.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();

    public List<User> findByUserName(@Param("userName") String userName);

    public User findOne(Long id);

    public Boolean exists(Long id);

    public void save(User user);

    public void update(User user);

    public void delete(User user);

}


