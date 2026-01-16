package com.codesnippet.ExceptionHandlersandGlobalExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Integer id) {
        try {
            if (id == 0) {
                throw new UserNotFoundException("user not found");
            }
        }
        catch (UserNotFoundException e) {
            ResponseMessage responseMessage=new ResponseMessage(LocalTime.now(),e.getMessage(),"User Not Found");
            return new ResponseEntity<>(responseMessage,HttpStatus.NOT_FOUND);

        }

     return new ResponseEntity<>("User Found", HttpStatus.OK);

    }




}
