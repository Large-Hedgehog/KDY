package com.green.boardver4.Board.model;

import lombok.Data;

@Data
public class BoardUpdateDto {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
}
