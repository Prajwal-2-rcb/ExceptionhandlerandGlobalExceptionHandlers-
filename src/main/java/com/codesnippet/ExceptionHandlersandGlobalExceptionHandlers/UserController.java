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
    public String getUser(@PathVariable Integer id) {

            if (id == 0) {
                throw new UserNotFoundException("user not found");
            }



        return "user found";

    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?>  handleUserNotFoundException(UserNotFoundException userNotFoundException) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(userNotFoundException.getMessage());
    }





}
