package main.java.com.lab111.lab7;

public class Main {
    public static void main(String[] args) {
        ClientListener clientListener = new ClientListener();
        Client client = new Client();
        client.context = clientListener.setAExample();
        client.terminalExpression = new TerminalExpression();
        client.context.makeAcctions();
    }
}
