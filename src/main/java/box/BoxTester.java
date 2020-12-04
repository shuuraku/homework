package box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length：");
        float l = scanner.nextFloat();
        System.out.print("Please enter object's width：");
        float w = scanner.nextFloat();
        System.out.print("Please enter object's height：");
        int h = scanner.nextInt();
        if(new Box3().validat(l,w,h))
            System.out.println("Box3");
        else if (new Box5().validat(l,w,h))
            System.out.println("Box5");
        else
            System.out.println("規格皆不符合兩種便利箱");

    }
}
