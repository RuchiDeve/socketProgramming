import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Server server = new Server(serverSocket);
        server.startServer();


//    public static void main(String[]args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your userName for the groupchat");
//        String userName = scanner.nextLine();
//        Socket socket = new Socket("localhost", 12);
//        Client client = new Client(socket, userName);
//        client.listenToMessage();
//        client.sendMessage();

    }
}
