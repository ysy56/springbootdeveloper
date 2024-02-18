import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() { // 전체 테스트를 시작하기 전에 1회 실행하므로 메서드는 static으로 선언
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() { // 테스트 케이스를 시작하기 전마다 실행
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll() { // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
        System.out.println("@AfterAll");
    } // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언

    @AfterEach
    public void afterEach() { // 테스트 케이스를 종료하기 전마다 실행
        System.out.println("@AfterEach");
    } // 테스트 케이스를 종료하기 전마다 실행

}