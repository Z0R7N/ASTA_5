package steps;

import org.junit.jupiter.api.Test;

public class TaskFiveTest extends BasePageTest {
    @Test
    public void fiveTest() {
        String st = lastString.findString("src/main/resources/testData.txt");
        main.goTo().chooseTask("5");
        taskFivePage
                .uploadFile("//span[text()[contains(.,'Wgraj plik')]]/input", "src/main/resources/testData.txt")
                .elementVisible("//td[text()[contains(.,'" + st + "')]]");
    }
}
