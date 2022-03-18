package overriding2;
class Animal
{
}
class Tiger extends Animal
{
	}
class Demo1
{
	public Animal disp()
	{
		System.out.println("abc");
		Animal a = new Animal();
		return a;
	}
}
class Demo2 extends Demo1
{
	public Tiger disp()
	{
		System.out.println("def");
		Tiger t = new Tiger();
		return t;
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 d = new Demo2 ();
d.disp();
	}

}
