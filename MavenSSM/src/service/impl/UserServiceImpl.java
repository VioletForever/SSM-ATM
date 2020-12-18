package service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserDAO;
import service.IUserService;
import vo.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO userDao;
	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}
	
	
	@Override
	public Map<String, Object> checkLogin(User user) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String,Object>();
		User userResult=userDao.get(user.getUserName());
		if(userResult == null){
			map.put("code", 2);
			map.put("info", "用户名不存在");
		}
		else{
			if(userResult.getPassword().equals(user.getPassword())){
				if(userResult.getLocker()) {
					map.put("code", 4);
					map.put("info", "账户已锁定，请持身份证到银行柜台解锁");
				}
				else {
					map.put("code", 0);
					map.put("info", "登录成功");
					map.put("userName", user.getUserName());
				}
			}
			else{
				map.put("code", 3);
				map.put("info", "密码不正确");
			}
		}
		return map;
	}


	@Override
	public boolean updatePassword(String password,String id) {
		// TODO 自动生成的方法存根
		return userDao.updatePassword(password,id);
	}
	
	public boolean updateMoney(double money,String id) {
		// TODO 自动生成的方法存根
		return userDao.updateMoney(money,id);
	}

	public boolean lock(String id) {
		// TODO 自动生成的方法存根
		return userDao.lock(true,id);
	}
	
	public boolean transeferMoney(double money,String id,String toId) {
		// TODO 自动生成的方法存根
		return userDao.inMoney(money,toId)&&userDao.deMoney(money,id);
	}


	@Override
	public boolean transferMoney(double money, String id, String toId) {
		// TODO Auto-generated method stub
		return false;
	}

}
