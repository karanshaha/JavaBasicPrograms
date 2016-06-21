import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;



		public class Client {

		    /**
		     * Runs the client as an application.  First it displays a dialog
		     * box asking for the IP address or hostname of a host running
		     * the date server, then connects to it and displays the date that
		     * it serves.
		     */
		    public static void main(String[] args) throws IOException {
		        String serverAddress = JOptionPane.showInputDialog(
		            "Enter IP Address of a machine that is\n" +
		            "running the date service on port 9090:");
		        Socket s = new Socket(serverAddress, 9090);
		        try{
		       
		        /*BufferedReader input =
		            new BufferedReader(new InputStreamReader(s.getInputStream()));
		        String answer = input.readLine();
		        JOptionPane.showMessageDialog(null, answer);*/
		        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		        String s1 = "Hi Madhura";
		        pw.write(s1);
		        pw.println(s1);
		       
		        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		        System.out.println(br.readLine());
		        }
		        finally{
		        s.close();
		        }
		        
		        System.exit(0);
		    }
		}


