package corejava_package;

public class firstprogram {
	void add(int x,int y)
	{
		System.out.println("add 2 nos"+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 2 nos"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstprogram ob1=new firstprogram();
		ob1.add(3, 4);
		ob1.add(6,2,3);
		

	}

}
