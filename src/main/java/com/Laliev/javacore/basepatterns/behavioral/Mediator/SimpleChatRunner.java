package com.Laliev.javacore.basepatterns.behavioral.Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SipleTextChat chat  =new SipleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "user 1");
        User user2 = new SimpleUser(chat, "user 2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.setMsg("I'm user 1");
    }
}
