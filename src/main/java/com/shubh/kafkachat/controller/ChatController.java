package com.shubh.kafkachat.controller;

import com.shubh.kafkachat.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.*;

//@RestController
//public class ChatController {
//
////    //    -------------- WebSocket API ----------------
////    @MessageMapping("/sendMessage")
////    @SendTo("/topic/group")
////    public Message broadcastGroupMessage(@Payload Message message) {
////        //Sending this message to all the subscribers
////        return message;
////    }
////
////    @MessageMapping("/newUser")
////    @SendTo("/topic/group")
////    public Message addUser(@Payload Message message,
////                           SimpMessageHeaderAccessor headerAccessor) {
////        // Add user in web socket session
////        headerAccessor.getSessionAttributes().put("username", message.getSender());
////        return message;
////    }
//
//}
