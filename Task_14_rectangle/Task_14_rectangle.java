package Task_14_rectangle;

public class Task_14_rectangle {


    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4, 5);
        Rectangle_90 rect90 = new Rectangle_90(3, 4, 5);
        System.out.println(rect.square());
        System.out.println(rect.perim());
        System.out.println(rect90.square_kat());
        System.out.println(rect90.perim());
    }
}
