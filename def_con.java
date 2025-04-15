class Def_con
{
    int x,y,result;

    Def_con()
    {
        x=10;
        y=20;
    }

    int sum()
    {
        result=x+y;
        return result;
    }

    public static void main(String a[])
    {
        Def_con ob=new Def_con();
        System.out.println("Sum is \t"+ob.sum());
    }
}