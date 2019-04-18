package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.MovieHistory;
import com.xyt.mydemo.entity.UandM;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MovieHistoryReponsitory extends PagingAndSortingRepository<MovieHistory, UandM> {
    Page<MovieHistory> findMovieHistorysByUandM(UandM uandM, Pageable pageable);
}
