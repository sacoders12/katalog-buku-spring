package com.subrutin.catalog.dto;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BookDetailDTO implements Serializable {
    public static final long serialVersionID = -7889938648939242355L;
    private Long bookId;
    private String authorName;
    private String bookTitle;
    private String bookDescription;
}
