package com.crm.mapper;

import com.crm.bean.Tea;
import com.crm.bean.TeaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaMapper {
    int countByExample(TeaExample example);

    int deleteByExample(TeaExample example);

    int deleteByPrimaryKey(Integer teaId);

    int insert(Tea record);

    int insertSelective(Tea record);

    List<Tea> selectByExample(TeaExample example);

    Tea selectByPrimaryKey(Integer teaId);

    int updateByExampleSelective(@Param("record") Tea record, @Param("example") TeaExample example);

    int updateByExample(@Param("record") Tea record, @Param("example") TeaExample example);

    int updateByPrimaryKeySelective(Tea record);

    int updateByPrimaryKey(Tea record);

	int delAll(Integer[] ids);
	
	List<Tea> queryTeaUser(Integer id);
	
	List<Tea> selteaschool();
	
	List<Tea> queryschool(Integer id);
}