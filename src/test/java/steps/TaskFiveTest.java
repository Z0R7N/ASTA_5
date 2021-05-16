package steps;

import org.junit.jupiter.api.Test;

public class TaskFiveTest extends BasePageTest{
    @Test
    public void fiveTest(){
        main.goTo().chooseTask("5");
    }
}
