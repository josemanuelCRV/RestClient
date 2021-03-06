/**
 * 
 *
 * Generated by <a href="http://enunciate.webcohesion.com">Enunciate</a>.
 */
 
/**
 * UMD load definition that supports AMD, CommonJS and browser globals.
 * https://github.com/umdjs/umd/blob/992cc0d071b7ebcd7feaad2a5349bdbeab09a0fe/commonjsStrict.js
 */
(function (root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['exports'], factory);
  } else if (typeof exports === 'object') {
    // CommonJS
    factory(exports);
  } else {
    // Browser globals
    factory(root.javascriptClient = {});
  }
}(this, function (exports) {
 
 'use strict';
 

/**
 * (no documentation provided)
 */
ensureNamespace('Com.Test.Ws.View');
exports.Com.Test.Ws.View.ResponseObj = class {

    /**
     * Constructs a ResponseObj from a JSON object
     *
     * @param Object o JSON object.
     */
    constructor(o) {
        var self = this;
        if (typeof o['result'] !== 'undefined') {
            this.result = o['result'];
        }
        if (typeof o['error'] !== 'undefined') {
            this.error = o['error'];
        }
        if (typeof o['retorno'] !== 'undefined') {
            this.retorno = o['retorno'];
        }
    }

    /**
     * (no documentation provided)
     *
     * @return string
     */
    getResult() {
        return this.result;
    }

    /**
     * (no documentation provided)
     *
     * @param string result
     */
    setResult(result) {
        this.result = result;
    }
    /**
     * (no documentation provided)
     *
     * @return string
     */
    getError() {
        return this.error;
    }

    /**
     * (no documentation provided)
     *
     * @param string error
     */
    setError(error) {
        this.error = error;
    }
    /**
     * (no documentation provided)
     *
     * @return string
     */
    getRetorno() {
        return this.retorno;
    }

    /**
     * (no documentation provided)
     *
     * @param string retorno
     */
    setRetorno(retorno) {
        this.retorno = retorno;
    }

    /**
     * Returns a JSON object for this ResponseObj
     *
     * @return object
     */
    toJSON() {
        var json = {};
        var self = this;
        if (typeof this.result !== 'undefined') {
            json['result'] = this.result;
        }
        if (typeof this.error !== 'undefined') {
            json['error'] = this.error;
        }
        if (typeof this.retorno !== 'undefined') {
            json['retorno'] = this.retorno;
        }
        return json;
    }

}

/**
 * (no documentation provided)
 */
ensureNamespace('Com.Test.Ws.View');
exports.Com.Test.Ws.View.RequestObj = class {

    /**
     * Constructs a RequestObj from a JSON object
     *
     * @param Object o JSON object.
     */
    constructor(o) {
        var self = this;
        if (typeof o['title'] !== 'undefined') {
            this.title = o['title'];
        }
        if (typeof o['singer'] !== 'undefined') {
            this.singer = o['singer'];
        }
    }

    /**
     * 
     *
     * @return string
     */
    getTitle() {
        return this.title;
    }

    /**
     * 
     *
     * @param string title
     */
    setTitle(title) {
        this.title = title;
    }
    /**
     * (no documentation provided)
     *
     * @return string
     */
    getSinger() {
        return this.singer;
    }

    /**
     * (no documentation provided)
     *
     * @param string singer
     */
    setSinger(singer) {
        this.singer = singer;
    }

    /**
     * Returns a JSON object for this RequestObj
     *
     * @return object
     */
    toJSON() {
        var json = {};
        var self = this;
        if (typeof this.title !== 'undefined') {
            json['title'] = this.title;
        }
        if (typeof this.singer !== 'undefined') {
            json['singer'] = this.singer;
        }
        return json;
    }

}
  
  /**
   * Ensures that a namespace exists.
   */
  function ensureNamespace(namespace){
    var current = exports;
    namespace.split('.').forEach(function(name){
      if(typeof current[name] === 'undefined'){
        current[name] = {};
      }
      current = current[name];
    });
  }

}));

