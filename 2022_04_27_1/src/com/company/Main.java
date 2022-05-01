package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Your program should ask user (use Scanner)
        // how to send mail and send it using Sender
        MailDeliveryService mailDeliveryService = createMailDeliveryService(readString());
        if (mailDeliveryService == null) {
            System.out.print("Allowed values are: dhl | email | pigeon\n");
            return;
        }

        Sender sender = new Sender();
        sender.send(mailDeliveryService);
    }
    public static String readString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Which service to use to send mail\n");
        return input.nextLine().toLowerCase();
    }

    public static MailDeliveryService createMailDeliveryService(String string){
        switch (string){
            case "dhl":
                return new DHL();
            case "email":
                return new Email();
            case "pigeon":
                return new Pigeon();
            default:
                return null;
        }

    }

}
