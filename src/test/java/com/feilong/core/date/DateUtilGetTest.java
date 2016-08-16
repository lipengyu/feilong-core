/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.date;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.feilong.core.date.DateUtil.toDate;

import static com.feilong.core.DatePattern.COMMON_DATE_AND_TIME;

/**
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class DateUtilGetTest extends BaseDateUtilTest{

    /** The Constant log. */
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtilGetTest.class);

    //**********com.feilong.core.date.DateUtil.getYear(Date)*********************
    @Test(expected = NullPointerException.class)
    public void testGetYear1(){
        DateUtil.getYear(null);
    }

    //**********com.feilong.core.date.DateUtil.getMonth(Date)******************************

    @Test(expected = NullPointerException.class)
    public void testGetMonthNullDate(){
        DateUtil.getMonth(null);
    }

    //******com.feilong.core.date.DateUtil.getWeekOfYear(Date)************************************

    @Test(expected = NullPointerException.class)
    public void testGetWeekOfYearNullDate(){
        DateUtil.getWeekOfYear(null);
    }

    //************com.feilong.core.date.DateUtil.getDayOfYear(Date)************************************
    @Test(expected = NullPointerException.class)
    public void testGetDayOfYearNullDate(){
        DateUtil.getDayOfYear(null);
    }

    //**********com.feilong.core.date.DateUtil.getDayOfMonth(Date)*****************************

    @Test(expected = NullPointerException.class)
    public void testGetDayOfMonthNullDate(){
        DateUtil.getDayOfMonth(null);
    }

    //********com.feilong.core.date.DateUtil.getDayOfWeek(Date)******************************
    @Test(expected = NullPointerException.class)
    public void testGetDayOfWeekNullDate(){
        DateUtil.getDayOfWeek(null);
    }

    //************com.feilong.core.date.DateUtil.getHourOfYear(Date)***************************
    @Test(expected = NullPointerException.class)
    public void testGetHourOfYearNullDate(){
        DateUtil.getHourOfYear(null);
    }

    /**
     * Gets the hour of year.
     * 
     */
    @Test
    public void testGetHourOfYear(){
        assertEquals(0, DateUtil.getHourOfYear(toDate("2013-01-01 00:00:05", COMMON_DATE_AND_TIME)));
        assertEquals(31 * 24, DateUtil.getHourOfYear(toDate("2016-02-01 00:00:05", COMMON_DATE_AND_TIME)));
        assertEquals(24, DateUtil.getHourOfYear(toDate("2013-01-02 00:00:05", COMMON_DATE_AND_TIME)));
        LOGGER.debug(DateUtil.getHourOfYear(toDate("2013-01-05 12:00:05", COMMON_DATE_AND_TIME)) + "");

        LOGGER.debug(DateUtil.getHourOfYear(toDate("2013-09-16 11:42:22", COMMON_DATE_AND_TIME)) + "");
        LOGGER.debug(DateUtil.getHourOfYear(NOW) + "");
    }

    //******************com.feilong.core.date.DateUtil.getHourOfDay(Date)**************************
    @Test(expected = NullPointerException.class)
    public void testGetHourOfDayNullDate(){
        DateUtil.getHourOfDay(null);
    }

    /**
     * Gets the hour of day.
     */
    @Test
    public void testGetHourOfDay(){
        assertEquals(0, DateUtil.getHourOfDay(toDate("2012-06-29 00:26:53", COMMON_DATE_AND_TIME)));
        assertEquals(22, DateUtil.getHourOfDay(toDate("2016-07-16 22:34:00", COMMON_DATE_AND_TIME)));
        assertEquals(0, DateUtil.getHourOfDay(toDate("2016-07-16 24:34:00", COMMON_DATE_AND_TIME)));
    }

    //**********com.feilong.core.date.DateUtil.getMinute(Date)****************************

    @Test(expected = NullPointerException.class)
    public void testGetMinuteNullDate(){
        DateUtil.getMinute(null);
    }

    /**
     * Gets the minute.
     */
    @Test
    public void testGetMinute(){
        LOGGER.debug(DateUtil.getMinute(NOW) + "");
    }

    //**********com.feilong.core.date.DateUtil.getSecondOfDay(Date)************************************

    @Test(expected = NullPointerException.class)
    public void testGetSecondOfDayNullDate(){
        DateUtil.getSecondOfDay(null);
    }

    /**
     * Gets the second of day.
     */
    @Test
    public void testGetSecondOfDay(){
        LOGGER.debug(DateUtil.getSecondOfDay(NOW) + "");
    }

    //*************com.feilong.core.date.DateUtil.getSecondOfHour(Date)***********************************

    @Test(expected = NullPointerException.class)
    public void testGetSecondOfHourNullDate(){
        DateUtil.getSecondOfHour(null);
    }

    /**
     * Gets the second of hour.
     */
    @Test
    public void testGetSecondOfHour(){
        LOGGER.debug(DateUtil.getSecondOfHour(NOW) + "");
    }

    //********com.feilong.core.date.DateUtil.getSecond(Date)********************

    @Test(expected = NullPointerException.class)
    public void testGetSecondNullDate(){
        DateUtil.getSecond(null);
    }

    /**
     * Gets the second.
     */
    @Test
    public void testGetSecond(){
        LOGGER.debug(DateUtil.getSecond(NOW) + "");
    }

    //************com.feilong.core.date.DateUtil.getTime(Date)***********************

    @Test(expected = NullPointerException.class)
    public void testGetTimeNullDate(){
        DateUtil.getTime(null);
    }

    /**
     * Gets the time.
     */
    @Test
    public void testGetTime(){
        LOGGER.debug(DateUtil.getTime(NOW) + "");
    }

}