package assignment7;

public class Assignment7 
{
	Node head = null;
	public boolean checkHankelMatrix(int n,int m[][])
	{
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(i <= j)
				{
					for(int k = 0;k <= j-i;k++)
						if(m[i][j] != m[i+k][j-k]) return false;
				}
			}
		}
		return true;
	}
	public Node hankelList(int m[][])
	{
		int n = m.length;
		if(!checkHankelMatrix(n,m))	return null;
		else
		{
			int i = 0;
			for(int j = 0;j < n;j++)
			{
				Node NewNode = new Node(m[i][j]);
				InsertSort(NewNode);
				if(j == n-1)
				{
					i = i^j;
					j = i^j;
					i = i^j;
				}
			}
		}
		return head;
	}
	private void InsertSort(Node NewNode)
	{
		if(head == null)	head = NewNode;
		else
		{
			Node i = head;
			if(i.data > NewNode.data)
			{
				NewNode.next = i;
				head = NewNode;
				return;
			}
			while(i.next != null)
			{
				if(i.data == NewNode.data) return;
				if(i.data < NewNode.data && ((i.next.data > NewNode.data) || (i.next == null)))
				{
					NewNode.next = i.next;
					i.next = NewNode;
					return;
				}
				i = i.next;
			}
			if(i.data == NewNode.data) return;
			NewNode.next = i.next;
			i.next = NewNode;
		}
	}
}

