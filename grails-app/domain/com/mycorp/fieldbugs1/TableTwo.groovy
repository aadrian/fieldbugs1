package com.mycorp.fieldbugs1

class TableTwo {
    String     strName
    String     strNote
    String     strType
    Integer    intgNo              = 42      // set a default value.
    TableThree three

    Date       dateCreated
    Date       lastUpdated

    static constraints = {
        strName        nullable: false, blank: false, unique: true
        strNote        nullable: true,  maxSize: 4000
        strType        nullable: true,  inList: ['S','M','L']
        intgNo         nullable: false, inList: [22, 42, 44, 66]
        three          nullable: true

        dateCreated    nullable: true
        lastUpdated    nullable: true
    }
    @Override
    String toString() { strName }
}
