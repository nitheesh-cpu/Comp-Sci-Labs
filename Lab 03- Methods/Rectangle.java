public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return (width*2)+(height*2);
    }

    public double diagonal() {
        return Math.sqrt((height*height)+(width*width));
    }

    /* You should leave anything below this point alone. It's
     * complete and you shouldn't change it.
     */
    public void setWidth(int w) {
        width = w;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height;
    }

}
