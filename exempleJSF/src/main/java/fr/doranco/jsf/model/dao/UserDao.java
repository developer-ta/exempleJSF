package fr.doranco.jsf.model.dao;

import fr.doranco.jsf.entity.pojo.User;

public class UserDao implements IUserDao {

	@Override
	public User addUser(User user) throws Exception {
		// exécuter la méthode save de JPA 
		user.setId(5);
		return user;
	}

}
