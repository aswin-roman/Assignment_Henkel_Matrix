package assignment7;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment7 a1 = new Assignment7();
		int[][] arr = {{0,2,3,5},
				  	   {2,3,5,1},
				  	   {3,5,0,9},
				  	   {5,1,9,8}};
		
		System.out.println(a1.checkHankelMatrix(4,arr));
		
		Node head = a1.hankelList(arr);
		
			String LL = "";
			if(head == null)
				System.out.println("Empty");
			else
			{
				Node i = head;
				while(i.next != null)
				{ 
					LL += " Data : " + i.data +  "\n";
					i = i.next;
				}
				LL += " Data : " + i.data +  "\n";
				System.out.println(LL);	
			}

	}
}
