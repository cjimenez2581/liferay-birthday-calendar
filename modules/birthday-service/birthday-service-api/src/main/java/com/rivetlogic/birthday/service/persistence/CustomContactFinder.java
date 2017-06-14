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

package com.rivetlogic.birthday.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface CustomContactFinder {
	public java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByDate(
		int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.Date getUpcomingBirthday(java.util.Date lastdate,
		long tzOffset)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByWeek(
		int year1, int month1, int day1, int year2, int month2, int day2)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.kernel.model.Contact> getContactsByMonth(
		int month, int startDay, int endDay)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupedBirthdaysOfMonth(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;
}