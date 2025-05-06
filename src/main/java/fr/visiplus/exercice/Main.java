package fr.visiplus.exercice;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.service.IService;
import fr.visiplus.exercice.service.ServiceImplementation;

public class Main {
	public static void main(String[] args) {
		IService service = new ServiceImplementation();

		List<User> users = new ArrayList<>();
		users.add(new User("Albert", "Martin", "martina", "noidea"));
		users.add(new User("Gérard", "Charles", "charlesg", "idea"));

		service.sortUsersByUsername(users).forEach(System.out::println);
	}
}
