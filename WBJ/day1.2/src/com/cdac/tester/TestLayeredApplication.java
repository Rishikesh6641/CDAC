package com.cdac.tester;

import java.sql.Date;
import java.util.Scanner;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. create DAO instance
			UserDao userDao = new UserDaoImpl();//up casting
			boolean exit = false;
			while (!exit) {
				System.out.println("Options \n1. Fetch Users By Role\n" +"2. Register Voter\n"+"3.Change Password \n"+"4.Delete record \n"+"5.Sing in  \n"+"0. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter role name");
						userDao.fetchUserDetailsByRole(sc.next())
						.forEach(System.out::println);
						break;
					case 2:
						System.out.println("Enter User Details:");
						System.out.println("first_name|last_name|email| password |dob yyyy-mm-dd");
						User voter=new User(sc.next(),sc.next(),sc.next(),sc.next(),Date.valueOf(sc.next()));
						String msg=userDao.registerVoter(voter);
						System.out.println(msg);
						break;
					case 3:
						System.out.println("Enter Email");
						String e=sc.next();
						System.out.println("Enter Old Password");
						String op=sc.next();
						System.out.println("Enter New Password");
						String np=sc.next();
						System.out.println(userDao.changePassword(e, op, np));
						break;
					case 4:
						System.out.println("Enter Id of voter you want to delete:");
						int id =sc.nextInt();
						System.out.println(userDao.deleteDetails(id));
						System.out.println("Log case4");
						break;
					case 5:
						System.out.println("Enter Email:");
						String email=sc.next();
						System.out.println("Enter password");
						String pass=sc.next();
						User user=userDao.SignIn(email, pass);
						if(user instanceof User)
						System.out.println(user.toString());
						else
						System.out.println("Something went wrong");
						break;
					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
