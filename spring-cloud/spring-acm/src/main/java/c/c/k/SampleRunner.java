package c.c.k;

@Component
class SampleRunner implements ApplicationRunner {

    @Value("${user.id}")
    String userId;

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int userAge;

    public void run(ApplicationArguments args) throws Exception {
        System.out.println(userId);
        System.out.println(userName);
        System.out.println(userAge);
    }
}
