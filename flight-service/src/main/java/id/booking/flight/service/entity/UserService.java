package id.booking.flight.service.entity;

import java.util.Date;

import id.booking.flight.entity.User;

public interface UserService {
	public boolean modifyUserData(User data);
	public boolean createNewUser(String fullName, String username, String Password, Date validDate);
}
