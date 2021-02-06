package org.cvtc.shapes;

public class ShapesTest {

  public static void main(String[] args) {

    Sphere sphere = new Sphere(10);
    Cylinder cylinder = new Cylinder(-1,15);
    Cuboid cuboid = new Cuboid(10,-1,10);

    sphere.render();
    cylinder.render();
    cuboid.render();


  }
}
