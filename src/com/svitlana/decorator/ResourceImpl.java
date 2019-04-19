package com.svitlana.decorator;

public class ResourceImpl implements Resource {
    @Override
    public String getPath() {
        return "I am ResourceImpl";
    }

    @Override
    public int getVersion() {
        return 1;
    }
}
