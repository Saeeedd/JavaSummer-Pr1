import java.util.*;
import entities.*;
import entitiesService.CourseService;

public class Main {
    public static void main(String[] args) {

        CourseService service = new CourseService();
        String fileName = "CourseDB.txt";
        service.getData(fileName);
    }
}