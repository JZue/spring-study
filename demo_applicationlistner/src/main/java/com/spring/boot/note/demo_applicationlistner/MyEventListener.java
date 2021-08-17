package com.spring.boot.note.demo_applicationlistner;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author xuejunze
 * @date 2021/8/17 12:32 下午
 **/
@Component
public class MyEventListener {

    @EventListener
    public void eventApplicationEvent(MyApplicationEvent myApplicationEvent){
        System.out.println("EventListener:ApplicationEvent"+myApplicationEvent.getSource());
    }
    @EventListener
    public void eventPayload(PayloadApplicationEvent<String> myApplicationEvent){
        System.out.println("EventListener:eventPayload"+myApplicationEvent.getPayload());
    }
}
