package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shapes{

  private float width = (float)0.0;
  private float height = (float)0.0;
  private float depth = (float)0.0;

  // using if statement to end the calculation if negative
  public Cuboid(float width, float height, float depth) {
    if (width < 0 || height < 0 || depth < 0) {
      System.out.printf("Please enter a positive number");
    } else {
      this.width = width;
      this.height = height;
      this.depth = depth;
    }
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getDepth() {
    return depth;
  }

  public void setDepth(float depth) {
    this.depth = depth;
  }



  @Override
  public float surfaceArea() {
    float side;
    side = width = height = depth;
    float surfA;
    surfA = 6*(side * side);
    return surfA;
  }

  @Override
  public float volume() {
    float vol;
    vol = width * height * depth;
    return vol;
  }

  @Override
  public void render() {
    JFrame f;
    f=new JFrame();
    JOptionPane.showMessageDialog(f,"width: " + width + "height: " + height + "depth: " + depth + "Surface Area: " + surfaceArea() + "volume: " + volume());
  }
}
