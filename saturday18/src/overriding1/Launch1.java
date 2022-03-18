package overriding1;
class Demo1
{
	int i=5;
	void disp()
	{
		System.out.println(i);
	}
}
class Demo2 extends Demo1
{
	int i =10;
	void disp()
	{
		System.out.println(i);
		System.out.println(super.i);
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 d = new Demo2();
d.disp();
	}

}
