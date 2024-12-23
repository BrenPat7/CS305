package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslServerApplication.class, args);
    }
}

@RestController
class SecurityController {

    private static final String UNIQUE_DATA = "CS305_Project_Two";

    @GetMapping("/hash")
    public String getChecksum(@RequestParam(value = "input", required = false) String input) {
        String data = (input == null || input.isEmpty()) ? UNIQUE_DATA : input;
        String checksum = calculateChecksum(data);
        return "Name: Brendan Clarke\n" +
               "Input Data: " + data + "\n" +
               "Checksum: " + checksum;
    }

    private String calculateChecksum(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error calculating checksum", e);
        }
    }
}
