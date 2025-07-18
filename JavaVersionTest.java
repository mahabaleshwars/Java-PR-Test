public class JavaVersionTest {
    public static void main(String[] args) {
        System.out.println("Current Java: " + 
            System.getProperty("java.vendor") + " " + 
            System.getProperty("java.version"));
        
        // Print environment variables for JDK paths
        System.out.println("JAVA_HOME_11_X64: " + System.getenv("JAVA_HOME_11_X64"));
        System.out.println("JAVA_HOME_17_X64: " + System.getenv("JAVA_HOME_17_X64"));
        System.out.println("JAVA_HOME_21_X64: " + System.getenv("JAVA_HOME_21_X64"));
        System.out.println("Default JAVA_HOME: " + System.getenv("JAVA_HOME"));
        System.out.println("Current User's Login: mahabaleshwars");
    }
}
