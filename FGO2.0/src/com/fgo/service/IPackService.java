package com.fgo.service;

import java.util.List;

import com.fgo.model.Servers;
import com.fgo.model.User;

/**处理背包逻辑
 * @author Administrator
 *
 */
public interface IPackService {
	//获取所有从者（测试方法）
public List<User> findall();
   
/**根据用户id获取用户所有从者
 * @param user
 * @return
 */
public List<Servers> findServersByUserID(User user);
}
