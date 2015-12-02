package com.example.secret;

public class EncodeException extends Exception {
    @Override
    public String getMessage() {
        return "encode  base64  exception ";
    }

    public EncodeException(String detailMessage) {
        super(detailMessage);
      
    }
}
