import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedMap;

public class LibraryObjectPool {

    private int poolSize;

    private Queue<Book> bookQueue;

    public LibraryObjectPool(int poolSize) {
        this.poolSize = poolSize;
        bookQueue = new LinkedList<>() ;
    }
    public Book accquireBook()
    {
        if(bookQueue.size() > 0)
        {
            return  bookQueue.poll();
        }
        else  {
            Scanner scanner = new Scanner(System.in);
            return new Book();
        }
    }

    public  void releaseBook(Book book)
    {
        if(bookQueue.size() < poolSize)
        {
            bookQueue.add(book);
        }

    }
}
