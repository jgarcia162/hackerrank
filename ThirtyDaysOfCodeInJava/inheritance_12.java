/*Day 12 Inheritance - https://www.hackerrank.com/challenges/30-inheritance?h_r=next-challenge&h_v=zen
	

You are given two classes, Person and Student, where Person is the base class
and Student is the derived class. Completed code for Person and a declaration
for Student are provided for you in the editor. Observe that Student inherits
all the properties of Person.  */



class Student extends Person{
    String firstName;
    String lastName;
    int id;
	int[] scores; 
    
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName,lastName,id);
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.id = id;
        this.scores = scores;
    }
    
    public char calculate(){
        int total =0;
       for(Integer grade:this.scores){
           total+=grade;
       } 
       int grade = total/this.scores.length; 
        
       if(grade >= 90 && grade <= 100)
           return 'O';
       else if(grade >= 80 && grade < 90)
           return 'E';
       else if(grade >= 70 && grade < 80)
           return 'A';
       else if(grade >= 55 && grade < 70)
           return 'P';
       else if(grade >= 40 && grade < 55)
           return 'D';
       else
           return 'T';
    } 
}