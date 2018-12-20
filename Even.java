public class Even {
    public static boolean isEven(int num)
    {
        boolean res;
        if(num%2==0)
        {
            res=true;
            System.out.println(res);
            return true;
        }
        else
            {
            res = false;
                System.out.println(res);
            return false;
        }

    }
    public static void main(String[] args)
    {
        Even obj=new Even();
        obj.isEven(8);
        System.out.println();

    }
}
