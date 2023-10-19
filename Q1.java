package polymorphism; 

import java.util.Scanner;

class Character{
	String name;
	int health_value;
	String uability;
	
	Scanner sc =  new Scanner(System.in);
	
}

class Knights extends Character{
	
	public void input() {
		System.out.println("Enter name of your  Knights: ");
		name = sc.next();
		System.out.println("Enter your health_value: ");
		health_value = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your ability: ");
		uability = sc.nextLine();
		sc.nextLine();

	}
	
	public void show() {
		System.out.println("Name of the Knights is: "+name);
		System.out.println("Health_value of the Knights is: "+health_value);
		System.out.println("Unique ability of the Knights is: "+uability);
		sc.nextLine();


	}
	
}

class Archers extends Character{
	public void input() {
		System.out.println("Enter name of your  Archers: ");
		name = sc.next();
		System.out.println("Enter your health_value: ");
		health_value = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your ability: ");
		uability = sc.nextLine();
		sc.nextLine();

	}
	
	public void show() {
		System.out.println("Name of the Archers is: "+name);
		System.out.println("Health_value of the Archers is: "+health_value);
		System.out.println("Unique ability of the Archers is: "+uability);
		sc.nextLine();


	}
	
}

class Wizards extends Character{
	
	public void input() {
		System.out.println("Enter name of your Wizard: ");
		name = sc.next();
		System.out.println("Enter your health_value: ");
		health_value = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your ability: ");
		uability = sc.nextLine();
		sc.nextLine();

	}
	
	public void show() {
		System.out.println("Name of the Wizards is: "+name);
		System.out.println("Health_value of the Wizards is: "+health_value);
		System.out.println("Unique ability of the Wizards is: "+uability);

	}
	
}



public class Q1 {

	public static void main(String[] args) {
		
		Knights kk = new Knights();
		kk.input();
		kk.show();
		
		Archers aa = new Archers();	
		aa.input();
		aa.show();
		
		Wizards ww = new Wizards();
		ww.input();
		ww.show();
	
	
	
	
	}

}

