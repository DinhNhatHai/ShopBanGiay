package com.shoes.application.service;


import com.shoes.application.entity.User;
import com.shoes.application.model.dto.UserDTO;
import com.shoes.application.model.request.ChangePasswordRequest;
import com.shoes.application.model.request.CreateUserRequest;
import com.shoes.application.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
