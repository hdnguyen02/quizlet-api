package hdnguyen.controller;

import hdnguyen.dto.ResponseObject;
import hdnguyen.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@ResponseStatus(HttpStatus.OK)
@RequestMapping("${system.version}")
public class TagController {
    private final TagService tagService;

    // người dùng thêm tag.


//    @PostMapping("/tags")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseObject createTag(@RequestBody Map<String, String> requestBody) throws Exception {
//        String name = requestBody.get("name");
//        if (name == null) throw new Exception("Thiếu dữ liệu");
//        return tagService.createTag(name);
//    }
//
//    @GetMapping("/tags")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseObject getTags()  {
//        return tagService.getTags();
//    }
}
