/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watson.health.fhir.server.test;

import static org.testng.AssertJUnit.assertEquals;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.testng.annotations.Test;

import com.ibm.watson.health.fhir.model.resource.OperationOutcome;
import com.ibm.watson.health.fhir.model.type.IssueSeverity;

public class FHIRHealthcheckOperationTest extends FHIRServerTestBase {    
    @Test
    public void testHealthcheck() {        
        WebTarget target = getWebTarget();
        Response response = target.path("$healthcheck").request().get(Response.class);
        assertResponse(response, Response.Status.OK.getStatusCode());
        OperationOutcome operationOutcome = response.readEntity(OperationOutcome.class);
        
        assertEquals(operationOutcome.getIssue().size(), 1);
        assertEquals(operationOutcome.getIssue().get(0).getSeverity(), IssueSeverity.INFORMATION);
    }

}