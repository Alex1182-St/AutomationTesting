package Lesson3.C1_PreIntermediateTasks;


import Lesson3.A1_Methods.SequencePresenceInArr;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;
import java.util.ArrayList;

public class PreIntermediateTask11 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask11.txt";
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> ourSequence = new ArrayList<>();

        arr1.add(4);
        arr1.add(6);
        arr1.add(0);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);
        arr1.add(9);

        ourSequence.add(1);
        ourSequence.add(2);
        ourSequence.add(3);

        System.out.println("Task11. PreIntermediate level");
        TaskDescriptionRead TaskDescription11 = new TaskDescriptionRead();
        TaskDescription11.taskDescriptionReading(taskDescriptionPath);

        SequencePresenceInArr newPresence = new SequencePresenceInArr();
        newPresence.sequencePresence(arr1, ourSequence);

    }}

