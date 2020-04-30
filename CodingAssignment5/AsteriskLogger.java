import java.util.*;

public class AsteriskLogger implements Logger {

    public void log(String log) {

        StringBuilder sb = new StringBuilder( );
        for (int i = 0; i < log.length( ); i++) {
            sb.append("*");
        }
        System.out.println("***" + log + "***");
    }

    public void error(String error) {
        error = "***Error:" + error + "***";
        StringBuilder sb = new StringBuilder( );
        for (int i = 0; i < error.length( ); i++) {
            sb.append("*");
        }
        System.out.println(sb);
        System.out.println(error);
        System.out.println(sb);
    }

}