package emailapp;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;

   // Constructor to receive the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        // Call the method asking the department - return the department
    }


    // Ask for the department

    private String setDepartment() {
        this.department = department;
    }

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password

}