package fr.visiplus.exercice.service;

import java.util.Collections;
import java.util.List;

import fr.visiplus.exercice.User;
import fr.visiplus.exercice.UserComparator;

public class ServiceImplementation implements IService {

	@Override
	public List<User> sortUsersByUsername(List<User> users) {
		Collections.sort(users, new UserComparator());
		return users;
	}
}
