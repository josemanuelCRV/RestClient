#import "TestJersey2.h"
#ifndef DEF_TESTJERSEY2NS0RequestObj_M
#define DEF_TESTJERSEY2NS0RequestObj_M

/**
 * (no documentation provided)
 */
@implementation TESTJERSEY2NS0RequestObj

/**
 * 
 */
- (NSString *) title
{
  return _title;
}

/**
 * 
 */
- (void) setTitle: (NSString *) newTitle
{
  [newTitle retain];
  [_title release];
  _title = newTitle;
}

/**
 * (no documentation provided)
 */
- (NSString *) singer
{
  return _singer;
}

/**
 * (no documentation provided)
 */
- (void) setSinger: (NSString *) newSinger
{
  [newSinger retain];
  [_singer release];
  _singer = newSinger;
}

- (void) dealloc
{
  [self setTitle: nil];
  [self setSinger: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  TESTJERSEY2NS0RequestObj *_tESTJERSEY2NS0RequestObj;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _tESTJERSEY2NS0RequestObj = (TESTJERSEY2NS0RequestObj *) [TESTJERSEY2NS0RequestObj readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _tESTJERSEY2NS0RequestObj;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation TESTJERSEY2NS0RequestObj */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface TESTJERSEY2NS0RequestObj (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface TESTJERSEY2NS0RequestObj (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation TESTJERSEY2NS0RequestObj (JAXB)

/**
 * Read an instance of TESTJERSEY2NS0RequestObj from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of TESTJERSEY2NS0RequestObj defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  TESTJERSEY2NS0RequestObj *_tESTJERSEY2NS0RequestObj = [[TESTJERSEY2NS0RequestObj alloc] init];
  NS_DURING
  {
    [_tESTJERSEY2NS0RequestObj initWithReader: reader];
  }
  NS_HANDLER
  {
    _tESTJERSEY2NS0RequestObj = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_tESTJERSEY2NS0RequestObj autorelease];
  return _tESTJERSEY2NS0RequestObj;
}

/**
 * Initialize this instance of TESTJERSEY2NS0RequestObj according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of TESTJERSEY2NS0RequestObj to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a TESTJERSEY2NS0RequestObj from an XML reader. The element to be read is
 * "requestObj".
 *
 * @param reader The XML reader.
 * @return The TESTJERSEY2NS0RequestObj.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  TESTJERSEY2NS0RequestObj *_requestObj = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element requestObj."];
    }
  }

  if (xmlStrcmp(BAD_CAST "requestObj", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}requestObj.");
#endif
    _requestObj = (TESTJERSEY2NS0RequestObj *)[TESTJERSEY2NS0RequestObj readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}requestObj.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read TESTJERSEY2NS0RequestObj. Expected element requestObj. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read TESTJERSEY2NS0RequestObj. Expected element requestObj. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _requestObj;
}

/**
 * Writes this TESTJERSEY2NS0RequestObj to XML under element name "requestObj".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _requestObj The RequestObj to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this TESTJERSEY2NS0RequestObj to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "requestObj", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}requestObj. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}requestObj for root element {}requestObj...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}requestObj for root element {}requestObj...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}requestObj. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "title", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}title of type {http://www.w3.org/2001/XMLSchema}string.");
#endif
    __child = [NSString readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}title of type {http://www.w3.org/2001/XMLSchema}string.");
#endif

    [self setTitle: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "singer", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}singer of type {http://www.w3.org/2001/XMLSchema}string.");
#endif
    __child = [NSString readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}singer of type {http://www.w3.org/2001/XMLSchema}string.");
#endif

    [self setSinger: __child];
    return YES;
  } //end "if choice"


  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  id __item_copy;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

  if ([self title]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "title", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}title."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}title...");
#endif
    [[self title] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}title...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}title."];
    }
  }
  if ([self singer]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "singer", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}singer."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}singer...");
#endif
    [[self singer] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}singer...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}singer."];
    }
  }
}
@end /* implementation TESTJERSEY2NS0RequestObj (JAXB) */

#endif /* DEF_TESTJERSEY2NS0RequestObj_M */
