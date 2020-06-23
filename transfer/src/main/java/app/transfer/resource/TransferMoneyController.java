package app.transfer.resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/transfer")
public class TransferMoneyController {

    @GetMapping
    public String getUsers() {
        return "users";
    }

    @PostMapping("/convert")
    public String convertMoney(@RequestBody final String money) {
        return money;
    }

    @PutMapping("/sendMoney")
    public String sendMoney(@RequestBody final String money) {
        return money;
    }
}
