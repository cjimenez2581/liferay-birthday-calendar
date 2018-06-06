<%-- 
/**
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 */
--%>

<%@include file="/init.jsp" %>

<!--[if lt IE 10]>
    <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<div class="container-fluid portlet-birthdays">
    <div class="row-fluid">
        <div>
                                
            <!-- content -->
            <select name="view-mode" class="view-mode" autocomplete="off">
                <option value="day" selected="selected"><liferay-ui:message key="daily"/></option>
                <option value="week"><liferay-ui:message key="weekly"/></option>
                <option value="month"><liferay-ui:message key="monthly"/></option>
            </select>
            <ul class="pager">
                <li class="previous">
                    <a href="#">&larr; <liferay-ui:message key="prev"/></a>
                </li>
                <li class="next">
                    <a href="#"><liferay-ui:message key="next"/> &rarr;</a>
                </li>
            </ul>
            <div class="bday-view-container">
                
            </div>
            
            
            <!-- TEMPLATES -->
            <script id="bday-big-date" type="text/x-handlebars-template">
                <p class="text-center">
                    <a href="javascript:void(0)" class="today"><u>see today</u></a>
                </p>
                <div class="bdays-info-container">
                    <div class="bdays-info clearfix">
                        <div class="bdays-info-biggie"> {{day}}</div>
                        <div class="bdays-info-label">
                            <div class="bdays-info-label-biggie">{{weekDay}}</div>
                            <div class="bdays-info-label-small">{{fullDate}}</div>
                        </div>
                    </div>
                </div>
            </script>
            <script id="bday-daily-list" type="text/x-handlebars-template">
                <ul class="nav nav-tabs nav-stacked">
                    {{#each users}}
                    <li class="active">
                        <a href="javascript:void(0)" class="bday-person">
                            <img src="{{portrait}}" class="img-circle" alt="">
                            {{name}}
                        </a>
                    </li>
                    {{/each}}
                </ul>
            </script>
            <script id="bday-grouped-list" type="text/x-handlebars-template">
                <ul class="nav nav-tabs nav-stacked accordionized">
                    {{#each dates}}
                    <li class="wrapper grouped-dates-wrapper">
                        <a href="" class="toggle" data-dateStr="{{dateStr}}">
                            ({{usersNumber}}) {{formatISODate date}}  <i class="toggle-icon icon-plus"></i>
                        </a>
                        <ul class="content nav nav-tabs nav-stacked hidden">
                            {{#each users}}
                            <li class="active">
                                <a href="javascript:void(0)" class="bday-person">
                                    <img src="{{portrait}}" class="img-circle" alt="">
                                    {{name}}
                                </a>
                            </li>
                            {{/each}}
                        </ul>
                    </li>
                    {{/each}}
                </ul>                            
            </script>
            <script id="bday-footer" type="text/x-handlebars-template">
                <div class="bottom-box text-center">
                    {{#if empty}}
                    <p>
                        <liferay-ui:message arguments="{{viewMode}}" key="no-birthdays-to-show-this-x"/> 
                        <br>
                        <a data-upcoming="{{upcomingDate}}" href="javascript:void(0)" class="upcoming"><u><liferay-ui:message key="see-upcoming-date"/></u></a>
                    </p>
                    {{/if}}
                </div>
            </script>
            <script id="bday-week" type="text/x-handlebars-template">
                <div class="top-box text-center">
                	<strong>{{start}} - {{end}}</strong>
                </div>
            </script>
            <script id="bday-month" type="text/x-handlebars-template">
                <div class="top-box text-center">
                	<strong>{{month}}</strong>
                </div>
            </script>
          	<script id="bday-show-more" class="bday-show-more" type="text/x-handlebars-template">
            	<p>
                	<a href="" class="show-more"><u><liferay-ui:message key="show-more"/></u></a>
                </p>
            </script>
            
        </div>
    </div>
</div>

<portlet:resourceURL var="getBirthdays">
</portlet:resourceURL>

<aui:script use="toutDisplay">
YUI().use('birthday-portlet', 'node', 'event', function(Y) {
    Y.on('domready', function() {
        new Y.BirthdayPortlet({
            namespace: '${pns}',
            resourceUrl: '${getBirthdays}'
        });
    });
});
</aui:script>