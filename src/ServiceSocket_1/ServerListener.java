package ServiceSocket_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {

@Override
public void run() {
	// TODO Auto-generated method stub
	 try {
			ServerSocket serversocket = new ServerSocket(12345);
			
			 while(true){
				 Socket socket= serversocket.accept();
					
					JOptionPane.showMessageDialog(null, "连接成功");
					
					new ChatSocket(socket).start();
			 }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
