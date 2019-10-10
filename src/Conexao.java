import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Conexao {	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.printarTabuleiro();
		
//		Socket client;
//		String serverIp = "192.168.1.135";
//		PrintWriter out;
//		try {
//			client = new Socket(serverIp, 4261);
//			out = new PrintWriter(client.getOutputStream(), true);
//    		out.println("catch;ok");
//    		
//    		Scanner nome = new Scanner(client.getInputStream());
//    		String string = nome.nextLine();
//    		System.out.println(string);
//    		
//    		try {
//				Thread.currentThread().sleep(5000);
//				nome = new Scanner(client.getInputStream());
//	    		string = nome.nextLine();
//	    		System.out.println(string);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    		
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
