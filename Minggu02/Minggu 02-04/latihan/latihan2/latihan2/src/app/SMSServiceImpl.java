package app;
public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS Sent to "+rec+ " with Message="+msg);
    }
}