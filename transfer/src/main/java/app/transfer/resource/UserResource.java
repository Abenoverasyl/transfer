package app.transfer.resource;

import app.transfer.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Peter", 2000L, "EUR"),
                new User("Dima", 5000L, "CHF"),
                new User("Roma", 3000L, "GBP")
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName) {
        return new User("userName", 1000L, "EUR");
    }
}
