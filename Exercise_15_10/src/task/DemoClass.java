package task;

import container.Container;
import container.Queue;
import container.Stack;
import runner.CounterTaskRunner;
import runner.PrintTimeTaskRunner;

/**
 *
 * @author Admin
 */
public class DemoClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Task c = new CounterOutTask();
    Task c1 = new CounterOutTask();
    Task c2 = new CounterOutTask();
    Task r1 = new RandomOutTask();
    Task r2 = new RandomOutTask();
    Task t1 = new OutTask("Test message");
    Task t2 = new OutTask("Second test message");

    Container stack = new Stack();
    Container queue = new Queue();

    stack.push(c);
    stack.push(c1);
    stack.push(c2);

    queue.push(r1);
    queue.push(r2);
    queue.push(t1);
    queue.push(t2);

    System.out.println("Stack elements:");
    System.out.println(stack);

    System.out.println("Queue elements:");
    System.out.println(queue);

//    System.out.println("Pop from Stack: " + stack.pop());
//    System.out.println("Pop from Queue: " + queue.pop());
    stack.transferFrom(queue);
    System.out.println("\nTransfering Queue to Stack: " + stack);

//    List<Task> list = Arrays.asList(c, c1, c2, r1, r2, t1, t2);
//
//    for (Task task : list) {
//      task.execute();
//    }
//
//    System.out.println();
//
//    for (Task list1 : list) {
//      System.out.println(list1.toString());
//    }
    PrintTimeTaskRunner pttr = new PrintTimeTaskRunner();
    pttr.add(t2);
    pttr.add(t1);
    pttr.add(r1);
    pttr.add(r2);
    pttr.executeAll();
    
    CounterTaskRunner ctr = new CounterTaskRunner();
    ctr.add(t2);
    ctr.add(t1);
    ctr.add(r1);
    ctr.add(r2);
    ctr.executeAll();
  }
}
