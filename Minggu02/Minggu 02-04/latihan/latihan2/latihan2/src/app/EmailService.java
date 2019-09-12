package app;

public class EmailService {
    public static void sendEmail(String message, String receiver) {
        System.out.println("Email send to "+receiver+" with Message="+message);
    }
}