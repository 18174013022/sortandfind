package com.sort.find.usb;

public interface NumberArraySort {
	/**
	 * 为数组赋值随机数
	 * 
	 * @param numberLength
	 *            数组长度
	 * @return 返回一个数组
	 */
	public int[] randomnumber(int numberLength);

	/**
	 * 给数组排序
	 * 
	 * @param randomNumber
	 *            赋值好随机数的数组
	 * @return 返回一个数组
	 */
	public int[] sortnumber(int[] randomNumber);

	 
	/**
	 * 打印数组的值
	 * 
	 * @param numberArray
	 *            数组的长度
	 */
	public void printnumber(int[] numberArray);
}
