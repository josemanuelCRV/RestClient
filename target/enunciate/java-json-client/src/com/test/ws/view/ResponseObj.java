/**
 * 
 *
 * Generated by <a href="http://enunciate.webcohesion.com">Enunciate</a>.
 */
package com.test.ws.view;

import com.fasterxml.jackson.annotation.*;

/**
 * (no documentation provided)
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class ResponseObj implements java.io.Serializable {

  @JsonIgnore
  private java.lang.String _result;
  @JsonIgnore
  private java.lang.String _error;
  @JsonIgnore
  private java.lang.String _retorno;

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "result", required = false )
  public java.lang.String getResult() {
    return this._result;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "result", required = false )
  public void setResult(java.lang.String _result) {
    this._result = _result;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "error", required = false )
  public java.lang.String getError() {
    return this._error;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "error", required = false )
  public void setError(java.lang.String _error) {
    this._error = _error;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "retorno", required = false )
  public java.lang.String getRetorno() {
    return this._retorno;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty( value = "retorno", required = false )
  public void setRetorno(java.lang.String _retorno) {
    this._retorno = _retorno;
  }
}
