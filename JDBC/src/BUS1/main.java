package BUS1;

import java.util.*;
public class main {

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        inventory inventory = new inventory();

        buss cs=new buss();
        System.out.println("WELCOME TO SMART TRANSPORTATION (BUS)");

int choice;

do {

System.out.println("1. Add");

System.out.println("2. Update");

System.out.println("3. Remove");

System.out.println("4. Search by ID");

System.out.println("5. Show");

System.out.println("6. Exit");

System.out.print("Enter your choice: ");

choice = scanner.nextInt();

scanner.nextLine();
switch (choice) {

case 1:	


	System.out.print("Enter bname : ");

	//cs.setBname(scanner.nextLine());

	cs.setBname(scanner.nextLine()); 

	System.out.print("Enter bprice: ");

	cs.setBprice(scanner.nextInt());

	System.out.println("Enter bcolor: ");
	  scanner.nextLine();
    cs.setBcolor(scanner.nextLine()); 
  
    inventory.addProduct(cs);

	break;

case 2:



System.out.println("Enter ID to Update the product");
int caridupdate=scanner.nextInt();
cs.setId(caridupdate);
System.out.print("Enter bname : ");

cs.setBname(scanner.next()); 

System.out.print("Enter bprice: ");

cs.setBprice(scanner.nextInt());

//System.out.println("Enter bcolor: ");
//cs.setBcolor(scanner.nextLine()); 
inventory.updateProduct(cs);
break;


case 3:



	System.out.println("Enter ID to remove the product");
	int busiddelete=scanner.nextInt();
	inventory.removeProduct(busiddelete);
	break;	
	

case 4:

System.out.print("Enter product ID to search: ");

int searchId = scanner.nextInt();

scanner.nextLine();

buss foundProduct = (buss) inventory.getBname();

if (foundProduct != null) {

System.out.println("Product found:");

System.out.println(foundProduct);

                    } else

                    {

System.out.println("Product not found.");

                    }

break;

case 5:

System.out.println("All products in inventory:");

inventory.showAllProducts();

break;

case 6:

System.out.println("Exiting program...");

break;

default:

System.out.println("Invalid choice. Please enter a number between 1 and 6.");

            }

        } while (choice != 6);

scanner.close();

    }


}

