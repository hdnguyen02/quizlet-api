package hdnguyen.controller;

import hdnguyen.dto.DeskDto;
import hdnguyen.dto.ResponseObject;
import hdnguyen.exception.AddException;
import hdnguyen.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/api/v1/desk")
public class DeskController {

    private final DeskService deskService;

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseObject addDesk(@RequestBody DeskDto deskDto) throws AddException {
       return deskService.addDesk(deskDto);
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObject getAll(
            @RequestParam(required = false) Boolean isPublic,
            @RequestParam(required = false) String sortBy
    ) {
        // check giá trị tại đây => không hợp lệ quăng ra lỗi
        return deskService.getAll(isPublic, sortBy);
    }

    @GetMapping("detail/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObject getDeskWithId(@PathVariable Integer id) throws Exception {
        return deskService.getDeskWithId(id);
    }

}
