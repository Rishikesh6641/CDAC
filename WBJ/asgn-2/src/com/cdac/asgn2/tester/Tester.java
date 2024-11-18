package com.cdac.asgn2.tester;
import java.util.Scanner;

import com.cdac.asgn2.dao.UserDaoImp;

public class Tester {
	
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter sid:");
			int sid=sc.nextInt();
			System.out.println("Enter did:");
			int did=sc.nextInt();
			System.out.println("Enter amount to debit:");
			double amt=sc.nextDouble();
			
			UserDaoImp userDao=new UserDaoImp();
			System.out.println(userDao.executeStoredProcedure(sid, did, amt));
			userDao.cleanUp();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
