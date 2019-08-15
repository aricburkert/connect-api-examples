/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.CreateBreakTypeRequest;
import com.squareup.connect.models.CreateBreakTypeResponse;
import com.squareup.connect.models.CreateShiftRequest;
import com.squareup.connect.models.CreateShiftResponse;
import com.squareup.connect.models.DeleteBreakTypeResponse;
import com.squareup.connect.models.DeleteShiftResponse;
import com.squareup.connect.models.GetBreakTypeResponse;
import com.squareup.connect.models.GetEmployeeWageResponse;
import com.squareup.connect.models.GetShiftResponse;
import com.squareup.connect.models.ListBreakTypesResponse;
import com.squareup.connect.models.ListEmployeeWagesResponse;
import com.squareup.connect.models.ListWorkweekConfigsResponse;
import com.squareup.connect.models.SearchShiftsRequest;
import com.squareup.connect.models.SearchShiftsResponse;
import com.squareup.connect.models.UpdateBreakTypeRequest;
import com.squareup.connect.models.UpdateBreakTypeResponse;
import com.squareup.connect.models.UpdateShiftRequest;
import com.squareup.connect.models.UpdateShiftResponse;
import com.squareup.connect.models.UpdateWorkweekConfigRequest;
import com.squareup.connect.models.UpdateWorkweekConfigResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LaborApi
 */
@Ignore
public class LaborApiTest {

    private final LaborApi api = new LaborApi();


    /**
     * CreateBreakType
     *
     * Creates a new &#x60;BreakType&#x60;.   A &#x60;BreakType&#x60; is a template for creating &#x60;Break&#x60; objects.  You must provide the following values in your request to this endpoint:  - &#x60;location_id&#x60; - &#x60;break_name&#x60; - &#x60;expected_duration&#x60; - &#x60;is_paid&#x60;  You can only have 3 &#x60;BreakType&#x60; instances per location. If you attempt to add a 4th &#x60;BreakType&#x60; for a location, an &#x60;INVALID_REQUEST_ERROR&#x60; \&quot;Exceeded limit of 3 breaks per location.\&quot; is returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBreakTypeTest() throws ApiException {
        CreateBreakTypeRequest body = null;
        CreateBreakTypeResponse response = api.createBreakType(body);

        // TODO: test validations
    }

    /**
     * CreateShift
     *
     * Creates a new &#x60;Shift&#x60;.   A &#x60;Shift&#x60; represents a complete work day for a single employee.  You must provide the following values in your request to this endpoint:  - &#x60;location_id&#x60; - &#x60;employee_id&#x60; - &#x60;start_at&#x60;  An attempt to create a new &#x60;Shift&#x60; can result in a &#x60;BAD_REQUEST&#x60; error when: - The &#x60;status&#x60; of the new &#x60;Shift&#x60; is &#x60;OPEN&#x60; and the employee has another  shift with an &#x60;OPEN&#x60; status.  - The &#x60;start_at&#x60; date is in the future - the &#x60;start_at&#x60; or &#x60;end_at&#x60; overlaps another shift for the same employee - If &#x60;Break&#x60;s are set in the request, a break &#x60;start_at&#x60; must not be before the &#x60;Shift.start_at&#x60;. A break &#x60;end_at&#x60; must not be after the &#x60;Shift.end_at&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShiftTest() throws ApiException {
        CreateShiftRequest body = null;
        CreateShiftResponse response = api.createShift(body);

        // TODO: test validations
    }

    /**
     * DeleteBreakType
     *
     * Deletes an existing &#x60;BreakType&#x60;.   A &#x60;BreakType&#x60; can be deleted even if it is referenced from a &#x60;Shift&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBreakTypeTest() throws ApiException {
        String id = null;
        DeleteBreakTypeResponse response = api.deleteBreakType(id);

        // TODO: test validations
    }

    /**
     * DeleteShift
     *
     * Deletes a &#x60;Shift&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShiftTest() throws ApiException {
        String id = null;
        DeleteShiftResponse response = api.deleteShift(id);

        // TODO: test validations
    }

    /**
     * GetBreakType
     *
     * Returns a single &#x60;BreakType&#x60; specified by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBreakTypeTest() throws ApiException {
        String id = null;
        GetBreakTypeResponse response = api.getBreakType(id);

        // TODO: test validations
    }

    /**
     * GetEmployeeWage
     *
     * Returns a single &#x60;EmployeeWage&#x60; specified by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmployeeWageTest() throws ApiException {
        String id = null;
        GetEmployeeWageResponse response = api.getEmployeeWage(id);

        // TODO: test validations
    }

    /**
     * GetShift
     *
     * Returns a single &#x60;Shift&#x60; specified by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShiftTest() throws ApiException {
        String id = null;
        GetShiftResponse response = api.getShift(id);

        // TODO: test validations
    }

    /**
     * ListBreakTypes
     *
     * Returns a paginated list of &#x60;BreakType&#x60; instances for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBreakTypesTest() throws ApiException {
        String locationId = null;
        Integer limit = null;
        String cursor = null;
        ListBreakTypesResponse response = api.listBreakTypes(locationId, limit, cursor);

        // TODO: test validations
    }

    /**
     * ListEmployeeWages
     *
     * Returns a paginated list of &#x60;EmployeeWage&#x60; instances for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEmployeeWagesTest() throws ApiException {
        String employeeId = null;
        Integer limit = null;
        String cursor = null;
        ListEmployeeWagesResponse response = api.listEmployeeWages(employeeId, limit, cursor);

        // TODO: test validations
    }

    /**
     * ListWorkweekConfigs
     *
     * Returns a list of &#x60;WorkweekConfig&#x60; instances for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listWorkweekConfigsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        ListWorkweekConfigsResponse response = api.listWorkweekConfigs(limit, cursor);

        // TODO: test validations
    }

    /**
     * SearchShifts
     *
     * Returns a paginated list of &#x60;Shift&#x60; records for a business.  The list to be returned can be filtered by: - Location IDs **and** - employee IDs **and** - shift status (&#x60;OPEN&#x60;, &#x60;CLOSED&#x60;) **and** - shift start **and** - shift end **and** - work day details  The list can be sorted by: - &#x60;start_at&#x60; - &#x60;end_at&#x60; - &#x60;created_at&#x60; - &#x60;updated_at&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchShiftsTest() throws ApiException {
        SearchShiftsRequest body = null;
        SearchShiftsResponse response = api.searchShifts(body);

        // TODO: test validations
    }

    /**
     * UpdateBreakType
     *
     * Updates an existing &#x60;BreakType&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBreakTypeTest() throws ApiException {
        String id = null;
        UpdateBreakTypeRequest body = null;
        UpdateBreakTypeResponse response = api.updateBreakType(id, body);

        // TODO: test validations
    }

    /**
     * UpdateShift
     *
     * Updates an existing &#x60;Shift&#x60;.   When adding a &#x60;Break&#x60; to a &#x60;Shift&#x60;, any earlier &#x60;Breaks&#x60; in the &#x60;Shift&#x60; have  the &#x60;end_at&#x60; property set to a valid RFC-3339 datetime string.   When closing a &#x60;Shift&#x60;, all &#x60;Break&#x60; instances in the shift must be complete with &#x60;end_at&#x60; set on each &#x60;Break&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShiftTest() throws ApiException {
        String id = null;
        UpdateShiftRequest body = null;
        UpdateShiftResponse response = api.updateShift(id, body);

        // TODO: test validations
    }

    /**
     * UpdateWorkweekConfig
     *
     * Updates a &#x60;WorkweekConfig&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkweekConfigTest() throws ApiException {
        String id = null;
        UpdateWorkweekConfigRequest body = null;
        UpdateWorkweekConfigResponse response = api.updateWorkweekConfig(id, body);

        // TODO: test validations
    }

}
