fieldbugs1
==========

Simplistic demo to illustrate various Grails 3.3.x (and Fields Plug-in) bugs/issues.

Entities used for:
  - [TableOne]()
      - controller dynamic scaffolding Bug (1)
      - no default values in DB Bug (3)
      - missing inList constraints in the DB Bug (4)
      - ignored i18 labels for inList Bug (5)
      - not all fields displayed in `show` Bug (6)
      - readonly attribute not working correctly Bug (7)
      - no textarea rendered for big fields Bug (8)
  - [TableTwo]()
      - controller dynamic scaffolding workaround      
  - [TableThree]()
      - tbd.
  
  - [TableParent](), [TableChild]() and [TableChildTwo]()  
      - table inheritance mapping in DB bug (2)
  
A. Reported Bugs/Issues referencing this demo:

  1. https://github.com/grails/grails-core/issues/10968
  2. https://github.com/grails/grails-data-mapping/issues/1076
  3. https://github.com/grails/grails-data-mapping/issues/1074
  4. https://github.com/grails/grails-data-mapping/issues/1073
  5. https://github.com/grails-fields-plugin/grails-fields/issues/272
  6. https://github.com/grails-fields-plugin/grails-fields/issues/271
  7. https://github.com/grails-fields-plugin/grails-fields/issues/259
  8. https://github.com/grails-fields-plugin/grails-fields/issues/256
  9. ~~https://github.com/grails-fields-plugin/grails-fields/issues/257~~  - Fixed in 2.2.7

B. Other issues that prevent or complicate a Grails 2.x -> 3.3.x migration for many applications:

   1. https://github.com/grails-fields-plugin/grails-fields/issues/269
   2. https://github.com/grails-fields-plugin/grails-fields/issues/267 (Grails 2.x did the equivalent of this)
   3. https://github.com/grails-fields-plugin/grails-fields/issues/268 (Grails 2.x did the equivalent of this)
   4. https://github.com/grails-fields-plugin/grails-fields/issues/264
   5. https://github.com/grails-plugins/grails-spring-security-core/issues/536
   6. https://github.com/grails-plugins/grails-spring-security-shiro/issues/5 
 
C. Other outstanding problems collected in the [WIKI](https://github.com/aadrian/fieldbugs1/wiki).
 