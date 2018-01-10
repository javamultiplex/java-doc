package com.javamultiplex.enums;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalQuery;
import java.util.Locale;

public class EnumDayOfWeekMethodsDemo {

	public static void main(String[] args) {

		/**
		 * 
		 * public Temporal adjustInto(Temporal temporal)throws DateTimeException,ArithmeticException
		 * 
		 * Description - It adjusts the specified temporal object to have this
		 * day-of-week.
		 *
		 * LocalDate, LocalDateTime, ZonedDateTime etc are the class
		 * implementations of Temporal interface.
		 * 
		 */

		System.out.println(DayOfWeek.MONDAY.adjustInto(LocalDate.of(1992, Month.JUNE, 11)));// 1992-06-08
		System.out.println(DayOfWeek.MONDAY.adjustInto(ZonedDateTime.now()));// 2018-01-08T20:25:16.376+05:30[Asia/Calcutta]
		// System.out.println(DayOfWeek.of(8).adjustInto(LocalDateTime.now())); RE:DateTimeException

		/**
		 * 
		 * public static DayOfWeek from(TemporalAccessor temporal)throws DateTimeException
		 * 
		 * Description - It returns an instance of DayOfWeek from a temporal
		 * object.
		 * 
		 * LocalDateTime, LocalDate, Month etc are the class implementations of
		 * TemporalAccessor interface.
		 * 
		 */
		System.out.println(DayOfWeek.from(LocalDateTime.now()));// TUESDAY
		System.out.println(DayOfWeek.from(LocalDate.of(2014, Month.JULY, 4)));// FRIDAY
		// System.out.println(DayOfWeek.from(Month.FEBRUARY));RE:DateTimeException
		
		
		/**
		 * 
		 * public int get(TemporalField field)throws DateTimeException, ArithmeticException,UnsupportedTemporalTypeException
		 * 
		 * Description -It returns the value of the specified field from this day-of-week as an int.
		 * 
		 * ChronoField enum is the implementation of TemporalField interface.
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.get(ChronoField.DAY_OF_WEEK));//1
		System.out.println(DayOfWeek.THURSDAY.get(ChronoField.DAY_OF_WEEK));//4
		//System.out.println(DayOfWeek.THURSDAY.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));RE:UnsupportedTemporalTypeException
		//System.out.println(DayOfWeek.of(12).get(ChronoField.DAY_OF_WEEK));RE:DateTimeException
		
		
		/**
		 * 
		 * public String getDisplayName(TextStyle style,Locale locale)
		 * 
		 * Description - It returns the text value of the day-of-week. If no textual mapping is found 
		 * then the numeric value is returned.
		 * 
		 */
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, Locale.ENGLISH));//Friday
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH));//Friday
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.NARROW, Locale.ENGLISH));//F
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH));//5
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));//Fri
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH));//Fri
		
		
		
		/**
		 * 
		 * public int getLong(TemporalField field)throws DateTimeException, ArithmeticException,UnsupportedTemporalTypeException
		 * 
		 * Description -It returns the value of the specified field from this day-of-week as an long.
		 * 
		 * ChronoField enum is the implementation of TemporalField interface.
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.getLong(ChronoField.DAY_OF_WEEK));//1
		System.out.println(DayOfWeek.THURSDAY.getLong(ChronoField.DAY_OF_WEEK));//4
		//System.out.println(DayOfWeek.THURSDAY.getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));RE:UnsupportedTemporalTypeException
		//System.out.println(DayOfWeek.of(12).getLong(ChronoField.DAY_OF_WEEK));RE:DateTimeException
		
		/**
		 * 
		 * public int getValue()
		 * 
		 * Description - It returns the day-of-week, from 1 (Monday) to 7 (Sunday)
		 * 
		 */
		System.out.println(DayOfWeek.WEDNESDAY.getValue());//3
		System.out.println(DayOfWeek.SATURDAY.getValue());//6
		
		
		/**
		 * 
		 * public boolean isSupported(TemporalField field)
		 * 
		 * Description - It returns true if the field is supported on this day-of-week, false if not.
		 * 
		 * ChronoField enum is the implementation of TemporalField interface.
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.isSupported(ChronoField.DAY_OF_WEEK));//true
		System.out.println(DayOfWeek.MONDAY.isSupported(ChronoField.DAY_OF_MONTH));//false
		
		/**
		 * 
		 * public DayOfWeek minus(long days)
		 * 
		 * Description - It returns the day-of-week that is the specified number of days 
		 * before this one.The calculation rolls around the start of the year from Monday to Sunday. 
		 * The specified period may be negative.
		 * 
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.minus(4));//THURSDAY
		System.out.println(DayOfWeek.SATURDAY.minus(3));//WEDNESDAY
		System.out.println(DayOfWeek.MONDAY.minus(-4));//FRIDAY
	
	
		/**
		 * 
		 * public static DayOfWeek of(int dayOfWeek)
		 * 
		 * Description - It returns an instance of DayOfWeek from an int value.DayOfWeek is an enum representing 
		 * the 7 days of the week. This method allows the enum to be obtained from the int value. 
		 * The int value follows the ISO-8601 standard, from 1 (Monday) to 7 (Sunday).
		 * 
		 * 
		 */
		System.out.println(DayOfWeek.of(2));//TUESDAY
		System.out.println(DayOfWeek.of(7));//SUNDAY
		//System.out.println(DayOfWeek.of(9));RE:DateTimeException 
		
		
		/**
		 * 
		 * public DayOfWeek plus(long days)
		 * 
		 * Description - It returns the day-of-week that is the specified number of days 
		 * after this one.The calculation rolls around the end of the week from Sunday to Monday. 
		 * The specified period may be negative.
		 * 
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.plus(6));//SUNDAY
		System.out.println(DayOfWeek.SATURDAY.plus(2));//MONDAY
		System.out.println(DayOfWeek.THURSDAY.plus(-3));//MONDAY
	
		/**
		 * 
		 * public <R> R query(TemporalQuery<R> query)throws DateTimeException,ArithmeticException
		 * 
		 * Description - It queries this day-of-week using the specified query.
		 * 
		 * TemporalQuery is a function interface and it has following method.
		 * R queryFrom(TemporalAccessor temporal)
		 * 
		 */
		TemporalQuery<Integer> query=T->T.get(ChronoField.DAY_OF_WEEK);
		System.out.println(DayOfWeek.SATURDAY.query(query));//6
		//System.out.println(DayOfWeek.of(8).query(query));RE:DateTimeException
		
		/**
		 * 
		 * public ValueRange range(TemporalField field)throws DateTimeException,UnsupportedTemporalTypeException
		 * 
		 * Description - It returns the range of valid values for the specified field.
		 * 
		 */
		System.out.println(DayOfWeek.MONDAY.range(ChronoField.DAY_OF_WEEK));//1-7
		//System.out.println(DayOfWeek.MONDAY.range(ChronoField.DAY_OF_MONTH));RE: UnsupportedTemporalTypeException
		//System.out.println(DayOfWeek.of(8).range(ChronoField.DAY_OF_WEEK));RE:DateTimeException
		
		/**
		 * 
		 * public static DayOfWeek valueOf(String name)throws NullPointerException,IllegalArgumentException
		 * 
		 * Description - It returns the enum constant with the specified name.
		 * 
		 */
		System.out.println(DayOfWeek.valueOf("SUNDAY"));
		System.out.println(DayOfWeek.valueOf("MONDAY"));
		//System.out.println(DayOfWeek.valueOf(null));RE:NullPointerException
		//System.out.println(DayOfWeek.valueOf("abc"));RE:IllegalArgumentException
		
		/**
		 * 
		 * public static DayOfWeek[] values()
		 * 
		 * Description - It returns an array containing the constants of this enum type, 
		 * in the order they are declared
		 * 
		 */
		DayOfWeek[] values = DayOfWeek.values();
		for(DayOfWeek value:values){
			System.out.println(value);
		}
		
	}
	
	
	

}
