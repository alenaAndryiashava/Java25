package com.company;

public class Practice {
    String subject;
    Person trainee;
    Person tutor;
    MyDate dateStart;
    MyDate dateFinish;

    public Practice(String subject,Person trainee, Person tutor,MyDate dateStart, MyDate dateFinish){
        this.subject = subject;
        this.trainee = trainee;
        this.tutor = tutor;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "subject='" + subject + '\'' +
                ", trainee=" + trainee +
                ", tutor=" + tutor +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                '}';
    }
}
