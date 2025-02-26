package com.ttn.Practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.gson.Gson;

class Admin{
	public String name;
	public String password;

	public Admin(String name, String password){
		this.name = name;
		this.password = password;
	}

}
@SpringBootApplication
public class PractiseApplication {

	public static void main(String[] args) {
		Admin admin = new Admin("Manvi", "Manvi123@");
		Gson gson = new Gson();
		System.out.println(gson.toJson(admin));
	}

}
