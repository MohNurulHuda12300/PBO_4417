class simplecircle{
      double radius;
      
      public simplecircle() {

      }
  
      public simplecircle(double newRadius) {
          radius = newRadius;
      }
  
      public double getArea() {
          return radius * radius * Math.PI;
      }
      
      public double getPerimeter() {
          return 2 * radius * Math.PI;
      }
      public double getRadius(double newRadius) {
          return radius;
      }
}