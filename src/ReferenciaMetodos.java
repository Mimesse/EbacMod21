public class ReferenciaMetodos {
    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> System.out.println(s);
        myEvent1.consumer("Olá1");
        
        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Olá2");
    }
}
