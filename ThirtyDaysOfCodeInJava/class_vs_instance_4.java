/*
Class vs Instance - https://www.hackerrank.com/challenges/30-class-vs-instance?h_r=next-challenge&h_v=zen

Task 
Write a Person class with an instance variable, , and a constructor that takes an integer, , as a parameter. The constructor must assign  to  after confirming the argument passed as is not negative; if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

yearPasses() should increase the  instance variable by .
amIOld() should perform the following conditional actions:
If , print You are young..
If  and , print You are a teenager..
Otherwise, print You are old..
*/
import java.io.*;
import java.util.*;

class Person{
	int age;

	public Person(int age){
		if(age >= 0){
			this.age = age;
		}else{
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}
	}

	public void amIOld(){
		if(this.age < 13)
			System.out.println("You are young.");
		else if(this.age >= 13 && this.age < 18)
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
	}

	public void yearPasses() {
	        this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

}

