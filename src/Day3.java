import java.io.IOException;
import java.util.List;

public class Day3 {

    private List<String> triangles;

    private int checkPossibleTriangles(){
        int count = 0;
        int a,b,c;
        for (String triangle : triangles){
            String[] sides = triangle.trim().split("\\s+");

            if(sides.length ==3){
                a = Integer.parseInt(sides[0]);
                b = Integer.parseInt(sides[1]);
                c = Integer.parseInt(sides[2]);
                if(a + b > c && a + c > b && b + c > a)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Day3 day3 = new Day3();

        try {
            day3.triangles = ReadFile.readFile("input_files/data3.txt");
        } catch (IOException e) {
            System.out.println("found a problem with file");
            e.printStackTrace();
        }
        System.out.println(day3.checkPossibleTriangles());
    }
}
