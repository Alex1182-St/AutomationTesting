package Lesson3.D1_IntermediateTasks;


import Lesson3.A1_Methods.BeautifulSentence;
import Lesson3.A1_Methods.TaskDescriptionRead;


import java.io.IOException;


public class IntermediateTask8 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask8.txt";
        String notBeautStr = "checkChangingProfilePicture";

        System.out.println("\nTask8. Intermediate level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        BeautifulSentence newSentence = new BeautifulSentence();
        System.out.println("\n Your old string - " + notBeautStr);
        System.out.println("\n Your new string - " + newSentence.splitCamelCase(notBeautStr));

    }}

