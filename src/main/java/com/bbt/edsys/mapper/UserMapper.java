package com.bbt.edsys.mapper;

import java.util.List;

import com.bbt.edsys.common.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    public List<User>  selectUsers();

}


