package com.cjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.model.User;
import com.cjc.model.repo.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);
		User user = new User();
		user.setUid(1);
		user.setUname("AAAA");
		user.setUaddress("Akurdi");
		repository.save(user);
		System.out.println("*** Data Inserted ***");

	}

	
	
	public static void selectAllUsersById(UserRepository repository) {
		List<Integer> list = Arrays.asList(1, 2);

		Iterable<User> iterable = repository.findAllById(list);
		Iterator<User> itr = iterable.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			System.out.println("---------------------\n");
			System.out.println(user);
		}
	}

	public static void selectSingleRecord(UserRepository repository) {
		Optional<User> instance = repository.findById(2);

		if (instance.isPresent()) {
			User user = instance.get();
			System.out.println(user);
			System.out.println("*** Data Selected ***");
		}
	}

	public static void selectAllUsers(UserRepository repository) {
		Iterable<User> iterable = repository.findAll();
		Iterator<User> itr = iterable.iterator();
		while (itr.hasNext()) {
			System.out.println("------------------\n");
			User user = itr.next();
			System.out.println(user);
		}
	}

	public static void insertAllUser(UserRepository repository) {
		List<User> list = new ArrayList<>();
		list.add(new User(2, "BBB", "Ravet"));
		list.add(new User(3, "CCC", "Nigadi"));
		repository.saveAll(list);
		System.out.println("*** List Inserted ***");
	}

	public static void inserUser(UserRepository repository) {
		User user = new User();
		user.setUid(1);
		user.setUname("AAAA");
		user.setUaddress("Akurdi");
		repository.save(user);
		System.out.println("*** Data Inserted ***");
	}

}
