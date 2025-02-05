package com.hcifuture.contextactionlibrary.sensor.collector;

import com.hcifuture.contextactionlibrary.sensor.data.Data;

public class CollectorResult {
    private String savePath;
    private String dataString;
    private Data data;
    private int logLength;
    private long startTimestamp;
    private long endTimestamp;
    private CollectorManager.CollectorType type = CollectorManager.CollectorType.All;

    public int getLogLength() {
        return logLength;
    }

    public String getSavePath() {
        return savePath;
    }

    public Data getData() {
        return data;
    }

    public String getDataString() {
        return dataString;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public long getEndTimestamp() {
        return endTimestamp;
    }

    public CollectorManager.CollectorType getType() {
        return type;
    }

    public CollectorResult setLogLength(int logLength) {
        this.logLength = logLength;
        return this;
    }

    public CollectorResult setSavePath(String savePath) {
        this.savePath = savePath;
        return this;
    }

    public CollectorResult setData(Data data) {
        this.data = data;
        return this;
    }

    public CollectorResult setDataString(String dataString) {
        this.dataString = dataString;
        return this;
    }

    public CollectorResult setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    public CollectorResult setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    public CollectorResult setType(CollectorManager.CollectorType type) {
        this.type = type;
        return this;
    }
}
