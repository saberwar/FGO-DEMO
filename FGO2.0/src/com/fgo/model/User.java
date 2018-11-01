package com.fgo.model;

/**用户模型
 * @author saber
 *
 */
public class User {
private String id; //登录名
private String name;//昵称
private String pass;//密码，后期想使用哈希加密
private String type;//用户类型
private String date;//注册时间
private int gold;//金币
private String packageid;//仓库id
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
