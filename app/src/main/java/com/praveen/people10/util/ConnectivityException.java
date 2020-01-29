package com.praveen.people10.util;

import java.io.IOException;

public class ConnectivityException extends IOException {

    @Override
    public String getMessage() {
        return "No internet available!";
    }
}
