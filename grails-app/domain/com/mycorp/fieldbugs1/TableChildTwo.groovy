package com.mycorp.fieldbugs1

class TableChildTwo extends TableParent {
    String   name
    String   childTwoText
    int      no                  = 242

    Date     dateCreated
    Date     lastUpdated

    static constraints = {
        one          nullable: false
        name         nullable: false, blank: false, unique: true
        childTwoText nullable: false
        no           nullable: true, inList: [212, 224, 242, 255, 277]

        dateCreated  nullable: true
        lastUpdated  nullable: true
    }
    @Override
    String toString() { name }
}
