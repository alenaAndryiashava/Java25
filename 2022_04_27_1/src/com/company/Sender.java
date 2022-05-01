package com.company;

// Create class Sender with the method send in it.
// As argument this method takes the MailDeliveryService
// and send the mail using given service.

public class Sender {
    void send(MailDeliveryService mailDeliveryService){
        mailDeliveryService.sendMail();


    }
}
