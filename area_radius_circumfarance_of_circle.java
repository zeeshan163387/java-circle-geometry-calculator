import java.util.*;
class radius_of_circle{
    double c;
    double x=Math.PI;
    public double radius(){
        return c/(2*x);
    }
}
class Area_of_circle{
    double x=Math.PI;
    double r;
    public double area(){

        return x*r*r;
    }
}
class circumfarance_of_circle{
    double r;
    double x=Math.PI;
    public double circumfarance(){
        return 2*x*r;

    }
}
public class area_radius_circumfarance_of_circle {
    public static void main(String[] args) {
        radius_of_circle roc=new radius_of_circle();
        Area_of_circle   aoc=new Area_of_circle();
        circumfarance_of_circle coc=new circumfarance_of_circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("This is simple calculater to calculate circle Area and Radius and Circumfarance");
        System.out.print("Slect what you want to calculate (Area,Radius,Circumfarance) enter (1,2,3) respectively : ");
        int choice=sc.nextInt();
        if (choice==1) {
            System.out.println("Area of the circle are gona calculat ");
            System.out.print("Enter the value of r : ");
            aoc.r=sc.nextDouble();
            System.out.print("The area of the circle is : "+aoc.area());
        }
        else if (choice==2) {
            System.out.println("Radius of the circle are gona calculat ");
            System.out.print("Enter the value of  c : ");
            roc.c=sc.nextDouble();
            System.out.print("The radius of the circle is : "+roc.radius());
        }
        else if (choice==3) {
            System.out.println("Circumfarance of the circle are gona calculat ");
            System.out.print("Enter the value of r : ");
            coc.r=sc.nextDouble();
            System.out.print("The circumfarance  of the circule is : "+coc.circumfarance());
        }
        else{
            System.out.println("Invalid Choice");
        }
        System.out.println();
            System.out.print("If you want to know the farmulas slect 1 for area, 2 for radius , 3 for circumfarance or 0 to end program : ");
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Farmula of Area is : A=πr*r" );
                    break;
                case 2:
                    System.out.println("Farmula of Radius is :r=C/2π");
                    break;
                case 3:
                    System.out.println("Farmula of circumfarance is : C=2πr");
                    break;
                case 0:
                    System.out.println("PROGRAM END");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            sc.close();
    }

}

