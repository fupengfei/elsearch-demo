package com.fpfos.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * Created by Fu Pengfei on 2018/3/27.
 */
@Setter
@Getter
@ToString
@Document(indexName = "blog",type = "user")
public class User implements Serializable{

    @Id
    private String primaryCode;
    private String name;
    private Integer age;
    private String interest;
    private String hobbies;
}
