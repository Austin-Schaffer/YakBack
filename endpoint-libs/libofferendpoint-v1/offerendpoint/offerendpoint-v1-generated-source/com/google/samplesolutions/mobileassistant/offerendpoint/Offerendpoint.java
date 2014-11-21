/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2014-11-20 at 12:53:42 UTC 
 * Modify at your own risk.
 */

package com.google.samplesolutions.mobileassistant.offerendpoint;

/**
 * Service definition for Offerendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link OfferendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Offerendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the offerendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://schafferdemo.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "offerendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Offerendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Offerendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getOffer".
   *
   * This request holds the parameters needed by the offerendpoint server.  After setting any optional
   * parameters, call the {@link GetOffer#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetOffer getOffer(java.lang.String id) throws java.io.IOException {
    GetOffer result = new GetOffer(id);
    initialize(result);
    return result;
  }

  public class GetOffer extends OfferendpointRequest<com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer> {

    private static final String REST_PATH = "offer/{id}";

    /**
     * Create a request for the method "getOffer".
     *
     * This request holds the parameters needed by the the offerendpoint server.  After setting any
     * optional parameters, call the {@link GetOffer#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetOffer#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetOffer(java.lang.String id) {
      super(Offerendpoint.this, "GET", REST_PATH, null, com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetOffer setAlt(java.lang.String alt) {
      return (GetOffer) super.setAlt(alt);
    }

    @Override
    public GetOffer setFields(java.lang.String fields) {
      return (GetOffer) super.setFields(fields);
    }

    @Override
    public GetOffer setKey(java.lang.String key) {
      return (GetOffer) super.setKey(key);
    }

    @Override
    public GetOffer setOauthToken(java.lang.String oauthToken) {
      return (GetOffer) super.setOauthToken(oauthToken);
    }

    @Override
    public GetOffer setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetOffer) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetOffer setQuotaUser(java.lang.String quotaUser) {
      return (GetOffer) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetOffer setUserIp(java.lang.String userIp) {
      return (GetOffer) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetOffer setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetOffer set(String parameterName, Object value) {
      return (GetOffer) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertOffer".
   *
   * This request holds the parameters needed by the offerendpoint server.  After setting any optional
   * parameters, call the {@link InsertOffer#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer}
   * @return the request
   */
  public InsertOffer insertOffer(com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer content) throws java.io.IOException {
    InsertOffer result = new InsertOffer(content);
    initialize(result);
    return result;
  }

  public class InsertOffer extends OfferendpointRequest<com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer> {

    private static final String REST_PATH = "offer";

    /**
     * Create a request for the method "insertOffer".
     *
     * This request holds the parameters needed by the the offerendpoint server.  After setting any
     * optional parameters, call the {@link InsertOffer#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertOffer#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer}
     * @since 1.13
     */
    protected InsertOffer(com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer content) {
      super(Offerendpoint.this, "POST", REST_PATH, content, com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer.class);
    }

    @Override
    public InsertOffer setAlt(java.lang.String alt) {
      return (InsertOffer) super.setAlt(alt);
    }

    @Override
    public InsertOffer setFields(java.lang.String fields) {
      return (InsertOffer) super.setFields(fields);
    }

    @Override
    public InsertOffer setKey(java.lang.String key) {
      return (InsertOffer) super.setKey(key);
    }

    @Override
    public InsertOffer setOauthToken(java.lang.String oauthToken) {
      return (InsertOffer) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertOffer setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertOffer) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertOffer setQuotaUser(java.lang.String quotaUser) {
      return (InsertOffer) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertOffer setUserIp(java.lang.String userIp) {
      return (InsertOffer) super.setUserIp(userIp);
    }

    @Override
    public InsertOffer set(String parameterName, Object value) {
      return (InsertOffer) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listOffer".
   *
   * This request holds the parameters needed by the offerendpoint server.  After setting any optional
   * parameters, call the {@link ListOffer#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListOffer listOffer() throws java.io.IOException {
    ListOffer result = new ListOffer();
    initialize(result);
    return result;
  }

  public class ListOffer extends OfferendpointRequest<com.google.samplesolutions.mobileassistant.offerendpoint.model.CollectionResponseOffer> {

    private static final String REST_PATH = "offer";

    /**
     * Create a request for the method "listOffer".
     *
     * This request holds the parameters needed by the the offerendpoint server.  After setting any
     * optional parameters, call the {@link ListOffer#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListOffer#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListOffer() {
      super(Offerendpoint.this, "GET", REST_PATH, null, com.google.samplesolutions.mobileassistant.offerendpoint.model.CollectionResponseOffer.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListOffer setAlt(java.lang.String alt) {
      return (ListOffer) super.setAlt(alt);
    }

    @Override
    public ListOffer setFields(java.lang.String fields) {
      return (ListOffer) super.setFields(fields);
    }

    @Override
    public ListOffer setKey(java.lang.String key) {
      return (ListOffer) super.setKey(key);
    }

    @Override
    public ListOffer setOauthToken(java.lang.String oauthToken) {
      return (ListOffer) super.setOauthToken(oauthToken);
    }

    @Override
    public ListOffer setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListOffer) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListOffer setQuotaUser(java.lang.String quotaUser) {
      return (ListOffer) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListOffer setUserIp(java.lang.String userIp) {
      return (ListOffer) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListOffer setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListOffer setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListOffer set(String parameterName, Object value) {
      return (ListOffer) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeOffer".
   *
   * This request holds the parameters needed by the offerendpoint server.  After setting any optional
   * parameters, call the {@link RemoveOffer#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveOffer removeOffer(java.lang.String id) throws java.io.IOException {
    RemoveOffer result = new RemoveOffer(id);
    initialize(result);
    return result;
  }

  public class RemoveOffer extends OfferendpointRequest<com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer> {

    private static final String REST_PATH = "offer/{id}";

    /**
     * Create a request for the method "removeOffer".
     *
     * This request holds the parameters needed by the the offerendpoint server.  After setting any
     * optional parameters, call the {@link RemoveOffer#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveOffer#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveOffer(java.lang.String id) {
      super(Offerendpoint.this, "DELETE", REST_PATH, null, com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveOffer setAlt(java.lang.String alt) {
      return (RemoveOffer) super.setAlt(alt);
    }

    @Override
    public RemoveOffer setFields(java.lang.String fields) {
      return (RemoveOffer) super.setFields(fields);
    }

    @Override
    public RemoveOffer setKey(java.lang.String key) {
      return (RemoveOffer) super.setKey(key);
    }

    @Override
    public RemoveOffer setOauthToken(java.lang.String oauthToken) {
      return (RemoveOffer) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveOffer setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveOffer) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveOffer setQuotaUser(java.lang.String quotaUser) {
      return (RemoveOffer) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveOffer setUserIp(java.lang.String userIp) {
      return (RemoveOffer) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveOffer setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveOffer set(String parameterName, Object value) {
      return (RemoveOffer) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateOffer".
   *
   * This request holds the parameters needed by the offerendpoint server.  After setting any optional
   * parameters, call the {@link UpdateOffer#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer}
   * @return the request
   */
  public UpdateOffer updateOffer(com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer content) throws java.io.IOException {
    UpdateOffer result = new UpdateOffer(content);
    initialize(result);
    return result;
  }

  public class UpdateOffer extends OfferendpointRequest<com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer> {

    private static final String REST_PATH = "offer";

    /**
     * Create a request for the method "updateOffer".
     *
     * This request holds the parameters needed by the the offerendpoint server.  After setting any
     * optional parameters, call the {@link UpdateOffer#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateOffer#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer}
     * @since 1.13
     */
    protected UpdateOffer(com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer content) {
      super(Offerendpoint.this, "PUT", REST_PATH, content, com.google.samplesolutions.mobileassistant.offerendpoint.model.Offer.class);
    }

    @Override
    public UpdateOffer setAlt(java.lang.String alt) {
      return (UpdateOffer) super.setAlt(alt);
    }

    @Override
    public UpdateOffer setFields(java.lang.String fields) {
      return (UpdateOffer) super.setFields(fields);
    }

    @Override
    public UpdateOffer setKey(java.lang.String key) {
      return (UpdateOffer) super.setKey(key);
    }

    @Override
    public UpdateOffer setOauthToken(java.lang.String oauthToken) {
      return (UpdateOffer) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateOffer setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateOffer) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateOffer setQuotaUser(java.lang.String quotaUser) {
      return (UpdateOffer) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateOffer setUserIp(java.lang.String userIp) {
      return (UpdateOffer) super.setUserIp(userIp);
    }

    @Override
    public UpdateOffer set(String parameterName, Object value) {
      return (UpdateOffer) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Offerendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Offerendpoint}. */
    @Override
    public Offerendpoint build() {
      return new Offerendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link OfferendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setOfferendpointRequestInitializer(
        OfferendpointRequestInitializer offerendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(offerendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
