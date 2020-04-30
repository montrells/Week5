public class App {
    public static void main(String[] args) {
        Logger asterisk = new AsteriskLogger( );
        Logger spaced = new SpacedLogger( );

        asterisk.log("Hello");
    }
}