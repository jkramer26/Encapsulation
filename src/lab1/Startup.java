package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        
        //instantiate an employee object
        Employee employee = new Employee("Peter", "Piper", "333-1234", "12-18-1990");
        
        //without this the Orientation will be incomplete
        //this calls the Orientation method and assigns a cubicleID
        employee.doOrientation("c565");
        
        //shows information about the employee
        System.out.println("Employee Name: " + employee.getFullName()
                            +"\nEmployee SSN: " + employee.getSsn()
                            +"\nEmployee Birthdate: " + employee.getBirthDate()
                            +"\nEmployee Cube ID: " + employee.getCubeId() + "\n\n");
                            
        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
