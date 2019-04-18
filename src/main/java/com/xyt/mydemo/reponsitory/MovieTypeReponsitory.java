package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.MovieType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieTypeReponsitory extends PagingAndSortingRepository<MovieType,Long> {
}
