package com.example.singleton;

public class Main {

	public static void main(String[] args) {

		SingletonClass s1 = SingletonClass.getInstance();

		System.out.println(s1);
		System.out.println("SingletonClass data: " + s1.getNextId());
		System.out.println(s1);
		
		

		System.out.println();

		SingletonClass s2 = SingletonClass.getInstance();
		
		System.out.println(s1 == s2);
		
		System.out.println();
		

		System.out.println(s2);
		System.out.println("SingletonClass data: " + s2.getNextId());
		System.out.println(s2);

		System.out.println();

		if (s1 == s2)
			System.out.println("same instance");
		else
			System.out.println("different instances");

		System.out.println();

		DbConfigSingleton db1 = DbConfigSingleton.getInstance();
		DbConfigSingleton db2 = DbConfigSingleton.getInstance();

		if (db1 == db2)
			System.out.println("same db instance");
		else
			System.out.println("different db instances");

		System.out.println("==DBData==");
		System.out.println("Host:" + db1.getHostName() + "\nDB: " + db2.getDbName() + "\nUser: " + db1.getUser()
				+ "\nPasswd: " + db2.getPasswd() + "\nPort: " + db1.getPort());

	}

}