package com.zlrx.javadevzed.lombok;

import lombok.extern.java.Log;

@Log
public class LogExample {
    public void logMethod() {
        log.info("LogExample.logMethod() is called!");
    }
}
