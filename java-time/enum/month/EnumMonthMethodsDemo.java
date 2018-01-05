package com.javamultiplex.enums;

import java.time.Month;

/**
 * 
 * @author Rohit Agarwal
 * @version 1.8
 *
 */
public class EnumMonthMethodsDemo {

	public static void main(String[] args) {

		/**
		 * public int firstDayOfYear(boolean leapYear)
		 * 
		 * Description - it returns the day of year corresponding to the first
		 * day of this month, from 1 to 336.
		 * 
		 */
		System.out.println(Month.MARCH.firstDayOfYear(false)); // 60
		System.out.println(Month.MARCH.firstDayOfYear(true));// 61

		/**
		 * public Month firstMonthOfQuarter()
		 * 
		 * Description - The year can be divided into four quarters. This method
		 * returns the first month of the quarter for the base month. January,
		 * February and March return January. April, May and June return April.
		 * July, August and September return July. October, November and
		 * December return October.
		 * 
		 */

		System.out.println(Month.MARCH.firstMonthOfQuarter());// JANUARY
		System.out.println(Month.MAY.firstMonthOfQuarter());// APRIL
		System.out.println(Month.AUGUST.firstMonthOfQuarter());// JULY
		System.out.println(Month.DECEMBER.firstMonthOfQuarter());// OCTOBER

		/**
		 * public int getValue()
		 * 
		 * Description - It returns this month number from 1 (January) to 12
		 * (December)
		 * 
		 */
		System.out.println(Month.JANUARY.getValue()); // 1
		System.out.println(Month.DECEMBER.getValue()); // 12

		/**
		 * 
		 * public int length(boolean leapYear)
		 * 
		 * Description - It returns number of days in this month based on leap
		 * year flag, from 28 to 31.February has 28 days in a standard year and
		 * 29 days in a leap year. April, June, September and November have 30
		 * days. All other months have 31 days.
		 * 
		 */
		System.out.println(Month.FEBRUARY.length(true)); // 29
		System.out.println(Month.FEBRUARY.length(false));// 28

		/**
		 * 
		 * public int maxLength()
		 * 
		 * Description - It returns the maximum length of this month in days,
		 * from 29 to 31. February has a maximum length of 29 days. April, June,
		 * September and November have 30 days. All other months have 31 days
		 * 
		 */
		System.out.println(Month.FEBRUARY.maxLength());// 29
		System.out.println(Month.JUNE.maxLength());// 30

		/**
		 * 
		 * public int minLength()
		 * 
		 * Description - It returns the minimum length of this month in days,
		 * from 28 to 31. February has a minimum length of 28 days. April, June,
		 * September and November have 30 days. All other months have 31 days.
		 * 
		 */
		System.out.println(Month.FEBRUARY.minLength());// 28
		System.out.println(Month.OCTOBER.minLength());// 31

		/**
		 * public Month minus(long months)
		 * 
		 * Description - Returns the month of year that is the specified number
		 * of months before this one.The calculation rolls around the start of
		 * the year from January to December. The specified period may be
		 * negative.
		 * 
		 */

		System.out.println(Month.DECEMBER.minus(5));// JULY
		System.out.println(Month.FEBRUARY.minus(3));// NOVEMBER
		System.out.println(Month.MARCH.minus(-3));// JUNE

		/**
		 * 
		 * public static Month of(int month) throws DateTimeException
		 * 
		 * Description - It returns the month of the year.Month is an enum
		 * representing the 12 months of the year. This method allows the enum
		 * to be obtained from the int value. The int value follows the ISO-8601
		 * standard, from 1 (January) to 12 (December).
		 * 
		 */
		System.out.println(Month.of(8));// AUGUST
		System.out.println(Month.of(5));// MAY
		//System.out.println(Month.of(15)); RE : DateTimeException because of invalid argument.

		/**
		 * 
		 * public Month plus(long months)
		 * 
		 * Description - It returns the month of year that is the specified
		 * number of months after this one.The calculation rolls around the end
		 * of the year from December to January. The specified period may be
		 * negative.
		 * 
		 */

		System.out.println(Month.JANUARY.plus(4));// MAY
		System.out.println(Month.DECEMBER.plus(3));// MARCH
		System.out.println(Month.FEBRUARY.plus(-3));// NOVEMBER

		/**
		 * 
		 * public static Month valueOf(String name)throws IllegalArgumentException, NullPointerException
		 * 
		 * Description - It returns the enum constant with the specified name.
		 * 
		 */
		System.out.println(Month.valueOf("MARCH"));// MARCH
		System.out.println(Month.valueOf("NOVEMBER"));// NOVEMBER
		//System.out.println(Month.valueOf("abc")); RE: IllegalArgumentException because of invalid enum constant.
		//System.out.println(Month.valueOf(null)); RE: NullPointerException

		/**
		 * public static Month[] values()
		 * 
		 * Description - It returns an array containing the constants of this
		 * enum type, in the order they are declared
		 * 
		 */

		Month[] months = Month.values();
		for (Month month : months) {
			System.out.println(month);
		}

	}

}
