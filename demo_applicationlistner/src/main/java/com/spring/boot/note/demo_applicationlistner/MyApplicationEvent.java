package com.spring.boot.note.demo_applicationlistner;

import org.springframework.context.ApplicationEvent;

/**
 * @author xuejunze
 * @date 2021/8/17 10:04 上午
 **/
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
