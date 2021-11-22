package ch8_lambda;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySupplier {
	public static void main(String[] args) {
		Supplier<Integer> answerSupplier = () -> 42;
		System.out.println(answerSupplier.get());
		
		Supplier<Integer> supInf = new Supplier<Integer>() {
			public Integer get() {
				return 42;
			}
		};
		
		
		Supplier<String> userSupplier = () -> {
			Map<String, String> env = System.getenv();
			return env.get("USER");
		};
		
		System.out.println("User is : " + userSupplier.get());
		
		
		// network call
		String host = "coderanch.com";
		int port = 80;
		
		Logger logger = Logger.getLogger("Status Logger");
		
		logger.setLevel(Level.SEVERE);
		Supplier<String> status = () -> {
			int timeout = 1000;
			try(Socket socket = new Socket()){
				socket.connect(new InetSocketAddress(host, port), timeout);
				return "up";
			}
			catch(IOException e) {
				return "down";
			}
		};
		
		try {
			logger.log(Level.INFO, status);
		}catch(Exception e) {
			logger.log(Level.SEVERE, status);
		}
		
		// print environment variable
		Map<String, String> env = System.getenv();
		BiConsumer<String, String> printEnv = (k, v) -> {
			System.out.println(k + " " + v);
		};
		
		env.forEach(printEnv);
	}
}