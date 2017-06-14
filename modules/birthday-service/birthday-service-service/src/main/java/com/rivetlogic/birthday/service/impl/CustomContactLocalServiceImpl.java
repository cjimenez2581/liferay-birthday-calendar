/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.birthday.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Contact;
import com.rivetlogic.birthday.service.base.CustomContactLocalServiceBaseImpl;

/**
 * The implementation of the custom contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rivetlogic.birthday.service.CustomContactLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomContactLocalServiceBaseImpl
 * @see com.rivetlogic.birthday.service.CustomContactLocalServiceUtil
 */
@ProviderType
public class CustomContactLocalServiceImpl
extends CustomContactLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rivetlogic.birthday.service.CustomContactLocalServiceUtil} to access the custom contact local service.
	 */

	public  List<Contact> findUsersByDate(int month, int day) throws SystemException {
		return customContactFinder.getContactsByDate(month, day);
	}

	public  Date getUpcomingBirthday(Date lastDate, long tzOffset) throws SystemException {
		return customContactFinder.getUpcomingBirthday(lastDate, tzOffset);
	}

	public List<Contact> getContactsByWeek(int minDateYear, int minDateMonth, int minDateDay,
			int maxDateYear, int maxDateMonth, int maxDateDay) throws SystemException {
		return customContactFinder.getContactsByWeek(minDateYear, minDateMonth, minDateDay,
				maxDateYear, maxDateMonth, maxDateDay);
	}

	public List<Contact> getContactsByBirthdayMonth(int month, int startDay, int endDay) throws SystemException{
		return customContactFinder.getContactsByMonth(month, startDay, endDay);
	}

	public Map<Integer, Integer> getGroupedMonthBirthdays(int year, int month) throws SystemException{
		return customContactFinder.getGroupedBirthdaysOfMonth(year, month);
	}
}