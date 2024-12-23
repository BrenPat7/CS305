package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Hello Brendan Clarke!";
        String hashValue = generateChecksum(data);
        
        return "<p>data:"+data + "</p><p>Hash: "+ hashValue + "</p>";
    }
    private String generateChecksum(String data) {
    	try {
    		MessageDigest digest = MessageDigest.getInstance("SHA-256");
    		byte[] hashBytes = digest.digest(data.getBytes());
    		
    		return bytesToHash(hashBytes);
    	}
    				catch (NoSuchAlgorithmException one) {
    					return "Error in hash generation: " +one.getMessage();
    				}
    				
    	}
    private String bytesToHash(byte[] bytes) {
    	StringBuilder hexString = new StringBuilder();
    	for (byte b : bytes) {
    		String hex = Integer.toHexString(0xff & b);
    		if (hex.length() == 1) {
    			hexString.append('0');
    		}
    		hexString.append(hex);
    		
    	}
    	return hexString.toString();
    	
    	
    	
    }
    }

	