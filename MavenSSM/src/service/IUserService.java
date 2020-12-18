package service;

import java.util.Map;

import vo.User;

public interface IUserService {
	public User get(String id);
	public Map<String,Object> checkLogin(User user);
	public boolean updatePassword(String password,String id);
	public boolean updateMoney(double money,String id);
	public boolean lock(String id);
	public boolean transferMoney(double money,String id,String toId);
}
