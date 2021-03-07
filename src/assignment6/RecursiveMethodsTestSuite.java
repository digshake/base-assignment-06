package assignment6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import assignment6.tests.ArraySumComprehensiveTest;
import assignment6.tests.ArraySumPreliminaryTest;
import assignment6.tests.DragonTest;
import assignment6.tests.ExponentTests;
import assignment6.tests.MaxPathLengthTest;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ExponentTests.class, ArraySumPreliminaryTest.class, ArraySumComprehensiveTest.class,
		DragonTest.class, MaxPathLengthTest.class })
public class RecursiveMethodsTestSuite {

}
