package com.DAO;

import com.entity.User;

public interface UserDAO {
	public boolean userRegister(User us);

	public boolean login(String email, String password);
}
