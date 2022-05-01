package com.company;
//• Create class Pigeon that should implement the interface MailDeliveryService.
// Its way to send mail is print something like:
// “ Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away ”

public class Pigeon implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away ");

    }
}
