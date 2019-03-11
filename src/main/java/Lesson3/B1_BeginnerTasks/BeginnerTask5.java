package Lesson3.B1_BeginnerTasks;

import Lesson3.A1_Methods.SchoolMarks;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask5 {

    public static void main(String[] args) throws IOException {


    String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask5.txt";


    System.out.println("Task5. Beginner level");
    TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
    TaskDescription4.taskDescriptionReading(taskDescriptionPath);
    SchoolMarks newSchoolMarkRes = new SchoolMarks();
    newSchoolMarkRes.marksResult();

}}
