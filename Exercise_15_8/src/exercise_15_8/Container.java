/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

/**
 *
 * @author Kate
 */
public interface Container {
  public Task pop();
  public void push(Task pushtask);
  public int size();
  public boolean isEmpty();
  public void transferFrom(Container trans);
  public void toprint();
}
