package com.darenzai.person_blog.utils;

import com.darenzai.person_blog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
