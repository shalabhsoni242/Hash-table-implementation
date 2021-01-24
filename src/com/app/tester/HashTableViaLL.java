package com.app.tester;
// class to implement separate chaining to avoid collission in hash table   
public class HashTableViaLL {

	public class Bucket{
		int data;
		boolean isEmpty;
		Bucket next;
	}
	
	private Bucket[] ht;
	private Bucket current;
	private int n;
	
	public HashTableViaLL(int size) {
		n = size;
		ht = new Bucket[n];
		for (int i = 0; i < n; ++i) {
			ht[i] = new Bucket();
			ht[i].isEmpty = true;
			ht[i].next = null;
		}		
	}
	
	private int hashFn(int key) {
		return key % n; // MOD N hash function
	}
	
	
	public void add(int elem) {
		int bucketId = hashFn(elem);
		if (ht[bucketId].isEmpty == true) {
			ht[bucketId].data = elem; // ht[bucket.Id].data.insert(elem);
			ht[bucketId].isEmpty = false;
			System.out.println(elem + " stored at bucket id " + bucketId);
		} 
		else {
			current = ht[bucketId];
			while(current.next != null)
				current = current.next;
			current.next = new Bucket();
			current.next.data = elem;
			System.out.println(elem + " stored at bucket id " + bucketId+" without collission");
		}
	}
	
	
	public boolean search(int elem) {
		int bucketId = hashFn(elem);
		current = ht[bucketId];
		while(current != null) {
			if (current.data == elem)
				return true;
			current = current.next;
		}		
		return false;
	}
	
	public void printData() {
		System.out.println("\nData stored in Hash Table : ");
		for(int i=0;i<n;i++) {
			int j=i;
			current = ht[j];
			while(current != null && current.data != 0) {
				System.out.print(current.data+" ");
				current = current.next;
			}			
		}			
	}
	
	public void deleteData(int elem) {
		int bucketId = hashFn(elem);
		while(ht[bucketId] != null) {
			if (ht[bucketId].data == elem) {
				ht[bucketId].data = 0;
				ht[bucketId].isEmpty = true;
				System.out.println(elem+" deleted succesfully");
				return;
			}
		}
	}
	
}







