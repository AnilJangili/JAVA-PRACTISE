/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class  Sport { 

// Create a member variable for Sport name 
String sportname;
// Set member variable for Sport name 
Sport(String sportname)
{
    this.sportname=sportname;
}

public static void main(String args[]) { 

// Create object for Sport class 
Sport sp=new Sport("Football");
// Print the value of Sport name using "this" reference
System.out.println("Sport Name:  "+sp.sportname);
} 

} 