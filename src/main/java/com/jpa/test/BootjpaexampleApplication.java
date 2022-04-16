package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
  
		//saving single object
		
		//User user = new User();
		//user.setCity("Mumbai");
		//user.setName("azhar");
		//user.setStatus("java developer");
		
		//User save = userRepository.save(user);
		//System.out.println(save);
		
		//creating user
		//saving multiple object
		//User user = new User();
		//user.setCity("Bangalore");
		//user.setName("sahil");
		//user.setStatus("python developer");
        //System.out.println(user);		

 		//User user1 = new User();
		//user1.setCity("delhi");
		//user1.setName("juned");
		//user1.setStatus("php developer");
        //System.out.println(user1);
        
        //List<User> users = List.of(user,user1);
        
		//Iterable<User> result = userRepository.saveAll(users);
		//result.forEach(e ->
		//{
			//System.out.println(e);
		//});
		//System.out.println("user saved");

		//updating user
		
		//Optional<User> optional = userRepository.findById(3);
		//User user = optional.get();
		//user.setCity("kolkata");
		//userRepository.save(user);
		//System.out.println(user);
		//System.out.println("user updated succsesfully");
		
		//fetching all data
		
		//Iterable<User> itr = userRepository.findAll();
         //itr.forEach(e->
         //{
        	 //System.out.println(e);
         //});
         //System.out.println("data selected");
     
		userRepository.deleteById(4);
		System.out.println("deleted");
	
	}

}
