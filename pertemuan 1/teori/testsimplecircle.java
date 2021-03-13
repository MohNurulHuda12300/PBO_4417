public class testsimplecircle{
    public static void main(String[] args) {
        simplecircle circle1 = new simplecircle() ;
        System.out.println("The area of the circle of radius"  + circle1.radius + "is" + circle1.getArea());

        simplecircle circle2 = new simplecircle(25) ;
        System.out.println("The area of the circle of radius"  + circle2.radius + "is" + circle2.getArea());

        simplecircle circle3 = new simplecircle(125) ;
        System.out.println("The area of the circle of radius"  + circle3.radius + "is" + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

}

