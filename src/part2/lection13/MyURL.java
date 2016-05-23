package part2.lection13;
import java.net.*;

public class MyURL {

	public static void main(String[] args) throws MalformedURLException{
	    URL hp = new URL("http://distedu.ukma.edu.ua");
	    System.out. println("Protocol: " + hp.getProtocol());
	    System.out.println("Port: " + hp.getPort());
	    System.out.println("Host: " + hp.getHost());
	    System.out.println("File: " + hp.getFile());
	    System.out.println("Ext: " + hp.toExternalForm());
	}
}
