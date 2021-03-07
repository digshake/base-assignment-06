package assignment6.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import assignment6.RecursiveMethods;
import assignment6.maxpath.MaxPathLengthScenarios;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Parameterized.class)
public class MaxPathLengthTest {
	private final boolean[][] stones;
	private final int row0;
	private final int col0;
	private final int expected;

	public MaxPathLengthTest(String description, String scenario) {
		this.stones = MaxPathLengthScenarios.parseStones(scenario);
		this.row0 = MaxPathLengthScenarios.parseRow0(scenario);
		this.col0 = MaxPathLengthScenarios.parseColumn0(scenario);
		this.expected = MaxPathLengthScenarios.lookupExpected(scenario);
	}

	@Test
	public void test() {
		int actual = RecursiveMethods.maxPathLength(stones, row0, col0);
		assertEquals(expected, actual);
	}

	@Parameterized.Parameters(name = "{0}; {1}")
	public static Collection<Object[]> getConstructorArguments() {
		List<Object[]> args = new LinkedList<>();
		for (String scenario : MaxPathLengthScenarios.scenariosAsArray()) {
			args.add(new Object[] { MaxPathLengthScenarios.lookupDescription(scenario), scenario });
		}
		return args;
	}
}
