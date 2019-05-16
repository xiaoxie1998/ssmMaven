package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.House;
import com.entity.HouseExample;
import com.entity.Users;
import com.entity.DistrictExample.Criteria;
import com.mapper.HouseMapper;
import com.mapper.UsersMapper;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper UsersMapper;
	


    @Autowired
	private HouseMapper houseMapper;

	@Override
	public List<Users> disps() {
		System.out.println("----userdisps()---------");
		List<Users> list=UsersMapper.selectByExample(null);
		
		return list;
	}

	@Override
	public Users disp(int id) {
		
		return UsersMapper.selectByPrimaryKey(id);
	}

	@Override
	public House houseById(int id) {
		System.out.println(id);
		return houseMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<House> houseByIds() {
		HouseExample houseExample = new HouseExample();
		houseExample.or().andUserIdEqualTo(1);
		houseExample.or().andUserIdEqualTo(4);
		houseExample.or().andIdEqualTo(1005);
		return houseMapper.selectByExample(houseExample);
	}
	

}
