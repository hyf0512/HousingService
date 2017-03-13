/*package com.housing.management.backend.actor;


import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.pattern.Patterns;
import akka.util.Timeout;

public class HelloWorker{

	public static class A extends UntypedActor {
		 
        private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);
 
        @Override
        public void onReceive(Object message) throws Exception {
            if (message instanceof String) {
                
                // 实际逻辑业务
            	Thread.sleep(3000);
            	
                System.out.println(Thread.currentThread().getName() + " sleep end");
                System.out.println("接收的消息：" + message);
                // 返回一个消息
                this.getSender().tell("hello wordb", this.getSelf());
                
//                this.getSender().tell("hello world", this.getSelf());
                System.out.println("sender path=" + this.getSender().path());
                // 停止
//                getContext().stop(this.getSelf());
                log.info("|||{} has stop", this.getSelf().path());
            }
        }
    }
 
    public static void main(String args[]) throws Exception {
        System.out.println(Thread.currentThread().getName());
        ActorSystem system = ActorSystem.create("mySystem");
        ActorRef a = system.actorOf(Props.create(A.class), "actorName");
        ActorRef b = system.actorOf(Props.create(A.class), "actorName1");
        Timeout timeout = new Timeout(Duration.create(5, "seconds"));
        Future<Object> future1 = Patterns.ask(a, "are you ready?", timeout);
        Future<Object> future2 = Patterns.ask(b, "OK?", timeout);
 
        // This will cause the current thread to block and wait for the UntypedActor to ‘complete’
        // the Future with it’s reply.
        // 在这里会阻塞到 Await.result 方法上，但这会导致性能的损失。
        String result1 = (String) Await.result(future1, timeout.duration());
        String result2 = (String) Await.result(future2, timeout.duration());
        System.out.println("1====:"+result1);
        System.out.println("2====:"+result2);
    }
}
*/