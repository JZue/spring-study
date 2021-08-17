package com.spring.boot.note.demo_applicationlistner;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author xuejunze
 * @date 2021/8/17 10:09 上午
 **/
@Component
public class PayloadApplicationListener implements ApplicationListener<PayloadApplicationEvent<String>> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent<String> stringPayloadApplicationEvent) {
        System.out.println("PayloadApplicationListener==============>"+stringPayloadApplicationEvent.getPayload());
    }
}
