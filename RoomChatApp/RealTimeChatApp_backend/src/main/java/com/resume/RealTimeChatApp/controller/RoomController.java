package com.resume.RealTimeChatApp.controller;


import com.resume.RealTimeChatApp.entities.Message;
import com.resume.RealTimeChatApp.entities.Room;
import com.resume.RealTimeChatApp.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/room")
@CrossOrigin("http://localhost:5173")
public class RoomController {


    @Autowired
    RoomRepo roomRepo;


    @Autowired
    Room room;

    //create room
    @PostMapping("/create")
    public ResponseEntity<?> createRoom(@RequestBody String roomId){

        //id already present cannot create room with that id
        if(roomRepo.findByRoomId(roomId)!=null){
            //room present
            return  ResponseEntity.badRequest().body("Room is already present");
        }

        //id not present create room

        //create new room
        Room room = new Room();
        room.setRoomId(roomId);
        Room savedRoom = roomRepo.save(room);
        return ResponseEntity.status(HttpStatus.CREATED).body(room);
    }

    // get room
    @GetMapping("/{roomId}")
    public ResponseEntity<?> joinRoom(@PathVariable String roomId){
        Room room=roomRepo.findByRoomId(roomId);
        if (room==null){
           ResponseEntity.badRequest().body("Room you are trying to join is not present");
        }
        //room!=null
        //room presnet and yu can join room

        return ResponseEntity.ok(room);
    }

    //get messages of room present
    //apply pagination
    //API Call api/room/{roomId}/get-msg     api/room/4001/get-msg
    // spacifying the roomId in path {} hence use PathVariable

    @GetMapping("/{roomId}/get-msg")
    public ResponseEntity<List<Message>> getMessages(@PathVariable String roomId,
    //apply pagination
   @RequestParam(value="page",defaultValue = "0",required = false) int page,
    @RequestParam(value = "size",defaultValue = "10",required = false) int size
    ){
        Room room = roomRepo.findByRoomId(roomId);
        if (room == null) {
            return ResponseEntity.badRequest().build()
                    ;
        }
        //get messages :
        //pagination
        List<Message> messages = room.getMessages();
        int start = Math.max(0, messages.size() - (page + 1) * size);
        int end = Math.min(messages.size(), start + size);
        List<Message> paginatedMessages = messages.subList(start, end);
        return ResponseEntity.ok(paginatedMessages);


       
    }
}
