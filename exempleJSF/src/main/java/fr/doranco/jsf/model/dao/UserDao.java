package fr.doranco.jsf.model.dao;

import fr.doranco.jsf.entity.pojo.User;

public class UserDao implements IUserDao {

	@Override
	public User addUser(User user) throws Exception {
		// ex�cuter la m�thode save de JPA 
		user.setId(5);
		return user;
	}

}
