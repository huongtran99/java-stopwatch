package com.codegym;

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = startTime;
        } else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }
}
