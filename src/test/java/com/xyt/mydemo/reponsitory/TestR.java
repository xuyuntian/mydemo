package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.Movie;
import com.xyt.mydemo.entity.MovieHistory;
import com.xyt.mydemo.entity.MovieRank;
import com.xyt.mydemo.entity.UandM;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestR {
    @Autowired
    MovieReponsitory movieReponsitory;
    @Autowired
    MovieRankReponsitory movieRankReponsitory;
    @Autowired
    MovieHistoryReponsitory movieHistoryReponsitory;
    @Test
    public void testInsert(){
        for(int i = 0;i < 10;i++){
            Movie movie = Movie.builder().name(UUID.randomUUID().toString()).build();
            movieReponsitory.save(movie);
            System.out.println(movie.getId());
        }
    }
    @Test
    public void testPage(){
        Pageable page = PageRequest.of(0,10);
        Page<Movie> movieList = movieReponsitory.findMoviesByType(1,page);
      //  System.out.println(movieList.getTotalPages());
        for(Movie m :movieList.getContent()){
            System.out.println(m.getId());
        }
    }
    @Test
    public void insertMovieRank(){
        UandM uandM = new UandM();
        uandM.setMovieId(1L);
        uandM.setUserId(1L);
        MovieRank movieRank = MovieRank.builder().uandM(uandM).star(2).build();
        movieRankReponsitory.save(movieRank);
    }
    @Test
    public void insertMovieHistory(){
        UandM uandM = new UandM();
        uandM.setUserId(1L);
        for(long i = 0; i< 100 ;i++){
            uandM.setMovieId(i);
            MovieHistory movieHistory = MovieHistory.builder()
                    .uandM(uandM).t(100L).time(new Date()).build();
            movieHistoryReponsitory.save(movieHistory);
        }
    }
    @Test
    public void findMovieHistory(){
//        UandM uandM = new UandM();
//        uandM.setUserId(1L);
        Page<MovieHistory> page = movieHistoryReponsitory.findMovieHistorysByUandMUserId(1L,PageRequest.of(0,30));
        for(MovieHistory e:page.getContent()){
            System.out.println(e.getUandM().getMovieId());
        }
    }
}
