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

package com.rivetlogic.birthday.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CustomContact. This utility wraps
 * {@link com.rivetlogic.birthday.service.impl.CustomContactLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CustomContactLocalService
 * @see com.rivetlogic.birthday.service.base.CustomContactLocalServiceBaseImpl
 * @see com.rivetlogic.birthday.service.impl.CustomContactLocalServiceImpl
 * @generated
 */
@ProviderType
public class CustomContactLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.birthday.service.impl.CustomContactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.Date getUpcomingBirthday(java.util.Date lastDate,
		long tzOffset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUpcomingBirthday(lastDate, tzOffset);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Contact> findUsersByDate(
		int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findUsersByDate(month, day);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByBirthdayMonth(
		int month, int startDay, int endDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getContactsByBirthdayMonth(month, startDay, endDay);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByWeek(
		int minDateYear, int minDateMonth, int minDateDay, int maxDateYear,
		int maxDateMonth, int maxDateDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getContactsByWeek(minDateYear, minDateMonth, minDateDay,
			maxDateYear, maxDateMonth, maxDateDay);
	}

	public static java.util.Map<java.lang.Integer, java.lang.Integer> getGroupedMonthBirthdays(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupedMonthBirthdays(year, month);
	}

	public static CustomContactLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CustomContactLocalService, CustomContactLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CustomContactLocalService.class);
}