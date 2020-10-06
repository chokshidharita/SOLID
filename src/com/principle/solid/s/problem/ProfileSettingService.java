package com.principle.solid.s.problem;


import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfileSettingService {

    private static final Logger LOGGER = Logger.getLogger(ProfileSettingService.class.getName());

    public void changeProfileName(User user, String name) {
        LOGGER.log(Level.INFO, "Changing name: {0}", name);
        user.setName(name);
    }
}
