package com.crm.mapper;

import com.crm.bean.User;
import com.crm.bean.*;
import com.crm.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int delUsers(Integer[] ids);
	
	List<User> allUser();

	List<User> isNotNull();
	
	List<User> all();
	
	User selectAll(Integer userId);
	
	int upteaId(Integer id);
	
	List<User> selUserScore(Integer id);
	
	int upcarId(Integer id);
}