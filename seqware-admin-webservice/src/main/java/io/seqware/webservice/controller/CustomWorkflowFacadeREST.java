/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.seqware.webservice.controller;

import io.seqware.webservice.generated.controller.WorkflowFacadeREST;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 * 
 * @author dyuen
 */
@Stateless
@Path("io.seqware.webservice.model.workflow")
public class CustomWorkflowFacadeREST extends WorkflowFacadeREST {
}
