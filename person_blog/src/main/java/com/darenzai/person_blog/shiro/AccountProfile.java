package com.darenzai.person_blog.shiro;

import lombok.Data;

@Data
public class AccountProfile {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
