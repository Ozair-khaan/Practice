package com.ozairProfile;

public class DeveloperProfile {
    public static void main(String[] args) {
        String title = "Java Developer";
        String[] skills = {"Java 8", "Spring Boot", "Microservices", "Spring MVC",
                "Restful Web-Services", "SQL", "JSP", "JavaScript", "jQuery", "AWS"};
        String mission = "Building scalable and innovative software solutions.";

        System.out.println("👨‍💻 " + title);
        System.out.println("\n🔧 Skills:");
        for (String skill : skills) {
            System.out.println(" - " + skill);
        }
        System.out.println("\n🌟 Mission: " + mission);
    }
}
