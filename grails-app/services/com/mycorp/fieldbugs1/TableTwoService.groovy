package com.mycorp.fieldbugs1

import grails.gorm.services.Service

@Service(TableTwo)
interface TableTwoService {

    TableTwo get(Serializable id)

    List<TableTwo> list(Map args)

    Long count()

    void delete(Serializable id)

    TableTwo save(TableTwo tableTwo)

}