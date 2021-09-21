package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;

import java.util.List;

public interface UserService {

        User saveUser(User user );
        Role saveRole(Role role);
        void addRoleToUser(String userName, String rolename);
        User getuser(String userName);
        List<User> getUsers();
}
