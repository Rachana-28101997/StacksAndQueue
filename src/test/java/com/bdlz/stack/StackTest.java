package com.bdlz.stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.bdlz.stack.MyLinkedList;

public class StackTest {

	@Test
	public void PushThreeNumbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode peak = stack.peak();
		stack.printMyNodes();
		Assert.assertEquals(myThirdNode, peak);
	}
}
