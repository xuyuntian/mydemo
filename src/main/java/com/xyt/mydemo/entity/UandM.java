package com.xyt.mydemo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
public class UandM implements Serializable {
    private Long userId;
    private Long movieId;
}
