import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyBeforeAfterTest {

    /** NOTE - RUN SEQUENCE TEST CLASS **
     * REMEMBER THAT THE JUNIT CLASS WHEN STARTED
     * DOESN'T RUN THE METHODS ONE AFTER ONE
     * BUT SOMETIMES CAN HAPPEN THAT THEY ARE RUN
     * RANDOMLY OR BASED ON THE JUNIT SYSTEM
     */

    // ========================================== //
    // NOTE - STATIC for @BeforeAll && @AfterAll //
    // @BeforeAll && @AfterAll METHODS
    // SPECIALLY FOR THE BEFORE ALL ANNOTATION
    // IT NEEDS TO BE STATIC OR ALL THE CLASS WILL FAIL,
    // THE REASON WHY IS THAT AS SAID BEFORE,
    // THE METHODS ARE NOT EXECUTED ONE BY ONE FOLLOWING THE ROWS
    // BUT CAN BE RUN RANDOMLY
    // AND
    // THE STATIC METHOD WILL MAKE THAT METHOD QUICKLY AVAILABLE
    // BEFORE THE OTHERS WITH ONLY @Test ANNOTATION
    // ========================================== //

    // The @BeforeAll annotation
    // is used to run a method,
    // ONCE, one time,
    // before the execution of evey other methods
    // so BEFORE ALL
    @BeforeAll
    public static void beforeAll() {
        System.out.println("*Before All");
    }

    // The @BeforeEach annotation
    // is used to run this method,
    // that you can call whatEverYouWant,
    // before each method.
    // Similar thing for the @AfterEach annotation
    // but that method will run after each @Test method of this class
    @BeforeEach
    public void beforeEach() {
        System.out.println("> Before each");
    }

    @Test
    public void test01() {
        System.out.println("test01");
    }

    @Test
    public void test02() {
        System.out.println("test02");
    }

    @Test
    public void test03() {
        System.out.println("test03");
    }

    // So the @AfterEach annotation
    // is used to run,
    // ALWAYS after each @Test Method,
    // this method down here
    // that you can call whatEverYouWant
    @AfterEach
    public static void afterEach() {
        System.out.println(">> After each");
    }

    // The @AfterAll annotation
    // is used to run a method,
    // ONCE, one time,
    // after the execution of evey other methods
    // so at the end of everything
    @AfterAll
    public void afterAll() {
        System.out.println("**After All");
    }

}