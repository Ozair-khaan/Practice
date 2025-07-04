//package com.mailBox;
//
//import java.util.Properties;
//
//public class IMapIntegeration {
//
//    public static void main(String[] args) {
//        // IMAP Server Configuration for Office 365
//        String host = "outlook.office365.com";
//        String username = "your-email@outlook.com";  // Your Outlook email
//        String password = "your-app-password";       // App password (if MFA is enabled)
//
//        // Set IMAP properties
//        Properties properties = new Properties();
//        properties.put("mail.store.protocol", "imap");
//        properties.put("mail.imap.host", host);
//        properties.put("mail.imap.port", "993");
//        properties.put("mail.imap.starttls.enable", "true");
//        properties.put("mail.imap.ssl.enable", "true");
//
//        try {
//            // Create a Session
//            Session emailSession = Session.getInstance(properties);
//            Store store = emailSession.getStore("imap");
//
//            // Connect to the Mail Server
//            store.connect(host, username, password);
//            System.out.println("Connected to Outlook IMAP successfully!");
//
//            // Open Inbox Folder
//            Folder inbox = store.getFolder("INBOX");
//            inbox.open(Folder.READ_ONLY);
//
//            // Fetch Messages
//            Message[] messages = inbox.getMessages();
//            System.out.println("Total Messages: " + messages.length);
//
//            // Display First 5 Emails
//            for (int i = 0; i < Math.min(5, messages.length); i++) {
//                Message message = messages[i];
//                System.out.println("---------------------------------");
//                System.out.println("Email #" + (i + 1));
//                System.out.println("From: " + message.getFrom()[0]);
//                System.out.println("Subject: " + message.getSubject());
//                System.out.println("Sent Date: " + message.getSentDate());
//
//                if (message.getContent() instanceof String) {
//                    System.out.println("Content: " + message.getContent());
//                } else if (message.getContent() instanceof MimeMultipart) {
//                    System.out.println("Content: [Multipart Message]");
//                }
//            }
//
//            // Close the connections
//            inbox.close(false);
//            store.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
