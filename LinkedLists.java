package test;

public class LinkedLists {
	
	Node head;
	
	void insert (int key)
	{
		Node temp = new Node();
		temp.data = key;                         
		
		if (head == null)
		{
			head = temp;
		}
		else
		{
			Node current = head;
			
			while (current.next != null) 
			{
				current = current.next;
			}
			
			current.next = temp;
		}
	}
	
	int search (int key) 
	{
		int position = 0;
		Node current = head;
		
		while (current.next != null)
		{
			if (current.data == key)
			{
				return position;
				//break;
			}	
			else
			{
				current = current.next;
				position++;
			}
		}
		return -1;
	}
		
	void insert (int position, int value)
	{
		Node temp = new Node();
		temp.data = value;
		
		//return if the position is a negative value
		if(position < 0)
		{
			return;
		}
		
		Node current = head;
		//int i;
		
		if (position == 0)
		{
			temp.next = head;
			head = temp;
		}
		
		else
		{	
			int i;
			for (i = 0; i < position - 1; i++)
			{
				current = current.next;
				if(current.next == null)
				{
					break;
				}
			}
			if(i < (position - 1))
			{
				temp.next = current.next; 
			}
			current.next = temp; 
		}
	}
	
	void delete (int key)
	{
		int nodePosition = search(key);
		int i;
		
		Node current = head;
		
		
		if (nodePosition == 0)
			head = head.next;
		
		else if (nodePosition > 0)
		{
			for (i=0; i<nodePosition - 1; i++)
				current = current.next;
			
			Node temp = current.next;
			
			if (temp.next == null)
				current.next = null;
			
			else
			{	
				current.next = temp.next; 
				temp.next = null;
			}
		}
		
	}
	
	void insertFirst(int key) 
	{
		Node temp = new Node();
		temp.data = key;
		
		temp.next = head;
		head = temp;
	}
	
	void deleteFirst()
	{
		head = head.next;
			
	}
	
	void print()
	{
		Node curr = head;
		
		while (curr != null)
	 	{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.println();
	}
	
}