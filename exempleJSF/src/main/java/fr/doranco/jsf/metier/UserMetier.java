package fr.doranco.jsf.metier;

import fr.doranco.jsf.entity.dto.UserDto;
import fr.doranco.jsf.entity.pojo.User;
import fr.doranco.jsf.model.dao.IUserDao;
import fr.doranco.jsf.model.dao.UserDao;

public class UserMetier implements IUserMetier {

	@Override
	public UserDto addUser(UserDto userDto) throws Exception {
		
		// on crypte le mot de passe
		// on convertit la date du String vers java.util.Date
		User user = new User();
		// on remplit l'objet user
		IUserDao userDao = new UserDao();
		userDao.addUser(user);
		
		userDto.setId(String.valueOf(user.getId()));
		
		return userDto;
	}

}
