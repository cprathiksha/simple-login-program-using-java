import java.util.*;
class login1{
	
	public static void main(String[] args)
	{
		String f_name, l_name, u_name, password, country;
		int age;
		String user_name, user_password;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First name :");
		f_name = in.next();
		System.out.println("Enter the Last name :");
		l_name = in.next();
		System.out.println("Enter the User name :");
		u_name = in.next();
		System.out.println("Enter the Password :");
		password = in.next();
		System.out.println("Enter the age :");
		age = in.nextInt();
		System.out.println("Enter value for country :");
		country = in.next();
		
		System.out.println("\n To Login \n");
		System.out.println("Enter user name :");
		user_name = in.next();
		System.out.print("Enter the password :");
		user_password = in.next();
		
		if(user_name.equals(u_name) && user_password.equals(password))
		{
			System.out.print("User "+u_name+" logged in successfully from "+country);
		}
		else
		{
			System.out.print("Invalid entry! ");
		}
		
			
	}
}
