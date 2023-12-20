package com.demo.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private Integer id;

    private String userName;

    private String password;

    private Character gender;

    private String addr;


}
