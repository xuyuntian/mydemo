package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.MovieRank;
import com.xyt.mydemo.entity.UandM;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRankReponsitory extends PagingAndSortingRepository<MovieRank, UandM> {
}
