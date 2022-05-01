package com.company;
// Create class Email that should implement the interface MailDeliveryService.
// Its way to send mail is print something like: “Send by internet”

public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Send by internet");
    }
}
