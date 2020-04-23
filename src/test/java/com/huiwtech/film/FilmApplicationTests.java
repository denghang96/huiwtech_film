package com.huiwtech.film;

import com.huiwtech.film.dao.entity.NextUser;
import com.huiwtech.film.dao.mapper.NextUserMapper;
import com.huiwtech.film.example.dao.UserMapper;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class FilmApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private NextUserMapper nextUserMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void hell() {
	}

	@Test
	public void generatorTest() {
		List<NextUser> nextUsers = nextUserMapper.selectList(null);

		nextUsers.forEach(System.out::println);
	}

}
