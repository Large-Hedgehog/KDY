package com.green.boardver4.cmt;

import com.green.boardver4.Board.model.BoardUpdateDto;
import com.green.boardver4.cmt.model.CmtDelDto;
import com.green.boardver4.cmt.model.CmtDto;
import com.green.boardver4.cmt.model.CmtEntity;
import com.green.boardver4.cmt.model.CmtSelDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmtMapper {
    int insertBoardCmt(CmtEntity entity);
    List<CmtSelDto>selectBoardCmt(CmtDto dto);
    int deleteBoardCmt(CmtDelDto dto);
    int updateBoardCmt(BoardUpdateDto dto);
}
