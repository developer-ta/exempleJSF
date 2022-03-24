package fr.doranco.jsf.metier;

import fr.doranco.jsf.entity.dto.UserDto;

public interface IUserMetier {

	UserDto addUser(UserDto userDto) throws Exception;
}
