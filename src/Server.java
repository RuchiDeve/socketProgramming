import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final ServerSocket serverSocket;
    private ServerSocket ServerSocket;

//    public Server(ServerSocket serverSocket){
//        this.serverSocket = serverSocket;
//
//    }

    public Server(java.net.ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer(){
        try{
            while (!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println(" A new client has connected ");
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();

            }
        }catch (IOException e){

        }

    }
    public void closeServerSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


