package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeRecursionTest {
TreeSet<Integer> tree;
	@BeforeEach
	void setUp() throws Exception {
		tree = new TreeSet<>();
		tree.add(30);
		tree.add(40);
		tree.add(35);
		tree.add(80);
		tree.add(60);
		tree.add(100);
		tree.add(90);
		tree.add(15);
		
	}

	@Test
	void widthTest() {
		assertEquals(4, tree.width());
	}
	@Test
	void heightTest() {
		assertEquals(5, tree.height());
	}
//	@Test
//	void displayTreeTest() {
//		tree.displayTree();
//	}
	
	@Test
	void maxBranchSumTest() {
		TreeSet<Integer> tree1 = getTreeForTest();
		assertEquals(36, tree1.sumOfMaxBranch());
	}

	private TreeSet<Integer> getTreeForTest() {
		TreeSet<Integer> tree = new TreeSet<>((a, b) -> Integer.compare(getSum(a),getSum(b)));
		tree.add(4);
		tree.add(6);
		tree.add(5);
		tree.add(7);
		tree.add(11);
        tree.add(21);
		return tree;
	}
	private int getSum(Integer num) {
		int temp = num;
		int sum = 0;
		while(temp %10 != 0) {
			int remainder = temp % 10;
			sum += remainder;
			temp /= 10;
		}
		return sum;
	}

	@Test
	void displayTreeFileSystemTest() {
		tree.displayTreeFileSystem();
	}

}
