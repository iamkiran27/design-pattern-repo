public class Main {
    public static void main(String[] args) {
        ResourceConnectionPool resourceConnectionPool = new ResourceConnectionPool(3);
       Resource resource =  resourceConnectionPool.accquireResource();
       resource.performAction();

       resourceConnectionPool.releaseResource(resource);

    }
}
