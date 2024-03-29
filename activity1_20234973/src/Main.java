import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float ax = 0, ay = 0, bx = 0, by = 0, cx = 0, cy = 0;

        System.out.print("Write the x, y coordinates of A >> ");
        ax = scanner.nextFloat();
        ay = scanner.nextFloat();

        System.out.print("Write the x, y coordinates of B >> ");
        bx = scanner.nextFloat();
        by = scanner.nextFloat();

        System.out.print("Write the x, y coordinates of C >> ");
        cx = scanner.nextFloat();
        cy = scanner.nextFloat();

        float lengthA = 0, lengthB = 0, lengthC = 0;
        float meeting_x = (ax + bx + cx) / 3;
        float meeting_y = (ay + by + cy) / 3;
        lengthA = (meeting_x-ax)*(meeting_x-ax)+(meeting_y-ay)*(meeting_y-ay);
        lengthB = (meeting_x-bx)*(meeting_x-bx)+(meeting_y-by)*(meeting_y-by);
        lengthC = (meeting_x-cx)*(meeting_x-cx)+(meeting_y-cy)*(meeting_y-cy);

        if (lengthA < lengthB) {
            if (lengthA < lengthC)
                System.out.println("\nFind the two people who are the furthest away from each other: B, C");
        }
        if(lengthA==lengthB){
            if(lengthA<lengthC)
                System.out.println("\nFind the one people who are the furthest away from each other: only C");
        }
        if (lengthB < lengthA) {
            if (lengthB < lengthC)
                System.out.println("Find the two people who are the furthest away from each other: A, B");
        }
        if (lengthC < lengthB) {
            if (lengthC < lengthA)
                System.out.println("Find the two people who are the furthest away from each other: B, C");
        }
        if(lengthC==lengthB){
            if(lengthC<lengthA)
                System.out.println("\nFind the one people who are the furthest away from each other: only A");
        }


        System.out.printf("The coordinates of meeting place this weekend: %.2f,%.2f", meeting_x, meeting_y);
    }
}