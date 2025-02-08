package com.codehelp.question_service.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NotFoundException extends QuestionException{
  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException(String message, String errorDescription) {
    super(message, errorDescription);
  }
}
