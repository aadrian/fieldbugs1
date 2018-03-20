package com.mycorp.fieldbugs1

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TableTwoController {
    static scaffold = TableTwo

    TableTwoService tableTwoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 3, 100)
        respond tableTwoService.list(params), model:[tableTwoCount: tableTwoService.count()]
    }
}
