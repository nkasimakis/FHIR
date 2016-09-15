/**
 * (C) Copyright IBM Corp. 2016,2017,2018,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.test.common;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.ibm.watsonhealth.fhir.model.AuditEvent;
import com.ibm.watsonhealth.fhir.model.Resource;

/**
 *  This class contains a collection of tests that will be run against
 *  each of the various persistence layer implementations.
 *  There will be a subclass in each persistence project.
 */
public abstract class AbstractQueryAuditEventTest extends AbstractPersistenceTest {
	
    /**
     * Tests the FHIRPersistenceCloudantImpl create API for a AuditEvent.
     * 
     * @throws Exception
     */
    @Test(groups = { "cloudant", "jpa" })
    public void testCreateAuditEvent() throws Exception {
    	AuditEvent auditEvt = readResource(AuditEvent.class, "auditevent-example-disclosure.canonical.json");

    	persistence.create(getDefaultPersistenceContext(), auditEvt);
        assertNotNull(auditEvt);
        assertNotNull(auditEvt.getId());
        assertNotNull(auditEvt.getId().getValue());
        assertNotNull(auditEvt.getMeta());
        assertNotNull(auditEvt.getMeta().getVersionId().getValue());
        assertEquals("1", auditEvt.getMeta().getVersionId().getValue());
    }
	
	/**
	 * Tests a query with a resource type but without any query parameters. This should yield all the resources created so far.
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateAuditEvent" })
	public void testAuditEventQuery_noParams() throws Exception {
		List<Resource> resources = runQueryTest(AuditEvent.class, persistence, null, null);
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for a AuditEvent with action = 'R' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateAuditEvent" })
	public void testAuditEventQuery_action() throws Exception {
		List<Resource> resources = runQueryTest(AuditEvent.class, persistence, "action", "R");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
		assertEquals(((AuditEvent)resources.get(0)).getEvent().getAction().getValue().toString(),"R");
	}
	
	/**
	 * Tests a query for a AuditEvent with action = 'Error!!!' which should yield no results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateAuditEvent" })
	public void testAuditEventQuery_action_noResults() throws Exception {
		List<Resource> resources = runQueryTest(AuditEvent.class, persistence, "action", "Error!!!");
		assertNotNull(resources);
		assertTrue(resources.size() == 0);
	}
}
