package Lesson3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TaskDescriptionRead {


    public void taskDescriptionReading (String  filename) throws IOException {

        // нужно добавить throws Exception в мейн-метод, поскольку могут быть ошибки (отсутствует файл из которого считывают)

    FileReader taskReader= new FileReader(filename);
    Scanner scan = new Scanner(taskReader);
        /*
        FileReader и Scanner идут вместе.
        Их нужно "связать" - для этого пишем название объекта FileReader вместо "System.in" при объявлении Scanner
        У нас это "taskReader" в "Scanner scan = new Scanner(taskReader);"
         */

        while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
    }
        taskReader.close();

}}
