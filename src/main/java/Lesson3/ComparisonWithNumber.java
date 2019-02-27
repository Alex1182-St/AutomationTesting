package Lesson3;

public class ComparisonWithNumber {

    private int x;
    private int y;
    private int comparable;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getComparable() {
        return comparable;
    }

    public void setComparable(int comparable) {
        this.comparable = comparable;
    }

    public ComparisonWithNumber() {
    }

    public void comparisonIntsWithInts () {

        if (x == comparable) {
            System.out.println("\n True  " + "X is " + comparable);
        }
        else if (y == comparable) {
            System.out.println("\n True  " + "Y iss" + comparable);
        }
        else if (x + y == comparable) {
            System.out.println("\n True  " + "Their sum is " + comparable);
        }
        else {
            System.out.println("\n False");
        }

}}