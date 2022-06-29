package Assignment2;

import java.awt.geom.Point2D;
import java.util.Scanner;

class TestClosestPointPair {

    /**
     *
     * @param filePath --> file absolute path
     * @return --> array containing the information of points read from the file
     * @throws Exception
     */
    private static Point2D.Double[] ReadFile(String filePath) throws Exception{
        // Create a File instance
        java.io.File file = new java.io.File(filePath);

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // read number of points and make arrays
        int numPoints = input.nextInt();

        Point2D.Double[] points = new Point2D.Double[numPoints];
        int p = 0;

        // Read data from a file
        while (input.hasNext()) {
            points[p] = new Point2D.Double(input.nextDouble(), input.nextDouble());
            p++;
        }

        // Close the file
        input.close();

        return points;
    }



    public static void main(String[] args) throws Exception {

        int totalGrade =0;
        Point2D.Double p1;
        Point2D.Double p2;

        //Rad Files
        Point2D.Double[] smallerSet = ReadFile("src/Assignment2/PointFiles/SmallerSet.input");
        Point2D.Double[] oneHundredPoints = ReadFile("src/Assignment2/PointFiles/test_100.input");
        Point2D.Double[] oneThousandPoints = ReadFile("src/Assignment2/PointFiles/test_1000.input");
        Point2D.Double[] tenThousandPoints = ReadFile("src/Assignment2/PointFiles/test_10000.input");
        Point2D.Double[] oneHundredThousandPoints = ReadFile("src/Assignment2/PointFiles/test_100000.input");

        System.out.println("\n***************************************************************************");
        System.out.println("\n* SmallerSet.input closest point pair is: ");
        FindClosest closestPointPair1 = new FindClosest(smallerSet);
        System.out.println(closestPointPair1.getClosestPointPair().toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = closestPointPair1.getClosestPointPair().getPoint1();
        p2 = closestPointPair1.getClosestPointPair().getPoint2();

        if(p1.getX() == 9.0 && p1.getY() == 12.0 && p2.getX() == 10.0 && p2.getY() == 11.0
                && closestPointPair1.getClosestPointPair().getDistance() == 1.4142135623730951){
            totalGrade += 20;
        }
        /**************************************************************************************************/

        System.out.println("\n***************************************************************************");
        System.out.println("\n* test_100.input closest point pair is: ");
        FindClosest closestPointPair2 = new FindClosest(oneHundredPoints);
        System.out.println(closestPointPair2.getClosestPointPair().toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = closestPointPair2.getClosestPointPair().getPoint1();
        p2 = closestPointPair2.getClosestPointPair().getPoint2();

        if(p1.getX() == 6.541110524967436 && p1.getY() == 3.701064033027377
                && p2.getX() == 6.5432927520409905 && p2.getY() == 3.7121465506819114
                && closestPointPair2.getClosestPointPair().getDistance() == 0.011295322596704299){
            totalGrade += 20;
        }
        /**************************************************************************************************/

        System.out.println("\n***************************************************************************");
        System.out.println("\n* test_1000.input closest point pair is: ");
        FindClosest closestPointPair3 = new FindClosest(oneThousandPoints);
        System.out.println(closestPointPair3.getClosestPointPair().toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = closestPointPair3.getClosestPointPair().getPoint1();
        p2 = closestPointPair3.getClosestPointPair().getPoint2();

        if(p1.getX() == -0.16428432411409055 && p1.getY() == 5.766920749003868
                && p2.getX() == -0.16122952149564718 && p2.getY() == 5.7733965944124215
                && closestPointPair3.getClosestPointPair().getDistance() == 0.007160195024797601){
            totalGrade += 20;
        }
        /**************************************************************************************************/

        System.out.println("\n***************************************************************************");
        System.out.println("\n* test_10000.input closest point pair is: ");
        FindClosest closestPointPair4 = new FindClosest(tenThousandPoints);
        System.out.println(closestPointPair4.getClosestPointPair().toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = closestPointPair4.getClosestPointPair().getPoint1();
        p2 = closestPointPair4.getClosestPointPair().getPoint2();

        if(p1.getX() == -3.790324091036039 && p1.getY() == -6.87015957930339
                && p2.getX() == -3.787354406374437 && p2.getY() == -6.871700452033338
                && closestPointPair4.getClosestPointPair().getDistance() == 0.003345641307619692){
            totalGrade += 20;
        }
        /**************************************************************************************************/

        System.out.println("\n***************************************************************************");
        System.out.println("\n* test_100000.input closest point pair is: ");
        FindClosest closestPointPair5 = new FindClosest(oneHundredThousandPoints);
        System.out.println(closestPointPair5.getClosestPointPair().toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = closestPointPair5.getClosestPointPair().getPoint1();
        p2 = closestPointPair5.getClosestPointPair().getPoint2();

        if(p1.getX() == -1.8380407124394118 && p1.getY() == 8.165046134562019
                && p2.getX() == -1.8379469797541006 && p2.getY() == 8.164951609956471
                && closestPointPair5.getClosestPointPair().getDistance() == 1.3311918475379897E-4){
            totalGrade += 20;
        }
        /**************************************************************************************************/

        System.out.println("\n*****************************************************");
        System.out.println("                Total Grade is " + totalGrade);
        System.out.println("*****************************************************");
    }

}
