package assignment6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxPathLengthTests {

    /**
     * Tests a simple path with no branches
     */
    @Test
    public void testSimplePath() {
        int[][] path =
                {{1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1}};
        assertEquals(10, RecursiveMethods.maxPathLength(path));
    }

    /**
     * Tests a path that dead ends in the middle of the array
     */
    @Test
    public void testSimpleDeadEnd() {
        int[][] path =
                {{1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        assertEquals(6, RecursiveMethods.maxPathLength(path));
    }

    /**
     * Tests a path with length 1
     */
    @Test
    public void testVeryShortPath() {
        int[][] path =
                {{1, 0},
                {0, 0}};
        assertEquals(1, RecursiveMethods.maxPathLength(path));
    }

    /**
     * Tests a path with length 1
     */
    @Test
    public void testVeryVeryShortPath() {
        int[][] path =
                {{1}};
        assertEquals(1, RecursiveMethods.maxPathLength(path));
    }

    /**
     * Tests a map without any paths on it
     */
    @Test
    public void testNonExistentPath() {
        int[][] path =
                {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        assertEquals(0, RecursiveMethods.maxPathLength(path));
    }

    /**
     * Tests an array with no rows or columns
     */
    @Test
    public void testNonExistentPath2() {
        int[][] path = new int[0][0];
        assertEquals(0, RecursiveMethods.maxPathLength(path));
    }

    @Test
    public void testLongDeadEnd() {
        int[][] path =
                {{1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}};
        assertEquals(44, RecursiveMethods.maxPathLength(path));

    }

    @Test
    public void testSimpleBranch() {
        int[][] path =
                {{1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1, 1}};
        assertEquals(10, RecursiveMethods.maxPathLength(path));
    }

    @Test
    public void testBranchWithDeadEnd() {
        int[][] path =
                {{1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0}};
        assertEquals(8, RecursiveMethods.maxPathLength(path));
    }

    @Test
    public void testManyBranches() {
        int[][] path =
                {{1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1, 1},
                {1, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}};
        assertEquals(28, RecursiveMethods.maxPathLength(path));
    }
}
