/**
 * IBM DevOps Metrics API
 * This is an API to gather data about significant events in the software delivery lifecycle
 *
 * OpenAPI spec version: 1.0.0
 * Contact: acm@us.ibm.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.Id
import io.swagger.client.model.InlineResponse400
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * Returns a list of events for User Story
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Successfully returned a list of events)
   *   code 400 : InlineResponse400 (Invalid request)
   * 
   * @param id User Story identifier
   */
  def userStoryGet(id: Option[String] = None): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, "https://virtserver.swaggerhub.com/ibmdevops/metrics/1.0.0", "/userStory", "application/json")
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[Any]](200)
      .withErrorResponse[InlineResponse400](400)
        /**
   * Create a new user story event
   * 
   * Expected answers:
   *   code 200 :  (Successfully created a new User Story event)
   *   code 400 : InlineResponse400 (Invalid request)
   * 
   * @param id creates a new user story event
   */
  def userStoryPost(id: Option[Id] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/ibmdevops/metrics/1.0.0", "/userStory", "application/json")
      .withBody(id)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[InlineResponse400](400)
      

}

