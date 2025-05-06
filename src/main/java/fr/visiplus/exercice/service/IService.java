package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public interface IService {
	List<User> sortUsersByUsername(List<User> users);
}
