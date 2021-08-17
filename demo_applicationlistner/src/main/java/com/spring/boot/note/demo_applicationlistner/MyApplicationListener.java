package com.spring.boot.note.demo_applicationlistner;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xuejunze
 * @date 2021/8/17 10:03 上午
 **/
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("MyApplicationListener==============>"+myApplicationEvent.getSource());
    }
}
