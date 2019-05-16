package com.service;

import java.util.List;

import com.entity.House;
import com.entity.Users;

public interface UserService {

	//²éËùÓĞ
	public List<Users> disps();
	public Users disp(int id);
	
	public House houseById(int id);
	//or
	public List<House> houseByIds();
}
