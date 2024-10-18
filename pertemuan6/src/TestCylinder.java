public class TestCylinder {  // save as "TestCylinder.java"
    public static void main (String[] args) {
        // Objek Cylinder dengan default radius, color, dan height
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString());  // Panggil toString()

        // Objek Cylinder dengan spesifikasi height, radius default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2.toString());  // Panggil toString()

        // Objek Cylinder dengan spesifikasi radius dan height
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString());  // Panggil toString()
    }
}
