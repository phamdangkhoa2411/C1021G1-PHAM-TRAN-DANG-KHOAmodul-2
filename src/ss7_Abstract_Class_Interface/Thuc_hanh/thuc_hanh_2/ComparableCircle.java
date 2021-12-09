package ss7_Abstract_Class_Interface.Thuc_hanh.thuc_hanh_2;

import ss6_Inheritance.Thuc_hanh.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

 public ComparableCircle() {
 }

 public ComparableCircle(double radius) {
  super(radius);
 }

 public ComparableCircle(double radius, String color, boolean filled) {
  super(radius, color, filled);
 }

 @Override
 public int compareTo(ComparableCircle o) {
  if (getRadius() > o.getRadius()) return 1;
  else if (getRadius() < o.getRadius()) return -1;
  else return 1;
 }
}


