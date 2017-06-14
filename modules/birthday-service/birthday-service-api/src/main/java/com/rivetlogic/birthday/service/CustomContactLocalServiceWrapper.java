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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomContactLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomContactLocalService
 * @generated
 */
@ProviderType
public class CustomContactLocalServiceWrapper
	implements CustomContactLocalService,
		ServiceWrapper<CustomContactLocalService> {
	public CustomContactLocalServiceWrapper(
		CustomContactLocalService customContactLocalService) {
		_customContactLocalService = customContactLocalService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _customContactLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.Date getUpcomingBirthday(java.util.Date lastDate,
		long tzOffset)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customContactLocalService.getUpcomingBirthday(lastDate, tzOffset);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Contact> findUsersByDate(
		int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customContactLocalService.findUsersByDate(month, day);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByBirthdayMonth(
		int month, int startDay, int endDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customContactLocalService.getContactsByBirthdayMonth(month,
			startDay, endDay);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByWeek(
		int minDateYear, int minDateMonth, int minDateDay, int maxDateYear,
		int maxDateMonth, int maxDateDay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customContactLocalService.getContactsByWeek(minDateYear,
			minDateMonth, minDateDay, maxDateYear, maxDateMonth, maxDateDay);
	}

	@Override
	public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupedMonthBirthdays(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customContactLocalService.getGroupedMonthBirthdays(year, month);
	}

	@Override
	public CustomContactLocalService getWrappedService() {
		return _customContactLocalService;
	}

	@Override
	public void setWrappedService(
		CustomContactLocalService customContactLocalService) {
		_customContactLocalService = customContactLocalService;
	}

	private CustomContactLocalService _customContactLocalService;
}