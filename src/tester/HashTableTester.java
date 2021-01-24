package tester;

import java.util.Scanner;

import com.app.tester.HashTableViaLL;

public class HashTableTester {

	public static void main(String[] args) {
		HashTableViaLL ob = new HashTableViaLL(10);		
		boolean flag = true;		
		try(Scanner sc = new Scanner(System.in)){
			while(flag) {
				System.out.println("\n1. Add element in hash table\n2. Print all the elemets of the hash table\n3. Seach an element in hash table\n4. Delete elements from the hash table\n5. Exit\nEnter your choice");
				
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("Enter the element that you want to insert in HT");
					ob.add(sc.nextInt());
					break;
					
				case 2:
					ob.printData();
					break;
					
				case 3:
					System.out.println("Enter the element that you want to search in HT");
					if(ob.search(sc.nextInt())) {
						System.out.println("\nmatch found");
						break;
					}						
					else {
						System.out.println("\nmatch not found");
						break;
					}
					
				case 4:
					System.out.println("Enter the element that you want to delete from HT");
					ob.deleteData(sc.nextInt());
					break;
				
				case 5:
					System.out.println("thankyou !!!");
					flag = false;
					break;
					
				default:
					System.out.println("Wrong choice !!!");
					break;
				
				}
			}
		}		
	}

}



























