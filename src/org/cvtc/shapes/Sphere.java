package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shapes {

  private float radius = (float) 0.0;

  // using if statement to end the calculation if negative
  public Sphere(float radius) {
    if (radius < 0 ) {
      System.out.printf("Please enter a positive number");
    } else {
      this.radius = radius;
    }
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius() {
    this.radius = radius;
  }

  @Override
  public float surfaceArea() {
    float surfaceA;

    surfaceA = (float) (4 * Math.PI * radius * radius);

    return surfaceA;
  }

  @Override
  public float volume() {
    float vol;

    vol = (float) ((4.0 / 3) * Math.PI * radius * radius * radius);

    return vol;
  }

  @Override
  public void render() {
    JFrame f;
    f=new JFrame();
    JOptionPane.showMessageDialog(f,"radius: " + radius + "Surface Area: " + surfaceArea() + "volume: " + volume());
  }
}
