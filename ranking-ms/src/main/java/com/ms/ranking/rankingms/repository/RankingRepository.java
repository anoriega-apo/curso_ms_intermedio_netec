package com.ms.ranking.rankingms.repository;

import com.ms.ranking.rankingms.model.RankingDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RankingRepository extends MongoRepository<RankingDocument, String> {
}
