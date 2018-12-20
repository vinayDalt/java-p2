public class Poweroffour {
    public boolean checkPowfour(int num) {
        if (num == 0)
            return false;
        while (num != 1) {
            if (num % 4 != 0)
                return false;
            num = num / 4;
        }
        return true;
    }

    public static void main(String[] args) {
        Poweroffour obj = new Poweroffour();
        if (obj.checkPowfour(256) == true) {
            System.out.println("it is power of 4");
        } else
            System.out.println("error");
    }
}

