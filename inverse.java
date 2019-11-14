 import java.util.*;

public class inverse
{
    static Node root;

    class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
	
	public Node insert(Node node, int value)
	{
		if(node==null)
        {
            return new Node(value);
        }

        if(value<node.value)
        {
            if(node.left!=null)
            {
                insert(node.left,value);
            }
            else
                node.left=new Node(value);
        }
		else if(value>node.value)
        {
            if(node.right!=null)
            {
                insert(node.right,value);
            }
            else
                node.right=new Node(value);
        }
        return node;
    }
	
	 public void add(int value)
    {
        root=insert(root,value);
    }

    public int height(Node root)
    {
        int lh=0;
        int rh=0;;
        int h=0;

        if(root==null)
        {
            return 0;
        }
        else
        {
            lh=height(root.left);
            rh=height(root.right);

            if(lh>rh)
            {
                return lh+1;
            }
            else
                return rh+1;
        }
    }
	
	public void display()
	{
		int h=height(root);
		for(int i=h;i>=1;i--)
		{
			printLevel(root,i);
		}
	}
	

	public void printLevel(Node root, int level)
	{
		if(root==null)
		{
			return;
		}
		else if(level==1)
		{
			System.out.println(root.value);
		}
		else if(level>1)
		{
			printLevel(root.right,level-1);
			printLevel(root.left,level-1);
		}
			
	}
	
	public static void main(String args[])
	{
		inverse bt = new inverse();
         
        bt.add(40);
        bt.add(30);
        bt.add(20);
        bt.add(35);
        bt.add(70);
		bt.add(50);
		bt.add(80);
		
		bt.display();
	}
}



        
