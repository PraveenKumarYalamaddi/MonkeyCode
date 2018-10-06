package junit.code;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {
	
	static final Logger LOG = Logger.getLogger(TestLifeCycleLogger.class.getName());
	
	@BeforeAll
	default void beforeAllTests() {
		LOG.info("Before All tests");
	}
	
	@BeforeEach
	default void beforeEachTest(TestInfo testInfo) {
		LOG.info(() -> String.format("About to start ", testInfo.getDisplayName()));
	}
	
	@AfterAll
	default void afterAllTests() {
		LOG.info("After All tests");
	}
	
	@AfterEach
	default void afterEachTest(TestInfo testInfo) {
		LOG.info(() -> String.format("Completed test is ", testInfo.getDisplayName()));
	}
	
	
	

}
