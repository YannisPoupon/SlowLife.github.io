package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.UserDao;
import com.slowlife.entity.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDao udao;

	@Override
	public User findByLogin(String login) {
		return udao.findByLogin(login);

	}

	@Override
	public User verif(String login, String pass) {
		System.out.println(login);
		System.out.println(this.findByLogin(login));
		if (this.findByLogin(login) != null) {
			String passUser = this.findByLogin(login).getPassword();
			if (passUser.equals(pass)) {

				return udao.findByLogin(login);

			}
		}
		return null;

	}

	@Override
	public User findById(int id) {
		return udao.findById(id).get();
	}

	@Override
	public User recup(String mail) {
		
		return udao.findByMail(mail);
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return udao.findAll();
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		udao.save(u);
		
	}

	@Override
	public void deleteById(int id) {
		udao.deleteById(id);
		
	}

}
