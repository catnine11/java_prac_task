package com.edu.chap10.level01.basic;

import java.util.Calendar;
import java.util.Date;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
//        super("만 20세 미만은 입장 불가입니다.");
    }

}
