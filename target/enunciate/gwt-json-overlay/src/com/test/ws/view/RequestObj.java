/**
 * 
 *
 * Generated by <a href="http://enunciate.webcohesion.com">Enunciate</a>.
 */
package com.test.ws.view;

/**
 * (no documentation provided)
 */
public class RequestObj extends com.google.gwt.core.client.JavaScriptObject {

  protected RequestObj() {
  }

  /**
   * 
   */
  public final native java.lang.String getTitle() /*-{
    return this.title;
  }-*/;

  /**
   * 
   */
  public final native void setTitle(java.lang.String title) /*-{
    this.title = title;
  }-*/;

  /**
   * (no documentation provided)
   */
  public final native java.lang.String getSinger() /*-{
    return this.singer;
  }-*/;

  /**
   * (no documentation provided)
   */
  public final native void setSinger(java.lang.String singer) /*-{
    this.singer = singer;
  }-*/;

  /**
   * Create an instance of RequestObj from JSON text.
   */
  public static native RequestObj fromJson(String json) /*-{
    return eval('(' + json + ')');
  }-*/;
}
