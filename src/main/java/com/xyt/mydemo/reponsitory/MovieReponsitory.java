package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieReponsitory extends PagingAndSortingRepository<Movie,Long> {
//    @Query(nativeQuery = true,value = "select * from movie where movie.type = :type limit :start,:num")
//    List<Movie> findMoviesByType(@Param("type") Integer type,@Param("start") Integer start,@Param("num") Integer num);
   Page<Movie> findMoviesByType(Integer type, Pageable pageable);
}
