import java.util.Scanner;


        public class Main{
            public static void main (String args[]){

                Scanner input = new Scanner(System.in);
                int choice;

                // user inetrction - user frindly
                System.out.println("Hi welcome to my Shapes Applicagtion\n\n");

                System.out.println("The following are the shapes");
                System.out.println("1) Circle");
                System.out.println("2) Cuboid");
                System.out.println("3) Rectangle");
                System.out.println("4) Cylinder");
                System.out.println("5) sphere");
                System.out.println("6) Cone\n");
                System.out.print("Enter your choice : ");
                choice = input.nextInt();

                switch(choice){




                    case 1:

                        double radius;
                        System.out.println("You selceted the circle");
                        System.out.print("Enter the radius : ");
                        radius = input.nextDouble();

                        // creating the object

                        Circle c1 = new Circle(radius);
                        // c1.radius = 10; -
                        System.out.println("Circumference = "+c1.calculateCircleCircumference());
                        System.out.println(" calculateCircleArea= "+c1.calculateCircleArea());

                        break;

                    case 2:

                        System.out.println("You selected Cuboid");
                        System.out.print("Enter the width : ");
                        int width = input.nextInt();
                        System.out.print("Enter the length : ");
                      int  length = input.nextInt();
                        System.out.print("Enter the height : ");
                     int height = input.nextInt();


                        // creating the object

                        Cuboid cu = new Cuboid(width,length,height);
//cu.width=10;
                        System.out.println(" claculateCuboidArea= "+cu.claculateCuboidArea());
                        System.out.println("claculateCuboidVolume = "+cu.claculateCuboidVolume());

                        break;
                    case 3:


                        System.out.println("You selceted the Rectangle");
                        System.out.print("Enter the width : ");
                       int   a = input.nextInt();
                        System.out.print("Enter the length : ");
                      int   b = input.nextInt();
                        System.out.print("Enter the height : ");
                       int  c = input.nextInt();


                        // creating the object

                        Rectangle re=new Rectangle(a,b,c);
                        // c1.radius = 10; -
                        System.out.println("calculate Reactangle Area= "+re.claculateRectangelArea());
                        System.out.println(" calculate Rectangle volume= "+re.claculateRectanglevolume());

                        break;
                    case 4:


                        System.out.println("You selceted the cylinder");
                        System.out.print("Enter the radius : ");
                       double r = input.nextDouble();
                        System.out.print("Enter the height : ");
                        double h = input.nextDouble();

                        // creating the object

                        Cylinder cy = new Cylinder(r,h);

                        System.out.println("Circumference = "+cy.calculateCylindervolume());
                        System.out.println(" calculateCircleArea= "+cy.calculateCylinderarea());

                        break;
                    case 5:
                    System.out.println("You selceted the Sphere");
                    System.out.print("Enter the radius : ");
                   double r1 = input.nextDouble();

                    // creating the object

                    Sphere sp=new Sphere(r1);

                    System.out.println("Sphere volume = "+sp.calculateShperevolume());
                    System.out.println(" calculate shpere Area= "+sp.calculateCylinderarea());

                    break;
                    case 6:
                        System.out.println("You selceted the cone");
                        System.out.print("Enter the radius : ");
                        double r2 = input.nextDouble();
                        System.out.print("Enter the height : ");
                        double h2 = input.nextDouble();
                        System.out.print("Enter the surface area : ");
                        double s = input.nextDouble();

                        // creating the object

                        Cone co=new Cone(r2,h2,s);

                        System.out.println("Cone volume = "+co.calculateConevolume());
                        System.out.println(" cone Area= "+co.calculateConearea());

                        break;



                }
            }
        }
public class Cone {
    private double r2;
    private double h2;
    private double s;

    // constructor

    public Cone(){
        this.r2 = 35;
        this.h2=29;
        this.s=40;
    }

    public Cone(double r2,double h2,double s){
        this.r2 = r2;
        this.h2=h2;
        this.s=s;
    }

    // setter
    public void setRadius(double r2){
        this.r2 = r2;
    }

    // getter
    public double getRadius(){
        return r2;
    }
    public void setHeight(double h2){
        this.h2 = h2;
    }

    // getter
    public double getS(){
        return s;
    }
    public void setS(double S){
        this.s = s;
    }

    // getter
    public double getHeight(){
        return h2;
    }

    // other methods
    public double calculateConevolume(){

        return (22/7*r2*r2*h2/3);

    }

    public double calculateConearea(){
        return (22/7*r2*s+22/7*r2*r2);
    }
}
public class Sphere {

        // member variable declaration
        private double r1;

        // constructor

        public Sphere(){
            this.r1 = 10;
        }

        public Sphere(double radius){
            this.r1 = radius;
        }

        // setter
        public void setRadius(double radius){
            this.r1 = radius;
        }

        // getter
        public double getRadius(){
            return r1;
        }

        // other methods
        public double calculateShperevolume(){
            return 4/3*22/7*r1*r1*r1;
        }

        public double calculateCylinderarea(){
            return 4*22/7*r1*r1;
        }
    }
public class Cylinder {

        // member variable declaration
        private double r;
        private double h;

        // constructor

        public Cylinder(){
            this.r = 5;
            this.h=20;
        }

        public Cylinder(double r,double h){
            this.r = r;
            this.h=h;
        }

        // setter
        public void setRadius(double radius){
            this.r = r;
        }

        // getter
        public double getRadius(){
            return r;
        }
    public void setHeight(double h){
        this.h = h;
    }

    // getter
    public double getHeight(){
        return h;
    }

        // other methods
        public double calculateCylindervolume(){

            return 2*22/7*r*h;

        }

        public double calculateCylinderarea(){
            return (2*22/7*r*h+2*22/7*r*r);
        }
    }

public class Rectangle {
    private int a;    // variables should no be directly changed by other classes
    private int b;
    private int c;

    // construtor declaration
    public Rectangle(){
        a = 10;
        b = 20;
        c = 30;
    }

    public Rectangle(int a, int b, int c){ // oveloaded constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // setters - mutators

    public void setWidth(int a){
        // member variable value = parameter value
        this.a = a ;
    }

    public void setLength(int b){
        this.b= b ;
    }

    public void setHeight(int c){
        this.c = c ;
    }

    // getters - accessors

    public int getWidth(){
        return a ;
    }

    public int getLength(){
        return b ;
    }

    public int getHeight(){
        return c ;
    }

    public int claculateRectanglevolume(){
        int volume; // local variable
        volume = a * b * c;
        return volume;
    }

    public int claculateRectangelArea(){
        return (b*a + b*c + c*a)*2;
    }
}
public class Cuboid {




        private int width;    // variables should no be directly changed by other classes
        private int length;
        private int height;

        // construtor declaration
        public Cuboid(){
            width = 10;
            length = 20;
            height = 30;
        }

    public Cuboid(int width, int length, int height){ // oveloaded constructor
        this.width = width;
        this.length = length;
        this.height = height;
    }

        // setters - mutators

        public void setWidth(int width){
            // member variable value = parameter value
            this.width = width ;
        }

        public void setLength(int length){
            this.length = length ;
        }

        public void setHeight(int height){
            this.height = height ;
        }

        // getters - accessors

        public int getWidth(){
            return width ;
        }

        public int getLength(){
            return length ;
        }

        public int getHeight(){
            return height ;
        }

        public int claculateCuboidVolume(){
            int volume; // local variable
            volume = height * length * width;
            return volume;
        }

        public int claculateCuboidArea(){
            int area;
            area=(length*width + length*height + height*width)*2;
            return area;
        }
    }
public class Circle{
        // member variable declaration
        private double radius;

        // constructor

        public Circle(){
            this.radius = 10;
        }

        public Circle(double radius){
            this.radius = radius;
        }

        // setter
        public void setRadius(double radius){
            this.radius = radius;
        }

        // getter
        public double getRadius(){
            return radius;
        }

        // other methods
        public double calculateCircleArea(){
            return 2*22/7*radius;
        }

        public double calculateCircleCircumference(){
            return 22/7*Math.pow(radius,2);
        }
    }

