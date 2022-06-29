package Assignment2;

import java.awt.geom.Point2D;

/** A pair of points and the distance between them.*/

public class PointPair {
    //The points.
    private Point2D.Double p1;
    private Point2D.Double p2;

    /** Creates a pair of points
     * @param p1 one point
     * @param p2 another point
     */
    PointPair(Point2D.Double p1, Point2D.Double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    /** Returns the first point in this pair. */
    Point2D.Double getPoint1() {

        return p1;
    }

    /** Returns the second point in this pair. */
    Point2D.Double getPoint2() {

        return p2;
    }

    /** Returns the distance between the points in this pair. */
    public double getDistance() {

        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    /** Normalizes this pair so the point with the smallest x-coordinate
     * comes first.  If the x-coordinates are the same then the point
     * with the smallest y-coordinate will come first.
     */
    private void normalize() {
        if (p1.x > p2.x || p1.x == p2.x && p1.y > p2.y) {
            Point2D.Double temp = p1;
            p1 = p2;
            p2 = temp;
        }

    }

    /** Returns a printable representation of this pair and the distance */
    public String toString() {
        normalize();
        return "(" + p1.x + ", " + p1.y + ")-(" + p2.x + ", " + p2.y + ") = " + getDistance();
    }

}