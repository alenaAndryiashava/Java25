package com.company;
//• Create class DHL that should implement the interface MailDeliveryService.
// Its way to send mail is print something like:
// “Put a letter in an envelope, put a stamp, send”

public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Put a letter in an envelope, put a stamp, send");

    }
}
