package app;
public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Emaiil sent to "+rec+ " with Message"+msg);
    }
}