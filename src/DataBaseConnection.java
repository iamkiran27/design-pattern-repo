public class DataBaseConnection {

   private final String databaseUrl= "https://lochalhost:3000/app/db";
   private  final  String username = "user";
   private  final  String password = "password";

    public DataBaseConnection() {
        System.out.println("Connecting to the database...\n"+"url : "+ databaseUrl + "\n username : "+username + "\n password :" + password );

    }
}
