package com.app.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.mdata.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMongodbRepositoryTest {
	
	
	//@MockInject
	@Autowired
	private UserMongodbRepository userMongodbRepositoryTest;
	

	@Before
	//@Test
	 public void setup() {
		// TODO Auto-generated method stub
		
		
		User user1 = new User("1", "vishal", "k");
		User user2 = new User("2", "john", "k");
		assertNull(user1.getId());
		assertNull(user2.getId());
		
		this.userMongodbRepositoryTest.save(user1);
		this.userMongodbRepositoryTest.save(user2);
				
		
	}
	
	@Test
	public void testfetchData() {
		
		User user3 = this.userMongodbRepositoryTest.findByFirstName("vishal");
		
		assertNotNull(user3);
		assertEquals("1", user3.getUserId());
		
		int count = 0;
		Iterable<User> users = userMongodbRepositoryTest.findAll();
		
		 for (User iterable_element : users) {
			count++;
		}		 
		 assertEquals(2, count);
	}
	
	@Test
	public void testUpdateData() {
		User user3 = this.userMongodbRepositoryTest.findByFirstName("vishal");
		assertNotNull(user3);

		System.out.println(user3.getUserId());
		assertEquals("1", user3.getUserId());
		
		user3.setUserId("11");
		
		this.userMongodbRepositoryTest.save(user3);
		
		User user4 = userMongodbRepositoryTest.findByFirstName("vishal");
		
		assertNotNull(user4);
		assertEquals("11", user4.getUserId());
		
	}
	
	@After
	public void tearDown() {
		this.userMongodbRepositoryTest.deleteAll();
	}
	
	

}
