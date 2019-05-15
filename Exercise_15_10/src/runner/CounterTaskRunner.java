/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import task.Task;

/**
 *
 * @author Kate
 */
public class CounterTaskRunner extends AbstractTaskRunner implements TaskRunner {
int counter = 0;
  @Override
  public void afterExecution(Task task) {
    counter++;
    System.out.println("counter : " + counter);

  }
}
