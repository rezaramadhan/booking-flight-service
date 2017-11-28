package id.booking.flight.service.soap.impl;

import java.util.Date;

import id.booking.flight.entity.User;
import id.booking.flight.service.entity.UserService;

public class UserImpl implements UserService {

	@Override
	public boolean modifyUserData(User user, String password, String fullName) {
		try	{
			user.setPassword(password);
			user.setName(fullName);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public User createNewUser(String fullName, String username, String password) {
		User newUser = new User(username, fullName, password);
		return newUser;
	}

}
