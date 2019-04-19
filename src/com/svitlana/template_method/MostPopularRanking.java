package com.svitlana.template_method;

import java.util.List;

public class MostPopularRanking extends RankingComponent {
    @Override
    public List<String> sortData(final List<String> data) {
        System.out.println("Sort by popularity");
        return data;
    }
}
