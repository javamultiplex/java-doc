package com.javamultiplex.classs;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class ClassYearMethodsDemo {

	public static void main(String[] args) {

		Year year = Year.now();
		System.out.println(year);// 2018

		/**
		 * 
		 * public Temporal adjustInto(Temporal temporal)throws DateTimeException, ArithmeticException
		 * 
		 * Description - It adjusts the specified temporal object to have this
		 * year.
		 * 
		 * LocalDate, LocalDateTime, Year, YearMonth etc are implementation
		 * class of Temporal interface.
		 */
		Temporal adjustInto = year.adjustInto(LocalDate.of(1992, Month.JUNE, 11));// 2018
		// Temporal adjustInto2 = Year.from(LocalDate.of(2018, Month.FEBRUARY,29)).adjustInto(LocalDate.of(1992, Month.JUNE,11));RE:DateTimeException
		System.out.println(adjustInto.get(ChronoField.MONTH_OF_YEAR));// 6
		System.out.println(adjustInto.get(ChronoField.DAY_OF_MONTH));// 11
		
		
		
		
		/**
		 * 
		 * public LocalDate atDay(int dayOfYear)throws DateTimeException
		 * 
		 * Description - It returns the local date formed from this year and the
		 * specified date of year.
		 * 
		 */
		System.out.println(year.atDay(78));// 2018-03-19
		// System.out.println(year.atDay(564));RE:DateTimeException

		
		
		
		/**
		 * 
		 * public YearMonth atMonth(int month) throws DateTimeException
		 * 
		 * Description - It returns the year-month formed from this year and the
		 * specified month
		 * 
		 */
		System.out.println(year.atMonth(6));// 2018-06
		// System.out.println(year.atMonth(13));RE:DateTimeException

		
		
		
		
		
		/**
		 * 
		 * public YearMonth atMonth(Month month)
		 * 
		 * Description - It returns the year-month formed from this year and the
		 * specified month
		 * 
		 */
		System.out.println(year.atMonth(Month.JANUARY));// 2018-01
		System.out.println(year.atMonth(Month.JUNE));// 2018-06

		
		
		
		
		/**
		 * 
		 * public LocalDate atMonthDay(MonthDay monthDay)
		 * 
		 * Description - It returns the local date formed from this year and the
		 * specified month-day
		 * 
		 */
		System.out.println(year.atMonthDay(MonthDay.now()));// 2018-01-11
		System.out.println(year.atMonthDay(MonthDay.of(Month.JUNE, 11)));// 2018-06-11

		
		
		
		
		/**
		 * 
		 * public int compareTo(Year other)
		 * 
		 * Description - It Compares this year to another year and returns 0,
		 * +ve or -ve number.
		 */
		System.out.println(year.compareTo(Year.of(2018)));// 0 because both years are equal
		System.out.println(year.compareTo(Year.of(2016)));// 2 because first year > second year
		System.out.println(year.compareTo(Year.of(2020)));// -2 because first year < second year

		
		
		
		/**
		 * 
		 * public boolean equals(Object obj)
		 * 
		 * Description - Checks if this year is equal to another year.
		 * 
		 */
		System.out.println(year.equals(Year.now()));// true
		System.out.println(year.equals(Year.of(2016)));// false

		
		
		
		
		/**
		 * 
		 * public String format(DateTimeFormatter formatter)
		 * 
		 * Description - It formats this year using the specified formatter.
		 * 
		 */
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yy");
		System.out.println(year.format(format1));// 2018
		System.out.println(year.format(format2));// 18

		
		
		
		
		
		/**
		 * 
		 * public static Year from(TemporalAccessor temporal)throws DateTimeException
		 * 
		 * Description - It returns an instance of Year from a temporal object.
		 * 
		 * LocalDate, LocalDateTime, YearMonth etc are implementation classes of
		 * TemporalAccessor interface.
		 * 
		 */
		System.out.println(Year.from(LocalDate.now()));// 2018
		System.out.println(Year.from(YearMonth.now()));// 2018
		// System.out.println(Year.from(LocalTime.now()));RE:DateTimeException

		
		
		
		
		
		/**
		 * public int get(TemporalField field) throws DateTimeException, UnsupportedTemporalTypeException, ArithmeticException
		 * 
		 * Description - It returns the value of the specified field from this
		 * year as an int.
		 * 
		 * ChronoField is an implementation class of TemporalField interface.
		 * 
		 */
		System.out.println(year.get(ChronoField.YEAR));// 2018
		// System.out.println(year.get(ChronoField.MONTH_OF_YEAR));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.from(LocalDate.of(2018, Month.FEBRUARY,29)).get(ChronoField.YEAR));RE:DateTimeException

		
		
		
		
		/**
		 * 
		 * public long getLong(TemporalField field)throws DateTimeException,UnsupportedTemporalTypeException, ArithmeticException
		 * 
		 * Description - It returns the value of the specified field from this
		 * year as an long.
		 * 
		 * ChronoField is an implementation class of TemporalField interface.
		 * 
		 */
		System.out.println(year.getLong(ChronoField.YEAR));// 2018
		// System.out.println(year.getLong(ChronoField.MONTH_OF_YEAR));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.from(LocalDate.of(2018, Month.FEBRUARY,29)).getLong(ChronoField.YEAR));RE:DateTimeException

		
		
		
		
		
		
		
		/**
		 * 
		 * public int getValue()
		 * 
		 * Description - It returns the year, MIN_VALUE to MAX_VALUE.
		 * 
		 */
		System.out.println(year.getValue());// 2018

		
		
		
		
		/**
		 * 
		 * public int hashCode()
		 * 
		 * Description - It returns the hash code for this year.
		 * 
		 */
		System.out.println(year.hashCode());// 2018

		
		
		
		
		
		
		
		/**
		 * 
		 * public boolean isAfter(Year other)
		 * 
		 * Description - It returns true if this is after the specified year.
		 * 
		 * 
		 */
		System.out.println(year.isAfter(Year.of(2016)));// true
		System.out.println(year.isAfter(Year.of(2019)));// false

		
		
		
		
		
		/**
		 * 
		 * public boolean isBefore(Year other)
		 * 
		 * Description - It returns true if this year is before the specified
		 * year.
		 * 
		 */
		System.out.println(year.isBefore(Year.of(2020)));// true
		System.out.println(year.isBefore(Year.of(2012)));// false

		
		
		
		
		
		
		/**
		 * 
		 * public boolean isLeap()
		 * 
		 * Description - It returns true if the year is leap, false otherwise.
		 * 
		 */
		System.out.println(year.isLeap());// false

		
		
		
		
		
		
		
		
		/**
		 * 
		 * public static boolean isLeap(long year)
		 * 
		 * Description - It returns true if the year is leap, false otherwise.
		 * 
		 */
		System.out.println(Year.isLeap(2016));// true
		System.out.println(Year.isLeap(2014));// false

		
		
		
		
		
		/**
		 * 
		 * public boolean isSupported(TemporalField field)
		 * 
		 * Description - It returns true if the field is supported on this year,
		 * false if not.
		 * 
		 * ChronoField is an implementation class of TemporalField interface.
		 * 
		 */
		System.out.println(year.isSupported(ChronoField.YEAR));// true
		System.out.println(year.isSupported(ChronoField.MONTH_OF_YEAR));// false

		
		
		
		
		
		
		
		/**
		 * 
		 * public boolean isSupported(TemporalUnit unit)
		 * 
		 * Description - it returns true if the unit can be added/subtracted,
		 * false if not.
		 * 
		 * The supported units are: YEARS DECADES CENTURIES MILLENNIA ERAS
		 * 
		 * All other ChronoUnit instances will return false.
		 *
		 * ChronoUnit is an implementation class of TemporalUnit interface.
		 */
		System.out.println(year.isSupported(ChronoUnit.YEARS));// true
		System.out.println(year.isSupported(ChronoUnit.DECADES));// true
		System.out.println(year.isSupported(ChronoUnit.CENTURIES));// true
		System.out.println(year.isSupported(ChronoUnit.MILLENNIA));// true
		System.out.println(year.isSupported(ChronoUnit.ERAS));// true
		System.out.println(year.isSupported(ChronoUnit.DAYS));// false

		
		
		
		
		
		/**
		 * 
		 * public boolean isValidMonthDay(MonthDay monthDay)
		 * 
		 * Description - It Checks if the month-day is valid for this year.
		 * 
		 */
		System.out.println(year.isValidMonthDay(MonthDay.of(Month.FEBRUARY, 28)));// true
		System.out.println(year.isValidMonthDay(MonthDay.of(Month.FEBRUARY, 29)));// false

		
		
		
		
		
		
		
		/**
		 * 
		 * public int length()
		 * 
		 * Description - It returns the length of this year in days, 365 or 366
		 * 
		 */
		System.out.println(year.length());// 365
		System.out.println(Year.of(2020).length());// 366

		
		
		
		
		/**
		 * 
		 * public Year minus(long amountToSubtract, TemporalUnit unit)throws UnsupportedTemporalTypeException, DateTimeException, ArithmeticException
		 * 
		 * Description - It returns a Year based on this year with the specified
		 * amount subtracted.
		 * 
		 * ChronoUnit is an implementation class of TemporalUnit interface.
		 */
		System.out.println(year.minus(20, ChronoUnit.YEARS));// 1998
		// 1 Decade = 10 years
		System.out.println(year.minus(20, ChronoUnit.DECADES));// 1818
		// 1 Century = 100 years
		System.out.println(year.minus(20, ChronoUnit.CENTURIES));// 18
		// 1 millenium = 1000 years
		System.out.println(year.minus(20, ChronoUnit.MILLENNIA));// -17982
		// System.out.println(year.minus(20,ChronoUnit.DAYS));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.from(YearMonth.of(2018,14)).minus(20,ChronoUnit.YEARS)); RE: DateTimeException

		
		
		
		
		
		
		
		
		/**
		 * 
		 * public Year minus(TemporalAmount amountToSubtract)throws DateTimeException
		 * 
		 * Description - It returns a Year based on this year with the
		 * subtraction made.
		 * 
		 * Period and Duration are implementation classes of TemporalAmount
		 * interface.
		 * 
		 */
		System.out.println(year.minus(Period.ofYears(20)));// 1998
		// System.out.println(Year.from(YearMonth.of(2018, 14)).minus(Period.ofYears(20))); RE: DateTimeException

		
		
		
		
		
		
		/**
		 * 
		 * public Year minusYears(long yearsToSubtract)throws DateTimeException
		 * 
		 * Description - it returns a Year based on this year with the year
		 * subtracted.
		 * 
		 */
		System.out.println(year.minusYears(10));// 2008
		// System.out.println(Year.from(YearMonth.of(2018, 14)).minusYears(10));RE: DateTimeException

		
		
		
		
		
		
		/**
		 * 
		 * public static Year now()
		 *
		 * Description - It returns the current year using the system clock and
		 * default time-zone.
		 * 
		 */
		System.out.println(Year.now());// 2018

		
		
		
		
		
		
		
		/**
		 * 
		 * public static Year now(Clock clock)
		 * 
		 * Description - It returns the current year from the specified clock.
		 */
		System.out.println(Year.now(Clock.systemDefaultZone()));// 2018
		System.out.println(Year.now(Clock.systemUTC()));// 2018
		System.out.println(Year.now(Clock.system(ZoneId.of("America/New_York"))));// 2018

		
		
		
		
		
		
		/**
		 * public static Year now(ZoneId zone)
		 * 
		 * Description - It returns the current year from the system clock in
		 * the specified time-zone
		 */
		System.out.println(Year.now(ZoneId.of("Asia/Kolkata")));// 2018
		System.out.println(Year.now(ZoneId.systemDefault()));// 2018

		
		
		
		
		
		
		/**
		 * 
		 * public static Year of(int isoYear)throws DateTimeException
		 * 
		 * Description - It accepts int value from MIN_VALUE to MAX_VALUE and
		 * returns Year instance.
		 * 
		 */
		System.out.println(Year.of(2019));// 2019
		System.out.println(Year.of(Year.MIN_VALUE));// -999999999
		System.out.println(Year.of(Year.MAX_VALUE));// 999999999
		// System.out.println(Year.of(Year.MIN_VALUE-1));RE : DateTimeException

		
		
		
		
		
		
		/**
		 *
		 * public static Year parse(CharSequence text)throws DateTimeException
		 * 
		 * Description - It returns an instance of Year from a text string.
		 */
		System.out.println(Year.parse("2017"));// 2017
		// System.out.println(Year.parse("abc"));RE:DateTimeParseException

		
		
		
		
		
		/**
		 * 
		 * public static Year parse(CharSequence text, DateTimeFormatter formatter) throws DateTimeException
		 * 
		 * Description - It returns an instance of Year from a text string using
		 * a specific formatter.
		 * 
		 */
		System.out.println(Year.parse("2017", DateTimeFormatter.ofPattern("yyyy")));// 2017
		// System.out.println(Year.parse("2017",DateTimeFormatter.ofPattern("yy")));RE:DateTimeParseException

		
		
		
		
		
		
		/**
		 * 
		 * public Year plus(TemporalAmount amountToAdd)throws DateTimeException,ArithmeticException
		 * 
		 * Description - It returns a Year based on this year with the addition
		 * made.
		 * 
		 * Period and Duration are implementation classes of TemporalUnit
		 * interface.
		 */
		System.out.println(year.plus(Period.ofYears(20)));// 2038
		// System.out.println(Year.from(YearMonth.of(2018,14)).plus(Period.ofYears(20))); RE: DateTimeException

		
		
		
		
		
		
		/**
		 * 
		 * public Year plus(long amountToAdd, TemporalUnit unit)throws UnsupportedTemporalTypeException, DateTimeException,ArithmeticException
		 * 
		 * Description - It returns a Year based on this year with the specified
		 * amount added.
		 * 
		 * ChronoUnit is an implementation class of TemporalUnit interface.
		 */
		System.out.println(year.plus(20, ChronoUnit.YEARS));// 2038
		// 1 Decade = 10 years
		System.out.println(year.plus(20, ChronoUnit.DECADES));// 2218
		// 1 Century = 100 years
		System.out.println(year.plus(20, ChronoUnit.CENTURIES));// 4018
		// 1 millenium = 1000 years
		System.out.println(year.plus(20, ChronoUnit.MILLENNIA));// 22018
		// System.out.println(year.plus(20,ChronoUnit.DAYS));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.from(YearMonth.of(2018,14)).plus(20,ChronoUnit.YEARS)); RE: DateTimeException

		
		
		
		
		
		
		
		
		
		
		/**
		 * 
		 * public Year plusYears(long yearsToAdd) throws DateTimeException
		 * 
		 * Description - It returns a Year based on this year with the years
		 * added.
		 * 
		 */
		System.out.println(year.plusYears(10));// 2028
		// System.out.println(Year.from(YearMonth.of(2018,14)).plusYears(10));RE: DateTimeException

		
		
		
		
		
		
		
		
		
		/**
		 * 
		 * public <R> R query(TemporalQuery<R> query)throws DateTimeException,ArithmeticException
		 * 
		 * Description - It queries this year using the specified query.
		 * 
		 * TemporalQuery is a functional interface.
		 */
		System.out.println(year.query(T -> T.isSupported(ChronoField.YEAR)));// true
		System.out.println(year.query(T -> T.get(ChronoField.YEAR)));// 2018
		// System.out.println(Year.from(LocalDate.of(2018, Month.FEBRUARY,29)).query(T -> T.get(ChronoField.YEAR)));RE: DateTimeException

		
		
		
		
		
		
		
		/**
		 * 
		 * public ValueRange range(TemporalField field) throws UnsupportedTemporalTypeException, DateTimeException
		 * 
		 * Description - It returns the range of valid values for the field.
		 * 
		 * ChronoField is an implementation class of TemporalField interface.
		 */
		System.out.println(year.range(ChronoField.YEAR));// -999999999 - 999999999
		System.out.println(year.range(ChronoField.ERA));// 0-1
		// System.out.println(year.range(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.of(Year.MIN_VALUE-1).range(ChronoField.YEAR));RE:DateTimeException

		
		
		
		
		
		
		
		
		
		/**
		 * 
		 * public String toString()
		 * 
		 * Description - It returns a string representation of this year.
		 * 
		 */
		System.out.println(year.toString());// 2018

		
		
		
		
		
		/**
		 * 
		 * public long until(Temporal endExclusive, TemporalUnit unit) throws DateTimeException, UnsupportedTemporalTypeException, ArithmeticException
		 * 
		 * Description - It calculates the amount of time until another year in
		 * terms of the specified unit.
		 * 
		 * LocalDate, LocalDateTime etc are implementation classes of Temporal
		 * interface. ChronoUnit is an implementation class of Temporal
		 * interface.
		 */
		System.out.println(year.until(LocalDate.of(2019, Month.JUNE, 11), ChronoUnit.YEARS));// 1
		// System.out.println(year.until(LocalDate.of(2019, Month.JUNE, 11),ChronoUnit.DAYS));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.of(Year.MIN_VALUE-1).until(LocalDate.of(2019,Month.JUNE, 11), ChronoUnit.DAYS));RE:DateTimeException

		
		
		
		
		
		
		/**
		 * 
		 * public Year with(TemporalField field, long newValue)
		 * 
		 * Description - It returns a copy of this year with the specified field
		 * set to a new value.
		 * 
		 * ChronoField is an implementation class of TemporalField interface.
		 */
		System.out.println(year.with(ChronoField.YEAR, 2019));// 2019
		// System.out.println(year.with(ChronoField.MINUTE_OF_DAY,12));RE:UnsupportedTemporalTypeException
		// System.out.println(Year.of(Year.MAX_VALUE+1).with(ChronoField.YEAR,2020));//RE:DateTimeException

		
		
		
		
		
		
		
		
		
		
		/**
		 * 
		 * public Year with(TemporalAdjuster adjuster)throws DateTimeException,ArithmeticException
		 * 
		 * Description - It returns a Year based on this with the adjustment
		 * made.
		 * 
		 * Year, YearMonth etc are implementation classes of TemporalAdjuster
		 * interface.
		 * 
		 */
		System.out.println(year.with(Year.of(2010)));// 2010
		// System.out.println(Year.from(LocalDate.of(2018, Month.FEBRUARY,29)).with(Year.of(2020)));RE:DateTimeException
	}

}
