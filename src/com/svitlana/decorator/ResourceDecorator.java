package com.svitlana.decorator;

public class ResourceDecorator implements Resource {

    private Resource resource;

    public ResourceDecorator(final Resource resource) {
        this.resource = resource;
    }

    @Override
    public String getPath() {
        return this.resource.getPath() + " + Decorator!!!";
    }

    @Override
    public int getVersion() {
        return 11;
    }
}
