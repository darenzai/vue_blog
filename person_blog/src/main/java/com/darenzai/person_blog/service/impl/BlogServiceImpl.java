package com.darenzai.person_blog.service.impl;

import com.darenzai.person_blog.entity.Blog;
import com.darenzai.person_blog.mapper.BlogMapper;
import com.darenzai.person_blog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
