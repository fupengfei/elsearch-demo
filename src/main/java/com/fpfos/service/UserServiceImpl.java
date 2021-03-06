package com.fpfos.service;

import com.fpfos.entity.User;
import com.fpfos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Fu Pengfei on 2018/3/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findByAge(Integer age) {
        return userRepository.findByAge(age);
    }

    @Override
    public Page<User> findByHobbies(String hobbies, Integer pageNo, Integer pageNumber) {

        return userRepository.findByHobbies(hobbies, PageRequest.of(pageNo,pageNumber));
    }

    @Override
    public User save(String name, Integer age, String interest, String hobbies) {

        User user = new User();
        user.setPrimaryCode(UUID.randomUUID().toString().replace("-",""));
        user.setName(name);
        user.setAge(age);
        user.setInterest(interest);
        user.setHobbies(hobbies);

        return userRepository.save(user);
    }

}
