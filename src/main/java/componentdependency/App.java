package componentdependency;

public class App {
    public static void main(String[] args) {
        Controller controller = DaggerApplicationComponent.create().controller();
        System.out.println(controller.handleRequest("Hello")); // prints Hello World!
    }
}
