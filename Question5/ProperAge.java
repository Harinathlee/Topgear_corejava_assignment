package Question5;
/* 5.Write a program to accept name and age of a person from the command                    
  prompt(passed as arguments when you execute the class) and ensure that the age 
  entered is >=18 and < 60. Display proper error messages. The program must exit 
  gracefully after displaying the error message in case the arguments passed are 
  not proper. 
  (Hint : Create a user defined exception class for handling errors.)*/
public class ProperAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		if(age>=18 && age < 60) {
			System.out.println(name.toUpperCase()+" has proper age as "+age);
		}
		else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}

	}

}

class InvalidAgeException extends Exception{
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "The Age you enter must be >=18 and < 60";
    }
}