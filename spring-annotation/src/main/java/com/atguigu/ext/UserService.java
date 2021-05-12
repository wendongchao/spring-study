package com.atguigu.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author wendongchao
 * @Date 2021/3/20 22:18
 */
@Service
public class UserService {

    /**
     * classes={ApplicationEvent.class}：要监听的那些事件，可以写多个
     * 事件发生后如果要拿到事件，那么在参数位置填写 ApplicationEvent event
     * @param event
     */
    @EventListener(classes={ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("UserService。。监听到的事件："+event);
    }

}

