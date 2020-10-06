import org.junit.jupiter.api.*;

public class LifeCycleTest {

    /*  MethodName_StateUnderTest_ExpectedBehavior
    example: isAdult_AgeLessThan18_False*/

    @BeforeAll
    static void beforeAll() {
        System.out.println("Executed once before all test methods in this class");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Executed before each test method in this class");
    }

    @Test
    void testMethod1() {
        System.out.println("Test method1 executed");
    }

    @Test
    @DisplayName("Test method2 with condition")
    void testMethod2() {
        System.out.println("Test method2 executed");
    }

    @Test
    @Disabled("Implementation is pending")
    void testMethod3() {
        System.out.println("Test method3 executed");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Executed after each test method in this class");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Executed once after all test methods in this class");
    }
}
