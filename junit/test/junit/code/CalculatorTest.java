package junit.code;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import junit.code.Calculator;

@Tag("JunitPractice")
@DisplayName("Calculator Test Class")
class CalculatorTest implements TestLifeCycleLogger {

	/****************************************Execution Order as follows ************************************/
//	BeforeAllCallback(1)
//		@BeforeAll(2)
//			BeforeEachCallback(3)
//				@BeforeEach(4)
//					BeforeTestExecutionCallback(5)
//						@Test(6)
//							TestExecutionExceptionHandler(7)
//					AfterTestExecutionCallBack(8)
//				@AfterEach(9)
//			AfterEachCallback(10)
//		@AfterAll(11)
//	AfterAllCallback(12)
	/****************************************Execution Order as follows ************************************/
	
	Calculator cal = new Calculator();
	@BeforeAll
	void beforeAll() {
		System.out.println("Before All executed");
	}
	
	@BeforeEach
	void beforeEch() {
		System.out.println("Before Each executed");
	}
	 /********************************************Assertions***********************************/
	@Test
	@DisplayName("Calculator Test Method.")
	void testCalculator() {
		assertEquals(5,  cal.add(1, 4));	
	}
	
	@Test
	void groupedAssertions() {
		assertAll(
				() -> assertEquals(7, (6+1)),
				() -> assertTrue(7<1),
				() -> assertFalse(4<1)
				);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void dependendAssertions() {
		assertAll("properties",
				() ->{
				String name  = cal.returnName();
				assertNotNull(name);
				
				assertTrue(name.startsWith("p"));
				assertTrue(name.endsWith("n"));
				},
				() -> {
					String name  = cal.returnName();
					assertTrue("a".equals(name.charAt(2)));
				}
				);
	}
	
	@Test
	void exceptionTesting() {
		Throwable exe = assertThrows(IllegalArgumentException.class, () ->{
			throw new IllegalArgumentException("Praveen");
		});
		assertEquals("Praveen", exe.getMessage());
	}
	
	@Test
	void timeoutNotExceeded() {
		String actualGreetings = assertTimeout(Duration.ofMinutes(2), CalculatorTest::greetings);
		assertEquals("Hello Praveen", actualGreetings);
	}
	
	@Test
	void timeoutExceeded() throws InterruptedException {
		String acString = assertTimeout(Duration.ofMillis(150), CalculatorTest::greetings);
		assertEquals("Hello Praveen", acString);
		Thread.sleep(160);
	}
	
	/********************************************Assumptions***********************************/
	
	@Test
	void onlyOnCIServer() {
		System.setProperty("ENV","DEV");
		assumeTrue("CI".equals(System.getenv("ENV")),
				() -> "Aborting Test: Not on CI Env"
				);
	}
	
	@Test
	void onlyOnDEVServer() {
		System.setProperty("ENV","CI");
		assumeFalse("DEV".equals(System.getenv("ENV")),
				() -> "Aborting Test: Not on DEV Env"
				);
	}
	
	/*@Test   Experimental Method Not yet confirmed.
	void onlyOnDEVServer() {
		assumeThat("DEV".equals(System.getenv("ENV")),
				() -> {
					assertEquals(2, 2);
				});
		assertEquals("aSrting", "String");
	}*/
	
	/***********************************@Disabled***********************************/
	@Disabled
	@Test
	void notYetCleared() {
		System.out.println("req is not clear");
	}
	
	/***************************Conditions************************************************/
	
	@Test
	@EnabledOnOs(value = { OS.WINDOWS })
	void enableOnWindows() {
		System.out.println("Only On Windows");
	}
	
	@Test
	@EnabledOnOs(value = {OS.MAC})
	void enableOnMAC() {
		System.out.println("Enabled on MAC only");
	}
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	void enableOnJAVA8() {
		System.out.println("Enabled for Java 8 only");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "USER",matches ="prave")
	void enabledForPrave() {
		System.out.println("Enabled env for prave");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named ="USER", matches = "prave")
	void disabledForPrave() {
		System.out.println("Disbled for prave");
	}
	
	@Test
	@DisabledIfSystemProperty(named = "user.name",matches ="prave")
	void disableIfSystemProp() {
		System.out.println("@DisabledIfSystemProperty(named = \"user.name\",matches =\"prave\")");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "os.name",matches ="WINDOWS")
	void enabledIfSysteProp(){
		System.out.println("@EnabledIfSystemProperty(named = \"os.name\",matches =\"WINDOWS\")");
	}
	
	@Test
	@EnabledIf("'prave' == systemEnvironment.get('USER')")
	void enabledIf() {
		System.out.println("@EnabledIf(\"'prave' == systemEnvironment.get('USER')\")");
	}
	
	@Test
	@DisabledIf("'MAC' == systemEnvironment.get('OS')")
	void disbleIf() {
		System.out.println("@DisabledIf(\"'MAC' == systemEnvironment.get('OS')\")");
	}
	
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_10)
	void enabledOnJAVA10() {
		System.out.println("Enabled for Java 10 only");
	}
	
	/*******************Dependency injection for constructors and methods *******************/
	
	@DisplayName("Dependency injection for constructors and methods")
	@Nested
	class DependencyInjection{
		
		public DependencyInjection(org.junit.jupiter.api.TestInfo testInfo) {
			assertEquals("NewString", testInfo.getDisplayName());
		}
		
		@DisplayName("Test Reporter")
		@Test
		void test1(TestReporter testReporter) {
			testReporter.publishEntry("TestReporter");
		}
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("After All Executed");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each executed");
	}
	
	private static String greetings() {
		return "Hello Praveen";
	}

}
