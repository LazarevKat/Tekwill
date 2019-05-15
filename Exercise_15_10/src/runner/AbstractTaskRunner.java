/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import container.Container;
import container.Queue;
import task.Task;

/**
 *
 * @author Kate
 */
public abstract class AbstractTaskRunner implements TaskRunner {

  protected Container container;

  public AbstractTaskRunner() {
    this.container = new Queue();
  }

  @Override
  public void add(Task task) {
    container.push(task);
  }

  @Override
  public void executeAll() {
    while (!container.isEmpty()) {
      Task myTask = container.pop();
      myTask.execute();
      this.afterExecution(myTask);
    }
  }
}
