package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.House;
import com.entity.Users;
import com.service.UserService;


@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/disps")
	
	public @ResponseBody Map<String, Object> disps(HttpServletRequest request,int page,int limit) {
		System.out.println("ffff");
		List<Users> list=UserService.disps();
		Map<String, Object> map = new HashMap<String, Object>();
		for (Users users : list) {
			System.out.println(users);
		}
		System.out.println(page+"\t"+limit);
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}
	

	
	@RequestMapping("/userspd")
	public @ResponseBody Users users(int id) {
//		List<Users> list=UserService.disps();
//		for (Users users : list) {
//			System.out.println(users);
//		}
//		//request.setAttribute("list", list);
		Users users=UserService.disp(id);
		users.setName("ÀÏºÚ");
		System.out.println(users);
		
		return users;
	}
	
	@RequestMapping("chakan")
	public String chakan() {
		List<Users> list=UserService.disps();
		for (Users users : list) {
			System.out.println(users);
		}
		return "ok";
	}
	
	@RequestMapping("shuju")
	public String shuju(Users users,String typeId) {
		System.out.println(users);
		System.out.println(typeId);
		return "ok";
	}
	
	@RequestMapping("chaxun")
	public String chaxun(int id) {
		/*
		 * House house= UserService.houseById(id); System.out.println(house);
		 */
		
		List<House> list=UserService.houseByIds();
		for (House house : list) {
			System.out.println(house);
		}
		
		System.out.println("ÊýÁ¿£º"+list.size());
		return "ok";
	}
}
