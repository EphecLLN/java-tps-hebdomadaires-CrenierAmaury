package tp9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Chat {
	BufferedReader in; 
	PrintWriter out;
	Socket socket;
	/*
	 * Constructeur.  Permet d'initialiser le chat en �tablissant la 
	 * connection avec un interlocuteur situ� sur la m�me machine. 
	 * @param isServer : si true, l'instance est un serveur et se met en attente d'une connexion
	 * @port le num�ro de port sur lequel �tablir la connexion
	 * @exception IOException s'il y a un probl�me pendant l'�tablissement de la connexion
	 */
	public Chat(boolean isServer, int port) throws IOException {
		connect(isServer, port, "localhost");
	}
	
	/*
	 * Envoie le messages msg � l'interlocuteur
	 * @param msg un message
	 */
	public void sendMessage(String msg) {
		out.println(msg);
	}

	/*
	 * Attend le prochain message de l'interlocuteur
	 * @return le message re�u de l'interlocuteur
	 * @exception IO Exception en cas d'erreur de transmission
	 */
	public String waitForMessage() throws IOException {
        String str = "";
        if(str.isEmpty()) {
        	str = "";
        }
        else {
        	str = in.readLine();
        }
		return str;
	}
	/*
	 * Permet l'�tablissement d'une connexion avec un h�te distant
	 * @param isServer : si true, l'instance est un serveur et se met en attente d'une connexion
	 * @port le num�ro de port sur lequel �tablir la connexion
	 * @addr si isServer est false, addr contient l'adresse du serveur � contacter
	 * @exception IOException s'il y a un probl�me pendant l'�tablissement de la connexion
	 */
	public void connect(boolean isServer, int port, String addr) throws IOException{
		if(isServer) {
			ServerSocket SerSocket = new ServerSocket(port);	
			Socket socket = SerSocket.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        }
		else {
			Socket socket = new Socket(addr, port);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		}
	}
	/*
	 * Ferme tous les flux d'une connexion �tablie.
	 * @exception IOException en cas d'erreur dans la fermeture de connexion
	 */
	public void closeConnection() throws IOException{
		System.out.println("Aurevoir!");
		out.println("AUrevoir!");
		in.close();
		out.close();
		socket.close();
	}
}