public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello from " + System.getProperty("java.vendor") + " " + System.getProperty("java.version"));
        System.out.println("Java VM: " + System.getProperty("java.vm.name"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
        System.out.println("Data Model: " + System.getProperty("sun.arch.data.model") + "-bit");
        System.out.println("Current Date and Time (UTC - YYYY-MM-DD HH:MM:SS formatted): 2025-07-18 10:21:28");
    }
}
