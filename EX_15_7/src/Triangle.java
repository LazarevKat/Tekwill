/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        this.vertices.add(cornerOne);
        this.vertices.add(cornerTwo);
        this.vertices.add(cornerThree);
    }

    @Override
    public String toString() {
        return ("Triangle: " + this.vertices.toString());
    }

    @Override
    public void moveUp(int distance) {
        this.vertices.get(0).setY(this.vertices.get(0).getY() + distance);
        this.vertices.get(1).setY(this.vertices.get(1).getY() + distance);
        this.vertices.get(2).setY(this.vertices.get(2).getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        this.vertices.get(0).setY(this.vertices.get(0).getY() - distance);
        this.vertices.get(1).setY(this.vertices.get(1).getY() - distance);
        this.vertices.get(2).setY(this.vertices.get(2).getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.vertices.get(0).setX(this.vertices.get(0).getX() - distance);
        this.vertices.get(1).setX(this.vertices.get(1).getX() - distance);
        this.vertices.get(2).setX(this.vertices.get(2).getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        this.vertices.get(0).setX(this.vertices.get(0).getX() + distance);
        this.vertices.get(1).setX(this.vertices.get(1).getX() + distance);
        this.vertices.get(2).setX(this.vertices.get(2).getX() + distance);
    }
}
