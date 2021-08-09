package com.darenzai.person_blog.service.impl;

import com.darenzai.person_blog.entity.User;
import com.darenzai.person_blog.mapper.UserMapper;
import com.darenzai.person_blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author darenzai
 * @since 2021-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
