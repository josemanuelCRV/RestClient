#
# 
#
# Generated by <a href="http://enunciate.webcohesion.com">Enunciate</a>.
#
require 'json'

# adding necessary json serialization methods to standard classes.
class Object
  def to_jaxb_json_hash
    return self
  end
  def self.from_json o
    return o
  end
end

class String
  def self.from_json o
    return o
  end
end

class Boolean
  def self.from_json o
    return o
  end
end

class Numeric
  def self.from_json o
    return o
  end
end

class Time
  #json time is represented as number of milliseconds since epoch
  def to_jaxb_json_hash
    return (to_i * 1000) + (usec / 1000)
  end
  def self.from_json o
    if o.nil?
      return nil
    else
      return Time.at(o / 1000, (o % 1000) * 1000)
    end
  end
end

class Array
  def to_jaxb_json_hash
    a = Array.new
    each { | _item | a.push _item.to_jaxb_json_hash }
    return a
  end
end

class Hash
  def to_jaxb_json_hash
    h = Hash.new
    each { | _key, _value | h[_key.to_jaxb_json_hash] = _value.to_jaxb_json_hash }
    return h
  end
end

module EnunciateHelpers
  LAMB_CLASS_AWARE = ->(_item) do
    java_clazz = _item['@class']
    clazz_array_parts = java_clazz.split('.')
    short_clazz = clazz_array_parts.pop
    clazz_package = clazz_array_parts.map do |e| e[0] = e.first.capitalize; e end.join("::")
    clazz = clazz_package + "::" + short_clazz
    Object.const_get(clazz).send(:from_json, _item)
  end
end


module Com

module Test

module Ws

module View

  # (no documentation provided)
  class ResponseObj 

    # (no documentation provided)
    attr_accessor :result
    # (no documentation provided)
    attr_accessor :error
    # (no documentation provided)
    attr_accessor :retorno

    # the json hash for this ResponseObj
    def to_jaxb_json_hash
      _h = {}
      _h['result'] = result.to_jaxb_json_hash unless result.nil?
      _h['error'] = error.to_jaxb_json_hash unless error.nil?
      _h['retorno'] = retorno.to_jaxb_json_hash unless retorno.nil?
      return _h
    end

    # the json (string form) for this ResponseObj
    def to_json
      to_jaxb_json_hash.to_json
    end

    #initializes this ResponseObj with a json hash
    def init_jaxb_json_hash(_o)
        if !_o['result'].nil?
          _oa = _o['result']
            if(_oa.is_a? Hash)
              @result = EnunciateHelpers::LAMB_CLASS_AWARE.call(_oa) if _oa['@class']
              @result =  String.from_json(_oa) unless _oa['@class']
            elsif (_oa.is_a? Array)
              #an array(of hashes hopefully) or scalar
              @result = Array.new
              _oa.each { | _item | 
                 if ((_item.nil? || _item['@class'].nil?)rescue true)
                   @result.push String.from_json(_item)
                 else
                   @result.push EnunciateHelpers::LAMB_CLASS_AWARE.call(_item)
                 end
               }
            else
                @result = _oa
            end
          end
        if !_o['error'].nil?
          _oa = _o['error']
            if(_oa.is_a? Hash)
              @error = EnunciateHelpers::LAMB_CLASS_AWARE.call(_oa) if _oa['@class']
              @error =  String.from_json(_oa) unless _oa['@class']
            elsif (_oa.is_a? Array)
              #an array(of hashes hopefully) or scalar
              @error = Array.new
              _oa.each { | _item | 
                 if ((_item.nil? || _item['@class'].nil?)rescue true)
                   @error.push String.from_json(_item)
                 else
                   @error.push EnunciateHelpers::LAMB_CLASS_AWARE.call(_item)
                 end
               }
            else
                @error = _oa
            end
          end
        if !_o['retorno'].nil?
          _oa = _o['retorno']
            if(_oa.is_a? Hash)
              @retorno = EnunciateHelpers::LAMB_CLASS_AWARE.call(_oa) if _oa['@class']
              @retorno =  String.from_json(_oa) unless _oa['@class']
            elsif (_oa.is_a? Array)
              #an array(of hashes hopefully) or scalar
              @retorno = Array.new
              _oa.each { | _item | 
                 if ((_item.nil? || _item['@class'].nil?)rescue true)
                   @retorno.push String.from_json(_item)
                 else
                   @retorno.push EnunciateHelpers::LAMB_CLASS_AWARE.call(_item)
                 end
               }
            else
                @retorno = _oa
            end
          end
    end

    # constructs a ResponseObj from a (parsed) JSON hash
    def self.from_json(o)
      if o.nil?
        return nil
      else
        inst = new
        inst.init_jaxb_json_hash o
        return inst
      end
    end
  end

end

end

end

end

module Com

module Test

module Ws

module View

  # (no documentation provided)
  class RequestObj 

    # 
    attr_accessor :title
    # (no documentation provided)
    attr_accessor :singer

    # the json hash for this RequestObj
    def to_jaxb_json_hash
      _h = {}
      _h['title'] = title.to_jaxb_json_hash unless title.nil?
      _h['singer'] = singer.to_jaxb_json_hash unless singer.nil?
      return _h
    end

    # the json (string form) for this RequestObj
    def to_json
      to_jaxb_json_hash.to_json
    end

    #initializes this RequestObj with a json hash
    def init_jaxb_json_hash(_o)
        if !_o['title'].nil?
          _oa = _o['title']
            if(_oa.is_a? Hash)
              @title = EnunciateHelpers::LAMB_CLASS_AWARE.call(_oa) if _oa['@class']
              @title =  String.from_json(_oa) unless _oa['@class']
            elsif (_oa.is_a? Array)
              #an array(of hashes hopefully) or scalar
              @title = Array.new
              _oa.each { | _item | 
                 if ((_item.nil? || _item['@class'].nil?)rescue true)
                   @title.push String.from_json(_item)
                 else
                   @title.push EnunciateHelpers::LAMB_CLASS_AWARE.call(_item)
                 end
               }
            else
                @title = _oa
            end
          end
        if !_o['singer'].nil?
          _oa = _o['singer']
            if(_oa.is_a? Hash)
              @singer = EnunciateHelpers::LAMB_CLASS_AWARE.call(_oa) if _oa['@class']
              @singer =  String.from_json(_oa) unless _oa['@class']
            elsif (_oa.is_a? Array)
              #an array(of hashes hopefully) or scalar
              @singer = Array.new
              _oa.each { | _item | 
                 if ((_item.nil? || _item['@class'].nil?)rescue true)
                   @singer.push String.from_json(_item)
                 else
                   @singer.push EnunciateHelpers::LAMB_CLASS_AWARE.call(_item)
                 end
               }
            else
                @singer = _oa
            end
          end
    end

    # constructs a RequestObj from a (parsed) JSON hash
    def self.from_json(o)
      if o.nil?
        return nil
      else
        inst = new
        inst.init_jaxb_json_hash o
        return inst
      end
    end
  end

end

end

end

end
