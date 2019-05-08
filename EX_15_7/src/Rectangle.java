/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        //Point topLeftCorner, downRightCorner, downLeftCorner;
        this.vertices.add(topRightCorner);
        this.vertices.add(new Point(topRightCorner.getX(), topRightCorner.getY() - width));
        this.vertices.add(new Point(topRightCorner.getX() - height, topRightCorner.getY() - width));
        this.vertices.add(new Point(topRightCorner.getX() - height, topRightCorner.getY()));
    }

    @Override
    public String toString() {
        return ("Rectangle: " + this.vertices.toString());
    }

    @Override
    public void moveUp(int distance) {
        this.vertices.get(0).setY(this.vertices.get(0).getY() + distance);
        this.vertices.get(1).setY(this.vertices.get(1).getY() + distance);
        this.vertices.get(2).setY(this.vertices.get(2).getY() + distance);
        this.vertices.get(3).setY(this.vertices.get(3).getY() - distance);
    }

    @Override
    public void moveDown(int distance) {
        this.vertices.get(0).setY(this.vertices.get(0).getY() - distance);
        this.vertices.get(1).setY(this.vertices.get(1).getY() - distance);
        this.vertices.get(2).setY(this.vertices.get(2).getY() - distance);
        this.vertices.get(3).setY(this.vertices.get(3).getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.vertices.get(0).setX(this.vertices.get(0).getX() - distance);
        this.vertices.get(1).setX(this.vertices.get(1).getX() - distance);
        this.vertices.get(2).setX(this.vertices.get(2).getX() - distance);
        this.vertices.get(3).setX(this.vertices.get(3).getX() - distance);

    }

    @Override
    public void moveRight(int distance) {
        this.vertices.get(0).setX(this.vertices.get(0).getX() + distance);
        this.vertices.get(1).setX(this.vertices.get(1).getX() + distance);
        this.vertices.get(2).setX(this.vertices.get(2).getX() + distance);
        this.vertices.get(3).setX(this.vertices.get(3).getX() - distance);

    }
}
