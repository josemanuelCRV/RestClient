#import "enunciate-common.h"

@class TESTJERSEY2NS0RequestObj;

#ifndef DEF_TESTJERSEY2NS0RequestObj_H
#define DEF_TESTJERSEY2NS0RequestObj_H

/**
 * (no documentation provided)
 */
@interface TESTJERSEY2NS0RequestObj : NSObject <EnunciateXML>
{
  @private
    NSString *_title;
    NSString *_singer;
}

/**
 * 
 */
- (NSString *) title;

/**
 * 
 */
- (void) setTitle: (NSString *) newTitle;

/**
 * (no documentation provided)
 */
- (NSString *) singer;

/**
 * (no documentation provided)
 */
- (void) setSinger: (NSString *) newSinger;
@end /* interface TESTJERSEY2NS0RequestObj */

#endif /* DEF_TESTJERSEY2NS0RequestObj_H */
