package com.fpfos.repository;

import com.fpfos.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Fu Pengfei on 2018/3/27.
 */
@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    Page<User> findByHobbies(String Hobbies, Pageable pageable);

    List<User> findByAge(Integer age);

}
