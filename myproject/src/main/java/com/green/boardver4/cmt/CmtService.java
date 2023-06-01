package com.green.boardver4.cmt;

import com.green.boardver4.Board.model.BoardUpdateDto;
import com.green.boardver4.cmt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CmtService {
    private final CmtMapper mapper;

    @Autowired
    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int insertBoardCmt(CmtInsDto dto){
        CmtEntity entity = new CmtEntity();
        entity.setIboard(dto.getIboard());
        entity.setIuser(dto.getIuser());
        entity.setCtnt(dto.getCtnt());
        return mapper.insertBoardCmt(entity);
    }

    public List<CmtSelDto> selectBoardCmt(CmtDto dto) {
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return mapper.selectBoardCmt(dto);
    }

    public int deleteBoardCmt (CmtDelDto dto){
        return mapper.deleteBoardCmt(dto);
    }


    public int updateBoardCmt(BoardUpdateDto dto) {
        return mapper.updateBoardCmt(dto);
    }
}
