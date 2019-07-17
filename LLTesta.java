package test;

public class LLTesta {
	
	public static void main(String args[])
	{
		LinkedLists l = new LinkedLists();
		
		l.insert(5);
		l.insert(10);	
		l.insert(15);
		l.insert(20);
		l.insert(30);
		
		l.print();
		
		System.out.println(l.search(4));
		
		System.out.println(l.search(20));
		
		l.insert(4, 25);
		l.print();
		
		l.insert(0, 1);
		l.print();
		
		l.delete(1);
		l.print();
		
		l.delete(30);
		l.print();
		
		l.insertFirst(100);
        l.print();  // prints 100 5 20 25
        l.insertFirst(110);
        l.print();  // prints 110 100 5 20 25
        l.deleteFirst();
        l.print();  // prints 100 5 20 25
        l.deleteFirst();
        l.print();  // prints 5 20 25
	}
}
