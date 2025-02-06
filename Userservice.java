import java.util.Optional;

interface service {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements service {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    public String getPersonalizedWelcome(String name) {
        return getUser(name).map(n -> "Welcome, " + n + "!").orElse(getWelcomeMessage());
    }
}

public class Userservice{
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        System.out.println(userService.getPersonalizedWelcome("Alina"));
        System.out.println(userService.getPersonalizedWelcome(null));
    }
}
