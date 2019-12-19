package com.galaxy.springboot;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;
import testspringboot_.HelloWorldApplication;
import com.galaxy.springboot.entity.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = { HelloWorldApplication.class })
public class testmysql {
	@Resource // 自动注入，spring boot会帮我们实例化一个对象
	private JdbcTemplate jdbcTemplate;

	//@Test
	public void mySqlTest() {
		String sql = "select uid,username,password from tb_user";

		List<Student> students = jdbcTemplate.query(sql, new RowMapper<Student>() {

			public Student mapRow(ResultSet resultSet, int i) throws SQLException {
				Student student = new Student();
				student.setUid(resultSet.getInt("uid"));
				student.setUsername(resultSet.getString("username"));
				student.setPassword(resultSet.getString("password"));
				return student;
			}
		});

		System.out.println("查询成功");
		for (Student s : students) {
			System.out.println(s);
		}
	}
	@Test
	public void insert() {
		String sql = "insert into tb_user (uid,username,password) values (6,'hhh','123')";
		jdbcTemplate.update(sql);
		
	}
	@Test
	public void del() {
		String sql = "delete from tb_user where uid = 5";
		jdbcTemplate.update(sql);
	}
	@Test
	public void update() {
		String sql = "update  tb_user set password = '666'  where uid = 2";
		jdbcTemplate.update(sql);
	}

}
