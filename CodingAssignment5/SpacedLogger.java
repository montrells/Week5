
public class SpacedLogger implements Logger{

    public void log(String log){

        StringBuilder sb = new StringBuilder();
        for (char c: log.toCharArray()) {
            sb.append(c).append(" ");
        }
        System.out.println(sb);
    }

    public void error(String error){

        StringBuilder sb = new StringBuilder();
        for (char c: error.toCharArray()) {
            sb.append(c).append(" ");
        }
        System.out.println("ERROR:" +sb);


    }

}
