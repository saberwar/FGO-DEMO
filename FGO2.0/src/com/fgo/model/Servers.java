package com.fgo.model;

/**����ģ��
 * @author saber
 *�ö�����
 */
public class Servers {
private int id;//����id
private String name;//������
private String type;//ְ��
private String start;//����
private int LV1_ATK;
private int LV1_HP;
private String camp;//������Ӫ
private int LVMAX4_ATK;
private int LVMAX4_HP;
private int ArtHit;
private int BusterHit;
private int QuickHit;
private int ExtraHit;
private String ILLUST;//��ʦ
private String CV;
private String Attributes;//���ԣ��ƶ���Ӫ��
private String Gender;//�Ա�
private String Region;//����
private String Height;
private String Weight;
private String Crit;//������
private String Death;//������
private String CritPr;//����Ȩ��
private String Origin;//��������
private String Property;//ʲô��״�����ε�
private String Spetext;//�ع�
private int maxATK;
private int maxHP;
private String tool;//����
private String INTR01;//�������� 
private String INTR02;//�������� 
private String INTR03;//�������� 
private String INTR04;//�������� 
private String INTR05;//�������� 
private String INTR06;//�������� 
private String INTR07;//�������� 
private String cutename;//�ǳ�
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getStart() {
	return start;
}
public void setStart(String start) {
	this.start = start;
}
public int getLV1_ATK() {
	return LV1_ATK;
}
public void setLV1_ATK(int lV1_ATK) {
	LV1_ATK = lV1_ATK;
}
public int getLV1_HP() {
	return LV1_HP;
}
public void setLV1_HP(int lV1_HP) {
	LV1_HP = lV1_HP;
}
public String getCamp() {
	return camp;
}
public void setCamp(String camp) {
	this.camp = camp;
}
public int getLVMAX4_ATK() {
	return LVMAX4_ATK;
}
public void setLVMAX4_ATK(int lVMAX4_ATK) {
	LVMAX4_ATK = lVMAX4_ATK;
}
public int getLVMAX4_HP() {
	return LVMAX4_HP;
}
public void setLVMAX4_HP(int lVMAX4_HP) {
	LVMAX4_HP = lVMAX4_HP;
}
public int getArtHit() {
	return ArtHit;
}
public void setArtHit(int artHit) {
	ArtHit = artHit;
}
public int getBusterHit() {
	return BusterHit;
}
public void setBusterHit(int busterHit) {
	BusterHit = busterHit;
}
public int getQuickHit() {
	return QuickHit;
}
public void setQuickHit(int quickHit) {
	QuickHit = quickHit;
}
public int getExtraHit() {
	return ExtraHit;
}
public void setExtraHit(int extraHit) {
	ExtraHit = extraHit;
}
public String getILLUST() {
	return ILLUST;
}
public void setILLUST(String iLLUST) {
	ILLUST = iLLUST;
}
public String getCV() {
	return CV;
}
public void setCV(String cV) {
	CV = cV;
}
public String getAttributes() {
	return Attributes;
}
public void setAttributes(String attributes) {
	Attributes = attributes;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getRegion() {
	return Region;
}
public void setRegion(String region) {
	Region = region;
}
public String getHeight() {
	return Height;
}
public void setHeight(String height) {
	Height = height;
}
public String getWeight() {
	return Weight;
}
public void setWeight(String weight) {
	Weight = weight;
}
public String getCrit() {
	return Crit;
}
public void setCrit(String crit) {
	Crit = crit;
}
public String getDeath() {
	return Death;
}
public void setDeath(String death) {
	Death = death;
}
public String getCritPr() {
	return CritPr;
}
public void setCritPr(String critPr) {
	CritPr = critPr;
}
public String getOrigin() {
	return Origin;
}
public void setOrigin(String origin) {
	Origin = origin;
}
public String getProperty() {
	return Property;
}
public void setProperty(String property) {
	Property = property;
}
public String getSpetext() {
	return Spetext;
}
public void setSpetext(String spetext) {
	Spetext = spetext;
}
public int getMaxATK() {
	return maxATK;
}
public void setMaxATK(int maxATK) {
	this.maxATK = maxATK;
}
public int getMaxHP() {
	return maxHP;
}
public void setMaxHP(int maxHP) {
	this.maxHP = maxHP;
}
public String getTool() {
	return tool;
}
public void setTool(String tool) {
	this.tool = tool;
}
public String getINTR01() {
	return INTR01;
}
public void setINTR01(String iNTR01) {
	INTR01 = iNTR01;
}
public String getINTR02() {
	return INTR02;
}
public void setINTR02(String iNTR02) {
	INTR02 = iNTR02;
}
public String getINTR03() {
	return INTR03;
}
public void setINTR03(String iNTR03) {
	INTR03 = iNTR03;
}
public String getINTR04() {
	return INTR04;
}
public void setINTR04(String iNTR04) {
	INTR04 = iNTR04;
}
public String getINTR05() {
	return INTR05;
}
public void setINTR05(String iNTR05) {
	INTR05 = iNTR05;
}
public String getINTR06() {
	return INTR06;
}
public void setINTR06(String iNTR06) {
	INTR06 = iNTR06;
}
public String getINTR07() {
	return INTR07;
}
public void setINTR07(String iNTR07) {
	INTR07 = iNTR07;
}
public String getCutename() {
	return cutename;
}
public void setCutename(String cutename) {
	this.cutename = cutename;
}
@Override
public String toString() {
	return "Servers [id=" + id + ", name=" + name + ", type=" + type + ", start=" + start + ", LV1_ATK=" + LV1_ATK
			+ ", LV1_HP=" + LV1_HP + ", camp=" + camp + ", LVMAX4_ATK=" + LVMAX4_ATK + ", LVMAX4_HP=" + LVMAX4_HP
			+ ", ArtHit=" + ArtHit + ", BusterHit=" + BusterHit + ", QuickHit=" + QuickHit + ", ExtraHit=" + ExtraHit
			+ ", ILLUST=" + ILLUST + ", CV=" + CV + ", Attributes=" + Attributes + ", Gender=" + Gender + ", Region="
			+ Region + ", Height=" + Height + ", Weight=" + Weight + ", Crit=" + Crit + ", Death=" + Death + ", CritPr="
			+ CritPr + ", Origin=" + Origin + ", Property=" + Property + ", Spetext=" + Spetext + ", maxATK=" + maxATK
			+ ", maxHP=" + maxHP + ", tool=" + tool + ", INTR01=" + INTR01 + ", INTR02=" + INTR02 + ", INTR03=" + INTR03
			+ ", INTR04=" + INTR04 + ", INTR05=" + INTR05 + ", INTR06=" + INTR06 + ", INTR07=" + INTR07 + ", cutename="
			+ cutename + "]";
}



}
