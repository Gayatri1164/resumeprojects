package com.resume.RealTimeChatApp.repo;

import com.resume.RealTimeChatApp.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepo extends MongoRepository<Room,String> {


    Room findByRoomId(String roomId);
}
