package com.xyt.mydemo.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieHistory {
    @EmbeddedId
    private UandM uandM;
    private Date time;
    private Long t;
}
