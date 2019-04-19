package com.svitlana.template_method;

import java.util.Arrays;
import java.util.List;

public abstract class RankingComponent {

    public List<String> getData() {
        final List<String> allData = extractData();
        final List<String> mapped = mapData(allData);
        return sortData(mapped);
    }

    private List<String> mapData(final List<String> allData) {
        System.out.println("Here we map data");
        return allData;
    }

    private List<String> extractData() {
        return Arrays.asList("Number1", "Number2", "Number3");
    }

    public abstract List<String> sortData(List<String> data);
}
