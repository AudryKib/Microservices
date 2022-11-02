package audry.tech.userservice.service;


import audry.tech.userservice.entity.ResponseDto;
import audry.tech.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}