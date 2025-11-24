package com.ecommerce.spring.ecommercespring.exceptions;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class ErrorResponse {

  private int status;
  private String message;
  private LocalDateTime timeStamp;

  public ErrorResponse(int status, String message, LocalDateTime timestamp) {
    this.status = status;
    this.message = message;
    this.timeStamp = timestamp;
  }
}
