package ToyShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dao.UsersDao;
import ToyShop.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	UsersDao usersDao = new UsersDao();
	
	public int AddAccount(Users user) {
		
		user.setMATKHAU(BCrypt.hashpw(user.getMATKHAU(), BCrypt.gensalt(12)));
		return usersDao.AddAccount(user);
		
	}

	public Users CheckAccount(Users user) {
		String pass = user.getMATKHAU();
		user = usersDao.GetUserByAccount(user);
		if(user != null) {
			if(BCrypt.checkpw(pass, user.getMATKHAU())) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}
}
