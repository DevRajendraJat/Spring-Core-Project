package com.rays.dao;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.UserDto;

@Repository
public class UserDAOImpl  extends BaseDAOImpl<UserDto> implements UserDAOInt{

}
