package com.example.secret;

public class DecodeException extends Exception {

    @Override
    public String getMessage() {
        return "decode  base64  exception ";
    }

    public DecodeException(String detailMessage) {
        super(detailMessage);
      
    }
    
    

}
