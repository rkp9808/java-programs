class Dynamic
{
	int a, x, y ,z;

	{
		int x = 100,y = 70;

		a = x+y;

	}

	void sum()

	{
		System.out.println(a);
	}

	{
		int x = 100,y = 70;

		z = x-y;

	}

	void div()

	{
		System.out.println(z);
	}

	public static void main(String aa[])
	{
		Dynamic ob = new Dynamic();
		ob.sum();
		ob.div();
		System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(ob.z);
		System.out.println(ob.a);
	}
}