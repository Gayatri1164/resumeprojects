package com.resume.RealTimeChatApp.playload;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {

    private String content;
    private String sender;
    private String roomId;

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}