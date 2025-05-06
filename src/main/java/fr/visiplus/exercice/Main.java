package fr.visiplus.exercice;

import fr.visiplus.exercice.service.IService;
import fr.visiplus.exercice.service.ServiceImplementation;

public class Main {
	public static void main(String[] args) {
		IService service = new ServiceImplementation();
		service.getSortedUsers().forEach(System.out::println);
	}
}
