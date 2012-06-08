package com.idega.xroad.bean;

import java.io.Serializable;

import com.idega.user.bean.UserDataBean;
import com.idega.user.business.UserApplicationEngine;
import com.idega.util.expression.ELUtil;

/**
 * Data structure to represent user entity
 *
 * @author valdas
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1514809950328524234L;

	private String id, email, phone, name;

	public User() {
		super();
	}

	public User(String id, String email, String phone, String name) {
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.name = name;
	}

	public User(com.idega.user.data.User user){
		id = user.getId();
		UserApplicationEngine userApplicationEngine = ELUtil.getInstance().getBean(UserApplicationEngine.class);
		UserDataBean userDataBean = userApplicationEngine.getUserInfo(user);
		email = userDataBean.getEmail();
		phone = userDataBean.getPhone();
		name = userDataBean.getName();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof User){
			if(id == null){
				return ((User)object).getId() == null;
			}
			return id.equals(((User)object).getId());
		}
		return false;
	}

}
