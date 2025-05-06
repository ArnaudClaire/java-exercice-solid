package fr.visiplus.exercice.service;

import java.util.Collections;
import java.util.List;

import fr.visiplus.exercice.User;
import fr.visiplus.exercice.UserComparator;
import fr.visiplus.exercice.repository.UserRepository;

public class ServiceImplementation implements IService {

	private final UserRepository repository = new UserRepository();

	@Override
	public List<User> getSortedUsers() {
		List<User> users = repository.findAll();
		Collections.sort(users, new UserComparator());
		return users;
	}
}
