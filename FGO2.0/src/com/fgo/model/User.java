package com.fgo.model;

/**�û�ģ��
 * @author saber
 *
 */
public class User {
private String id; //��¼��
private String name;//�ǳ�
private String pass;//���룬������ʹ�ù�ϣ����
private String type;//�û�����
private String date;//ע��ʱ��
private int gold;//���
private String packageid;//�ֿ�id
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getGold() {
	return gold;
}
public void setGold(int gold) {
	this.gold = gold;
}
public String getPackageid() {
	return packageid;
}
public void setPackageid(String packageid) {
	this.packageid = packageid;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", type=" + type + ", date=" + date + ", gold="
			+ gold + ", packageid=" + packageid + "]";
}

}
