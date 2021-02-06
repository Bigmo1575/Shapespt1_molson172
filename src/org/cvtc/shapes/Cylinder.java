package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shapes {

  private float radius = (float) 0.0;
  private float height = (float) 0.0;

  // using if statement to end the calculation if negative
  public Cylinder(float radius, float height) {
    if (radius < 0 || height < 0) {
      System.out.printf("Please enter a positive number");
    } else {
      this.radius = radius;
      this.height = height;
    }
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {

    this.radius = radius;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {

    this.height = height;
  }



  @Override
  public float surfaceArea() {
    float surfA;

    surfA = (float) (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);

    return surfA;
  }

  @Override
  public float volume() {
    float vol;

    vol = (float) (Math.PI * (radius * radius) * height);

    return vol;
  }

  @Override
  public void render() {
    JFrame f;
    f=new JFrame();
    JOptionPane.showMessageDialog(f,"radius: " + radius + "height: " + height + "Surface Area: " + surfaceArea() + "volume: " + volume());
  }
}
