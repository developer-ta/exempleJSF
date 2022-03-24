package fr.doranco.jsf.model.dao;

import fr.doranco.jsf.entity.pojo.User;

public interface IUserDao {

	User addUser(User user) throws Exception;
}
