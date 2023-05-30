package com.Laliev.javacore.basepatterns.behavioral.chain;

import com.sun.tools.javac.Main;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE),
                emailNotifier = new EmailNotifier(Priority.IMPORTANT),
                smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("OK", Priority.ROUTINE);
        reportNotifier.notifyManager("email", Priority.IMPORTANT);
        reportNotifier.notifyManager("sms", Priority.ASAP);
    }
}
