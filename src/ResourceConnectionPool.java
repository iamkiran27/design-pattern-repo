import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ResourceConnectionPool {

    private int poolSize;

    private Queue<Resource> resourceQueue;

    public ResourceConnectionPool(int poolSize) {
        this.poolSize = poolSize;
        resourceQueue = new LinkedList<>() ;
    }
    public Resource accquireResource()
    {
        if(resourceQueue.size() > 0)
        {
            return  resourceQueue.poll();
        }
        else  {
            return new Resource();
        }
    }

    public  void releaseResource(Resource resource)
    {
        if(resourceQueue.size() < poolSize)
        {
            System.out.println("Adding resource back to pool");
            resourceQueue.add(resource);
        }

    }
}
