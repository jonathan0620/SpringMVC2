package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

/**
 * 회원 목록 조회: GET `/users`
 * 회원 등록: POST `/users`
 * 회원 조회: GET `/users/{userId}`
 * 회원 수정: PATCH `/users/{userId}`
 * 회원 삭제: DELETE `/users/{userId}`
 */
@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * GET /mapping/users
     */
    @GetMapping
    public String user() {
        return "get users";
    }

    /**
     * POST /mapping/users
     */
    @PostMapping
    public String addUser() {
        return "post user";
    }

    /**
     * GET /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userID) {
        return "get userID =" + userID;
    }

    /**
     * PATCH /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String updateUser(@PathVariable String userID) {
        return "update userID =" + userID;
    }

    /**
     * DELETE /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String deleteUser(@PathVariable String userID) {
        return "delete userID =" + userID;
    }
}
