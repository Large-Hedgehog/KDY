package com.green.boardver4.cmt;

import com.green.boardver4.Board.model.BoardUpdateDto;
import com.green.boardver4.cmt.model.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board/cmt")
@Tag(name="댓글", description = "")
public class CmtController {
    private final CmtService service;

    @Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }
    @PostMapping
    public int PostCmt(@RequestBody CmtInsDto dto){
        return service.insertBoardCmt(dto);
    }
    @GetMapping("/{iboard}")
    public List<CmtSelDto> GetCmt(@PathVariable int iboard, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "30") int row){
        CmtDto dto = new CmtDto();
        dto.setIboard(iboard);
        dto.setPage(page);
        dto.setRow(row);
        return service.selectBoardCmt(dto);
    }

    @DeleteMapping("/cmt/{iboardCmt}")
    public int DelBoardCmt(@PathVariable int iboardCmt,
                           @RequestParam int iuser){
        CmtDelDto dto= new CmtDelDto();
        dto.setIboard_cmt(iboardCmt);
        dto.setIuser(iuser);
        return service.deleteBoardCmt(dto);
    }

    @PutMapping("/cmt/{iboardCmt}")
    public int updateBoard(@RequestBody BoardUpdateDto dto){
        return service.updateBoardCmt(dto);
    }




}
