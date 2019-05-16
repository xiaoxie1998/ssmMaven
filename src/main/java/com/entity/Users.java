package com.entity;

public class Users {
    private Integer id;

    private String name;

    private String password;

    private String username;

    private String telephone;

    private String isadmin;

    private House house;
    
    /**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin == null ? null : isadmin.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username
				+ ", telephone=" + telephone + ", isadmin=" + isadmin + ", house=" + house + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
    
	
}