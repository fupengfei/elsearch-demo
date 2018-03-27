package com.fpfos.service;


import com.fpfos.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Fu Pengfei on 2018/3/27.
 */
public interface UserService {

    List<User> findByAge(Integer age);

    Page<User> findByHobbies(String hobbies, Integer pageNo, Integer pageNumber);

    User save(String name,Integer age, String interest, String hobbies);
}
