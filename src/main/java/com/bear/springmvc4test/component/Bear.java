package com.bear.springmvc4test.component;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/9 下午5:15
 * Description:
 */

@Component
public class Bear {

    private String name;

    public Bear() {
        System.out.println("Bear");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
