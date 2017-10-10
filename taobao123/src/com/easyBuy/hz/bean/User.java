package com.easyBuy.hz.bean;

/**
 * 
 * @author 
 *
 */
public class User {
	private String euUserId;//用户ID
	private String euUserName;//用户名
	private String euPassword;//用户密码
	private String euSex;//性别
	private String euBirthday;//出生日期
	private String euIdentityCode;//用户编码
	private String euEmail;//邮箱
	private String euMobile;//手机号
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEuUserId() {
		return euUserId;
	}
	public void setEuUserId(String euUserId) {
		this.euUserId = euUserId;
	}
	public String getEuUserName() {
		return euUserName;
	}
	public void setEuUserName(String euUserName) {
		this.euUserName = euUserName;
	}
	public String getEuPassword() {
		return euPassword;
	}
	public void setEuPassword(String euPassword) {
		this.euPassword = euPassword;
	}
	public String getEuSex() {
		return euSex;
	}
	public void setEuSex(String euSex) {
		this.euSex = euSex;
	}
	public String getEuBirthday() {
		return euBirthday;
	}
	public void setEuBirthday(String euBirthday) {
		this.euBirthday = euBirthday;
	}
	public String getEuIdentityCode() {
		return euIdentityCode;
	}
	public void setEuIdentityCode(String euIdentityCode) {
		this.euIdentityCode = euIdentityCode;
	}
	public String getEuEmail() {
		return euEmail;
	}
	public void setEuEmail(String euEmail) {
		this.euEmail = euEmail;
	}
	public String getEuMobile() {
		return euMobile;
	}
	public void setEuMobile(String euMobile) {
		this.euMobile = euMobile;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((euBirthday == null) ? 0 : euBirthday.hashCode());
		result = prime * result + ((euEmail == null) ? 0 : euEmail.hashCode());
		result = prime * result
				+ ((euIdentityCode == null) ? 0 : euIdentityCode.hashCode());
		result = prime * result
				+ ((euMobile == null) ? 0 : euMobile.hashCode());
		result = prime * result
				+ ((euPassword == null) ? 0 : euPassword.hashCode());
		result = prime * result + ((euSex == null) ? 0 : euSex.hashCode());
		result = prime * result
				+ ((euUserId == null) ? 0 : euUserId.hashCode());
		result = prime * result
				+ ((euUserName == null) ? 0 : euUserName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (euBirthday == null) {
			if (other.euBirthday != null)
				return false;
		} else if (!euBirthday.equals(other.euBirthday))
			return false;
		if (euEmail == null) {
			if (other.euEmail != null)
				return false;
		} else if (!euEmail.equals(other.euEmail))
			return false;
		if (euIdentityCode == null) {
			if (other.euIdentityCode != null)
				return false;
		} else if (!euIdentityCode.equals(other.euIdentityCode))
			return false;
		if (euMobile == null) {
			if (other.euMobile != null)
				return false;
		} else if (!euMobile.equals(other.euMobile))
			return false;
		if (euPassword == null) {
			if (other.euPassword != null)
				return false;
		} else if (!euPassword.equals(other.euPassword))
			return false;
		if (euSex == null) {
			if (other.euSex != null)
				return false;
		} else if (!euSex.equals(other.euSex))
			return false;
		if (euUserId == null) {
			if (other.euUserId != null)
				return false;
		} else if (!euUserId.equals(other.euUserId))
			return false;
		if (euUserName == null) {
			if (other.euUserName != null)
				return false;
		} else if (!euUserName.equals(other.euUserName))
			return false;
		return true;
	}
	public User(String euUserId, String euUserName, String euPassword,
			String euSex, String euBirthday, String euIdentityCode,
			String euEmail, String euMobile) {
		super();
		this.euUserId = euUserId;
		this.euUserName = euUserName;
		this.euPassword = euPassword;
		this.euSex = euSex;
		this.euBirthday = euBirthday;
		this.euIdentityCode = euIdentityCode;
		this.euEmail = euEmail;
		this.euMobile = euMobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [euUserId=" + euUserId + ", euUserName=" + euUserName
				+ ", euPassword=" + euPassword + ", euSex=" + euSex
				+ ", euBirthday=" + euBirthday + ", euIdentityCode="
				+ euIdentityCode + ", euEmail=" + euEmail + ", euMobile="
				+ euMobile + ", userName=" + userName + "]";
	}
	

}
