package com.svitlana.template_method;

import java.util.List;

public class NewestSorting extends RankingComponent {
    @Override
    public List<String> sortData(final List<String> data) {
        System.out.println("Sort by newest");
        return data;
    }
}
