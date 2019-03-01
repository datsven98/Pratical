import java.util.Scanner;

public class kiemtra123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("nhap itemID");
        int ID = sc.nextInt();
        System.out.println("nhap name");
        String name = ac.nextLine();
        System.out.println("nhap producer");
        String product = ac.nextLine();
        System.out.println("nhap price");
        double price = sc.nextDouble();
Item hanghoa= new Item(ID,name,product,price);
        System.out.println(hanghoa.toString());
    }
    }
