package com.fgo.service;

import java.util.List;

import com.fgo.model.Servers;
import com.fgo.model.User;

/**�������߼�
 * @author Administrator
 *
 */
public interface IPackService {
	//��ȡ���д��ߣ����Է�����
public List<User> findall();
   
/**�����û�id��ȡ�û����д���
 * @param user
 * @return
 */
public List<Servers> findServersByUserID(User user);
}
