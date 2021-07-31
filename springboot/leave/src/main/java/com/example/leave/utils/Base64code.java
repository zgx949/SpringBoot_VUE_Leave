package com.example.api.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64code {
    public String encode(String text) throws UnsupportedEncodingException {
        final Base64.Encoder encoder = Base64.getEncoder();
        byte[] textByte = text.getBytes("UTF-8");
        return encoder.encodeToString(textByte);
    }
}
