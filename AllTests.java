package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countAtest.class, divideTesting.class, squareTest.class })
public class AllTests {

}
