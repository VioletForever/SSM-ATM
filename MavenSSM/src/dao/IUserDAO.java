package dao;



import org.apache.ibatis.annotations.Param;

import vo.User;

public interface IUserDAO {
	//按用户名进行查询，返回User对象
	public User get( @Param("id")String id);
	public boolean updatePassword(@Param("password")String password,@Param("id")String id);
	public boolean updateMoney(@Param("money")double Money,@Param("id")String id);
	public boolean lock(@Param("lock")boolean lock,@Param("id")String id);
	public boolean inMoney(@Param("money")double Money,@Param("id")String id);
	public boolean deMoney(@Param("money")double Money,@Param("id")String id);
}
