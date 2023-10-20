package me.dio.santanderdevweek2023.service.impl;

import me.dio.santanderdevweek2023.domain.model.User;
import me.dio.santanderdevweek2023.domain.repository.UserRepository;
import me.dio.santanderdevweek2023.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById() {
        return findById(null);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchEleemntException::new);
    }

    @Override
    public User create(User userToCreate) {
        return null;
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        } else {
        return userRepository.save(userToCreate);
    }
}
