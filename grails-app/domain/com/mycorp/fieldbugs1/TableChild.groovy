package com.mycorp.fieldbugs1

class TableChild extends TableParent {
    String   name
    String   childText
    int      no                  = 42

    Date     dateCreated
    Date     lastUpdated

    static constraints = {
        one         nullable: false
        name        nullable: false, blank: false, unique: true
        childText   nullable: true
        no          nullable: true, inList: [12, 24, 42, 55, 77]

        dateCreated nullable: true
        lastUpdated nullable: true
    }
    @Override
    String toString() { name }
}
