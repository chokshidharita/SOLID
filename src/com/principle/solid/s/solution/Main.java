package com.principle.solid.s.solution;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(Role.ADMIN);

        MailboxSettingService mailboxSettingService = new MailboxSettingService(new SecurityService());
        mailboxSettingService.changeSecondaryEmail(user, "newmail@gmail.com");

        ProfileSettingService profileSettingService = new ProfileSettingService(new SecurityService());
        profileSettingService.changeProfileName(user, "Adam");

    }

}
