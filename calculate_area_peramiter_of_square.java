import java.util.*;
class square{
        int n;
        public int area(){
            return n*n;
        }
        public int perameter(){
            return n*4;
        }
    }    
public class calculate_area_peramiter_of_square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        square sq=new square();
        System.out.print("Enter the lenght of the one side of square : ");
        sq.n=sc.nextInt();
        System.out.println("The area of the square is : "+sq.area());
        System.out.println("The parameter of the Square is : " +sq.perameter());
        System.out.print("If you want t0 know the farmulas of area and perameter of square press 1 0r for end program press 0 : ");
        int choice=sc.nextInt();
        if (choice==1) {
            System.out.println("The formula of area is = side*side ");
            System.out.println("The formula of perameter is = side + side + side + side");
        }
        else{
            System.out.println("Program is End");
        }
        sc.close();
    }
}