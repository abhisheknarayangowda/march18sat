package overriding0;
class Demo1
{
	public void disp()
	{
		System.out.println("Sri Ramakrishna paramahamsa");
	}
}
class Demo2 extends Demo1
{
	public void dsp()
	{
		System.out.println("Sri Sharada Devi ");
	}
}
public class Launch0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 d = new Demo2();
d.disp();
	}

}
