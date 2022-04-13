package study.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * @author 万松(Aaron)
 * @creat_date: 2022/4/13
 * @creat_time: 08:10
 * @since 7.5.0
 */
public class ActivityDemo {
  @Test
  public void testCreateDbTable(){
    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    System.out.println(processEngine);
  }
}
