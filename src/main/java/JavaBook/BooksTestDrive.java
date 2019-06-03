package JavaBook;

public class BooksTestDrive {

    public static void main(String[] args) {

        Books [] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Java Results";
        myBooks[1].title = "Java Getsby";
        myBooks[2].title = "Збірник рецептів по Java";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Yan";

        while (x<3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x=x+1;

        }
    }
}
