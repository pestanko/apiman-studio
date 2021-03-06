package io.openapi.simple;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/system")
public interface System {
  /**
   * Get current gateway status. Useful for determining whether a given gateway is responding correctly (routing, finished booting, error, etc) and verifying that provided auth credentials are correct, and/or the auth server is reachable (if applicable).
   */
  @Path("/status")
  @GET
  Response getGatewayStatus();
}
