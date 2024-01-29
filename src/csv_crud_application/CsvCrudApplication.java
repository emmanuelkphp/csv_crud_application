package csv_crud_application;

import java.util.Scanner;

public class CsvCrudApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n1. Add Record");
			System.out.println("2. View Records");
	        System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
		}
	}
	
	//add records in the csv file
	private static void addRecord() {
		System.out.println("store records");
	}
	
	//view the records from csv file
	private static void viewRecords() {
		System.out.println("view records");
	}
	
	//update records from the csv file
	private static void updateRecord() {
		System.out.println("update the records");
	}
	
	//delete the records from the csv file
	private static void deleteRecord() {
		System.out.println("delete the records form the csv file");
	}
}
