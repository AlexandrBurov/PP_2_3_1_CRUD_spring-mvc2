package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAO {

    private List<User> users;

    private static int USER_COUNT;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_COUNT,"User_1"));
        users.add(new User(++USER_COUNT,"User_2"));
        users.add(new User(++USER_COUNT,"User_3"));
        users.add(new User(++USER_COUNT,"User_4"));
        users.add(new User(++USER_COUNT,"User_5"));

    }
//===========================================================
    public List<User> index() {
        return users;
    }
    public User show(int id){return  users.stream().filter(user -> user.getId() == id).findAny().orElse(null);}

    public  void save(User user) {

        user.setId(++USER_COUNT);

        users.add(user);
    }

    public void update(int id, User updateUser){   // ОБНОВЛЯЕМ ПОЛЯ
        User userToBeUpdated = show(id);

        userToBeUpdated.setName(updateUser.getName()); // ЕСЛИ НЕСКОЛЬКО ПОЛЕЙ, ТО КАЖДОЕ НУЖНО ОБНОВИТЬ!


    }












//===========================================================
}
