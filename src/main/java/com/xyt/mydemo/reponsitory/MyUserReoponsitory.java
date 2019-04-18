package com.xyt.mydemo.reponsitory;

import com.xyt.mydemo.entity.MyUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyUserReoponsitory extends PagingAndSortingRepository<MyUser,Long> {
}
