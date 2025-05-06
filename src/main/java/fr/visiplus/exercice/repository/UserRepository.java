package fr.visiplus.exercice.repository;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.User;

public class UserRepository {

	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User("albert", "martin", "martina", "noidea"));
		users.add(new User("gerard", "charles", "charlesg", "idea"));
		return users;
	}
}
