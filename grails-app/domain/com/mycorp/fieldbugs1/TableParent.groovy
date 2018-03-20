package com.mycorp.fieldbugs1

class TableParent {
    TableOne one
    String   name

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
    }
}
