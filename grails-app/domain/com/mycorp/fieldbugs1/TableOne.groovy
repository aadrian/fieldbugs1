package com.mycorp.fieldbugs1

class TableOne {
    String   strName
    String   strDescription
    String   strOne
    String   strTwo
    String   strType
    Integer  intgNo              = 42      // set a default value.
    String   strWorking          = 'x'     // set a default value.
    Date     dtFirst
    Date     dtLast

    Date     dateCreated
    Date     lastUpdated

    static constraints = {
        strName        nullable: false, blank: false, unique: true
        strDescription nullable: true,  maxSize: 4000
        strOne         nullable: true
        strTwo         nullable: true
        strType        nullable: true,  inList: ['S','M','L','XL']
        intgNo         nullable: false, inList: [22, 42, 44, 66]
        strWorking     nullable: false, inList: ['y','n','x']
        dtFirst        nullable: false
        dtLast         nullable: true

        dateCreated    nullable: true
        lastUpdated    nullable: true
    }

    @Override
    String toString() { strName }
}
