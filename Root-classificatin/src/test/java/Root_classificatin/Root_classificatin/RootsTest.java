package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

//	@Test
//	public void testPartion1() 
//	{
//		//(0,1,2)
//		Roots.calculate_roots(-2, 1, 2);
//		String  root_expected = Root_Types.ERROR.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
	
	// Partition for the A parameter
	@Test
	public void testPartion_A_Min() {
		Roots.calculate_roots(0, 10, 20);
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion_A_MinPlus1() {
		Roots.calculate_roots(1, 10, 20);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_A_Nominal() {
		Roots.calculate_roots(50, 40, 8);
		String  root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_A_MaxMinus1() {
		Roots.calculate_roots(99, 10, 50);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_A_Max() {
		Roots.calculate_roots(100, 25, 50);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	// Partition for the B parameter
//	@Test
//	public void testPartion_B_Min() {
//		Roots.calculate_roots(25, 0, 50);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_B_MinPlus1() {
//		Roots.calculate_roots(25, 1, 50);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	
//	@Test
//	public void testPartion_B_Nominal() {
//		Roots.calculate_roots(10, 50, 15);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_B_MaxMinus1() {
//		Roots.calculate_roots(15, 99, 20);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_B_Max() {
//		Roots.calculate_roots(25, 100, 25);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	
//	// Partition for the C parameter
//	@Test
//	public void testPartion_C_Min() {
//		Roots.calculate_roots(25, 25, 0);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_C_MinPlus1() {
//		Roots.calculate_roots(25, 10, 1);
//		String  root_expected = Root_Types.Equal_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_C_Nominal() {
//		Roots.calculate_roots(25, 25, 50);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_C_MaxMinus1() {
//		Roots.calculate_roots(10, 25, 99);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
//	@Test
//	public void testPartion_C_Max() {
//		Roots.calculate_roots(10, 25, 100);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected, Roots.root_types().toString());
//	}
	
	
	}
