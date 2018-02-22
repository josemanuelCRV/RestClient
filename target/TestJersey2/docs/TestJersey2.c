#include <enunciate-common.c>
#ifndef DEF_TestJersey2_ns0_requestObj_H
#define DEF_TestJersey2_ns0_requestObj_H

/**
 * (no documentation provided)
 */
struct TestJersey2_ns0_requestObj {


  /**
   * 
   */
  xmlChar *title;

  /**
   * (no documentation provided)
   */
  xmlChar *singer;
};

/**
 * Reads a RequestObj element from XML. The element to be read is "requestObj", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The RequestObj, or NULL in case of error.
 */
struct TestJersey2_ns0_requestObj *xml_read_TestJersey2_ns0_requestObj(xmlTextReaderPtr reader);

/**
 * Writes a RequestObj to XML under element name "requestObj".
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_TestJersey2_ns0_requestObj(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj);

/**
 * Frees a RequestObj.
 *
 * @param _requestObj The RequestObj to free.
 */
void free_TestJersey2_ns0_requestObj(struct TestJersey2_ns0_requestObj *_requestObj);

/**
 * Reads a RequestObj element from XML. The element to be read is "requestObj", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The RequestObj, or NULL in case of error.
 */
struct TestJersey2_ns0_requestObj *xmlTextReaderReadNs0RequestObjElement(xmlTextReaderPtr reader);

/**
 * Writes a RequestObj to XML under element name "requestObj".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RequestObjElement(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj);

/**
 * Writes a RequestObj to XML under element name "requestObj".
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RequestObjElementNS(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj, int writeNamespaces);

/**
 * Frees the children of a RequestObj.
 *
 * @param _requestObj The RequestObj whose children are to be free.
 */
static void freeNs0RequestObjElement(struct TestJersey2_ns0_requestObj *_requestObj);

/**
 * Reads a RequestObj from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The RequestObj, or NULL in case of error.
 */
static struct TestJersey2_ns0_requestObj *xmlTextReaderReadNs0RequestObjType(xmlTextReaderPtr reader);

/**
 * Writes a RequestObj to XML.
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RequestObjType(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj);

/**
 * Frees the elements of a RequestObj.
 *
 * @param _requestObj The RequestObj to free.
 */
static void freeNs0RequestObjType(struct TestJersey2_ns0_requestObj *_requestObj);

#endif /* DEF_TestJersey2_ns0_requestObj_H */
#ifndef DEF_TestJersey2_ns0_requestObj_M
#define DEF_TestJersey2_ns0_requestObj_M

/**
 * Reads a RequestObj element from XML. The element to be read is "requestObj", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The RequestObj, or NULL in case of error.
 */
struct TestJersey2_ns0_requestObj *xml_read_TestJersey2_ns0_requestObj(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0RequestObjElement(reader);
}

/**
 * Writes a RequestObj to XML under element name "requestObj".
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_TestJersey2_ns0_requestObj(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj) {
  return xmlTextWriterWriteNs0RequestObjElementNS(writer, _requestObj, 1);
}

/**
 * Frees a RequestObj.
 *
 * @param _requestObj The RequestObj to free.
 */
void free_TestJersey2_ns0_requestObj(struct TestJersey2_ns0_requestObj *_requestObj) {
  freeNs0RequestObjType(_requestObj);
  free(_requestObj);
}

/**
 * Reads a RequestObj element from XML. The element to be read is "requestObj", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The RequestObj, or NULL in case of error.
 */
struct TestJersey2_ns0_requestObj *xmlTextReaderReadNs0RequestObjElement(xmlTextReaderPtr reader) {
  struct TestJersey2_ns0_requestObj *_requestObj = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "requestObj", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}requestObj.\n");
#endif
    _requestObj = xmlTextReaderReadNs0RequestObjType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_requestObj == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}requestObj failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}requestObj failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _requestObj;
}

/**
 * Writes a RequestObj to XML under element name "requestObj".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0RequestObjElement(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj) {
  return xmlTextWriterWriteNs0RequestObjElementNS(writer, _requestObj, 0);
}

/**
 * Writes a RequestObj to XML under element name "requestObj".
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0RequestObjElementNS(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "requestObj", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}requestObj. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}requestObj for root element {}requestObj...\n");
#endif
  status = xmlTextWriterWriteNs0RequestObjType(writer, _requestObj);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}requestObj. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}requestObj. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a RequestObj.
 *
 * @param _requestObj The RequestObj whose children are to be free.
 */
static void freeNs0RequestObjElement(struct TestJersey2_ns0_requestObj *_requestObj) {
  freeNs0RequestObjType(_requestObj);
}

/**
 * Reads a RequestObj from XML. The reader is assumed to be at the start element.
 *
 * @return the RequestObj, or NULL in case of error.
 */
static struct TestJersey2_ns0_requestObj *xmlTextReaderReadNs0RequestObjType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct TestJersey2_ns0_requestObj *_requestObj = calloc(1, sizeof(struct TestJersey2_ns0_requestObj));



  if (xmlTextReaderIsEmptyElement(reader) == 0) {
    depth = xmlTextReaderDepth(reader);//track the depth.
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);

    while (xmlTextReaderDepth(reader) > depth) {
      if (status < 1) {
        //panic: XML read error.
#if DEBUG_ENUNCIATE
        printf("Failure to advance to next child element.\n");
#endif
        freeNs0RequestObjType(_requestObj);
        free(_requestObj);
        return NULL;
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "title", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}title of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}title of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0RequestObjType(_requestObj);
          free(_requestObj);
          return NULL;
        }

        _requestObj->title = ((xmlChar*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "singer", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}singer of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}singer of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0RequestObjType(_requestObj);
          free(_requestObj);
          return NULL;
        }

        _requestObj->singer = ((xmlChar*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else {
#if DEBUG_ENUNCIATE > 1
        if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
          printf("unknown child element {}%s for type {}requestObj.  Skipping...\n",  xmlTextReaderConstLocalName(reader));
        }
        else {
          printf("unknown child element {%s}%s for type {}requestObj. Skipping...\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
        }
#endif
        status = xmlTextReaderSkipElement(reader);
      }
    }
  }

  return _requestObj;
}

/**
 * Writes a RequestObj to XML.
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0RequestObjType(xmlTextWriterPtr writer, struct TestJersey2_ns0_requestObj *_requestObj) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;
  if (_requestObj->title != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "title", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}title. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for element {}title...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_requestObj->title));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for element {}title. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}title. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_requestObj->singer != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "singer", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}singer. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for element {}singer...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_requestObj->singer));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for element {}singer. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}singer. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a RequestObj.
 *
 * @param _requestObj The RequestObj to free.
 */
static void freeNs0RequestObjType(struct TestJersey2_ns0_requestObj *_requestObj) {
  int i;
  if (_requestObj->title != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor title of type TestJersey2_ns0_requestObj...\n");
#endif
    freeXsStringType(_requestObj->title);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor title of type TestJersey2_ns0_requestObj...\n");
#endif
    free(_requestObj->title);
  }
  if (_requestObj->singer != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor singer of type TestJersey2_ns0_requestObj...\n");
#endif
    freeXsStringType(_requestObj->singer);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor singer of type TestJersey2_ns0_requestObj...\n");
#endif
    free(_requestObj->singer);
  }
}
#endif /* DEF_TestJersey2_ns0_requestObj_M */
