public class QuandoUtilizarParenteses {

    public static void main(String[] args) {
        MyEventConsumer myEvent  = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvente1 = (s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent2 = s -> System.out.println(s);

        MyEventConsumer myEvente3 = s -> {
            System.out.println(s);
            System.out.println(s);
        };

        MyEventConsumerReturn ret = s -> {
            System.out.println(s);
            System.out.println(s);
            return 1;
        };

    }
}
