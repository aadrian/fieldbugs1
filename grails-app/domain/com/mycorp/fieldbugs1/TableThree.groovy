package com.mycorp.fieldbugs1

class TableThree {
    String     strName
    Integer    age
    String     strType

    Date       dateCreated
    Date       lastUpdated
    static constraints = {
        strName   nullable: true, blank: false, unique: true
        age       nullable: false
        strType        nullable: true,  inList: ['a','b','c']

        dateCreated    nullable: true
        lastUpdated    nullable: true
    }

    String toString() { strName }
}
