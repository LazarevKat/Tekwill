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
public class PrintTimeTaskRunner extends AbstractTaskRunner implements TaskRunner{
  
  @Override
  public void afterExecution(Task thisTask){
  System.out.println( "Created at: " + thisTask.getCreatedAt() + "  ||  "
          + "Executed at: " + thisTask.getExecutedAt());  
  }
}
