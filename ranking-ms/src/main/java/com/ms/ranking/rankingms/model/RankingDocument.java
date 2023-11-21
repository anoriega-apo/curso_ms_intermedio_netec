package com.ms.ranking.rankingms.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("rankings")
public class RankingDocument {

    private String id;

    private String userId;

    private String hotelId;

    private int start;
}
