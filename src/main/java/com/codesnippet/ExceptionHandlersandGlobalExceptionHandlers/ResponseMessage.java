package com.codesnippet.ExceptionHandlersandGlobalExceptionHandlers;

import java.sql.Time;
import java.time.LocalTime;

public class ResponseMessage {

  LocalTime time;
  String message;
  String details;

  public ResponseMessage(LocalTime time, String message, String details) {
      this.time = time;
      this.message = message;
      this.details = details;
  }
  public LocalTime getTime() {
      return time;
  }
  public void setTime(LocalTime time) {
      this.time = time;
  }
  public String getMessage() {
      return message;
  }
  public void setMessage(String message) {
      this.message = message;
  }
  public String getDetails() {
      return details;

  }
  public void setDetails(String details) {
      this.details = details;
  }


}
