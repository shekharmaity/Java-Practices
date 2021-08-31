package random;

import java.util.concurrent.CompletableFuture;

public class CompleteFutureDemo {


    public static void main(String[] args) {
        demoCompletableFuture();
    }

private static void demoCompletableFuture() {
    CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
        System.out.println("task running inside completableFuture");

    });

    //completableFuture.get();
}
}
