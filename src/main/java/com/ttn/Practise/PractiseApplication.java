package com.ttn.Practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.gson.Gson;
import org.joda.time.DateTime;

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
		SpringApplication.run(PractiseApplication.class, args);


		Admin admin = new Admin("Manvi", "Manvi123@");
		Gson gson = new Gson();
		String jsonAdmin = gson.toJson(admin);
		System.out.println("Admin JSON: " + jsonAdmin);


		DateTime now = new DateTime();
		System.out.println("Current Date and Time: " + now);

	}

}
