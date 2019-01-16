package service;

import dto.User;

public class UserCheck {

    public boolean validate(User user) {
        if (user != null && user.getName().equals("admin")) {
            if (user.getPwd().equals("admin")) {
                return true;
            }
            return false;
        }
        return false;
    }

}
