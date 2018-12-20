import java.util.*;
public class Student {
    public void marks() {
        int n;
        System.out.println("enter the number of students");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter marks of students");

        for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

        }
        int max, min;
        float avg;
        min = arr[0];
        for (int i = 1; i < n; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("minimum marks is:" + min);
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("maximum marks is:" + max);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            avg = sum / n;


            System.out.println("the average is :" + avg);
        }
    }
    public static void main(String[] args){
        Student obj= new Student();
        obj.marks();
    }
}
