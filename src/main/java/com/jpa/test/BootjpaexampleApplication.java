package com.jpa.test;

import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.userRepository;
import com.jpa.test.entities.user;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		 
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		userRepository UserRepository= context.getBean(userRepository.class);
		
	//	user user1=new user();
	//	user1.setName("vikram singh");
	//	user1.setCity("sarni");
	//	user1.setStatus("married");
		
	//	user user2 = UserRepository.save(user1);
		
	//	System.out.println(user2);
		
//		// create object of user
//		user user2=new user();
//		user2.setName("rama");
//		user2.setCity("city1");
//		user2.setStatus("married");
//		
//		user user3=new user();
//		user3.setName("hanuman");
//		user3.setCity("city2");
//		user3.setStatus("unmarried");
//		//==>>	saving single user
//	// user resultuser =UserRepository.save(user3);
//	//==>>	 for saveing multiple objects	
//		List<user> users = List.of(user2,user3);
//		Iterable<user> result = UserRepository.saveAll(users);
//		
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//	//	System.out.println("save user"+resultuser);
	
	//==>>	update the user of id 52
		
//		Optional<user> optional = UserRepository.findById(52);
//		
//		user User = optional.get();
//		
//		User.setName("Harre Ramma");
//		
//		user result = UserRepository.save(User);
//		
//		System.out.println(User);

		
		//how to get the data
		//findById(id)- return Optional Containing your data
		Iterable<user> itr = UserRepository.findAll();
		//method 1
//		itr.forEach(new Consumer<user>() {
//
//			@Override
//			public void accept(user t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
		//method 2
	//	itr.forEach(user->{System.out.println(user);});
	
	//for deleating the user elements
	// UserRepository.deleteById(52);
		// System.out.println("deleted");
		
		
	//	for multiple delete user
//		Iterable<user> allusers = UserRepository.findAll();
//		
//		allusers.forEach(user->System.out.println(user));
//		
//		UserRepository.deleteAll(allusers);
//		
	}
	

}
