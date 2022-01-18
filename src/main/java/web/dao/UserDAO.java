package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAO {

    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(1,"User_1"));
        users.add(new User(2,"User_2"));
        users.add(new User(3,"User_3"));
        users.add(new User(4,"User_4"));
        users.add(new User(5,"User_5"));

    }

    public List<User> index() {
        return users;
    }

    public User show(int id){

        return  users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }



}
