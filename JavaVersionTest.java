public class JavaVersionTest {
    public static void main(String[] args) {
        System.out.println("Current Java: " + 
            System.getProperty("java.vendor") + " " + 
            System.getProperty("java.version"));
        
        // Print all environment variables with JAVA_HOME in their name
        System.getenv().forEach((key, value) -> {
            if (key.startsWith("JAVA_HOME")) {
                System.out.println(key + ": " + value);
            }
        });
        
        System.out.println("Current User's Login: mahabaleshwars");
    }
}
