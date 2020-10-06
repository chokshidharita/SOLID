package com.principle.solid.s.problem;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        User user = new User(Role.ADMIN);

        MailboxSettingService mailboxSettingService = new MailboxSettingService();
        mailboxSettingService.changeSecondaryEmail(user, "newmail@gmail.com");

        if (mailboxSettingService.hasAdminAccess(user)) {
            ProfileSettingService profileSettingService = new ProfileSettingService();
            profileSettingService.changeProfileName(user, "Adam");
            LOGGER.log(Level.INFO, "Name changed successfully");
        }
    }
    /*
      Here for every operation which is not part of mailbox say profile details. S in solid principle says that every
      class should have only one responsibility. Here MailboxSettingService is having two responsibilities 1 - setting
      secondary email and 2 - verify access.

      Single responsibility principle states that every class should have only one reason to change.Single Re
     */

}
