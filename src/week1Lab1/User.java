package week1Lab1;
public class User {
	
		//This is the public class of user for the first part of question 7
	
	
		String firstName;
		String lastName;
		String company;
		int department;
				
		public User(String fName) {
			this.firstName = fName;
		}
		
		public void lastName(String lName) {
			this.lastName = lName;
		}
		
		public void company(String comp) {
			this.company = comp;
		}
		
		public void department(int dept) {
			dept = department;
		}

		public void userInfo() {
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);
			System.out.println("Company Name: " + company);
			System.out.println("Department number: " + department);
		}
		
}


