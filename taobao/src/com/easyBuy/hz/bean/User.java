package com.easyBuy.hz.bean;

/**
 * 
 * @author NieWang
 *
 */
public class User {
	private String en_user_id;//用户ID
	private String  en_user_name;//用户名
	private String en_user_pwd;//用户密码
	private String en_user_sex;//性别
	private String en_user_birthday;//出生日期
	private String en_user_identify_code;//用户编码
	private String email;//邮箱
	private String en_mobile;//手机号
	private String en_address;//地址
	private String en_status;//账号类型
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String en_user_id, String en_user_name, String en_user_pwd, String en_user_sex, String en_user_birthday,
			String en_user_identify_code, String email, String en_mobile, String en_address, String en_status) {
		super();
		this.en_user_id = en_user_id;
		this.en_user_name = en_user_name;
		this.en_user_pwd = en_user_pwd;
		this.en_user_sex = en_user_sex;
		this.en_user_birthday = en_user_birthday;
		this.en_user_identify_code = en_user_identify_code;
		this.email = email;
		this.en_mobile = en_mobile;
		this.en_address = en_address;
		this.en_status = en_status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((en_address == null) ? 0 : en_address.hashCode());
		result = prime * result + ((en_mobile == null) ? 0 : en_mobile.hashCode());
		result = prime * result + ((en_status == null) ? 0 : en_status.hashCode());
		result = prime * result + ((en_user_birthday == null) ? 0 : en_user_birthday.hashCode());
		result = prime * result + ((en_user_id == null) ? 0 : en_user_id.hashCode());
		result = prime * result + ((en_user_identify_code == null) ? 0 : en_user_identify_code.hashCode());
		result = prime * result + ((en_user_name == null) ? 0 : en_user_name.hashCode());
		result = prime * result + ((en_user_pwd == null) ? 0 : en_user_pwd.hashCode());
		result = prime * result + ((en_user_sex == null) ? 0 : en_user_sex.hashCode());
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (en_address == null) {
			if (other.en_address != null)
				return false;
		} else if (!en_address.equals(other.en_address))
			return false;
		if (en_mobile == null) {
			if (other.en_mobile != null)
				return false;
		} else if (!en_mobile.equals(other.en_mobile))
			return false;
		if (en_status == null) {
			if (other.en_status != null)
				return false;
		} else if (!en_status.equals(other.en_status))
			return false;
		if (en_user_birthday == null) {
			if (other.en_user_birthday != null)
				return false;
		} else if (!en_user_birthday.equals(other.en_user_birthday))
			return false;
		if (en_user_id == null) {
			if (other.en_user_id != null)
				return false;
		} else if (!en_user_id.equals(other.en_user_id))
			return false;
		if (en_user_identify_code == null) {
			if (other.en_user_identify_code != null)
				return false;
		} else if (!en_user_identify_code.equals(other.en_user_identify_code))
			return false;
		if (en_user_name == null) {
			if (other.en_user_name != null)
				return false;
		} else if (!en_user_name.equals(other.en_user_name))
			return false;
		if (en_user_pwd == null) {
			if (other.en_user_pwd != null)
				return false;
		} else if (!en_user_pwd.equals(other.en_user_pwd))
			return false;
		if (en_user_sex == null) {
			if (other.en_user_sex != null)
				return false;
		} else if (!en_user_sex.equals(other.en_user_sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [en_user_id=" + en_user_id + ", en_user_name=" + en_user_name + ", en_user_pwd=" + en_user_pwd
				+ ", en_user_sex=" + en_user_sex + ", en_user_birthday=" + en_user_birthday + ", en_user_identify_code="
				+ en_user_identify_code + ", email=" + email + ", en_mobile=" + en_mobile + ", en_address=" + en_address
				+ ", en_status=" + en_status + "]";
	}
	public String getEn_user_id() {
		return en_user_id;
	}
	public void setEn_user_id(String en_user_id) {
		this.en_user_id = en_user_id;
	}
	public String getEn_user_name() {
		return en_user_name;
	}
	public void setEn_user_name(String en_user_name) {
		this.en_user_name = en_user_name;
	}
	public String getEn_user_pwd() {
		return en_user_pwd;
	}
	public void setEn_user_pwd(String en_user_pwd) {
		this.en_user_pwd = en_user_pwd;
	}
	public String getEn_user_sex() {
		return en_user_sex;
	}
	public void setEn_user_sex(String en_user_sex) {
		this.en_user_sex = en_user_sex;
	}
	public String getEn_user_birthday() {
		return en_user_birthday;
	}
	public void setEn_user_birthday(String en_user_birthday) {
		this.en_user_birthday = en_user_birthday;
	}
	public String getEn_user_identify_code() {
		return en_user_identify_code;
	}
	public void setEn_user_identify_code(String en_user_identify_code) {
		this.en_user_identify_code = en_user_identify_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEn_mobile() {
		return en_mobile;
	}
	public void setEn_mobile(String en_mobile) {
		this.en_mobile = en_mobile;
	}
	public String getEn_address() {
		return en_address;
	}
	public void setEn_address(String en_address) {
		this.en_address = en_address;
	}
	public String getEn_status() {
		return en_status;
	}
	public void setEn_status(String en_status) {
		this.en_status = en_status;
	}
	
}