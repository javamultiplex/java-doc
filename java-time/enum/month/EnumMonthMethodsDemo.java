package com.javamultiplex.enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalQuery;
import java.util.Locale;

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
		
		/**
		 * 
		 * public String getDisplayName(TextStyle style, Locale locale)
		 * 
		 * Description - It returns the textual name used to identify the
		 * month-of-year. If no textual mapping is found then the numeric value
		 * is returned.
		 * 
		 */
		String full = Month.FEBRUARY.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		String fullStandalone = Month.FEBRUARY.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
		String narrow = Month.FEBRUARY.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
		String narrowStandalone = Month.FEBRUARY.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH);
		String shortt = Month.FEBRUARY.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		String shortStandalone = Month.FEBRUARY.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH);
		System.out.println(full); // February
		System.out.println(fullStandalone);// 2
		System.out.println(narrow);// F
		System.out.println(narrowStandalone);// 2
		System.out.println(shortt);// Feb
		System.out.println(shortStandalone);// 2

		/**
		 * 
		 * public int get(TemporalField field) throws DateTimeException,UnsupportedTemporalTypeException,ArithmeticException
		 * 
		 * Description - It returns the value of the specified field from this
		 * month-of-year as an int.
		 * 
		 * ChronoField is an enum present in java.time.temporal package and
		 * implements TemporalField interface.
		 */
		System.out.println(Month.DECEMBER.get(ChronoField.MONTH_OF_YEAR));// 12
		// System.out.println(Month.of(18).get(ChronoField.MONTH_OF_YEAR)); RE : DateTimeException
		// System.out.println(Month.DECEMBER.get(ChronoField.CLOCK_HOUR_OF_AMPM)); RE : UnsupportedTemporalTypeException
		
		/**
		 * 
		 * public long getLong(TemporalField field) throws DateTimeException,UnsupportedTemporalTypeException,ArithmeticException
		 * 
		 * Description - It returns the value of the specified field from this
		 * month-of-year as an long.
		 * 
		 * ChronoField is an enum present in java.time.temporal package and
		 * implements TemporalField interface.
		 */
		System.out.println(Month.JUNE.getLong(ChronoField.MONTH_OF_YEAR));// 6
		// System.out.println(Month.of(18).getLong(ChronoField.MONTH_OF_YEAR)); RE : DateTimeException
		// System.out.println(Month.JUNE.getLong(ChronoField.CLOCK_HOUR_OF_AMPM)); RE : UnsupportedTemporalTypeException

		
		/**
		 * public boolean isSupported(TemporalField field)
		 * 
		 * Description - It returns true if the field is supported on this
		 * month-of-year, false if not
		 * 
		 * ChronoField is an enum present in java.time.temporal package and
		 * implements TemporalField interface.
		 * 
		 */
		System.out.println(Month.JUNE.isSupported(ChronoField.MONTH_OF_YEAR));// true
		System.out.println(Month.JUNE.isSupported(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));// false

		
		/**
		 * 
		 * public ValueRange range(TemporalField field)throws DateTimeException,UnsupportedTemporalTypeException
		 * 
		 * Description - It returns the range of valid values for the specified
		 * field.
		 * 
		 * ChronoField is an enum present in java.time.temporal package and
		 * implements TemporalField interface.
		 * 
		 */
		System.out.println(Month.JUNE.range(ChronoField.MONTH_OF_YEAR));// 1-12
		// System.out.println(Month.JUNE.range(ChronoField.CLOCK_HOUR_OF_AMPM)); RE : UnsupportedTemporalTypeException
		// System.out.println(Month.of(14).range(ChronoField.MONTH_OF_YEAR)); RE : DateTimeException

		
		/**
		 * 
		 * public static Month from(TemporalAccessor temporal) throws DateTimeException
		 * 
		 * Description - It returns an instance of Month from a temporal object.
		 * 
		 * LocalDate, Month, LocalDateTime, LocalTime etc are implementation
		 * classes of TemporalAccessor interface.
		 * 
		 */
		System.out.println(Month.from(LocalDate.now()));// JANUARY
		System.out.println(Month.from(Month.DECEMBER));// DECEMBER
		System.out.println(Month.from(LocalDateTime.now()));// JANUARY
		// System.out.println(Month.from(LocalTime.now()));RE : DateTimeException

		
		/**
		 * public Temporal adjustInto(Temporal temporal) throws ArithmeticException,DateTimeException
		 * 
		 * Description - It Adjusts the specified temporal object to have this
		 * month-of-year.
		 * 
		 * LocalDate, YearMonth etc are implementation classes of Temporal
		 * interface.
		 * 
		 */
		System.out.println(Month.JUNE.adjustInto(LocalDate.now()));// 2018-06-08
		System.out.println(Month.JUNE.adjustInto(YearMonth.now()));// 2018-06
		// System.out.println(Month.of(20).adjustInto(LocalDate.now())); RE:DateTimeException

		
		/**
		 * 
		 * public <R> R query(TemporalQuery<R> query)throws ArithmeticException,DateTimeException
		 * 
		 * Description - It queries this month-of-year using the specified query.
		 * 
		 * TemporalQuery is a function interface and it has following method.
		 * R queryFrom(TemporalAccessor temporal)
		 *
		 */
		TemporalQuery<Integer> myQuery = T -> T.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(Month.AUGUST.query(myQuery));
		//System.out.println(Month.of(14).query(myQuery)); // RE: DateTimeException


	}

}
